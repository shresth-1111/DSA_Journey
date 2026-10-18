public class ques1 {
    
    public static void main(String[] args) {
        
        //Brute Approach 
        // int arr[]={1,2,7,6,9,10,8,4,5};

        // for(int i=1;i<=arr.length+1;i++){
        //     boolean indicator=false;
        //     for(int j=0;j<arr.length;j++){
        //         if(arr[j]==i){
        //             indicator=true;
        //             break;
        //         }
        //     }
        //     if(!indicator){
        //         System.out.println(i+" does not exist in the array.");
        //         break;
        //     }
        // }

        //Optimal Approach

        int arr[]={1,2,7,6,9,3,8,4,5};

        int n=arr.length;

        int actual_length=n+1;
        
        int sum_actual=((actual_length)*(actual_length+1))/2;

        int arrSum=0;

        for(int i=0;i<arr.length;i++){
            arrSum=arrSum+arr[i];
        }


        System.out.println("The missing number is "+(sum_actual-arrSum));


    }

}
