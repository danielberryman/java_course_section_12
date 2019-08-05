package MapLesson;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();

        languages.put("Python", "an interpreted high level, oo, dynamic semantics");
        languages.put("Ruby", "a interpreted high level, oo");

//        System.out.println(languages.get("Ruby"));
//        keys must be unique
//        use a value again and the old value gets overwritten
        System.out.println(languages.put("Java", "a compiled high level, oo, platform independent"));
        System.out.println(languages.put("Java", "changed language"));
//        System.out.println(languages.get("Java"));
//        a value is being added for the first time you can sout .put because it returns the previous value or null
        if(languages.containsKey("Java")) {
            System.out.println("It's there");
        }
        System.out.println(languages.putIfAbsent("Java", "hello"));
        System.out.println(languages.get("Java"));

        System.out.println("+++++++++++++++++++++++++++++++++++++");

        System.out.println(languages.remove("Ruby","a interpreted high level, oo"));
        if(languages.remove("Java", "changed language again")) {
            System.out.println("Java removed");
        } else {
            System.out.println("Key value pair not found");
        }

        System.out.println(languages.replace("Java", "it's SO great just like coffee!!!!"));
//        System.out.println(languages.replace("Basic", "it's SO great just like coffee!!!!"));
//        for(String key : languages.keySet()) {
//            System.out.println(key + " : " + languages.get(key));
//        }
//        System.out.println(languages.replace("Java", "it's SO great just like coffee!!!!", "REPLACED!!!"));

//        No order to a HashMap
    }
}
