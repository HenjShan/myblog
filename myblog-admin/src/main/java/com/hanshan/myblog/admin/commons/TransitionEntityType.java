package com.hanshan.myblog.admin.commons;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TransitionEntityType {

    public static Map<String,Object> transitionEntityToHashMap(Object onClass){
        Map<String,Object> hashMap = new HashMap<>();
        Field[] fields = onClass.getClass().getDeclaredFields();
        for(Field field:fields){
            field.setAccessible(true);
            try {
                hashMap.put(field.getName(),field.get(onClass));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return hashMap;
    }
}
