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
        for (int  i = 0; i<chessArray.length; i++){
            for (int j = 0; j<chessArray[i].length;j++){
                System.out.print(chessArray[i][j]+" ");
            }
            System.out.println();
        }

        // 2. 将二维数组转为稀疏数组，
        // 先遍历原始数组，得到非0数据的个数

        // 创建对应的稀疏数组

        // 给对应的稀疏数组赋值

        // 遍历原始二维数组，将非0数据 存放到  sparseArray


        // 3 输出稀疏数组的形式


        // 4 将稀疏数组 回复称二维数组。

        // 4.1 先读取稀疏数组的第一行，创建原始二维数组的结构

        // 4.2 再读取稀疏数组后几行的数据，并复制给原始的二维数组


    }

}