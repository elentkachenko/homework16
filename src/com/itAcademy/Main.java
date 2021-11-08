package com.itAcademy;

public class Main {

    public static void main(String[] args) {
        float[] arr = new float[10000000];
        for (int i = 0; i < arr.length; i++) arr[i] = 1.0f;
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++)
            arr[i] = (float) (arr[i] * Math.sin(0.2f + arr[i] / 5) * Math.cos(0.2f + arr[i] / 5) * Math.cos(0.4f + arr[i] / 2));
        System.out.println((System.currentTimeMillis() - a));

    }
}
