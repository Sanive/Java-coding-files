
import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 3, 9, 4, 5, 6};
        Duplicate Dup = new Duplicate();
        boolean result = Dup.checkDuplicate(arr);
        System.out.println(result);

    }
    public boolean checkDuplicate(int[] num){
        int n = num.length;
        Arrays.sort(num);

        for(int i = 1; i < n; i++){
            if(num[i] == num[i-1]){
                return true;
            }
        }
        return false;
    }
    
}
