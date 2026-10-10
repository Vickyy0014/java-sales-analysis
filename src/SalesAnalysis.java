public class SalesAnalysis {

    public static void main(String[] args) {
        String[] months = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        };

        double[] salesChange = {
            12, -8, 15, 18, -22, 10,
            14, -5, 20, 8, -25, 6
        };

        BestPeriod bestPeriod = findBestPeriod(salesChange);

        printResult(months, bestPeriod);
    }

    // Examines every possible consecutive period.
    public static BestPeriod findBestPeriod(double[] salesChange) {
        double bestTotal = Double.NEGATIVE_INFINITY;
        int bestStart = 0;
        int bestEnd = 0;

        for (int start = 0; start < salesChange.length; start++) {
            double runningTotal = 0;

            for (int end = start; end < salesChange.length; end++) {
                runningTotal += salesChange[end];

                // Update only when a strictly larger total is found.
                // This keeps the first period in a tie.
                if (runningTotal > bestTotal) {
                    bestTotal = runningTotal;
                    bestStart = start;
                    bestEnd = end;
                }
            }
        }

        return new BestPeriod(bestStart, bestEnd, bestTotal);
    }

    // Displays the best period using the month names and saved indexes.
    public static void printResult(String[] months, BestPeriod result) {
        System.out.println("Sales Analysis");
        System.out.println("-------------------------");
        System.out.println("Start Month: " + months[result.startIndex]);
        System.out.println("End Month:   " + months[result.endIndex]);
        System.out.printf(
            "Total Sales Change: %.2f million%n",
            result.total
        );
    }

    // Stores the result of the search for the best period.
    public static class BestPeriod {
        public final int startIndex;
        public final int endIndex;
        public final double total;

        public BestPeriod(int startIndex, int endIndex, double total) {
            this.startIndex = startIndex;
            this.endIndex = endIndex;
            this.total = total;
        }
    }
}