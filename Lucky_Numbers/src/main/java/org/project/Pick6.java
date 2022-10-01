package org.project;

import java.util.Random;

public class Pick6 {
    private Random random = new Random();
    private int[] arr = new int[6];

    public int[] generateSix() {
        arr[0] = random.nextInt(1, 49);
        arr[1] = random.nextInt(1, 49);
        arr[2] = random.nextInt(1, 49);
        arr[3] = random.nextInt(1, 49);
        arr[4] = random.nextInt(1, 49);
        arr[5] = random.nextInt(1, 49);
        return arr;
    }
}
