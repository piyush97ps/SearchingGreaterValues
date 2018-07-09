package SearchingPackage;

/*
 *
 * Author Piyush Sharma Git-Profile(piyush97ps) 
 * 
 */

public class Main {

    public static void main(String arg []){
        SearchingFunctions sf = new SearchingFunctions();
        int [] arr = {5,2,6,3,4,10,2,3,4,4,5};
        int size = arr.length-1;
        // Finding Greater Value by using recursiveSearch()
        long startTime1 = System.nanoTime();
        System.out.println("Recursive Searching recursiveSearch() --> "+sf.recursiveSearch(arr,0,size));
        long endTime1   = System.nanoTime();
        System.out.println("Time in Milliseconds"+(endTime1 - startTime1));
        // Greater value and index array by using recursiveSearchWithIndex()
        long startTime2 = System.nanoTime();
        int [] set = sf.recursiveSearchWithIndex(arr,0,size);
        System.out.println("Recursive Search With Index recursiveSearchWithIndex() --> "+set[0]+" "+set[1]);
        long endTime2   = System.nanoTime();
        System.out.println("Time in Milliseconds"+(endTime2 - startTime2));
        //Finding Greater value index by using greaterIndexBySimpleFor()
        long startTime3 = System.nanoTime();
        System.out.println("Finding Greater Index by using simple For Loop greaterIndexBySimpleFor()  --> "+ sf.greaterIndexBySimpleFor(arr ,size));
        long endTime3   = System.nanoTime();
        System.out.println("Time in Milliseconds"+(endTime3 - startTime3));
        // Finding Greater value Index by using greaterIndexByJump()
        long startTime4 = System.nanoTime();
        System.out.println("Finding Greater Index by Jumping index in for loop greaterIndexByJump() --> "+ sf.greaterIndexByJump(arr,size));
        long endTime4   = System.nanoTime();
        System.out.println("Time in Milliseconds"+(endTime4 - startTime4));
    }
}
