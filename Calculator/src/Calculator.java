class Calculator {
    double result(double a, double b) {
        if (a > b) {
            return a + b;
        } else if (a < b) {
            return a * b;
        } else
        return Math.pow(a, 2);
    }
}

