# N-Queen Problem Using Backtracking Algorithm
The N-Queen Problem is the problem of placing N queens on an N×N chessboard such that none of them attack one another (no two are in the same row, column, or diagonal).  More specifically, I am solving this problem with placing eight queens on 8x8 chessboard.

There are different solutions for solving this problem, but I am using Backtracking algorithm. 

## Description
The idea is to place queens one by one in different columns, starting from the left to right. When we place a queen in a column, we check for clashes with already placed queens. In the current column, if we find a row for which there is no clash, we mark this row and column as part of the solution. If we do not find such a row due to clashes then we backtrack and return false.

The expected output for this problem is a binary array which has 1s for the blocks where queens are placed, and 0s for the blocks where queens are not placed. In our case of 8 queens, an output should be as following:

```
      {0, 0, 0, 0, 0, 0, 0, 0}
			{0, 0, 0, 0, 0, 0, 0, 0} 
			{0, 0, 0, 0, 0, 0, 0, 0} 
			{0, 0, 0, 0, 0, 0, 0, 0}
			{0, 0, 0, 0, 0, 0, 0, 0}
			{0, 0, 0, 0, 0, 0, 0, 0}
			{0, 0, 0, 0, 0, 0, 0, 0}
			{0, 0, 0, 0, 0, 0, 0, 0} 
```


## Introduction to Backtracking
Backtracking is an algorithmic-technique for solving problems recursively by trying to build a solution incrementally, one piece at a time, removing those solutions that fail to satisfy the constraints of the problem at any point of time (by time, here, is referred to the time elapsed till reaching any level of the search tree).

There are three types of problems in backtracking:
  1.) Decision Problem – searching for a feasible solution.
  2.) Optimization Problem – searching for the best solution.
  3.) Enumeration Problem – finding all feasible solutions.
