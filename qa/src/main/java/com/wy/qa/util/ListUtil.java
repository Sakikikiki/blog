package com.wy.qa.util;

import java.util.ArrayList;
import java.util.List;

public class ListUtil {
    /**
     * @param list
     * @param size
     * @param <T> 泛型
     * @return
     */
    public static <T> List<List<T>> split(List<T> list, Integer size) {
        List<List<T>> resultList = new ArrayList<>();
        if (list == null || list.size() == 0 || size == 0) {
            return resultList;
        } else {
            int index = 0;
            int start;
            int end = 0;
            while (index < list.size()) {
                start = end;
                end = Math.min(index + size, list.size());
                List<T> subList = list.subList(start, end);
                resultList.add(subList);
                index += size;
            }
        }
        return resultList;
    }
}
