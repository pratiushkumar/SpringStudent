package com.example;

import java.util.HashMap;
import java.util.Map;

public class MapStore
{
    private String field;
    public MapStore(Map<String,String> mymap) {
        System.out.println("This is the map "+ mymap);
    }

    public Map<Integer,String> bolling  =  new HashMap<Integer,String>();

}
