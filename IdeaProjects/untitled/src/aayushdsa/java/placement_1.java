package aayushdsa.java;
import java.util.*;

public class placement_1 {
    public static void main(String[] args) {
        ArrayList<Integer>  height=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
//        1,8,6,2,5,4,8,3,7
        for(int i=0;i<9;i++){
            height.add(sc.nextInt());

        }
       // System.out.println(height);
       int area_water= storewater(height);
        System.out.println(area_water);
    }
    public static int storewater(ArrayList<Integer>height ){
        int maxwater=0;
//        brute force
//        time complexity=0(n^2) when loop is run like below
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
int htt=Math.min(height.get(i),height.get(j));
int width=j-i;
int currwater=htt*width;
maxwater=Math.max(currwater,maxwater);
            }
        }
        return maxwater;
    }
}
