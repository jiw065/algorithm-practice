package Leetcode.src.twoPointers;

public class sortArrayByParityII{

    // two pointer
    public int[] sortArrayByParityII(int[] A) {
        int e = 0;
        int o = 1;

        while(o<A.length && e<A.length){
            while( e<A.length && A[e]%2==0){
                e+=2;
            }

            while( o<A.length && A[o]%2 == 1){
                o+=2;
            }

            //swap
            if(o<A.length && e<A.length){
                int temp = A[e];
                A[e] = A[o];
                A[o] = temp;
                e +=2;
                o +=2;
            }
        }

        return A;

    }

    public int[] sortArrayByParityII2(int[] A) {
        //bruteforce
        int[] odd = new int[A.length/2];
        int[] even = new int[A.length/2];
        int oc = 0;
        int ec =0;
        for(int i : A){
            if(i%2 == 0){
                even[ec] = i;
                ec++;
            }else{
                odd[oc] = i;
                oc++;
            }
        }


        oc = 0;
        ec = 0;
        for(int j = 0; j<A.length;j++){
            if(j%2 == 0){
                A[j] = even[ec];
                ec++;
            }else{
                A[j] = odd[oc];
                oc++;
            }
        }

        return A;

    }


}
