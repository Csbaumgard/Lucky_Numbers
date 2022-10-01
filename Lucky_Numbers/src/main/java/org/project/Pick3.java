package org.project;

import java.util.Random;

public class Pick3 {
    private Random random = new Random();
    private int[] arr = new int[3];

    public int[] generateThree() {
        arr[0] = random.nextInt(1, 9);
        arr[1] = random.nextInt(1, 9);
        arr[2] = random.nextInt(1, 9);
        return arr;
    }
}
