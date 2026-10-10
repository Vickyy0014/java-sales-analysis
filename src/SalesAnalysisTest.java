public class SalesAnalysisTest {

    public static void main(String[] args) {

        // Test 1: The provided 12-month dataset
        runTest(
            "Provided 12-month dataset",
            new double[]{12, -8, 15, 18, -22, 10, 14, -5, 20, 8, -25, 6},
            0, 9, 62
        );

        // Test 2: A single month
        runTest(
            "Single month",
            new double[]{15},
            0, 0, 15
        );

        // Test 3: All values are negative
        runTest(
            "All negative values",
            new double[]{-8, -3, -10, -6},
            1, 1, -3
        );

        // Test 4: Best period begins at the first element
        runTest(
            "Best period begins at first element",
            new double[]{10, 8, -20, 2},
            0, 1, 18
        );

        // Test 5: Best period ends at the last element
        runTest(
            "Best period ends at last element",
            new double[]{2, -10, 8, 9},
            2, 3, 17
        );

        // Test 6: Equal totals should keep the first period
        runTest(
            "Tie keeps first period",
            new double[]{5, -10, 5},
            0, 0, 5
        );
    }

    public static void runTest(
            String testName,
            double[] values,
            int expectedStart,
            int expectedEnd,
            double expectedTotal) {

        SalesAnalysis.BestPeriod result =
            SalesAnalysis.findBestPeriod(values);

        boolean passed =
            result.startIndex == expectedStart
            && result.endIndex == expectedEnd
            && result.total == expectedTotal;

        System.out.println();
        System.out.println("Test: " + testName);
        System.out.println("Expected start index: " + expectedStart);
        System.out.println("Expected end index: " + expectedEnd);
        System.out.println("Expected total: " + expectedTotal);

        System.out.println("Actual start index: " + result.startIndex);
        System.out.println("Actual end index: " + result.endIndex);
        System.out.println("Actual total: " + result.total);

        System.out.println("Result: " + (passed ? "PASS" : "FAIL"));
    }
}