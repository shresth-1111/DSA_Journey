public class ques1 {
    public static void main(String[] args) {
        
        int[] arr={1,2,3,4,5};

        //Method 1
        // int temp=arr[0];
        // int i=1;
        // while(i<arr.length){
        //     arr[i-1]=arr[i];
        //     i++;
        // }
        // arr[i-1]=temp;

        // for(int j=0;j<arr.length;j++){
        //     System.out.println(arr[j]);
        // }

        //Method 2
        for(int i=0;i<arr.length-1;i++){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }

        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }

    }
}
