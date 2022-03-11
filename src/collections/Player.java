package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Player implements Comparable<Player> {

    String name;
    int age;
    int ranking;

    public Player(String name, int age, int ranking) {
        this.name = name;
        this.age = age;
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public static void main(String[] args) {

        List<Player> players = new ArrayList<>();

//        List<Integer> lst = new ArrayList<>();
//        lst.add(9);
//        lst.add(3);
//        lst.add(0);
//        Collections.sort(lst);
        //  System.out.println(lst);
        Player p1 = new Player("Akhil", 32, 4);
        Player p2 = new Player("Atul", 29, 3);
        Player p3 = new Player("Dileep", 26, 1);

        players.add(p1);
        players.add(p2);
        players.add(p3);

        ComparatorEx ex = new ComparatorEx();
        Collections.sort(players, ex);
        Iterator<Player> iter = players.iterator();


        while(iter.hasNext()){
            System.out.println(iter.next().getName());


        }
    }


    @Override
    public int compareTo(Player o) {
        return Integer.compare(getRanking(), o.getRanking());
    }
}
