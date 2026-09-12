class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            int sum = 0;
            for(int i=0; i<word.length(); i++){
                int index = word.charAt(i) - 'a';
                sum += weights[index];
            }
            int mod = sum % 26;
            char val = (char) ('z' - mod);
            sb.append(val);
        }
        return sb.toString();
    }
}