public class PosterManager {
    private String movieName;
    private int movie;
    private PosterManager[] movies = new PosterManager[0];

    public PosterManager (String movieName, int movie) {
        this.movieName = movieName;
        this.movie = movie;
    }

    public PosterManager (){
        this.movie = 5;
    }

    public int getMovieName() {
        return movie;
    }

    public int setMovie() {
        return movie;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }


    public void addMovie(PosterManager movie) {
        PosterManager[] tmp = new PosterManager[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public PosterManager[] findAll() {
        return movies;
    }


    public PosterManager[] findLast() {
        PosterManager[] all = findAll();
        PosterManager[] reversed = new PosterManager[all.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }


}
