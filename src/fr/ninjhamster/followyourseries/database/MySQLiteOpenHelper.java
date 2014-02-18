package fr.ninjhamster.followyourseries.database;

import fr.ninjhamster.followyourseries.content.Serie;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class MySQLiteOpenHelper extends SQLiteOpenHelper{

	public static final String DB_NAME = "fysdb";
    public static final int DB_VERSION = 1;
    
    private static final String CREATE_TABLE_SERIES =
            "CREATE TABLE " + Serie.SERIE_TABLE
                    + " ("
                    + Serie.SERIE_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + Serie.SERIE_TITLE + " TEXT NOT NULL"
                    + ");";
    
	public MySQLiteOpenHelper(Context context) {
		super(context, DB_NAME, null, DB_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CREATE_TABLE_SERIES);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
		db.execSQL("DROP TABLE "+ Serie.SERIE_TABLE + ";");
		
	}
	
	/*********************************
	***** 	Accès Series		******
	*********************************/
	public String getAllSeriesQuerry(SQLiteDatabase db){
		return "";
		//return db.exec("RETURN * FROM Series");
	}
}
