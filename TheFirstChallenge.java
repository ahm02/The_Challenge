import java.util.Scanner;

public class TheFirstChallenge {

    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {

        int rowss , col;
        System.out.println(" enter the number of rows for the array number 1");
        rowss = read.nextInt();
        System.out.println(" enter the number of columns for array number 1");
        col = read.nextInt();
        int [][] array1 = new int[rowss][col];

        store(array1);

        System.out.println(" enter the number of rows for the array number 2 ");
        rowss = read.nextInt();
        System.out.println(" enter the number of columns for array number 2");
        col = read.nextInt();
        int [][] array2 = new int[rowss][col];

        store(array2);

        sum(array1,array2);

    }
    public static void sum (int [][] array , int [][] array1){

        int rows = 4  , columns = 4;
        int [][] sum = new int[rows][columns];
        for (int i = 0 ; i< array.length ; i++){
            for (int j = 0; j < array[0].length ; j++) {

                sum[i][j] += array[i][j] + array1[i][j];
                System.out.println(sum[i][j]);
            }
        }
    }


    public static void store(int[][] array) {


        for (int row = 0; row < array.length; row++) {

            for (int column = 0; column < array[0].length; column++) {
                System.out.println("enter the data for the row number " + (row+1) + " And enter the data for column number " + (column+1));
                array[row][column] = read.nextInt();
            }
        }
    }

}
