package LLD.CompositeDesignePattern.SolutionCompositeDesignePattern;

public class File implements FileSystem{
    
    String name;

    File(String name){
        this.name = name;
    }

    @Override
    public void ls(){

        System.out.println("Name of this file is "+name);

    }
    
}
