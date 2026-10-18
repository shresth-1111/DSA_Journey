public class nextPerOptimal {

    public static void main(String[] args) {
        
        int[] arr={2,1,5,4,3,0,0};

        int n=arr.length;

        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                for(int j=n-1;j>=i+1;j--){
                    if(arr[j]>arr[i]){
                        int temp=arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;
                        break;
                    }
                }
                int start=i+1;
                int end=n-1;
                while(start<end){
                    int temp=arr[start];
                    arr[start]=arr[end];
                    arr[end]=temp;
                    start++;
                    end--;
                }
                break;
            }
            else if(i==0){
                int start=i;
                int end=n-1;
                while(start<end){
                    int temp=arr[start];
                    arr[start]=arr[end];
                    arr[end]=temp;
                    start++;
                    end--;
                }
            }

        }

        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }

}
