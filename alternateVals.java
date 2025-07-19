import java.util.Scanner;
public class fibnoc{
    public static void main(String[] args){
        int n=5;
        int arr[] = new int[n];
        //int n=5;
        for(int i=0;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}

