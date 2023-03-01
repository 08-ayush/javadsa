package GFG_Questions;
import java.util.*;
public class maxsubaaryasum {


    static  void subarraysum(int arr[],int sum){
        int currsum=0;
        int start=0;
        int max=0;
        int end=-1;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i< arr.length;i++){
            currsum+=arr[i];
            if(currsum-sum==0){
                start=0;
                end=i;
                break;
            }
            if(map.containsKey(currsum-sum)){
                start=map.get(currsum-sum)+1;
                end=i;
//                break;
                if(end-start>max){
                    max=end-start;
                }
            }
            map.put(currsum,i);
        }
        if(end==-1){
            System.out.println("not found");
        }
        else{
            System.out.println(start+" "+end);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();

        }
        int sum= sc.nextInt();
        subarraysum(arr,sum);
    }
}
