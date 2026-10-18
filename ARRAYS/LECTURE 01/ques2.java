public class ques2 {
    public static void main(String[] args) {
        
        int[] arr={1,2,4,7,7,5};

        //Better Approach

        // int largest=Integer.MIN_VALUE;

        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>largest){
        //         largest=arr[i];
        //     }
        // }

        // int second_laregst=Integer.MIN_VALUE;

        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>=second_laregst && arr[i]<largest){
        //         second_laregst=arr[i];
        //     }
        // }

        // System.out.println("The second largest element is "+second_laregst);

        //Optimal Approach

        int second_largest=Integer.MIN_VALUE;
        int largest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                second_largest=largest;
                largest=arr[i];
            }else if(arr[i]>second_largest && arr[i]<largest){
                second_largest=arr[i];

            }
        }

        System.out.println("The second largest element is "+second_largest);


    }   
}
