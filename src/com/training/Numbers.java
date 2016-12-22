package com.training;

public class Numbers {
    int n;
    
    public Numbers(){
        this.n = 0;
    }
    
    public Numbers(int n){
        this.n = n;
    }
    
    public int addNumberDigits(int n) {
        String nString = String.valueOf(n);
        int result = 0;
        char[] arraynumbers = nString.toCharArray();
        int[] numbers = new int[arraynumbers.length];
        int i = 0;
        for(char number : arraynumbers) {
            numbers[i] = Integer.parseInt(String.valueOf(number));
            i++;
        }
        for (int actualNumber : numbers) {
            result = result + actualNumber;
        }
        return result;
    }
    
    public int largestNumber(int n) {
        String resultString = "";
        for (int i = 1; i <= n; i++) {
            resultString += "9";
        }
        return Integer.parseInt(resultString);
    }
}
