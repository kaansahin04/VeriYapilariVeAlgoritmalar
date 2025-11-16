package veriyapıları;

import java.util.*;

public class MonotonicStack {

    public static void main(String[] args) {
        int[] sayılar = {2, 1, 2, 4, 3};
        int[] sonrakiBüyük = sonrakiBüyük(sayılar);

        System.out.println(Arrays.toString(sayılar)+" dizisindeki her eleman için kendinden sonraki ilk büyüğü tutan yeni dizi: "+Arrays.toString(sonrakiBüyük));
    }

    public static int[] sonrakiBüyük(int[] sayılar) {
        int n = sayılar.length;
        int[] sonuç = new int[n];
        Arrays.fill(sonuç, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && sayılar[i] > sayılar[stack.peek()]) {
                int index = stack.pop();
                sonuç[index] = sayılar[i];
            }
            stack.push(i);
        }

        return sonuç;
    }

}