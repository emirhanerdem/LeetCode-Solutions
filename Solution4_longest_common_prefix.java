public class Solution4_longest_common_prefix {
    public String longestCommonPrefix(String[] strs){
        String text = strs[0];
        if(strs.length==0) return "";
        for(int i =1;i<strs.length;i++){
            while(strs[i].indexOf(text)!=0){
                text=text.substring(0,text.length()-1);
                if(text.isEmpty()) return "";
            }
        }
        return text;
    }
}