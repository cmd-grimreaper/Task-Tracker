package model;

import java.time.LocalDateTime;

public class TaskModel {
    private int id;
    private  String description;
    private boolean completed;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    public TaskModel(){}
    public TaskModel(int id,String description, boolean completed){
        this.id = id ;
        this.description = description ;
        this.completed = completed ;

        this.createdAt =LocalDateTime.now();
        this.updatedAt =LocalDateTime.now();
    }


































    // overriding toString() method
    @Override
    public String toString(){

        return
                "{\n" +
                "id: "+id+
                "\ndescription: "+description+
                "\nstatus: "+(completed ? "Completed" : "Not Completed")+
                "\n"+
                "\ncreatedAt: "+createdAt+
                "\nupdatedAt: "+updatedAt+
                "\n},\n";
    }


}
