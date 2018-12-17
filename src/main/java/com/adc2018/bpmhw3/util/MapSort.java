package com.adc2018.bpmhw3.util;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

public class MapSort {

    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        Map<K, V> result = new LinkedHashMap<>();
        Stream<Map.Entry<K, V>> st = map.entrySet().stream();

        st.sorted((e1, e2) -> (Integer) e2.getValue() - (Integer) e1.getValue())
                .forEach(e -> result.put(e.getKey(), e.getValue()));
        return result;
    }
}
