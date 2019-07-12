package math;

public class DecimalToBinary {
	public String decimalToBinary(int num) {
		String binayString = "";
		while(num >=1) {
			if(num%2 == 1 ) {
				binayString = binayString.concat("1");
			}else {
				binayString = binayString.concat("0");				
			}			
			num = num/2; 
			//System.out.println(num);
		}
			
		return binayString;
	}
	public static void main(String[] args) {
		DecimalToBinary db = new DecimalToBinary();
		System.out.println(db.decimalToBinary(42));

	}

}
