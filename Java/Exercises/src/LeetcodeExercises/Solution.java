package LeetcodeExercises;

class Solution {
    public int fib(int n) {
        return (int)(findFib(n) % 1e9+7);
    }
    public int findFib(int n){
        if(n == 1 || n == 2) return 1;
        return findFib(n-1) + findFib(n-2);
    }
}