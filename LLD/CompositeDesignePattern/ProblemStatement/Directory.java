package LLD.CompositeDesignePattern.ProblemStatement;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    
    String name;
    List<Object> objectList;

    public Directory(String name){
        this.name = name;
        this.objectList = new ArrayList<>();
    }

    public void ls(){

        System.out.println("Directory name is "+name);

        for(Object object : objectList){
            if(object instanceof File){
                ((File) object).ls();
            }
            else{
                ((Directory) object).ls();
            }
        }

    }

    public void add(Object newObject){
        objectList.add(newObject);
    }

}
