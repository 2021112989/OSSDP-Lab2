package Lab2;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


public class L2021112989_8_Test {
    /*
    * testing strategy
    * 1. 当grid为null
    * 2. 当grid只有一行或者一列
    * 3. 当grip有多行多列时
     * */
    @Test
    public void dfs() {
    }

    @Test
    public void numIslands() {
        Solution8 solution = new Solution8();
        char[][] grip1 = null;
        char[][] grip2 = {{'1','1','1'}};
        char[][] grip3 = {{'0','0','0'}};
        char[][] grip4 = {{'1'},{'1'},{'1'}};
        char[][] grip5 = {{'0'},{'0'},{'0'}};
        char[][] grip6 = {{'1','1','1'},{'0','1','0'}};
        char[][] grip7 = {{'0','1','1'},{'1','0','1'}};
        assertEquals(solution.numIslands(grip1),0);
        assertEquals(solution.numIslands(grip2),1);
        assertEquals(solution.numIslands(grip3),0);
        assertEquals(solution.numIslands(grip4),1);
        assertEquals(solution.numIslands(grip5),0);
        assertEquals(solution.numIslands(grip6),1);
        assertEquals(solution.numIslands(grip7),2);
    }
}