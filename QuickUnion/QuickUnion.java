package QuickUnion;
public class QuickUnion {
    private int[] id;
    QuickUnion(int N){
        id = new int[N];
        for(int i = 0; i<N ; i++){
            id[i] = i;
        }
    }
    private int root(int p){
        while(id[p] != p){
            p = id[p];
        }
        return p;
    }
    public boolean connected(int p, int q){
        return (root(p) == root(q));
    }
    public void union(int p, int q){
        id[root(q)] = root(p);
    }
    public void print(){
        for(int i = 0 ; i < id.length ; i++){
            id[i] = root(i);
            System.out.print(id[i] + " ");
        }
        System.out.println();
    }
}
