import java.util.*;

public class mergesort {
    public List<Integer> msort(List<Integer> arr) {
        int l = arr.size();
        if (l <= 1) {
            return arr;
        }
        List<Integer> a = new ArrayList<Integer>();
        List<Integer> b = new ArrayList<Integer>();
        for (int i = 0; i < l / 2; i++) {
            a.add(arr.get(i));
        }
        for (int j = l / 2; j < l; j++) {
            b.add(arr.get(j));
        }
        msort(a);
        msort(b);

        int i = 0;
        int j = 0;
        int k = 0;
        int l_a = a.size();
        int l_b = b.size();
        while(i != l_a && j != l_b) {
            if(a.get(i) < b.get(j)) {
                arr.set(k,a.get(i));
                i += 1;
            } else {
                arr.set(k,b.get(j));
                j += 1;
            }
            k += 1;
        }
        while(i < l_a) {
            arr.set(k,a.get(i));
            i += 1;
            k += 1;
        }
        while(j < l_b) {
            arr.set(k,b.get(j));
            j += 1;
            k += 1;
        }
        return arr;
    }

    public static void main(String[] args) {
        mergesort obj = new mergesort();
        List<Integer> b = new ArrayList<>();
        Integer[] a = {8,4,3,19,21,2,0,5,1,10,10};
        int l = a.length;
        for(int i=0;i<l;i++) {
            b.add(a[i]);
        }
        System.out.println(obj.msort(b));
    }
}
