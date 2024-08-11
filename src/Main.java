import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 4, 5, 6};
        int target = 7;
        String strs[] = new String[]{"act","pots","tops","cat","stop","hat"};
        System.out.println((groupAnagrams(strs)));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            String key = Arrays.toString(count);
            System.out.println(key);
            if (!ans.containsKey(key)) {
                ans.put(key, new ArrayList<>());
            }

            ans.get(key).add(s);
        }

        return new ArrayList<>(ans.values());
    }
}
