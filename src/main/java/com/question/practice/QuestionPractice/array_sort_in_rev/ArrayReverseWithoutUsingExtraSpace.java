package com.question.practice.QuestionPractice.array_sort_in_rev;

public class ArrayReverseWithoutUsingExtraSpace {
    public static void main(String[] args) {
        int[] arr = {2,6,8,5,3};
        System.out.println("The reversed array is: ");
        int i =0;
        int j = arr.length -1;

        while (i < j){
            //swappint ith and jth index element
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
        //displaying the array
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + "");

        }
    }
}
