package org.example;

public class Calculator {
    private int[] arr;
    public Calculator(int[] arr){
        this.arr = arr;

    }
    public long sum(){
        long sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
