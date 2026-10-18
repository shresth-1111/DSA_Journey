public class ques3 {
    public static void main(String[] args) {
        int[] arr={1,0,2,3,2,0,0,4,5,1};

        int i=0;
        int j=0;

        while(j<arr.length){
            if(arr[i]!=0){
                i++;
                j++;
            }else if(arr[i]==0 && arr[j]!=0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
                j++;
            }else if(arr[i]==0 && arr[j]==0){
                j++;
            }
        }

        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}
