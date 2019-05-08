package Lesson_2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
//        Fruit f = Fruit.APPLE;

       // System.out.println(Fruit.APPLE);

//        Cat cat = null;
//        cat.setName("asd");
//        for (Fruit o : Fruit.values()) {
//            System.out.println(o.getRus() + " " + o.getWeight() + " " + o.ordinal());
//        }

    //    System.out.println(Fruit.valueOf("APPLE"));
//        Outer outer = new Outer(1);
//        outer.infoOuter();
//
//        Outer.Inner inner = new Outer(10).new Inner(20);

        // Optional.ofNullable()

//        try {
//
//            int[] mass = {1,2,3};
//            mass[20] = 10;
//            int b = 10 / 0;
//
//
//        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
//        } finally {
//
//        }
//
//        System.out.println("END");

      //  testFinally();

        try (FileOutputStream fileOutputStream = new FileOutputStream("1.txt")) {
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //   throw new RuntimeException("Ошибка!");
    //    System.out.println(sqrt(10));
//
//        try {
//            System.out.println(sqrt(10));
//        } catch (ArithmeticException e) {
//            System.out.println("Введите число больше 0");
//        }

        try {
            someThing();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void someThing() throws FileNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("1.txt");
    }

    public static int sqrt(int n) {
        if(n > 0) {
            return n / 2;
        }
        throw new ArithmeticException("Нельзя отрицательное!");
    }

    static void testFinally() {
        try {
            System.out.println(1);

        } finally {
            System.out.println(2);

        }
    }


    public static  void  a() {
        b();
    }

    public static  void  b() {
        c();
    }

    public static  void  c() {
        int a = 0;
        int b = 10 / 0;
    }
}







//public class Team {
//
//    String name;
//    public Competitor[] com;
//
//    public Team(String name, Competitor[] com) {
//        this.name = name;
//        this.com = com;
//    }









//public class Team {
//    private String name;
//    private Competitor[] members;
//
//    public Team(String name) {
//        this.name = name;
//        members = new Competitor[4];
//        members[0] = new Human("Боб");
//        members[1] = new Cat("Барсик");
//        members[2] = new Dog("Бобик");
//        members[3] = new Human("Билл");
//    }
//
//    public Competitor[] getMembers() {
//        return members;
//    }











//public class Team {
//
//    private String name;
//    private Competitor[] competitors;
//
//    public Team(String name) {
//        this.name = name;
//        this.competitors = new Competitor[] {new Human("Боб"), new Cat("Барсик"), new Dog("Бобик"), new Human("Марта")};
//    }
//
//    public Competitor[] getCompetitors() {
//        return competitors;
//    }
//
//
//    // информация обо всех членах команды
//    public void ShowCompetitorsInfo() {
//        for (Competitor c : competitors
//                ) {
//            c.info();
//        }
//    }








//
////public class Team
////{
////    String Name;
////    Competitor[] CompetitorList = {new Cat("cat 1"), new Dog("dog 1"), new Human("human 1")};
////
////    public Team(String name)
////    {
////        Name = name;
////    }
////
////    public void ShowResult()
////    {
////        for (Competitor competitorItem : CompetitorList)
////        {
////            competitorItem.info();
////        }
////    }
////}














//public class Team {
//    protected Competitor [] competitors;
//    protected String nameTeam;
//    // Competitor[] competitors = { new Human("Боб"), new Cat("Барсик"), new Dog("Бобик")};
//
//    public Team (String _nameTeam, Human a, Human b ,Animal c, Animal d) {
//
//        this.nameTeam = _nameTeam;
//        Competitor []_competitors = {a,b,c,d};
//        this.competitors = _competitors;
//    }
//    public void showResults (){
//
//        System.out.println();
//        System.out.println("Участники команды: " + "'" + nameTeam + "'" +
//                " успешно прошедшие полосу препятствий.");
//        System.out.println();
//
//        for (Competitor c : competitors){
//            if (c.isOnDistance()) {
//                c.info();
//            }
//        }
//
//    }











//public class Team {
//    Competitor[] winners = {new Human("Боб"), new Cat("Барсик"), new Dog("Бобик")};
//
//    public Team() {
//        this.winners = winners;
//    }
//
//    public Competitor[] getWinners() {
//        return winners;
//    }
//    public void infoWiners() {
//        for (Competitor c : winners) {
//            c.info();
//        }
//    }
//}






















//
//public class Team implements Competitor {
//
//    String nameTeam;
//    String name;
//    boolean isSuccess;
//    int maxRunDistance;
//    int maxJumpHeight;
//    int maxSwimDistance;
//
//    Team[] newTeam = new Team[4];
//
//    public Team(String nameTeam, Players player1, Players player2, Players player3, Players player4){
//        this.nameTeam = nameTeam;
//        newTeam = new Team[]{player1, player2, player3, player4};
//    }
//
