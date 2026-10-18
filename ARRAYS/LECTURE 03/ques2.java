public class ques2 {

    public static void main(String[] args) {
        
        int arr[]={1,1,0,1,1,1,0,1,1};

        int counter_max=Integer.MIN_VALUE;
        int count=0;

        int i=0;

        while(i<arr.length){
            if(arr[i]==1){
                int j=i+1;
                count=1;
                while(j<arr.length && arr[j]!=0){
                    count=count+1;
                    j++;
                }
                if(j<arr.length-1){
                    i=j+1;
                }else{
                    break;
                }
            }
            if(count>counter_max){
                counter_max=count;
            }
            count=0;
        }

        System.out.println("The maximum consecutive ones are "+counter_max);
    }
}
