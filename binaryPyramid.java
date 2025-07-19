import java.util.*;
class binaryPyramid {
    static void bpyramid(int n){
        for(int i=1;i<=n;i++){
            int val=(i%2==0)?0:1;

            for(int j=1;j<=i;j++){
                System.out.print(val+" ");
                val=1-val;
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int n=5;
        bpyramid(n);
    }
}
    

