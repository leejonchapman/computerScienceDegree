import java.util.Arrays;

public class QF {
    private int id[];

    //Initialise and populate array
    public QF(int n) {
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    //Call method findRoot and check other integer to see if they are a connected component.
    public boolean isConnected(int p, int q) {
        return findRoot(p) == findRoot(q);
    }

    //Climb up and check till you get to the root.
    private int findRoot(int p) {
        while (p != id[p]) {
            p = id[p];
        }
        return p;
    }

    //Makes P a child of Q if components arent connected.
    public void union(int p, int q) {
        if (!isConnected(p, q)) {
            id[findRoot(p)] = id[findRoot(q)];
        }
    }

    @Override
    public String toString() {
        return "QF{" +
                "id=" + Arrays.toString(id) +
                '}';
    }
}