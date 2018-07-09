package SearchingPackage;

/*
 *
 * Author Piyush Sharma Git-Profile(piyush97ps) 
 * 
 */
public class SearchingFunctions {
    static int recursiveSearch(int [] arr,int low,int high){
        if(low==high){
            return arr[low];
        }
        else {
            int mid  = (low+high)/2;
            int x = recursiveSearch(arr, low, mid);
            int y = recursiveSearch(arr, mid + 1, high);
            return (x > y ? x : y);
        }
    }
    public static void main(String arg []){
        int [] arr = {5,2,6,3,4,10,2,3,4,4,5};
        int size = arr.length-1;
        // Greater Value FG()
        long startTime1 = System.nanoTime();
        System.out.println("Recursive Searching recursiveSearch() --> "+recursiveSearch(arr,0,size));
        long endTime1   = System.nanoTime();
        System.out.println("Time in Milliseconds"+(endTime1 - startTime1));
        // Greater value index and value array set FGset()
        long startTime2 = System.nanoTime();
        int [] set = recursiveSearchWithIndex(arr,0,size);
        System.out.println("Recursive Search With Index recursiveSearchWithIndex() --> "+set[0]+" "+set[1]);
        long endTime2   = System.nanoTime();
        System.out.println("Time in Milliseconds"+(endTime2 - startTime2));
        // Greater index greaterIndexBySimpleFor()
        long startTime3 = System.nanoTime();
        System.out.println("Finding Greater Index by using simple For Loop greaterIndexBySimpleFor()  --> "+ greaterIndexBySimpleFor(arr ,size));
        long endTime3   = System.nanoTime();
        System.out.println("Time in Milliseconds"+(endTime3 - startTime3));
        // Find GraterIndex
        long startTime4 = System.nanoTime();
        System.out.println("Finding Greater Index by Jumping index in for loop greaterIndexByJump() --> "+ greaterIndexByJump(arr,size));
        long endTime4   = System.nanoTime();
        System.out.println("Time in Milliseconds"+(endTime4 - startTime4));
    }

    static int[] recursiveSearchWithIndex(int [] arr, int low, int high){
        int [] set = new int[2];
        if(low==high){
            set[0] = arr[low];
            set[1] = low;
            return set;
        }
        else{
            int mid  = (low+high)/2;
            int[] x = recursiveSearchWithIndex(arr, low, mid);
            int[] y = recursiveSearchWithIndex(arr, mid + 1, high);
            return (x[0] > y[0] ? x : y);
        }
    }
    static int greaterIndexBySimpleFor(int arr [], int size){
        int index   = 0;
        for(int i = 0;i<size;i++){
            if(arr[index]<arr[i]){
                index = i;
            }
        }
        return index;
    }
    static int greaterIndexByJump(int arr[], int size) {
        int index   = 0;
        for(int i = 0;i<size-1;i+=2){
            if(arr[index]<arr[i]){
                index = i;
            }else if(arr[index]<arr[i+1]){
                index = i+1;
            }
        }
        return index;
    }
}
