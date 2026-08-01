package LLD.CompositeDesignePattern.SolutionCompositeDesignePattern;

public class Main {
    public static void main(String[] args) {
        Directory movies = new Directory("Movies");

        File movie1 = new File("Spider Man");

        Directory bollywood = new Directory("Bollywood");
        File movie2 = new File("Krish");

        bollywood.add(movie2);

        movies.add(movie1);
        movies.add(bollywood);

        movies.ls();
        
    }
}
