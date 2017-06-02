package com.practice.backtracking;

/**
 * Created by sunilsahu on 02-06-2017.
 */
public class SudokuSolver {
    private static int[][] grid;

    private boolean  solve() {
        if (grid.length < 9) {

            return false;
        }

        int[] emptyCell = findEmptyCell();
        int row = emptyCell[0];
        int col = emptyCell[1];

        if(row == -1){
            return true;
        }

        for(int i=1;i<=9;i++){
            if(isRowSafe(row,i) && isColSafe(col,i) && isBoxSafe(row-row%3,col-col%3,i)){
                grid[row][col]=i;
               if (solve()){
                   return true;
               }




                grid[row][col]=0;

            }
        }


        return false;
    }

    private boolean isBoxSafe(int row,int col,int num) {
        for(int i=row;i<row+3;i++){
            for(int j=col;j<col+3;j++){

                if (grid[i][j]==num){
                    return false;
                }
            }
        }
        return true;

    }

    private boolean isColSafe(int col,int num) {
        for(int i=0;i<9;i++){
            if (grid[i][col]==num){
                return false;
            }
        }
        return true;

    }

    private boolean isRowSafe(int row,int num) {
        for(int i=0;i<9;i++){
            if (grid[row][i]==num){
                return false;
            }
        }
        return true;
    }

    private int[] findEmptyCell() {

        for (int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(grid[i][j]==0){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }



    private void printGrid() {
        for(int i=0;i<9;i++){
            System.out.println();
            if(i%3==0){
                System.out.println();
            }
            for(int j=0;j<9;j++){
                if(j%3==0){
                    System.out.print(" ");
                }
                System.out.print(grid[i][j]);
            }
        }
    }

    public static void main(String[] args){
        SudokuSolver ss = new SudokuSolver();
        grid=new int[][]{
                {0,4,2,0,0,8,0,0,7},
                {0,9,0,0,0,0,0,0,0},
                {7,0,0,0,9,0,0,0,3},
                {5,3,0,0,0,0,0,0,0},
                {0,7,0,6,0,2,0,4,0},
                {0,0,0,0,0,0,0,1,8},
                {6,0,0,0,7,0,0,0,5},
                {0,0,0,0,0,0,0,8,0},
                {4,0,0,8,0,0,1,7,0}
        };
        ss.printGrid();
        if(ss.solve()){

            System.out.println("\n*******************SOLUTION***************");
            ss.printGrid();
        }else{
            System.out.println("NO SOLUTION");
        }
    }


}
