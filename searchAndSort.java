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
}
