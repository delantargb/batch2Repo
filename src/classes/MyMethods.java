package classes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JPMPC-B210 on 11/12/2016.
 */
public class MyMethods {


    public static int getMymethods(boolean regularStudent, boolean working) {
        int subj = 6;
        if (!working) {
            subj = regularStudent ? 7 : 5;
        }
        return subj;
    }

    public static void getWhileMethod() {
        int n = 1;
        while (n <= 6) {
            System.out.print("[" + n + "] ");
            n++;
        }
    }

    public static void getDoWhilesample(int loopStarter, int doWhileIn) {
        int limit = loopStarter;
        do {
            System.out.print("[" + limit + "] ");
            limit++;
        }
        while (limit <= doWhileIn);

    }



    public static String getAnotherDoWhile(int doWhileLimit, int doWhileIn) {
        int limit = doWhileLimit ;
        int in=doWhileIn;
        String str = "";
        do {
            str += "[" + limit + "] ";
            limit++;
        }
        while (limit <= doWhileIn);
        return str;

    }

    public static int getPositive(int input) {
        int p = 1;
        int x = 0;

        while (p <= input) {
            x = p + x;
            p++;
        }
        return x;
    }

    public static void getForLoopsample(int loopInput) {

        for (int i = 1; i < loopInput; i++) {
            System.out.println("i is :" + i);
        }
    }

//random List
    public static List getMyFriends() {
            List<String> boyFriends = new ArrayList<String>();

            boyFriends.add("Blaine");
            boyFriends.add("Edmund");
            boyFriends.add("Nick");
            boyFriends.add("Craig");
            boyFriends.add("Tracy");
            boyFriends.add("Scott");
            boyFriends.add("Mario");
            boyFriends.add("Connor");
            boyFriends.add("Lennon");

            return boyFriends;
        }

    public static List getRelation() {
        List<String> relation = new ArrayList<String>();

        relation.add("is friends with");
        relation.add("loves");
        relation.add("admires");
        relation.add("will Marry");
        relation.add("hates");
        relation.add("killed");

        return relation;
    }



    public static List getGirlfriends() {
        List<String> girlFriends = new ArrayList<String>();

        girlFriends.add("Kelsey");
        girlFriends.add("Isabella");
        girlFriends.add("Monika");
        girlFriends.add("Cathleen");
        girlFriends.add("Kerry");
        girlFriends.add("Mariah");
        girlFriends.add("Chantelle");
        girlFriends.add("Adrianne");
        girlFriends.add("Maddy");

        return girlFriends;
    }



}














