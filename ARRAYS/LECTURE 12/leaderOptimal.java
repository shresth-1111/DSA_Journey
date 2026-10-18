public class leaderOptimal {
    public static void main(String[] args) {
        
        int[] arr={10,22,12,3,0,6};
        int n=arr.length;
        int max_num=arr[n-1];
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=max_num){
                System.out.println(arr[i]);
                max_num=arr[i];
            }
        }
    }
}
