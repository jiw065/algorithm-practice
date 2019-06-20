
public class TitleToNumber {
	public int titleToNumber(String s) {
        int gap = 'A'-1;
        char[] cl = s.toCharArray();
        int n = cl.length;
        int count=(cl[n-1]-gap);
        int k = 1;
        for (int i =n-2; i>=0 ; i-- ){
            count += (cl[i]-gap)*Math.pow(26,k);
            k++;
        }
        
        return count; 
    }
}
