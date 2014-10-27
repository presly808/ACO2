package ua.artcode.week3.day2.interf;


public class StudentWorkerTest {
    public static void main(String[] args) {

        Worker worker = new Worker();
        Student student = new Student();
        SuperPerson superPerson = new SuperPerson();

        Company company = new Company();
        University university = new University();

        company.testWorker(worker);
        company.testWorker(superPerson);

        university.testStudent(student);
        university.testStudent(superPerson);

    }
}

class Constants {
    public static final String DESC = "SOME";
    private Constants(){

    }
}

interface IStudent {
    static final int VAR = 9;
    void study();
}

interface IWorker {
    public abstract void work();
}

class SuperPerson implements IStudent, IWorker{
    public void study(){
        System.out.println("superperson is studying");

    }
    public void work(){
        System.out.println("superperson is working");
    }
}

class Student implements IStudent {
    public void study(){
        System.out.println("im studying");
    }

}
class Worker implements IWorker{
    public void work(){
        System.out.println("im working");
    }

}

class University {
    public void testStudent(IStudent student){
        student.study();
    }
}

class Company {
    public void testWorker(IWorker worker) {
        worker.work();
    }
}



