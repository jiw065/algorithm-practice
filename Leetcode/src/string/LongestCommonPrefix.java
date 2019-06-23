package string;

public class LongestCommonPrefix {
	  /*
    public String longestCommonPrefix(String[] strs) {
        if (strs.length ==0){
            return "";
        }
         String maxP = strs[0];
        for (int i =0; i<strs.length-1;i++){
           
            String temp="";
            int j = 0;
            int len = Math.min(strs[i].length(),strs[i+1].length());
            while(j<len && strs[i].charAt(j) ==strs[i+1].charAt(j)){
                temp += strs[i].charAt(j);
                j++;
            }
           
            if (maxP.length()>temp.length()){
                maxP = temp; 
            }
            
        }
        return maxP; 
    }
    */
     public String longestCommonPrefix(String[] strs) {
        if (strs.length ==0){
            return "";
        }
         String maxP = strs[0];
        for (int i =1; i<strs.length;i++){
           // if the string a does not contain String b, it returns -1 otherwise return 0 (prefix start with 0) 
           while(strs[i].indexOf(maxP)!=0){   
            System.out.println(strs[i].indexOf(maxP)+" "+maxP);
               // decrease maxP until next string contains it
               maxP = maxP.substring(0,maxP.length()-1);
               if (maxP.length() == 0) return "";
           }           
            
        }
        return maxP; 
    }
    
}
