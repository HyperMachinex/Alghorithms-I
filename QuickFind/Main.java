package QuickFind;
public class Main {
    public static void main(String args[]){
        QuickFind quickfind = new QuickFind(10);
        quickfind.print();
        quickfind.union(5, 2);
        quickfind.union(8, 1);
        quickfind.union(0, 9);
        quickfind.union(6, 7);
        quickfind.print();
        quickfind.union(0, 1);
        quickfind.print();
        quickfind.union(2, 9);
        quickfind.print();
    }
}
