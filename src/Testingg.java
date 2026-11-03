import model.Task;
import repository.TaskRepo;

public class Testingg {
    static void main() {
        Task t1 = new Task("go to work",false);
        Task t2 = new Task("go to school",true);
        Task t3 = new Task("go for lunch with a friend",true);
        Task t4 = new Task("buy groceries for dinner", false);
        Task t5 = new Task("water the house plants", true);
        Task t6 = new Task("pay monthly electricity bill", false);
        Task t7 = new Task("submit final project report", false);
        Task t8 = new Task("review pull request on GitHub", true);
        Task t9 = new Task("attend team daily standup meeting", true);
        Task t10 = new Task("go for a 30-minute evening run", false);
        Task t11 = new Task("take daily vitamins", true);
        Task t12 = new Task("schedule dentist appointment", false);

        TaskRepo tR = new TaskRepo();
        tR.addTask(t1);
        tR.addTask(t2);
        tR.addTask(t3);
        tR.addTask(t4);
        tR.addTask(t5);
        tR.addTask(t6);
        tR.addTask(t7);
        tR.addTask(t8);
        tR.addTask(t9);
        tR.addTask(t10);
        tR.addTask(t11);
        tR.addTask(t12);


        tR.allTask();
    }
}
