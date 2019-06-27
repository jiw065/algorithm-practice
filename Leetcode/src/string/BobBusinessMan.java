package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BobBusinessMan {

	private int toMins(String s) {
	    String[] hourMin = s.split(":");
	    int hour = Integer.parseInt(hourMin[0]);
	    int mins = Integer.parseInt(hourMin[1]);
	    int hoursInMins = hour * 60;
	    return hoursInMins + mins;
	}
	
	public int solution(String S) {
		String[] schedule = S.split("/");
		//System.out.println(schedule[1]);
		List<List<Integer>> s = new ArrayList<>();
		List<Integer> mon = new ArrayList<>();
		List<Integer> tue = new ArrayList<>();
		List<Integer> wed = new ArrayList<>();
		List<Integer> thu = new ArrayList<>();
		List<Integer> fri = new ArrayList<>();
		List<Integer> sat = new ArrayList<>();
		List<Integer> sun = new ArrayList<>();
		List<Integer> all = new ArrayList<>();
		for(String sch : schedule) {
			String[] detail = sch.split(" ");
			//System.out.println(detail[0]);
			String date = detail[0];
			String[] time = detail[1].split("-");
			int begin = toMins(time[0]);
			int end = toMins(time[1]);
			//System.out.println(times[0]);
			switch (detail[0]) {
			case "Mon":
				mon.add(begin);
				mon.add(end);
				break;
			case "Tue":
				begin += 1440; 
				end += 1440; 
				tue.add(begin);
				tue.add(end);
				break;
			case "Wed":
				begin += 1440*2; 
				end += 1440*2; 
				wed.add(begin);
				wed.add(end);
				break;	
			case "Thu":
				begin += 1440*3; 
				end += 1440*3; 
				thu.add(begin);
				thu.add(end);
				break;	
			case "Fri":
				begin += 1440*4; 
				end += 1440*4; 
				fri.add(begin);
				fri.add(end);
				break;	
			case "Sat":
				begin += 1440*5; 
				end += 1440*5; 
				sat.add(begin);
				sat.add(end);
				break;	
			case "Sun":
				begin += 1440*6; 
				end += 1440*6; 
				sun.add(begin);
				sun.add(end);
				break;	
			default:
				break;
			}
					
		}
		s.add(0,mon);
		s.add(1,tue);
		s.add(2,wed);
		s.add(3,thu);
		s.add(4,fri);
		s.add(5,sat);
		s.add(6,sun);
		
//		int[] t = s.get(0).get(0);		
//		System.out.println(t[0]+" "+t[1]);
		int j = 0;
		for(List<Integer> tList : s) {
			if(!tList.isEmpty()) {
				all.addAll(tList);
			}
			j++;
		}
		
		int max = Integer.MIN_VALUE;
		int restTime = 0;
		Collections.sort(all);
		int fast = 2;
		int slow = 1; 
		while(fast<all.size()) {
			//System.out.print(all.get(i)+" ");
		    restTime = all.get(fast)-all.get(slow);			
			max = Math.max(max, restTime);
			fast+=2;
			slow+=2; 
		}
			
		return max; 
	}
	
	
	
	
	public static void main(String[] args) {
		String str = "Sun 10:00-20:00/"
					+ "Fri 05:00-10:00/"
					+ "Fri 16:30-23:50/"
					+ "Sat 10:00-24:00/"
					+ "Sun 01:00-04:00/"
					+ "Sat 02:00-06:00/"
					+ "Tue 03:30-18:15/"
					+ "Tue 19:00-20:00/"
					+ "Wed 04:25-15:14/"
					+ "Wed 15:14-22:40/"
					+ "Thu 00:00-23:59/"
					+ "Mon 05:00-13:00/"
					+ "Mon 15:00-21:00";
					
		BobBusinessMan b = new BobBusinessMan();
		System.out.println(b.solution(str));
		
	}
}
