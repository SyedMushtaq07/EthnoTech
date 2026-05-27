import java.util.*;
public class ArrayExample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] newArr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = 0;
        for(int i=0;i<n;i++){
            int mul = 1;
            for(int j=0;j<n;j++){
                if(i!=j){
                    mul *= arr[j];
                }
            }
            newArr[k++] = mul;
            //System.out.print(mul+" ");
        }
        for(int num:newArr){
            System.out.print(num+" ");
        }
    }
}
