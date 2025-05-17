class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> li = new ArrayList<>();
        int n = words1.length;
        int m = words2.length;
        int[] freq = new int[26];
        for (String s : words2) {
            int[] temp = new int[26];
            for (char c : s.toCharArray()) {
                temp[c - 'a']++;
                freq[c - 'a'] = Math.max(freq[c - 'a'], temp[c - 'a']);
            }
        }
        for (int j = 0; j < n; j++) {
            int[] wordfreq = new int[26];
            for (char c : words1[j].toCharArray()) {
                wordfreq[c - 'a']++;
            }
            int i = 0;
            for (i = 0; i < 26; i++) {
                if (freq[i] > 0 && wordfreq[i] < freq[i]) {
                    break;
                }
            }
            if (i == 26) {
                li.add(words1[j]);
            }
        }
        return li;
    }
}