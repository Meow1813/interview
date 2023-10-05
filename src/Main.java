import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(method(arr));
    }
    public static List<Integer> method(int[] arr){
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                list.add(arr[i]+1);
            }else{
                list.add(arr[i]);
            }
        }
        return list.subList(2,7);
    }
}