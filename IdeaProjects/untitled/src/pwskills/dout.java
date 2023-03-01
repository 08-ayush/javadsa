package pwskills;

public class dout {
    static void swap(int arr [],int p,int q){
        int temp=arr[p];
        arr[p]=arr[q];
        arr[q]=temp;

    }


    public static void main(String[] args) {
        int a=1,b=4;
        int arr[]={1,2,3,4,5};
       //  swap(arr);
        swap(arr, a, b);

        System.out.println(arr[a]);
        System.out.println(arr[b]);
    }
}
