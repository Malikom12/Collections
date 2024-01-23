package org.example;

public class ArrayListEx {
    private int[] data;
    private int num_elements;

    public void MyArrayList(){
        data = new int[10];
    }

    public int size(){
        return num_elements;
    }

    public void add(int num){
        if (num_elements == data.length){
            grow();
        }
        data[num_elements] = num;
        num_elements++;
    }

    private void grow(){
        int[] newData = new int[data.length + 10];
        for (int i = 0; i < num_elements; i++){
            newData[i] = data[i];
        }
        data = newData;
    }


}
