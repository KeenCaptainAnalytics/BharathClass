public class Merge {

    static int[] mergeHelper(int arr1[], int arr2[]){
        int temp[] = new int[arr1.length + arr2.length];
        int i =0;//arr1
        int j =0; // arr2
        int k =0 ; //temp

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                temp[k]=arr1[i];
                i++;
                k++;
            }
            else{
                temp[k]= arr2[j];
                j++;
                k++;
            }

        }

        while(i<arr1.length){
            temp[k] = arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            temp[k] = arr2[j];
            j++;
            k++;
        }
        return temp;

    }
    public static void main(String[] args) {
        int arr1[]= {2,4,7};
        int arr2[] ={1,3,8};
       int result[]= mergeHelper(arr1, arr2);
       print(result);
    }

    static void print(int arr[]){
        for(int i=0;i<arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
