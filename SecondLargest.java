import java.util.*;

public class SecondLargest {

     public static int  largest(int arr[], int n) {
        int i,j,t;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        return arr[n-2];
    }
    public static void main(String[] args) {
        int arr[] = { 12, 35, 1, 10, 34, 1 };
        int n = arr.length;
        System.out.println("Second Largest : "+ largest(arr, n));
    }
}
