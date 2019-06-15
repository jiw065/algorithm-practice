
public class ConvertStringToNum {

	public static int string2num(String a){
		int num = 0 ;
		final int zero = '0';
		final int nine = '9';
		String b = a.trim();
		char[] aList = b.toCharArray();
		
		if (b.length() == 0) {
			throw new IllegalArgumentException("The string is empty!");
			
		}
		if(aList[0]!='-') {
			for (int i = 0;i<=aList.length-1;i++) {
				int cr = 0;
				if(aList[i]>=zero&&aList[i]<=nine) {
					cr = aList[i]-zero;
					num+=cr*Math.pow(10, ((aList.length-1)-i));
				}else {
					throw new IllegalArgumentException("cannot convert string to num");
				}
				if(num == Integer.MAX_VALUE) {
					throw new IllegalArgumentException("out of bound MAX");
				}
			}
	    	
		}else {
			for (int i = 1;i<=aList.length-1;i++) {
				int cr = 0;
				if(aList[i]>=zero&&aList[i]<=nine) {
					cr = aList[i]-zero;
					num+=cr*Math.pow(10, ((aList.length-1)-i))*-1;
				}else {
					throw new IllegalArgumentException("cannot convert string to num");
				}

				if(num == Integer.MIN_VALUE) {
					throw new IllegalArgumentException("out of bound MIN");
				}
		}
	    
		}
		
		return num;
	}
	public static void main(String[] args) {
		
		int b = string2num("12548784");
		//String bString = "1234 5655";
		//int b = Integer.parseInt(bString);
		System.out.println(b);
		//2147483647

	}

}
