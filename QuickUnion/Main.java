package QuickUnion;
public class Main {
    public static void main(String args[]){
        QuickUnion quickunion = new QuickUnion(10);
        quickunion.print();
        quickunion.union(1, 5);
        quickunion.union(6, 9);
        quickunion.union(2, 7);
        quickunion.union(0, 8);  
        quickunion.print();
        quickunion.union(5, 9);
        quickunion.union(2, 0);
        quickunion.print();
    }
}
