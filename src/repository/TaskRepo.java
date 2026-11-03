package repository;

import model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskRepo {

    List<Task> repository = new ArrayList<>();
    public void addTask(Task task) {

        repository.add(task);
    }

    public void allTask(){
        for (Task repo : repository){
            System.out.println(repo);
        }
    }
}
