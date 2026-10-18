public class ques1{
    public static void main(String[] args) {
        
        int[] numbers={3,2,1,5,2};

        int largest=Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }
        }

        System.out.println("The largest element in the array is "+largest);
    }
}