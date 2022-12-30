
import java.util.*;
public class selectionSort {

    public void selectionSort(Integer[] arr_obj){
        int len = arr_obj.length;
        for(int i=0;i<len;i++) {
            int j = i;
            int small_element_index = i;
            while(j != len-1) {
                if(arr_obj[small_element_index] > arr_obj[j+1]) {
                    small_element_index = j+1;
                }
                j++;
            }int x = arr_obj[i];
            arr_obj[i] = arr_obj[small_element_index];
            arr_obj[small_element_index] = x;
        }
        System.out.println(Arrays.toString(arr_obj));
    }
    public static void main(String args[]) {
        Integer[] array = {1,9,8,6,3,2,0,5,7,4};
        selectionSort obj = new selectionSort();
        obj.selectionSort(array);
    }
}
// here selectionSort is a type of sorting algorithm which complete the work in O(n^2)
//first it take the starting element and replace it with the smaller element by traversing through the list and so on
/*TIME COMPLEXITY
 *   BEST-CASE: Ω (n);
 *   WORST-CASE: O(n^2);
 *SPACE COMPLEXITY
 *   BEST-CASE: O(1)
 *   WORST-CASE: O(1)
 *   the algorithm which use only constant space without respective to increase in size of input such algorithm are called as "INPLACE" algorithm
 */
