import java.util.Arrays;

public class UF {
    private final int[] id;

    public UF(int n) {
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        if (!connected(p, q)) {
            id[q] = id[p];
        }
    }

    @Override
    public String toString() {
        return "UF{" +
                "id=" + Arrays.toString(id) +
                '}';
    }
}
