/**
 * Created by ismet özöztürk on 30/07/15.
 * Demonstrating variable initialization problem at base class constructor
 */
abstract class BaseClass {
    int size = 5;
    int[] intarray ;

    BaseClass(){
        initArray();
    }

    protected void initArray(){
        intarray = new int[size];
    }

}

