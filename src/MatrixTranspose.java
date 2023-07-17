import java.util.Scanner;

public class MatrixTranspose {
    static void transpose(int mat[][],int rowsize,int colsize) {
        int matT[][]=new int[colsize][rowsize];


        for (int i = 0; i < colsize ; i++) {
            for (int j = 0; j < rowsize; j++) {

                    matT[i][j]=mat[j][i];
                System.out.print(matT[i][j]+" ");

                }
            System.out.println();

            }

        }


    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        int rowsize=scan.nextInt();
        int colsize=scan.nextInt();
        int mat[][]=new int[rowsize][colsize];


        for(int i=0;i<rowsize;i++){
            for (int j=0;j<colsize;j++){
                mat[i][j]=scan.nextInt();

            }

        }
        transpose(mat,rowsize,colsize);

    }
}
