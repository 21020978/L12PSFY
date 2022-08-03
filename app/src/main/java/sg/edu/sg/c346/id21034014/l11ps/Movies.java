package sg.edu.sg.c346.id21034014.l11ps;

import java.io.Serializable;

public class Movies implements Serializable {
    private int movieid;
    private String movieTitle;
    private String moviegenre;
    private int movieyear;
    private String movierating;


    public Movies(int movieid, String movieTitle, String moviegenre, int movieyear, String movierating) {
        this.movieid = movieid;
        this.movieTitle = movieTitle;
        this.moviegenre = moviegenre;
        this.movieyear = movieyear;
        this.movierating = movierating;
    }

    public int getMovieid() {
        return movieid;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMoviegenre() {
        return moviegenre;
    }

    public void setMoviegenre(String moviegenre) {
        this.moviegenre = moviegenre;
    }

    public int getMovieyear() {
        return movieyear;
    }

    public void setMovieyear(int movieyear) {
        this.movieyear = movieyear;
    }

    public String getMovierating() {
        return movierating;
    }

    public void setMovierating(String movierating) {
        this.movierating = movierating;
    }


}
