import java.util.Arrays;
public class insertionSort {
    public void isort(Integer[] brray){
        int i = brray.length;

        for(int j=1;j<i;j++){
            int k = j;
            int l = brray[k];
            while((k>0) && (brray[k-1] > l)){
                brray[k] = brray[k-1];
                k -= 1;
            }
            brray[k] = l;
        }System.out.print(Arrays.toString(brray));
    }

    public static void main(String args[]){
        Integer[] array = {11,5,2,6,0,9,8,4,1,3};
        insertionSort is = new insertionSort();
        is.isort(array);
    }
}


//Description:
/*TIME COMPLEXITY
 *   BEST-CASE: Ω (n);
 *   WORST-CASE: O(n^2);
 *SPACE COMPLEXITY
 *   BEST-CASE: O(1)
 *   WORST-CASE: O(1)
 *   the algorithm which use only constant space without respective to increase in size of input such algorithm are called as "INPLACE" algorithm
 */
// insertionSort algorithm is an sorting algorithm.
// first it starts from index 1 of an array.and store it with an variable some X,compare it with index-1
// if index< index-1 is True then replace arr[index] with arr[index-1].
// and continue it by decreasing the index value till 0.in every index-1 if arr[index-1] > some X then arr[index] is replaced by arr[index-1]
// if index == 0 then replace arr[0] with arr[some variable X which is used to store the starting index value].
