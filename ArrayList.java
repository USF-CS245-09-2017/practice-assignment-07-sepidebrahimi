//Sepid Ebrahimi, CS245


import java.util.*;

public class ArrayList<T> implements List<T> {

    private T[] array;
    private int size;
    private int max_size;

    public ArrayList(){

        this.size = 0;
        this.max_size = 10;
        array = (T[]) new Object[10];

    }

    public void add(T item) {

        if (size == max_size) { //increases the size of the array if needed
            growArray();
            max_size*= 2;
        }
        array[size] = item;
        size++;

    }

    public void add (int pos, T item){ //adds an item into a specific position

        if (size == max_size) { //check if we need more space/grows the array
            growArray();
            max_size*= 2;

        }

        for(int i = size; i > pos; i--){
            array[i] = array[i-1];
        }
        array[pos] = item;
        size++;

    }

    public T get(int pos){ //get an item

        if(pos < 0 || pos > size){ //check if its in bound
            throw new ArrayIndexOutOfBoundsException("Out of Bound");
        }

        T data = array[pos];
        return data;


    }

    public T remove(int pos){ //remove an item

        if(pos < 0){
            throw new ArrayIndexOutOfBoundsException("Out of Bound");

        }

        T removed = array[pos];

        for(int i = pos+1; i < size; i++){
            array[i-1] = array[i];
        }

        size--;
        return removed;

    }

    public int size(){ //returns instance variable

        return this.size;

    }

    public void growArray(){ //double the size of the array

        T[] temp = (T[]) new Object[array.length * 2];

        for(int i = 0; i < size; i++){
            temp[i] = array[i];
        }

        array = temp;

    }



}