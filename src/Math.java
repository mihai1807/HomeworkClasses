public class Math {

    //For a given number n, calculate the sum from 1 to n using a recursive method
    static int sumUntilN(int n, int sum) {
        if (n == 0) return sum;
        return sumUntilN(n - 1, sum + n);

    }

    //For a given number n, calculate its factorial value using a recursive method
    static int factorial(int n, int multiplication) {
        if (n == 1) return multiplication;
        return factorial(n - 1, multiplication * n);
    }
}
