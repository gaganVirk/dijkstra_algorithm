public class IndexMinPQ<Key extends Comparable<Key>>  implements Iterable<Integer> {
    private int n;          // number of elements on PQ
    private int[] pq;       // binary heap using 1-based indexing
    private int[] qp;       // inverse: qp[pq[i]] = pq[qp[i]] = i
    private int[] keys;     // items with priorities

    public IndexMinPQ(int maxN) {
        keys = (Key[]) new Comparable[maxN + 1];
        pq = new int[maxN + 1];
        qp = new int[maxN + 1];
        for(int i = 0; i <= maxN; i++) qp[i] = -1;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public boolean contains(int i) {
        return qp[i] != -1;
    }

    public void insert(int i, Key key) {
        n++;
        qp[i] = n;
        pq[n] = i;
        key[i] = key;
    }

    public Key minKey() {
        return keys[pq[1]];
    }
}
