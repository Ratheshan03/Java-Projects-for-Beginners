import java.util.*;

public class Array{
    public static void main (String [] args){
        String [] header = {" Chicago ", " boston ", " New York "," Atlanta "," Miami "," Dallas "," Houston "};
        int [][] number = {{0,987,787,714,1375,967,1087 },
                            {983,0,214,1102,1763,1723,1842},
                            {787,14,0,888,1549,1548,1627},
                            {714,1102,888,0,661,781,810},
                            {1375,1763,1549,661,0,1426,1187},
                            {967,1723,1548,781,1426,0,239},
                            {1087,1842,1627,810,1187,239,0}};
        System.out.println("\t\t\tDistance Table(in miles)");
        System.out.print(" ");
        for (int x=0; x<header.length; x++){
            System.out.printf("%9s",header[x]);
        }
        System.out.println();
        
        for (int x= 0; x<number.length; x++){
            System.out.printf("%9s",header[x]);
            for (int y = 0; y<number[x].length; y++){
                System.out.printf("%9d",number[x][y]);
            }
            System.out.println();
        }
    }
}