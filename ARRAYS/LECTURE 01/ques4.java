import java.util.*;

public class ques4 {
    public static void main(String[] args) {
        
        int[] arr={1,1,2,2,2,3,3};

        //Optimal Approach
        // int i=0;
        // int j=1;
        // while(j<arr.length){
        //     if(arr[i]!=arr[j]){
        //         arr[i+1]=arr[j];
        //         i=i+1;
        //     }
        //     j++;
        // }

        // System.out.println("The number of unique elements are "+(i+1));


        //Brute/Better Approach 
        TreeSet<Integer> set = new TreeSet<>();

        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }

        int j=0;

        for(int x : set){
            arr[j]=x;
            j++;
        }

        System.out.println("the number of unique elements are "+set.size());

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
}
