package com.learner;

public class FunctionOne {
	
	public int funSum(int x, int y) {
		return x + y;
	}
	
	public int funMul(int x, int y) {
		return x * y;
	}
	
	public int game(int[] guess, int[] answer) {
        int count = 0;
        for(int i=0; i < guess.length; i++){
            if(guess[i] == answer[i]){
                count++;
            }
        }
        return count;
    }
	
	public int[] fraction(int[] cont) {
        int[] res = new int[2];
        res[0] = cont[cont.length - 1];
        res[1] = 1;
        for (int i = cont.length - 1; i > 0; i--) {
            int temp = res[0];
            res[0] = cont[i - 1] * res[0] + res[1];
            res[1] = temp;
        }
        return res;      
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionOne fc = new FunctionOne();
		int z = fc.funSum(2, 3);
		System.out.println(z);

	}

}
