package com.example.datastructurespractice.Medium;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FlattenDictionory {
//    public static void main(String[] args) {
//        Map<String, Object> map = new LinkedHashMap<>();
//        Map<String, Object> dictionary = new LinkedHashMap<>();
//        dictionary.put("key1", 1);
//        dictionary.put("key2", new LinkedHashMap<>());
//        ((Map) dictionary.get("key2")).put("a", 2);
//        ((Map) dictionary.get("key2")).put("b", 3);
//        ((Map) dictionary.get("key2")).put("c", new LinkedHashMap<>());
//        ((Map) ((Map) dictionary.get("key2")).get("c")).put("d", 3);
//        ((Map) ((Map) dictionary.get("key2")).get("c")).put("e", 1);
//        flatten("", map, dictionary);
//        for (String s : map.keySet()) {
//            System.out.println(s + " " + map.get(s));
//        }
//    }

    static HashMap<String, Object> flattenDictionary(HashMap<String, Object> dict) {
        HashMap<String, Object> output = new HashMap<>();

        flatten("",dict, output);
    return output;

}


    public static void main(String[] args) {

        HashMap<String, Object> map = new LinkedHashMap<>();
        Map<String, Object> dictionary = new LinkedHashMap<>();
        dictionary.put("key1", 1);
        dictionary.put("key2", new LinkedHashMap<>());
        ((Map) dictionary.get("key2")).put("a", 2);
        ((Map) dictionary.get("key2")).put("b", 3);
        ((Map) dictionary.get("key2")).put("c", new LinkedHashMap<>());
        ((Map) ((Map) dictionary.get("key2")).get("c")).put("d", 3);
        ((Map) ((Map) dictionary.get("key2")).get("c")).put("e", 1);

        Map<String, String> op =new HashMap<>();
        //op = flattenDictionary(map);

        for (String s : op.keySet()) {
            System.out.println(s + " " + map.get(s));
        }

    }

    private static void flatten(String s, Map<String, Object> map,
                                Map<String, Object> dictionary) {

        for (String key : dictionary.keySet()) {

            if (dictionary.get(key) instanceof Map) {
                if (s.length() == 0) {
                    flatten(key, map, ((Map) dictionary.get(key)));
                } else {
                    flatten(s + "." + key, map, ((Map) dictionary.get(key)));
                }

            } else {
                if (s.length() == 0) {
                    map.put(key, dictionary.get(key));
                } else {
                    map.put(s + "." + key, dictionary.get(key));
                }
            }

        }
    }
    }




