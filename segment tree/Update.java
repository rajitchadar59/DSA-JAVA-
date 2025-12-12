public class Update {

    static int tree[];

    public static void initialize(int n) {
        tree = new int[4 * n];
    }

    public static int buildSegmentTree(int arr[], int i, int start, int end) {
        if (start == end) {
            tree[i] = arr[start];
            return arr[start];

        }

        int mid = (start + end) / 2;
        buildSegmentTree(arr, 2 * i + 1, start, mid);
        buildSegmentTree(arr, 2 * i + 2, mid + 1, end);
        tree[i] = tree[2 * i + 1] + tree[2 * i + 2];

        return tree[i];
    }

    public static void updateUtil(int i, int si, int sj, int idx, int diff) {
        if (idx > sj || idx < si) {
            return;
        }

        tree[i] += diff;

        if (si != sj) {
            int mid = (si + sj) / 2;
            updateUtil(2 * i + 1, si, mid, idx, diff); //left 
            updateUtil(2 * i + 2, mid + 1, sj, idx, diff); //right
        }
    }

    public static void update(int arr[], int idx, int newval) {
        int n = arr.length;
        int diff = newval - arr[idx];
        arr[idx] = newval;
        updateUtil(0, 0, n - 1, idx, diff); // segment tree updation

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        initialize(n);
        buildSegmentTree(arr, 0, 0, n - 1);
       
        for(int i =0 ; i < tree.length ; i++ ){
            System.out.print(tree[i]+" ");
        }

         update(arr, 2, 2);
         System.out.println();

         for(int i =0 ; i < tree.length ; i++ ){
            System.out.print(tree[i]+" ");
        }

    }
}
