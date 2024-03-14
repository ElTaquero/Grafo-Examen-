public class grafo {
    public static void main (String[] args){
        int[][] mAdy;
        int[][] mAdy2;
        int[][] mAdy3;
        int[][] mAdy4;
        int[][] mAdy5;
        mAdy = new int[5][5];
        mAdy2 = new int[6][6];
        mAdy3 = new int[6][6];
        mAdy4 = new int[5][5];
        mAdy5 = new int[6][6];

        //GRAFO 1

        mAdy[1][1] = 0;
        mAdy[1][2] = 1;
        mAdy[1][3] = 0;
        mAdy[1][4] = 0;

        mAdy[2][1] = 1;
        mAdy[2][2] = 0;
        mAdy[2][3] = 1;
        mAdy[2][4] = 1;

        mAdy[3][1] = 0;
        mAdy[3][2] = 1;
        mAdy[3][3] = 0;
        mAdy[3][4] = 1;

        mAdy[4][1] = 0;
        mAdy[4][2] = 1;
        mAdy[4][3] = 1;
        mAdy[4][4] = 0;

        //GRAFO 2

        mAdy2[1][1] = 0;
        mAdy2[1][2] = 0;
        mAdy2[1][3] = 0;
        mAdy2[1][4] = 1;
        mAdy2[1][5] = 0;

        mAdy2[2][1] = 0;
        mAdy2[2][2] = 0;
        mAdy2[2][3] = 0;
        mAdy2[2][4] = 1;
        mAdy2[2][5] = 0;

        mAdy2[3][1] = 0;
        mAdy2[3][2] = 0;
        mAdy2[3][3] = 0;
        mAdy2[3][4] = 1;
        mAdy2[3][5] = 1;

        mAdy2[4][1] = 1;
        mAdy2[4][2] = 1;
        mAdy2[4][3] = 1;
        mAdy2[4][4] = 0;
        mAdy2[4][5] = 1;

        mAdy2[5][1] = 0;
        mAdy2[5][2] = 0;
        mAdy2[5][3] = 1;
        mAdy2[5][4] = 1;
        mAdy2[5][5] = 0;

        //GRAFO 3

        mAdy3[1][1] = 0;
        mAdy3[1][2] = 1;
        mAdy3[1][3] = 0;
        mAdy3[1][4] = 0;
        mAdy3[1][5] = 0;

        mAdy3[2][1] = 1;
        mAdy3[2][2] = 0;
        mAdy3[2][3] = 1;
        mAdy3[2][4] = 1;
        mAdy3[2][5] = 0;

        mAdy3[3][1] = 0;
        mAdy3[3][2] = 1;
        mAdy3[3][3] = 0;
        mAdy3[3][4] = 1;
        mAdy3[3][5] = 0;

        mAdy3[4][1] = 0;
        mAdy3[4][2] = 1;
        mAdy3[4][3] = 1;
        mAdy3[4][4] = 1;
        mAdy3[4][5] = 1;

        mAdy3[5][1] = 0;
        mAdy3[5][2] = 0;
        mAdy3[5][3] = 0;
        mAdy3[5][4] = 1;
        mAdy3[5][5] = 0;

        //GRAFO 4

        mAdy4[1][1] = 0;
        mAdy4[1][2] = 0;
        mAdy4[1][3] = 0;
        mAdy4[1][4] = 1;

        mAdy4[2][1] = 0;
        mAdy4[2][2] = 0;
        mAdy4[2][3] = 1;
        mAdy4[2][4] = 0;

        mAdy4[3][1] = 0;
        mAdy4[3][2] = 1;
        mAdy4[3][3] = 0;
        mAdy4[3][4] = 1;

        mAdy4[4][1] = 0;
        mAdy4[4][2] = 0;
        mAdy4[4][3] = 1;
        mAdy4[4][4] = 1;

        //GRAFO 5

        mAdy5[1][1] = 0;
        mAdy5[1][2] = 1;
        mAdy5[1][3] = 0;
        mAdy5[1][4] = 0;
        mAdy5[1][5] = 0;

        mAdy5[2][1] = 1;
        mAdy5[2][2] = 0;
        mAdy5[2][3] = 1;
        mAdy5[2][4] = 1;
        mAdy5[2][5] = 0;

        mAdy5[3][1] = 0;
        mAdy5[3][2] = 1;
        mAdy5[3][3] = 0;
        mAdy5[3][4] = 1;
        mAdy5[3][5] = 0;

        mAdy5[4][1] = 0;
        mAdy5[4][2] = 1;
        mAdy5[4][3] = 1;
        mAdy5[4][4] = 1;
        mAdy5[4][5] = 1;

        mAdy5[5][1] = 0;
        mAdy5[5][2] = 0;
        mAdy5[5][3] = 0;
        mAdy5[5][4] = 1;
        mAdy5[5][5] = 0;

        System.out.println("\n\nGRAFO 1\n");
        printMatriz(mAdy);
        System.out.println("\n\nGRAFO 2\n");
        printMatriz(mAdy2);
        System.out.println("\n\nGRAFO 3\n");
        printMatriz(mAdy3);
        System.out.println("\n\nGRAFO 4\n");
        printMatriz(mAdy4);
        System.out.println("\n\nGRAFO 5\n");
        printMatriz(mAdy5);

    }

    public static void  printMatriz (int[][] matriz){
        for(int i=1; i<matriz.length; i++){
            for(int j=1; j<matriz[i].length; j++)
            System.out.println("["+ i +"]["+ j +"] = " + matriz[i][j]);
        }
    }
}