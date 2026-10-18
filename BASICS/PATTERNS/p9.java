import java.util.Scanner;
public class p9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of lines you want : ");
        int n=sc.nextInt();

        if(n%2!=0){
            System.out.print("Number of lines should be even.");
        }else{

            //UPWARDS

            //Space
            for(int i=1;i<=n/2;i++){

                //Space
                for(int j=1;j<=(n/2)-i;j++){
                    System.out.print(" ");
                }

                //Star
                for(int k=1;k<=(2*i-1);k++){
                    System.out.print("*");
                }

                //Space
                for(int l=1;l<=(n/2)-i;l++){
                    System.out.print(" ");
                }

                System.out.println();

            }

            //BACKWARDS
            for(int i=n/2;i>=1;i--){

                //Space
                for(int k=1;k<=(n/2-i);k++){
                    System.out.print(" ");
                }
                
                //Stars
                for(int j=1;j<=(2*i-1);j++){
                    System.out.print("*");
                }

                //Space
                for(int l=1;l<=(n/2-i);l++){
                    System.out.print(" ");
                }

                System.out.println();

                sc.close();
            }

        }


    }
}
