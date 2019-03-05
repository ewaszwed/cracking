package com.algo.sorting;

class DuplicatesWithBits {
    
    void checkDuplicates(int[] array) {
        BitSet bs = new BitSet(32000);
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            int num0 = num - 1;
            if (bs.get(num0)) {
                System.out.println("Duplicate:" + num);
            } else {
                bs.set(num0);
            }   
        }
    }
    
    private class BitSet {
        
        int[] bitSet;
        
        public BitSet(int size) {
            bitSet = new int[(size >> 5) + 1]; //divide by 32
        }
        
        boolean get(int pos) {
            int wordNumber = (pos >> 5);
            int bitNumber = (pos & 0x1F); //mod 32

            return (bitSet[wordNumber] & (1 << bitNumber)) != 0;
            
        }
        
        void set(int pos) {
            
            int wordNumber = (pos >> 5); //divide by 32
            int bitNumber = (pos & 0x1F); //mod 32

            bitSet[wordNumber] |= 1 << bitNumber;
        }
        
    }
}
