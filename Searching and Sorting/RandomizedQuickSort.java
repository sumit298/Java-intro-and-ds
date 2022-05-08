public class RandomizedQuickSort {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    }

    public static void randomizedQuickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            randomizedQuickSort(arr, low, pivot - 1);
            randomizedQuickSort(arr, pivot + 1, high);
        }
    }
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}

// What is randomized quick sort?
// Randomized quick sort is a variation of quick sort.
// It picks a random element as pivot and partitions the array around the pivot.
// It is a variation of quick sort where the pivot is chosen randomly.
// It is a randomized algorithm.
// It is a comparison sort.
// It is a divide and conquer algorithm.



// what is big data