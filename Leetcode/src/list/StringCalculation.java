package list;

import java.util.Stack;

public class StringCalculation {
	static public int Solution(String s) {
		if(s.length() == 0) return -1; 
		String[] ops = s.split(" ");
		
		//if(!ops[ops.length-1].equals("POP")) return -1; 
		
		int num = -1;
		Stack<Integer> st = new Stack<>();
		for(int i=0;i<ops.length;i++) {
			String op = ops[i];	
			switch (op) {
			case "POP":
				st.pop();
				break;
			case "DUP":
				int temp = st.peek();
				st.push(temp);
				break;
			case "+":
				int a =-1;
				int b = -1; 
				if(!st.isEmpty()) {
					a = st.pop();
				}else {
					return -1;
				}
				if(!st.isEmpty()) {
					b = st.pop();
				}else {
					return -1; 
				}
				int temp2 = a+b;
				st.push(temp2);
				break;
			case "-":
				int c =-1;
				int d = -1; 
				if(!st.isEmpty()) {
					c = st.pop();
				}else {
					return -1;
				}
				if(!st.isEmpty()) {
					d = st.pop();
				}else {
					return -1; 
				}
				int temp3 = c-d;
				st.push(temp3);
				break;
			default:
				st.push(Integer.parseInt(op));
				break;
			}
			for (int n:st) {
				System.out.print(n+" ");
			}
			System.out.println();
		}
		if(!st.isEmpty())num = st.pop();
		return num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "4 5 DUP 2 + 8 - POP";
		int num = Solution(s);
		System.out.println("num "+num);
	}

}
