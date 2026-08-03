class Solution {
    public List<String> validStrings(int n) {
        List<String> list = new ArrayList<>();
        backtrack(n, new StringBuilder(), list);
        return list;
    }

    private void backtrack(int n, StringBuilder sb, List<String> list){
        if(sb.length() == n){
            list.add(sb.toString());
            return;
        }

        sb.append('1');
        backtrack(n, sb, list);
        sb.deleteCharAt(sb.length()-1);

        if(sb.length()==0 ||sb.charAt(sb.length()-1) != '0'){
            sb.append('0');
            backtrack(n, sb, list);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}