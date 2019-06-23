package bit;

public class HammingDistance {

	 /*
    public int hammingDistance(int x, int y) {
        String xb = Integer.toBinaryString(x);
        String yb = Integer.toBinaryString(y);
        if (xb.length()<yb.length()) return hammingDistance(y, x);
        int gap = xb.length()- yb.length();
        String zero = "";
        while(gap>0){
            zero+='0';
            gap--;
        }
        yb=zero.concat(yb);
//        System.out.println (xb);
//        System.out.println (yb);
        
        int count = 0; 
        for(int i=0; i<xb.length();i++){
            if(xb.charAt(i) != yb.charAt(i)){
                count++;
            }
        }
        
        
        return count; 
        
    }*/
    
    
     public int hammingDistance(int x, int y) {
       int res = 0;
       for(int i = 0; i < 32; i++){
         res += (x & 1) ^ (y & 1);
         x = x >> 1;
         y = y >> 1;
       }
      return res;
    }

}
