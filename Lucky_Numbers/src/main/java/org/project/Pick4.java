package org.project;

import java.util.Random;

public class Pick4 {
    private Random random = new Random();
    private int[] arr = new int[4];

    public int[] generateFour() {
        arr[0] = random.nextInt(1, 9);
        arr[1] = random.nextInt(1, 9);
        arr[2] = random.nextInt(1, 9);
        arr[3] = random.nextInt(1, 9);
        return arr;
    }
}
