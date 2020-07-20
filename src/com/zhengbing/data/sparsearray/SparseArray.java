package com.zhengbing.data.sparsearray;

/**
 * @author zhengbing_vendor
 */
public class SparseArray{

    public static void main(String[] args) {
        // 1. 创建一个原始的二维数组 11*11
        // 0 表示没有棋子， 1表示黑棋  2 表示蓝棋
        int[][] chessArray = new int[11][11];

        chessArray[1][2] = 1;
        chessArray[2][3] = 2;

        //  输出原始数组
        System.out.println("原始数组");
        for (int  i = 0; i<chessArray.length; i++){
            for (int j = 0; j<chessArray[i].length;j++){
                System.out.print(chessArray[i][j]+" ");
            }
            System.out.println();
        }

        // 2. 将二维数组转为稀疏数组，
        // 先遍历原始数组，得到非0数据的个数
        int sum = 0;
        for (int  i = 0; i<chessArray.length; i++){
            for (int j = 0; j<chessArray[i].length;j++){
                if (chessArray[i][j]!=0){
                    sum++;
                }
            }
        }

        // 创建对应的稀疏数组
        int[][] sparsearray = new int[sum+1][3];

        sparsearray[0][0] = chessArray.length;
        sparsearray[0][1] = chessArray[0].length;
        sparsearray[0][2] = sum;

        // 给对应的稀疏数组赋值
        // 用于记录第几个非零
        // 遍历原始二维数组，将非0数据 存放到  sparseArray
        int count = 0;
        for (int  i = 0; i<chessArray.length; i++){
            for (int j = 0; j<chessArray[i].length;j++){
                if (chessArray[i][j]!=0){
                    count++;
                    sparsearray[count][0]=i;
                    sparsearray[count][1]=j;
                    sparsearray[count][2]=chessArray[i][j];
                }
            }
        }

        // 3 输出稀疏数组的形式
        System.out.println("\n稀疏数组");
        for (int i =0; i<sparsearray.length;i++){
            for (int j = 0; j<sparsearray[i].length;j++){
                System.out.print(sparsearray[i][j]+" ");
            }
            System.out.println();
        }

        // 4 将稀疏数组 恢复成二维数组。
        // 4.1 先读取稀疏数组的第一行，创建原始二维数组的结构
        int[][] chessarray2 = new int[sparsearray[0][0]][sparsearray[0][1]];
        // 4.2 再读取稀疏数组后几行的数据，并复制给原始的二维数组
        for (int i=1; i<sparsearray.length;i++){
            chessarray2[sparsearray[i][0]][sparsearray[i][1]]=sparsearray[i][2];
        }

        // 输出稀疏数组还原出的原始数组
        System.out.println("\n还原出的原始数组"        );
        for (int  i = 0; i<chessarray2.length; i++){
            for (int j = 0; j<chessarray2[i].length;j++){
                System.out.print(chessarray2[i][j]+" ");
            }
            System.out.println();
        }
    }

}