/**
 * Created by ismet özöztürk on 30/07/15.
 */
public class SubClass extends BaseClass {
    int size = 15;

    public SubClass() {
        size = 10;
    }

    public void printListSize() {
        System.out.println("List size is:" + intarray.length);
    }

    @Override
    protected void initArray() {
        intarray = new int[size];
    }

    public static void main(String args[]) {
        SubClass sub = new SubClass();
        sub.printListSize();
    }
}
