/*Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true
Explanation:
The element 1 occurs at the indices 0 and 3.

Example 2:
Input: nums = [1,2,3,4]
Output: false
Explanation:
All elements are distinct.

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
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