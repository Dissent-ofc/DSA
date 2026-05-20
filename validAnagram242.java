/*Given two strings s and t, return true if t is an of s, and false otherwise.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        for (char ch : s.toCharArray()) {
            mapS.put(ch, mapS.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            mapT.put(ch, mapT.getOrDefault(ch, 0) + 1);
        }

        for (char key : mapS.keySet()) {
            if (mapS.get(key).intValue() != mapT.getOrDefault(key, 0)) {
                return false;
            }
        }

        return true;
    }
}