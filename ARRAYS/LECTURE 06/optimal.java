public class optimal {

    //Dutch National Flag Algorithm
    public static void main(String[] args) {
        int[] arr={0,1,1,0,1,2,1,2,0,0,0};

        int low=0;
        int mid=0;
        int high=arr.length-1;

        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low=low+1;
                mid++;
            }else if(arr[mid]==2){
                int temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                high=high-1;
                if(arr[mid]!=0){
                    mid++;
                }
            }else if(arr[mid]==1){
                mid++;
            }
        }

        for(int p=0;p<arr.length;p++){
            System.out.println(arr[p]);
        }
    }    
}
