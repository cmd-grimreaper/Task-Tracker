package repository;

import model.TaskModel;

import java.util.ArrayList;
import java.util.List;

public class TaskRepo {

    List<TaskModel> repository = new ArrayList<>();
    public void addTask(TaskModel task) {

        repository.add(task);
    }

    public void allTask(){
        for (TaskModel repo : repository){
            System.out.println(repo);
        }
    }
}
