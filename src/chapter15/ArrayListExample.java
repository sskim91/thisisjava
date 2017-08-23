package chapter15;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("JAVA");
        list.add("jdbc");
        list.add("servlet/jsp");
        list.add(2, "database");
        list.add("mybatis");

        int size = list.size(); //저장된 총 객체 수 얻기
        System.out.println("총 객체 수 : " + size);
        System.out.println();

        String skill = list.get(2); //2번 인덱스 객체 얻기
        System.out.println();

        for (int i=0; i< list.size(); i++) {
            String str = list.get(i);
            System.out.println(i + ":" + str);
        }
        System.out.println();

        list.remove(2);
        list.remove(2);
        list.remove("mybatis");

        for (int i=0; i< list.size(); i++) {
            String str = list.get(i);
            System.out.println(i + ":" + str);
        }
    }
}
