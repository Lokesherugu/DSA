/* Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]. */
import java.util.*;
public class twoSum{
    public static void main(String[] args) {
        
    int n;
   
  //  int n,t;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of array:");
    n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
         arr[i]= sc.nextInt();
    }
    System.out.println("target :");
    int t=sc.nextInt();
    boolean found=false;
    for(int i=0;i<n;i++){
        int r=t-arr[i];
        for(int j=i+1;j<n;j++){

        
        if(arr[j]==r){
            System.out.println("["+i+","+j+"]");
            found=true;
        }
        
    }

    }
    if(!found){
        System.out.println("doesnt have a valid pair");
    }

}}