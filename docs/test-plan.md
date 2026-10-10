# Sales Analysis — Test Plan

## 1. Purpose

The purpose of testing is to check that the program correctly identifies the consecutive period of months with the highest combined sales change. The tests include the provided dataset and additional cases to check single values, negative values, array boundaries, and ties.

## 2. Testing Method

I used a separate Java test program to call the `findBestPeriod()` method with different arrays of sales-change values. For each test, I compared the actual starting index, ending index, and total with the expected results.

The program was compiled and run in the GitHub Codespace terminal. All six tests passed.

## 3. Test Results

| Test | Input Data | Expected Result | Actual Result | Status |
|---|---|---|---|---|
| Provided 12-month dataset | {12, -8, 15, 18, -22, 10, 14, -5, 20, 8, -25, 6} | Start index 0, end index 9, total 62 | Start index 0, end index 9, total 62 | PASS |
| Single month | {15} | Start index 0, end index 0, total 15 | Start index 0, end index 0, total 15 | PASS |
| All negative values | {-8, -3, -10, -6} | Start index 1, end index 1, total -3 | Start index 1, end index 1, total -3 | PASS |
| Best period at beginning | {10, 8, -20, 2} | Start index 0, end index 1, total 18 | Start index 0, end index 1, total 18 | PASS |
| Best period at end | {2, -10, 8, 9} | Start index 2, end index 3, total 17 | Start index 2, end index 3, total 17 | PASS |
| Tie keeps first period | {5, -10, 5} | Start index 0, end index 0, total 5 | Start index 0, end index 0, total 5 | PASS |

## 4. Test Case Discussion

### Test 1: Provided Dataset

The program selected January through October, with a combined sales change of 62 million dollars. This matched the expected result.

### Test 2: Single Month

The array contained only one value, 15. The program correctly selected index 0 as both the starting and ending index.

### Test 3: All Negative Values

Every value was negative. The program selected -3 at index 1 because it was the highest value, meaning the smallest decrease in sales.

### Test 4: Best Period at the Beginning

The first two values, 10 and 8, produced a total of 18. The program correctly identified indexes 0 through 1 as the best period.

### Test 5: Best Period at the End

The last two values, 8 and 9, produced a total of 17. The program correctly selected indexes 2 through 3.

### Test 6: Tie Between Periods

The array contained two separate periods with a maximum total of 5. The program kept the first period, at index 0, as required by the tie rule.

## 5. Conclusion

All six tests passed. The results show that the program correctly handles the provided dataset, a single-element array, all-negative values, periods at the beginning and end of an array, and tied maximum totals. No corrections were needed after these tests.