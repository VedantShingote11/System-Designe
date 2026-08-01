package LLD.CompositeDesignePattern.SolutionCompositeDesignePattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    
    String name;
    List<FileSystem> fileList;

    Directory(String name){
        this.name = name;
        this.fileList = new ArrayList<>();
    }

    @Override
    public void ls(){

        System.out.println("Name of directory is "+name);

        for(FileSystem fs : fileList){
            fs.ls();
        }

    }

    public void add(FileSystem f){
        fileList.add(f);
    }
    
}
