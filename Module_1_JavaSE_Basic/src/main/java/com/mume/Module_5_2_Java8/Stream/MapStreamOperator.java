package com.mume.Module_5_2_Java8.Stream;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description:
 * @date: 2024-03-16 14:32
 */
public class MapStreamOperator<K, V> {

//    public Map<K, V> AscSortByKeyForLinkedMap(HashMap<K, V> map) {
//        return map.entrySet().stream()
//                .sorted((Comparator<? super Map.Entry<K, V>>) Map.Entry.comparingByKey())
//                .collect(
//                        Collectors.toMap(
//                                Map.Entry::getKey,
//                                Map.Entry::getValue,
//                                (oldVal, newVal) -> oldVal,
//                                LinkedHashMap::new
//                        )
//                );
//    }

    public static void main(String[] args) {
        MapStreamOperator mapStreamOperator = new MapStreamOperator();
//        mapStreamOperator.AscSortByKeyForLinkedMap(new HashMap<String, Integer>(){{
//            put("aa", 1);
//            put("bb", 2);
//            put("cc", 3);
//        }});
    }

//    public Map<K, V> DescSortByKeyForLinkedMap(HashMap<K, V> map) {
//        return map.entrySet().stream()
//                .sorted((Comparator<? super Map.Entry<K, V>>) Map.Entry.comparingByKey().reversed())
//                .collect(
//                        Collectors.toMap(
//                                Map.Entry::getKey,
//                                Map.Entry::getValue,
//                                (oldVal, newVal) -> oldVal,
//                                LinkedHashMap::new
//                        )
//                );
//    }

//    public Map<K, V> AscSortByValueForLinkedMap(HashMap<K, V> map) {
//        return map.entrySet().stream()
//                .sorted((Comparator<? super Map.Entry<K, V>>) Map.Entry.comparingByValue())
//                .collect(
//                        Collectors.toMap(
//                                Map.Entry::getKey,
//                                Map.Entry::getValue,
//                                (oldVal, newVal) -> oldVal,
//                                LinkedHashMap::new
//                        )
//                );
//    }

}
