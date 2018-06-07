package test;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public Map<String, String> result = new HashMap<>();

   
    public void add(String key, String value){
        result.put(key, value);
    }


    @Override
    public String toString() {
        return "Test{" +
                "result=" + result +
                '}';
    }
}
