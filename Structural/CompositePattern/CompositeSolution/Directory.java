package CompositeSolution;

import java.util.ArrayList;
import java.util.List;

public class Directory implements DirectorySystem {
 String directoryName;
    List<DirectorySystem> objectList;

    public Directory(String name){
        this.directoryName = name;
        objectList = new ArrayList<>();
    }

    public void add(DirectorySystem object) {
        objectList.add(object);
    }

    public void ls(){
        System.out.println("Directory Name: " + directoryName);
        for(DirectorySystem obj: objectList) {
           obj.ls();
           
        }
    }
    
}
