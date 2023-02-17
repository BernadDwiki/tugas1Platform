/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

public class searchAndSort {
    public static int sequentialSearch(int larik[], int kunci) {
        for (int counter = 0; counter <= larik.length - 1; counter++) {
            if (kunci == larik[counter]) {
                return counter;
            }
        }
        return -1;
    }

    public static int binerySearch(int Larik[], int kunci) {
        int awal = 0;
        int akhir = Larik.length - 1;
        while (awal <= akhir) {
            int tengah = (awal + akhir) / 2;
            if (Larik[tengah] == kunci) {
                return tengah;
            } else if (Larik[tengah] > kunci) {
                akhir = tengah - 1;
            } else {
                awal = tengah + 1;

            }
        }
        return -1;
    }
    
    public static int interpolationSearch(int arr[], int lo,
            int hi, int x) {

        int pos;

        if (lo <= hi && x >= arr[lo] && x <= arr[hi]) {

            pos = lo
                    + (((hi - lo) / (arr[hi] - arr[lo]))
                    * (x - arr[lo]));

            if (arr[pos] == x) {
                return pos;
            }

            if (arr[pos] < x) {
                return interpolationSearch(arr, pos + 1, hi,
                        x);
            }

            if (arr[pos] > x) {
                return interpolationSearch(arr, lo, pos - 1,
                        x);
            }
        }
        return -1;
    }
    
    public static void bubleSort(int larik[]) {
        for (int iterasi = 1; iterasi <= larik.length - 1; iterasi++) {
            for (int elemen = 0; elemen <= larik.length - 1 - iterasi; elemen++) {
                if (larik[elemen] > larik[elemen + 1]) {
                    int temp = larik[elemen];
                    larik[elemen] = larik[elemen + 1];
                    larik[elemen + 1] = temp;
                }

            }

        }
    }
    
    public static int[] selection_sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int x = 1 + i; x < arr.length; x++) {
                if (arr[min] > arr[x]) {
                    min = x;
                }
            }
            int z = arr[min];
            arr[min] = arr[i];
            arr[i] = z;
        }
        return arr;
    }
}
