package Algoritimos;

import java.util.Arrays;

public class selectionSort {

    public static int smallest(int[] arr){
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  //Todo novo loop um novo número é adicionado
            for (int j = i + 1; j < arr.length; j++){  //Loop afrente do loop i
                if (arr[j] < arr[index]){   //Se acharmos um número menor colocamos no index
                    index = j; //Número menor é adicionado
                }  
            }  
            int smallerNumber = arr[index]; //Menor número
            arr[index] = arr[i];  //Menor número é substituido para o número inicial
            arr[i] = smallerNumber; //Menor número é adicionado
            System.out.println(Arrays.toString(arr));
        }  
        return arr[0];
    }  

    public static int indexOfSmallest(int[] array){
        int lowest = array[0];
        int index = 0;
        for(int i = 0 ; i < array.length ; i++){
            if(lowest > array[i]){
                lowest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] array , int initialIndex){
        int lowest = array[initialIndex];
        int index = initialIndex;
        for(int i = initialIndex; i < array.length ; i++){
            if(lowest > array[i]){
                lowest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] array = {4,7,9,10,1};
        int[] array2 = {11,15,2,30,50};
        System.out.println(indexOfSmallest(array));
        System.out.println(smallest(array));
        System.out.println(indexOfSmallestFrom(array2,0));
    }
}
