package fr.ninjhamster.followyourseries.database;
import java.util.LinkedList;
import java.util.List;

import fr.ninjhamster.followyourseries.content.Serie;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;
import android.content.Context;

public class SerieDB {

	private static SerieDB instance = null;
    private static Context context;
    private static SQLiteDatabase database;
    private MySQLiteOpenHelper dbHelper;
    
    private static final int NUM_COL_ID = 0;
    private static final int NUM_COL_TITLE = 1;
    
    private SerieDB(Context context) {
        this.context = context;
        this.dbHelper = new MySQLiteOpenHelper(context);
    }
    
    public static SerieDB getInstance(Context context1) {
        if (instance == null) {
            SerieDB.instance = new SerieDB(context1);
        } else {
            context = context1;
        }
        return SerieDB.instance;
    }
    
    public void open(){
        this.database = dbHelper.getWritableDatabase();
    }
    
    public void close(){
        this.dbHelper.close();
    }
    
    public long insertSerie(Serie serie){
        ContentValues values = new ContentValues();
        
        values.put(Serie.SERIE_TITLE, serie.getTitleSerie());

        return this.database.insert(Serie.SERIE_TABLE, null, values);
    }

    private Serie cursorToSerie(Cursor c){
        if(c.getCount() == 0)
            return null;
                
        Serie serie = new Serie();
        
        serie.setIdSerie(c.getInt(NUM_COL_ID));
        serie.setTitleSerie(c.getString(NUM_COL_TITLE));

        return serie;
    }
    
    public List<Serie> getAllSeries(){
        Cursor result = this.database.query(Serie.SERIE_TABLE, null, "", null, null, null, null);

        List<Serie> seriesList = new LinkedList<Serie>();
        while (result.moveToNext()) {
            seriesList.add(cursorToSerie(result));
        }
        result.close();

        return seriesList;
    }
    
}
