package chapter15_컬렉션;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
    public static void main(String[] args) {
        //이름을 키로 점수를 값으로 저장하기

        Map<String, Integer> map = new HashMap<>();

        //객체저장
        map.put("가나다", 85);
        map.put("라마바", 90);
        map.put("사자차", 80);
        map.put("가나다", 95);
        System.out.println("총 Entry 수: " + map.size()); //저장된 총 Entry 수 얻기

        //객체 찾기
        System.out.println("\t가나다 : " + map.get("가나다"));

        //객체를 하나씩 처리
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.println("\t" + key + " : " + value);
        }
        System.out.println();

        //객체 삭제
        map.remove("가나다");  //키로 Map.Entry를 제거
        System.out.println("총 Entry 수: " + map.size());

        //객체를 하나씩 처리
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();  //Map.EntrySet 얻기
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t" + key + " : " + value);
        }
        System.out.println();

        //객체 전체 삭제
        map.clear();
        System.out.println("총 Entry 수: " + map.size());
    }
}
