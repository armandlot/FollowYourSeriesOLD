package fr.ninjhamster.followyourseries.activities;

import fr.ninjhamster.followyourseries.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

public class AddSerieActivity extends Activity /*implements AdapterView.OnItemClickListener*/{

	/*public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		
	}*/
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_serie);
        //Récupérer boutons et EditText
    }
	//Ajouter code pour ajouter Série dans DB
}
