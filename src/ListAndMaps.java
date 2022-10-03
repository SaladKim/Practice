import java.util.*;

public class ListAndMaps {
    public static void main(String[] args) {
        //List 사용
        List<String> myList = new ArrayList<>();
        myList.add("red");
        myList.add("blue");
        myList.add("green");
        myList.add("yellow");
        System.out.println(myList);

        myList.add("black");

        String third = myList.get(2);
        System.out.println(third);

        myList.clear();
        System.out.println(myList);

        //Immutable List (unmodifiableList)
        List<String> readOnlyList = Collections.unmodifiableList(myList);
        System.out.println(readOnlyList);

        //readOnlyList.add("White");
        //System.out.println(readOnlyList);

        //Java9 of 메소드 사용
        List<String> java9List = List.of("red", "blue", "green");
        System.out.println(java9List);
        //java9List.add("white");

        // Map (HashMap)
        Map<String, String> myMap = new HashMap<>();
        myMap.put("i5", "아이폰5");
        myMap.put("i6", "아이폰6");
        myMap.put("i7", "아이폰7");
        System.out.println(myMap);

        //myMap.clear();

        // Immutable Map
        Map<String, String> immutableMyMap = Collections.unmodifiableMap(myMap);

        // Java0 of 메소드
        Map<String, String> java9Map =
                Map.of("i5", "아이폰5",
                        "i6", "아이폰6",
                        "i7", "아이폰7");

        //java9Map.put("i8", "아이폰8");

    }
}
