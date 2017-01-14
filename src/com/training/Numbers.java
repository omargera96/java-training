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
    
    public int maxMultiple(int divisor, int bound) {
        int a;
        for (int i = 1; true; i++) {
            a = i * divisor;
            if (a > bound) 
                return a - divisor;
        }
    }
    
    public int circleOfNumbers(int n, int firstNumber) {
        for (int i = 0; i < n; i++) {
            if(i == firstNumber) 
                if(i > (n/2))
                    return i + (n/2);
                else
                    return i - (n/2);
        }
        return 0;
    }
    
    
    public int lateRide(int n) {
        int n1 = n/60;
        int n2 = n%60;
        return n1/10 + n1%10 + n2/10 + n2%10;
    }
}
