package com.Collections;

import java.util.*;

public class MapUtil {
    public static void main(String[] args){
        HashMap<String ,Integer> map=new HashMap<>();
        map.put("A",4);
        map.put("B",3);
        map.put("C",3);
        map.put("D",1);
        printMap(map);
        LinkedHashMap<String ,Integer> soretedMap=sortMapByValue(map);
        System.out.println("===================sorted");
        printMap(soretedMap);

    }

    private static void printMap(HashMap<String, Integer> map) {
        for (String key: map.keySet()) {
            System.out.println(key+"  "+ map.get(key));
        }
    }

    private static   LinkedHashMap<String,Integer>  sortMapByValue(HashMap<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list,new ValueComparator());
        LinkedHashMap<String,Integer> linkedHashMap=new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry:list) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }
}
  class ValueComparator implements Comparator<Map.Entry<String,Integer>>{

      @Override
      public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
          return o1.getValue().compareTo(o2.getValue());
      }
  }
