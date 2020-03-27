package models;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

import java.util.ArrayList;
import java.util.List;

@Parcel
public class Movie {

    int movieId;
    String backdrop_path;
    String posterPath;
    String title;
    String overView;
    double rating;

    public Movie(){}

    public Movie(JSONObject jsonObject) throws JSONException {
        backdrop_path = jsonObject.getString("backdrop_path");
        posterPath = jsonObject.getString("poster_path");
        title = jsonObject.getString("title");
        overView = jsonObject.getString("overview");
        rating = jsonObject.getDouble("vote_average");
        movieId = jsonObject.getInt("id");

    }

    public static List<Movie> fromJsonArray(JSONArray movieJsonArray) throws JSONException {
        List<Movie> movies = new ArrayList<>();
        for (int i = 0; i <movieJsonArray.length(); i++){
            movies.add(new Movie(movieJsonArray.getJSONObject(i)));
        }
        return movies;
    }

    public String getPosterPath() {
        return String.format("https://image.tmdb.org/t/p/w342/%s", posterPath);
    }

    public String getBackdrop_path(){
        return String.format("https://image.tmdb.org/t/p/w342/%s",backdrop_path);
    }

    public String getTitle() {

        return title;
    }

    public String getOverView() {

        return overView;
    }

    public double getRating() {
        return rating;
    }

    public int getMovieId() {
        return movieId;
    }
}
