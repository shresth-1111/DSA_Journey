public class setMatrixBrute {

    public static void row(int[][] arr, int rowNum){
        for(int i=0;i<arr.length;i++){
            if(i==rowNum){
                for(int j=0;j<arr[0].length;j++){
                    arr[i][j]=-1;
                }
                return;
            }
        }
    }

    public static void column(int[][] arr, int colNum){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(j==colNum){
                    arr[i][j]=-1;
                    break;
                }
            }
        }
        return;
    }
    
    public static void main(String[] args) {

        int[][] arr={{1,1,1,1},{1,0,0,1},{1,1,0,1},{1,1,1,1}};

        int n=arr.length;
        int m=arr[0].length;

        System.out.println("Printing Matrix Before Changing");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //Applying Matrix Algo
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    row(arr,i);
                    column(arr,j);
                }
            }
        }

        //Changing -1 -> 0
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==-1){
                    arr[i][j]=0;
                }
            }
        }


        System.out.println("Printing Matrix After Changing");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }

}
