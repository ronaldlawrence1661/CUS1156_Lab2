import java.util.ArrayList;
import java.util.HashSet;

public class UniqueWordCounter {

    public static int countUnique(ArrayList<String> list) {
        HashSet<String> uniqueWords = new HashSet<>(list);
        return uniqueWords.size();
    }

    public static void CUS1156_Lab2(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        
        words.add("apple");
        words.add("orange");
        words.add("blackboard");
        words.add("apple");
        words.add("orange");
        words.add("sun");
        words.add("moon");
        
        int unique = countUnique(words);
        System.out.println(words + " has " + unique + " unique words");
    }

    public static void main(String[] args) {
        CUS1156_Lab2(args);
    }
}
