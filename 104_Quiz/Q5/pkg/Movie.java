package pkg;

public class Movie{
    // Part 1
    String movieName;
    double rating;
    int numRatings;
    int revenue;
    
    public Movie(){
        movieName = "Avengers";
        rating = 8.0;
        numRatings = 33;
        revenue = 623357910;
        
    }
    public Movie(String movieName, double rating, int numRatings, int revenue){
        this.movieName = movieName;
        this.rating = rating;
        this.numRatings = numRatings;
        this.revenue = revenue;
    }
    // Part 2
    public void movieToString(){
        System.out.println("Movie: " + movieName);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: " + numRatings);
        System.out.println("Revenue: " + revenue);
        System.out.println("");
    }
    // Part 3
    public String getMovieName(){
        return movieName;
    }
    public int getRevenue(){
        return revenue;
    }
    // Part 4
    public double addRating(double newRating){
        numRatings++;
        rating = ((rating*(numRatings-1)) + newRating)/numRatings;
        return rating;
    }
    // Part 5
    public double getRating(){
        return rating;
    }
    public boolean compareRatings(Movie inp){
        if(this.rating > inp.getRating()){
            return true;
        }
        else{
            return false;
        }
    }
    // Part 6
    public String revenueToString(){
        String newRevenue = "";
        int totalnum = getRevenue();
        int i = 8;
        int [] digit = new int[1000];
        while(totalnum > 10){
            totalnum = (totalnum/10)%10;
            digit[i] = totalnum;
            newRevenue = "" + digit[i];
            if( i == 2 || i == 5 || i == 8){
                newRevenue = newRevenue + ",";
            }
            i++;
        }
        return newRevenue;
    }
    // Part 7
    public void pirateMovie(){
        this.Movie = 
    }
    
    
    
}
