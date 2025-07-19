class continousNumRPyrami{
    static void pattern13(int n){
        int num=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(num+"  ");
                num=num+1;
            }
        
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int n=5;
        pattern13(n);
    }
    
}
