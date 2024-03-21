class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return ""; // Return empty string if the array is empty
        }
        
        // Iterate through the characters of the first string
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            
            // Iterate through the remaining strings
            for (int j = 1; j < strs.length; j++) {
                // If we reach the end of any string or if the character at position i is different,
                // return the substring up to i as the common prefix
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        
        // If we reach this point, the entire first string is the common prefix
        return strs[0];
    }
}
