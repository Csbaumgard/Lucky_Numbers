package org.project;

import java.util.Random;

public class MegaMillions {
    Random random = new Random();
    private int[] arr = new int[5];
    private int megaBall;

    public int[] megaMillions() {
        arr[0] = random.nextInt(1, 70);
        arr[1] = random.nextInt(1, 70);
        arr[2] = random.nextInt(1, 70);
        arr[3] = random.nextInt(1, 70);
        arr[4] = random.nextInt(1, 70);
        return arr;
    }

    public int megaBall() {
        megaBall = random.nextInt(1, 25);
        return megaBall;
    }
}
