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
}
