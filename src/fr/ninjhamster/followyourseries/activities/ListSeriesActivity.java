package fr.ninjhamster.followyourseries.activities;

import fr.ninjhamster.followyourseries.R;
import fr.ninjhamster.followyourseries.R.layout;
import fr.ninjhamster.followyourseries.R.menu;
import fr.ninjhamster.followyourseries.database.SerieDB;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;

public class ListSeriesActivity extends Activity /*implements AdapterView.OnItemClickListener*/{

    private SerieDB serieDB = SerieDB.getInstance(this);
	private SerieArrayAdapter serieArrayAdapter;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_series);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_list_series, menu);
        return true;
    }

	/*public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		
	}*/
	
	public void launchAddSerieActivity(View v){
		Toast.makeText(getApplicationContext(), "AddSerieActivity...", Toast.LENGTH_LONG).show();
		//Lancer activité AddSerieActivity
	}
}
