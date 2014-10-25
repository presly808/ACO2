package ua.artcode.week3.day1.inher;

/**
 * Created by admin on 25.10.2014.
 */
public class TestCompany {

    public static void main(String[] args) {
        Developer developer =
                new Developer("Andriy", 25, 3000);
        Developer developer1 =
                new Developer("Petia", 22, 1500);
        Developer developer2 =
                new Developer("Vasia", 24, 2000);

        Tester tester1 = new Tester("Olexiy", 20, 1600, "QA");
        Tester tester2 = new Tester("Oleg", 24, 1000,"MANUAL");

        Manager manager = new Manager("Olia", 27, 3000);
        manager.addToTeam(developer);
        manager.addToTeam(tester1);
        manager.addToTeam(developer1);
        manager.addToTeam(tester2);
        manager.addToTeam(developer2);

        manager.manage();
    }

}
