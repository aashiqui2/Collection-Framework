import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class StringMapDemo {
    public static void main(String[] args) {
        StringMapDemo smd=new StringMapDemo();
        smd.countchar();
        smd.countWords();

    }
    public void countWords(){
        // count of each character
        // String s="ammaappa";
        String names = "tamil english maths tamil";
        String[] word=names.split(" ");

        HashMap<String, Integer> wordCountMap = new HashMap<>();
       
        for (String c : word) {
            // System.out.println(c);
            if (wordCountMap.containsKey(c)) {
                wordCountMap.put(c, wordCountMap.get(c) + 1);
            } else {
                wordCountMap.put(c, 1);
            }
        }
        System.out.println(wordCountMap);

        Set<Map.Entry<String, Integer>> se = wordCountMap.entrySet();
        for (Map.Entry<String, Integer> entry : se) {
            // System.out.println(entry.getKey()+" "+entry.getValue());
            if (entry.getValue() >1)
                System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public void countchar() {

        // count of each character
        // String s="ammaappa";
        String s = "vishalsubburam";
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        // System.out.println(charCoutnMap); //{}
        char[] ch = s.toCharArray();
        for (char c : ch) {
            // System.out.println(c);
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        System.out.println(charCountMap);

        Set<Map.Entry<Character, Integer>> se = charCountMap.entrySet();
        for (Map.Entry<Character, Integer> entry : se) {
            // System.out.println(entry.getKey()+" "+entry.getValue());
            if (entry.getValue() == 1)
                System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
