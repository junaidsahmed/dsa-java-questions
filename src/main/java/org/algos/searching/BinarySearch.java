package org.algos.searching;


import java.util.Arrays;

/**
 * @author Junaid Shakeel
 */

public class BinarySearch {



    public int binarySearch(int[] input, int element){

        System.out.println(Arrays.toString(input));
        var left = 0;
        var right = input.length-1;
        while (right>=left){
            var mid = left + (right-left)/2;
            int midElement = input[mid];
            if(midElement<element)
                left= mid+1;
            else if (midElement> element)
                right= mid - 1;
            else{
                return mid;}
        }
        return -1;
    }

    public int binarySearchRecursive(int[] input, int element){

       return this.binarySearch(input,element,0,input.length);

    }

    public int binarySearch(int[] input, int element, int left, int right){

        var mid = left + (right-left)/2;

        if(right<left)
            return -1;
        if(input[mid]< element)
            return this.binarySearch(input,element,mid+1,right);
        if(input[mid]>element)
            return this.binarySearch(input,element,left,mid-1);
        if (input[mid] == element) {
            return mid;
        }
        return -1;
    }

    void main(){

        int[] myArr = new int[]{2,3,6,8,9,13,20};
        var val1 =  this.binarySearch(myArr,20);
        var val2 =  this.binarySearchRecursive(myArr,20);

        System.out.format("binarySearch-> index: %s\n",val1);
        System.out.format("binarySearchRecursive-> index: %s",val2);
    }
}