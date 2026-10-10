# Sales Analysis — Design

## 1. Problem Description

This program analyzes monthly changes in computer sales compared with the previous year. It uses 12 months of sales data, measured in millions of dollars. Positive numbers represent increases in sales, while negative numbers represent decreases.

The goal is to find the consecutive period of months with the highest combined sales change. The program will display the starting month, ending month, and total sales change for that period. The result must be calculated from the data instead of being hard-coded.

## 2. Data Design

I will use two parallel arrays. A `String[]` array will store the month names, and a `double[]` array will store the sales-change values. Both arrays will have the same length, and the same index will connect each month with its sales value. For example, index `0` represents January in both arrays.

The program will use variables to track the running total, the best total found so far, and the starting and ending indexes of the best period. I will use nested loops to examine consecutive periods. The outer loop will choose a starting month, and the inner loop will add each value as the ending month moves forward.

When a total is greater than the best total, the program will save that total and its starting and ending indexes. If two periods have the same total, the program will keep the first period found by updating the best result only when a strictly greater total is found.

The initial best total will be negative infinity. This allows the program to handle a dataset where every sales value is negative. In that situation, the best period should be the single month with the highest value.

## 3. Program Organization

- `main()`: Creates the arrays, calls the calculation method, and displays the result.
- `findBestPeriod()`: Uses nested loops to calculate consecutive-period totals and track the best result.
- `printResult()`: Displays the starting month, ending month, and maximum combined sales change.
- `BestPeriod`: Stores the best starting index, ending index, and combined total so the result can be used by other methods.

## 4. Program Flow

1. Start the program.
2. Create the arrays containing month names and sales-change values.
3. Choose a starting index.
4. Examine consecutive values beginning at that index.
5. Calculate a running total for each possible ending index.
6. Compare the running total with the best total found so far.
7. Update the best total and its starting and ending indexes when a larger total is found.
8. Keep the first period when two totals are equal.
9. Continue until all consecutive periods have been examined.
10. Display the starting month, ending month, and maximum combined sales change.
11. End the program.