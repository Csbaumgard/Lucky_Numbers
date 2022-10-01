package org.project;

import java.util.Random;

public class Pick5 {
    private Random random = new Random();
    private int[] arr = new int[5];

    public int[] generateFive() {
        arr[0] = random.nextInt(1, 9);
        arr[1] = random.nextInt(1, 9);
        arr[2] = random.nextInt(1, 9);
        arr[3] = random.nextInt(1, 9);
        arr[4] = random.nextInt(1, 9);
        return arr;
    }
}
