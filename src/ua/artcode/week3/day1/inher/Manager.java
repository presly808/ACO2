package ua.artcode.week3.day1.inher;

/**
 * Created by admin on 25.10.2014.
 */
public class Manager extends Worker {

    private Worker[] team = new Worker[6];
    private int freeSpace = 0;

    public Manager(String name, int age, double salary) {
        super(name, age, salary);
    }

    public void addToTeam(Worker worker){
        team[freeSpace++] = worker;
    }

    public void manage(){
        for(int i = 0; i < freeSpace; i++){
            Worker worker = team[i];
            worker.work();
        }
    }

}
