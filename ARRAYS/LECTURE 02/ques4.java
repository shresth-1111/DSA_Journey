public class ques4 {
    
    public static void main(String[] args) {
        
        int[] arr={6,7,8,4,1};
        int nums=10;

        int flag=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==nums){
                flag=i;
                break;
            }
        }

        System.out.println("Position of "+nums+" in the array is "+flag+" ith index");
    }
}
