package LLD.CompositeDesignePattern.ProblemStatement;

public class File {
    
    String name;

    public File(String name){
        this.name = name;
    }

    public void ls(){
        System.out.println("Name of file is "+name);
    }

}
