# Sales Analysis — Pseudocode

## Goal

Find the consecutive period of months with the highest combined sales change. Display the starting month, ending month, and combined total.

## Pseudocode

1. Begin the program.

2. Create an array containing the 12 month names.

3. Create a parallel array containing the sales-change values. The month and its sales value must have the same index.

4. Set the best total to negative infinity. Set the best starting index and best ending index to the first index.

5. For each possible starting index:
   - Set the running total to zero.
   - Examine each possible ending index, beginning at the starting index and continuing to the last array element.
   - Add the sales value at the ending index to the running total.
   - If the running total is greater than the best total:
     - Save the running total as the best total.
     - Save the current starting index.
     - Save the current ending index.
   - If the running total equals the best total, keep the earlier result.

6. Continue until every possible consecutive period has been examined.

7. Use the saved starting and ending indexes to find the corresponding month names.

8. Display the starting month, ending month, and maximum combined sales change in millions of dollars.

9. End the program.

## Important Rules

- The outer loop chooses the starting month.
- The inner loop examines consecutive months from that starting point.
- The running total is reset each time a new starting month is chosen.
- The program updates the best result only when it finds a strictly greater total. This keeps the first result when totals are tied.
- Initializing the best total to negative infinity allows the program to handle data containing only negative values. In that case, the highest single-month value becomes the best result.