// multiplication table with 2D Arrays

import java.util.*;
public class Table{
    public static void main(String[] args){
        int table [][] = new int [4][6];
        int row = 1, coloumn =1;
        for (int x=0; x<table.length; x++){
        for (int y=0; y<table[x].length; y++){
            table[x][y] = row*coloumn;
            coloumn=coloumn+1;
        }
        row=row+1;
        coloumn=1;
        }

        for (int x=0; x<table.length; x++){
            for (int y=0;y<table[x].length; y++){
                System.out.print(" " + table[x][y] + "\t" );
        }
            System.out.print("\n");
        }
    }
}
