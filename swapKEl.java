import java.util.*;
public class swapKEl {
    public static void main(String args[]){
        //int target=45;
        int k=2;
        int arr[]={5,8,1,9,4};
        int arr1[]=new int[5];
        int p=0;
        for(int i=k;i<arr.length;i++)
        {
           
            arr1[p]=arr[i];
            p++;
            
        }
        for(int i=0;i<k;i++){
            arr1[p]=arr[i];
            p++;
        }
        System.out.println(Arrays.toString(arr1));

    }
    
}
