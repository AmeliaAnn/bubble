package com.bubble;

public class Main {

    public static void main(String[] args) {

        public void bubbleSort(int[] arr)
        {
            boolean swapped = true;
            for(int i = 0; i < arr.length-1; i++) {
                swapped = false;
                for(int j = 0; j < arr.length-i-1; j++) {
                    if(arr[j] > arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        swapped = true;
                    }
                }
                if(swapped == false)
                    break;
            }
        }
    }
}