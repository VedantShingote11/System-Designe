package LLD.CompositeDesignePattern.ProblemStatement;

public class Main {
    public static void main(String[] args) {
        File movie1 = new File("Spider Man");

        Directory bollywood = new Directory("Bollywood movies");
        File movie2 = new File("Krish");

        bollywood.add((Object)movie2);

        Directory movies = new Directory("Movies");

        movies.add((Object)movie1);
        movies.add(bollywood);

        movies.ls();

    }

}
