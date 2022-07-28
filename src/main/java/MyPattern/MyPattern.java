package MyPattern;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MyPattern {
    static HashMap<String,String> patternMap = new HashMap();
    static HashMap<String,String> wordSet = new HashMap();
    static char[] patternArray;
    public static void main(String[] args) {
        String[] words = {"cat","dog","dog","fish"};
        String pattern = "abba";
        establishPattern(pattern,words);
        System.out.println(checkPattern(pattern, words));

    }
    private static void establishPattern(String pattern,String[] stringArray){
        patternArray = pattern.toCharArray();
        int i;
        for (i=0 ; i<patternArray.length ; i++){
            String key = Character.toString(patternArray[i]);

            if (!patternMap.containsKey(key)) {
                patternMap.put(key, stringArray[i]);
            }
        }
    }
    private static boolean checkPattern(String pattern, String[] stringArray){
        if (pattern.length()!=stringArray.length){
            return false;
        }
        int i;
        for (i = 0; i< stringArray.length; i++){
            String key = Character.toString(patternArray[i]);
            if (patternMap.get(key)!=stringArray[i]){
                return false;
            }
        }
        return true;
    }
}
