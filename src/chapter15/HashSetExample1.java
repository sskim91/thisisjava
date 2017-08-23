package chapter15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {
    public static void main(String[] args) {

        //String 객체를 중복 없이 저장하는 HashSet
        Set<String> set = new HashSet<>();

        set.add("java");
        set.add("jdbc");
        set.add("servlet");
        set.add("java");    // java는 한번만 저장됨
        set.add("mybatis");

        int size = set.size();
        System.out.println("총 객체수:" + size);

        Iterator<String> iterator = set.iterator(); //반복자 얻기
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("\t" + element);
        }

        set.remove("jdbc");
        set.remove("mybatis");

        System.out.println("총 객체수:" + size);
        iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("\t" + element);
        }

        set.clear();
        if (set.isEmpty()) {
            System.out.println("비어 있음");
        }
    }
}
