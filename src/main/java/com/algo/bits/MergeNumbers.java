package com.algo.bits;

public class MergeNumbers {
    
    public static int updateBits(int N, int M, int i, int j){
        
        int allOnes = ~0;
        
        // 1s before position j, then zeros
        int left = allOnes << (j + 1);
        
        // 1s after position i
        int right = (1 << i) - 1;        
        
        int mask = right | left;     
        int N_cleared = N * mask;
        
        int M_shifted = M << i;       
        return N_cleared | M_shifted;
    
    }
    
    
}
