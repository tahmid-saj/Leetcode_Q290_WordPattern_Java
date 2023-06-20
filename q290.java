class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");

        if (str.length != pattern.length()) {
            return false;
        }

        Map<Character, String> letters = new HashMap<Character, String>();

        for (int i = 0, j = 0; i < pattern.length(); i++, j++) {
            if (!letters.containsKey(pattern.charAt(i))) {
                if (letters.containsValue(str[j])) {
                    return false;
                }

                letters.put(pattern.charAt(i), str[j]);
            } else if (letters.containsKey(pattern.charAt(i)) && !str[j].equals(letters.get(pattern.charAt(i)))) {
                return false;
            }
        }

        return true;
    }
}
