/**
 * Created by sinen on 2017-09-03.
 */
public class Calculation {
    public static int findMax(int arr[]) {
        int max=arr[0];
        for(int i=1; i<arr.length; i++) {
            if (max<arr[i])
                max = arr[i];
        }
        return max;
    }
}
