public class optimalRotate {

    public static void main(String[] args) {

        int[][] arr={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int n=arr.length;
        int m=arr[0].length;

        System.out.println("Array befor Rotation");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        if(n==m){
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
        }else{
            System.out.println("Optimal approach not applicable for rectangular matrices.");
        }

        System.out.println("Array after Rotation");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
