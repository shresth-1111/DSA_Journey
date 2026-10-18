public class ques3 {

    public static void main(String[] args) {
        
        int[] arr={1,2,1,3,4};
        boolean flag=true;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){
                flag=true;
            }else{
                flag=false;
                break;
            }
        }

        if(flag==true){
            System.out.println("Yes, the array is sorted.");
        }else{
            System.out.println("No, the array is not sorted.");
        }
    }
}
