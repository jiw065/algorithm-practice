package queue;

public class RevealCardsIncreasingOrder {
	 public int[] deckRevealedIncreasing(int[] deck) {
	        Deque<Integer> index = new LinkedList<>();
	        int N = deck.length;
	        int[] ans = new int[N];  
	        for (int i=0; i<N; i++){
	            index.add(i); 
	        }
	        // use deque to simulate the game
	        Arrays.sort(deck);
	        for(int i= 0; i<N;i++){
	            ans[index.pollFirst()] = deck[i]; //put the smallest value to the first element      
	            if(!index.isEmpty()){
	               index.addLast(index.pollFirst()); //put the next first card to the end 
	            }
	        }
	        
	        return ans; 
	        
	    }
}
