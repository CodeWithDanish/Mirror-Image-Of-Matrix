package com.company;

import javax.xml.crypto.Data;
import java.awt.image.ImagingOpException;
import java.io.DataInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        DataInputStream d = new DataInputStream(System.in);
        int m;
        int n;
        int i;
        int j;
        int k;
        int l;
        int[][] a = new int[10][10];
        System.out.println("Enter Rows m:");
        m = Integer.parseInt(d.readLine());
        System.out.println("Enter columns n:");
        n = Integer.parseInt(d.readLine());
        System.out.println("Enter the matrix:");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = Integer.parseInt(d.readLine());
            }
            System.out.println();
        }
        System.out.println("Original matrix:");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Mirror image of a matrix:");
        for (i = 0; i < m; i++) {
            for (j = n-1; j > n/2; j--) {
                System.out.print(a[i][j] + " ");
            }
            for (k=n/2;k>=0;k--)
            {
                System.out.print(a[i][k]+" ");
            }
            System.out.println();
        }
    }}
