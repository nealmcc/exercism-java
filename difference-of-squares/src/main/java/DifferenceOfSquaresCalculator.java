class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int n) {
        // 1 + 2 + 3 + 4
        // 4 + 3 + 2 + 1
        // -------------
        // 5 + 5 + 5 + 5
        // == (n)(n+1)
        // == 2x(sum of 1..4)
        int sum = n * (n + 1) / 2;
        return sum * sum;
    }

    int computeSumOfSquaresTo(int n) {
        // https://proofwiki.org/wiki/Sum_of_Sequence_of_Squares
        return n * (n + 1) * (2*n + 1) / 6;
    }

    int computeDifferenceOfSquares(int n) {
        return computeSquareOfSumTo(n) - computeSumOfSquaresTo(n);
    }
}
