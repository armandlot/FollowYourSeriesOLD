package fr.ninjhamster.followyourseries.content;

import java.util.List;

public class Serie {
	private int idSerie;
    private String titleSerie;
    private List<Season> seasons;
    
    public static final String SERIE_TABLE = "series";
    public static final String SERIE_ID = "_id";
    public static final String SERIE_TITLE = "title";
    
    /*********************************
    ***** 	Constructors		******
    *********************************/
    public Serie(int id, String title){
    	this.idSerie = id;
    	this.titleSerie = title;
    }
    
    public Serie(String title){
    	this(-1, title);
    }
    
    public Serie(){
    	this(-1,"");
    }
    /*********************************
    ***** 	Getters/Setters		******
    *********************************/
    public int getIdSerie(){
    	return this.idSerie;
    }
    
    public void setIdSerie(int id){
    	this.idSerie = id;
    }
    
    public String getTitleSerie(){
    	return this.titleSerie;
    }
    
    public void setTitleSerie(String title){
    	this.titleSerie = title;
    }
    
    public List<Season> getSeasons(){
    	return this.seasons;
    }
    
    public void setSeasons(List<Season> seasons){
    	this.seasons = seasons;
    }
}
