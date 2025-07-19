public class prime {
    public static void main(String[] args) {
        int n=2;
        int m =10;
        int sum=0;
        //int count=0;
       // boolean isPrime = true;
       for(int i=n;i<=m;i++){
        int count=0;
        for(int j=1;j<=i;j++){
            if(i%j==0){
                //isPrime=false;
                //break;
                count++;
            }          
        }
        if(count==2){
            sum++;
        }
    }
                System.out.println(sum);

                //System.out.println(count);

    }
}

        