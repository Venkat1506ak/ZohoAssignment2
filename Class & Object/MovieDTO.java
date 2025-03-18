
class MovieDTO{
    private int movieId;
    private String title;
    private String director;
    private String genre;
    private double rating;
    private int duration;

    public MovieDTO(String director, int duration, String genre, int movieId, double rating, String title) {
        this.director = director;
        this.duration = duration;
        this.genre = genre;
        this.movieId = movieId;
        this.rating = rating;
        this.title = title;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void display(){
        System.out.println("Director : "+director);
        System.out.println("Title : "+title);
        System.out.println("Genre : "+genre);
        System.out.println("Duration : "+duration);
        System.out.println("MovieId : "+movieId);
        System.out.println("Rating : "+rating);
    }
    public static void main(String[] args) {
        MovieDTO mt=new MovieDTO("Vetrimaran", 3, "Action", 1, 4.5, "Asuran");
        mt.display();
    }
}