package com.algoritms;

import org.junit.Assert;

public class ZeroMatrixTest {

    public ZeroMatrixTest() {
    }

    @org.junit.Test
    public void shouldZeroTheExample() {
        
        
        int [][] input = {{1,2,3,4},{2,0,3,-4},{9,8,4,0},{1,2,3,4}};
        int [][] expectedResult = {{1,0,3,0},{0,0,0,0},{0,0,0,0},{1,0,3,0}};
        int [][] result = ZeroMatrix.zeroMatrix(input);
        
        

        Assert.assertArrayEquals(expectedResult, result);
    }
}
