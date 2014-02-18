package fr.ninjhamster.followyourseries.activities;

import java.util.List;

import fr.ninjhamster.followyourseries.R;
import fr.ninjhamster.followyourseries.R.id;
import fr.ninjhamster.followyourseries.R.layout;
import fr.ninjhamster.followyourseries.content.Serie;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class SerieArrayAdapter extends ArrayAdapter<Serie> {
	private List<Serie> seriesList;
    public SerieArrayAdapter(Context context, int textViewResourceId, List<Serie> objects) {
        super(context, textViewResourceId, objects);
        this.seriesList = objects;
    }
    
    @Override
    public View getView(int position, View containerView, ViewGroup parent){
        Context context = getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

         View serieView = inflater.inflate(R.layout.serie, parent, false);

        TextView titleSerieTV = (TextView) serieView.findViewById(R.id.text_view_serie_title);
        
        try{
            Serie serie = this.seriesList.get(position);
            titleSerieTV.setText(serie.getTitleSerie());
            
        }catch(Exception ex){
            Log.e("SerieArrayAdapter", ex.getMessage());
        }
        
        return serieView;
    } 
}
