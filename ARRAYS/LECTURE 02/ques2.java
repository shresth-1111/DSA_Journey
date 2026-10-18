public class ques2 {
    
    public static void main(String[] args) {
        
        int[] arr={1,2,3,4,5,6,7};

        int d=10;

        int n=arr.length;
        d=d%n;

        //Brute Approach
        // int temp[]=new int[d];


        // for(int i=0;i<d;i++){
        //     temp[i]=arr[i];
        // }

        // for(int i=d;i<n;i++){
        //     arr[i-d]=arr[i];
        // }

        // int temp_ind=0;
        // for(int i=n-d;i<n;i++){
        //     arr[i]=temp[temp_ind];
        //     temp_ind++;
        // }

        // for(int j=0;j<arr.length;j++){
        //     System.out.println(arr[j]);
        // }


        //Optimal Approach

        //Reversal 1
        int back1=d-1;
        int start1=0;
        while(start1<=back1){
            int temp=arr[start1];
            arr[start1]=arr[back1];
            arr[back1]=temp;
            start1++;
            back1--;
        }

        //Reversal 2
        int back2=n-1;
        int start2=d;
        while(start2<=back2){
            int temp=arr[start2];
            arr[start2]=arr[back2];
            arr[back2]=temp;
            start2++;
            back2--;
        }

        //Reversal 3
        int back3=n-1;
        int start3=0;
        while(start3<=back3){
            int temp=arr[start3];
            arr[start3]=arr[back3];
            arr[back3]=temp;
            start3++;
            back3--;
        }

        for(int j=0;j<arr.length;j++){
             System.out.println(arr[j]);
        }

    }
}
