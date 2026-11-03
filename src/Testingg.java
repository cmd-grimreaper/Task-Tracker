import model.TaskModel;
import repository.TaskRepo;

public class Testingg {
    static void main() {
        TaskModel t1 = new TaskModel(1,"go to work",false);
        TaskModel t2 = new TaskModel(2,"go to school",true);


        TaskRepo tR = new TaskRepo();
        tR.addTask(t1);
        tR.addTask(t2);


        tR.allTask();
    }
}
