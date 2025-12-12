
public class MaxSegmentTreeQueries {

    static int tree[];

    public static void initialize(int n) {
        tree = new int[4 * n];
    }

    public static void buildST(int i, int si, int sj, int arr[]) {
        if (si == sj) {
            tree[i] = arr[si];
            return;

        }

        int mid = (si + sj) / 2;
        buildST(2 * i + 1, si, mid, arr);
        buildST(2 * i + 2, mid + 1, sj, arr);

        tree[i] = Math.max(tree[2 * i + 1], tree[2 * i + 2]);

    }

    public static int getmaxUtil(int i, int si, int sj, int qi, int qj) {
        if (si > qj || sj < qi) { // no overlap
            return Integer.MIN_VALUE;
        } else if (si >= qi && sj <= qj) { // complete overlap
            return tree[i];
        } else {  // partial overlap

            int mid = (si + sj) / 2;
            int leftAns = getmaxUtil(2 * i + 1, si, mid, qi, qj);
            int rightAns = getmaxUtil(2 * i + 2, mid + 1, sj, qi, qj);
            return Math.max(leftAns, rightAns);

        }
    }

    public static int getMax(int arr[], int qi, int qj) {
        int n = arr.length;
        return getmaxUtil(0, 0, n - 1, qi, qj);
    }

     public static void updateUtil(int i, int si, int sj, int idx, int newVal) {
        if (idx < si || idx > sj) return;

        if (si == sj) { 
            tree[i] = newVal;
            return;
        }

        int mid = (si + sj) / 2;

        if (idx <= mid) {
            updateUtil(2 * i + 1, si, mid, idx, newVal);
        } else {
            updateUtil(2 * i + 2, mid + 1, sj, idx, newVal);
        }

        
        tree[i] = Math.max(tree[2 * i + 1], tree[2 * i + 2]);
    }

    public static void update(int arr[], int idx, int newVal) {
        arr[idx] = newVal;
        int n = arr.length;
        updateUtil(0, 0, n - 1, idx, newVal);
    }

    public static void main(String[] args) {
        int arr[] = {6, 8, -1, 2, 17, 1, 3, 2, 4};
        int n = arr.length;
        initialize(n);
        buildST(0, 0, n - 1, arr);

        int max = getMax(arr, 2, 5);
        System.out.println(max);
        update(arr, 2, 20);
        System.out.println(getMax(arr, 2, 5));

    }
}
