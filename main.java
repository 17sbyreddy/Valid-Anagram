class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        //create two hashamps with key  being the character and value being the number of occurences and compare the two hashmaps
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            if (map1.containsKey(s.charAt(i))) {
                int counter = map1.get(s.charAt(i)) + 1;
                map1.put(s.charAt(i), counter);
            }
            else{
                map1.put(s.charAt(i), 1);
            }


        }

        for (int j = 0; j < t.length(); j++) {

            if (map2.containsKey(t.charAt(j))) {
                int counter = map2.get(t.charAt(j)) + 1;
                map2.put(t.charAt(j), counter);
            }
            else{
                map2.put(t.charAt(j), 1);
            }
        }

        if (map1.equals(map2)) {
            return true;
        } else {
            return false;
        }

    }

}