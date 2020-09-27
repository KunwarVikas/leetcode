package main.com.kv.leetcode.medium;

/**
 * Given an 2D board, count how many battleships are in it. The battleships are represented with 'X's, empty slots are represented with '.'s. You may assume the following rules:
 * You receive a valid board, made of only battleships or empty slots.
 * Battleships can only be placed horizontally or vertically. In other words, they can only be made of the shape 1xN (1 row, N columns) or Nx1 (N rows, 1 column), where N can be of any size.
 * At least one horizontal or vertical cell separates between two battleships - there are no adjacent battleships.
 * Example:
 * X..X
 * ...X
 * ...X
 * In the above board there are 2 battleships.
 * Invalid Example:
 * ...X
 * XXXX
 * ...X
 * This is an invalid board that you will not receive - as battleships will always have a cell separating between them.
 * Follow up:
 * Could you do it in one-pass, using only O(1) extra memory and without modifying the value of the board?
 */
public class BattleshipsInABoard419 {
    /**
     *
     * @param grid
     * @return
     */
    public int countBattleships(char[][] grid) {
        int numOfIslands = 0;
        if(grid==null || grid.length==0){
            return numOfIslands;
        }

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='X'){
                    numOfIslands+=dfs(grid, i ,j);
                }
            }
        }
        return numOfIslands;
    }

    /**
     *
     * @param grid
     * @param i
     * @param j
     * @return
     */
    public int dfs(char [][] grid, int i, int j) {
        if(i<0 || i>=grid.length||j<0||j>=grid[i].length||grid[i][j]=='.'){
            return 0;
        }

        grid[i][j]='.';
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
        return 1;
    }
}
