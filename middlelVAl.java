import java.util.Arrays;

public class middlelVAl {
    public static void main(String args[]){
        int arr[]={90,8,7,1,23};
        for(int i =0;i<5;i++){
            for(int j=1;j<5;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                     arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("middle:"+arr[arr.length/2]);

    }
    
}
