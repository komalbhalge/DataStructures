package com.example.datastructurespractice.Maps;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
/*
function flattenDictionary(dict):
    flatDictionary = {}
    flattenDictionaryHelper("", dict, flatDictionary)

    return flatDictionary


function flattenDictionaryHelper(initialKey, dict, flatDictionary):
    for (key : dict.keyset()):
        value = dict.get(key)

        if (!isDictionary(value)): # the value is of a primitive type
            if (initialKey == null || initialKey == ""):
                flatDictionary.put(key, value)
            else:
                flatDictionary.put(initialKey + "." + key, value)
        else:
            if (initialKey == null || initialKey == "")
                flattenDictionaryHelper(key, value, flatDictionary)
            else:
                flattenDictionaryHelper(initialKey + "." + key, value, flatDictionary)
 */
public class FlattenDictionary {
        static HashMap<String, String> flattenDictionary1(HashMap<String, Object> dict) {
            HashMap<String, String> output = new HashMap<>();
            flattenDictionary( "",dict, output);
            return output;
        }
        public static void flattenDictionary( String initialKey, HashMap<String, Object> dict, HashMap<String, String> output) {
            for( String key : dict.keySet()){
                Object value = dict.get(key);

                if(!(value instanceof HashMap)){
                    if( initialKey == null || initialKey ==""){
                        output.put( key, value+"" );
                    }else{
                        output.put( initialKey+"."+key, value+"" );
                    }
                }else{
                    if( initialKey == null || initialKey ==""){
                        flattenDictionary(key, dict, parameters1( value ));
                    }else{

                        flattenDictionary(initialKey+"."+key, dict, parameters1( value ));
                }
            }

        }
        }
    public static HashMap<String, String> parameters1(Object obj) {
        HashMap<String, String> map = new HashMap<>();
        for (Field field : obj.getClass().getDeclaredFields()) {
            field.setAccessible( true );
            try {
                map.put( field.getName(), field.get( obj ).toString());
            } catch (Exception e) {
            }
        }

        return map;
    }

        public static void main(String[] args) {

            HashMap<String, Object> map = new LinkedHashMap<>();
            HashMap<String, Object> dictionary = new LinkedHashMap<>();
            dictionary.put("key1", 1);
            dictionary.put("key2", new LinkedHashMap<>());
            ((Map) dictionary.get("key2")).put("a", 2);
            ((Map) dictionary.get("key2")).put("b", 3);
            ((Map) dictionary.get("key2")).put("c", new LinkedHashMap<>());
            ((Map) ((Map) dictionary.get("key2")).get("c")).put("d", 3);
            ((Map) ((Map) dictionary.get("key2")).get("c")).put("e", 1);
            Map<String, String> op =new HashMap<>();
            op = flattenDictionary1(dictionary);

            for (String s : op.keySet()) {
                System.out.println(s + " " + op.get(s));
            }

        }




    }
