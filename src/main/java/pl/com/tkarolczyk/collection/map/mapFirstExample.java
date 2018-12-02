package pl.com.tkarolczyk.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class mapFirstExample {


    public static void main(String[] args) {

        Map<String, String> idsOverNames = new HashMap<>();
        System.out.println(idsOverNames.put("85121501571", "Tomek"));
        System.out.println(idsOverNames.put("85121501572", "Michał"));
        System.out.println(idsOverNames.put("85121501573", "edek"));
        System.out.println(idsOverNames.put("85121501574", "ania"));
        System.out.println(idsOverNames.put("85121501575", "zosia"));


        for (String key : idsOverNames.keySet()) {

            System.out.println("Key: " + key + ",value: " + idsOverNames.get(key));

        }
        Map<String, String> secondMap = new LinkedHashMap<>();

    }


}
