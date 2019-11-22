package com.omniwyse.assignment1;

public class TowerOfHanoi 
{
	public static int towerOfHanoiPuzzle(int n, char from_rod, char to_rod, char adj_rod) {
		if (n < 0) 
		{
			throw new IllegalArgumentException("disk number must not be negative....");
		}
		if (n == 1) 
		{
			System.out.println("Move disk 1 from rod " + from_rod + " to rod " + to_rod);
			return 1;
		}
		towerOfHanoiPuzzle(n - 1, from_rod, adj_rod, to_rod);
		System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod);
		towerOfHanoiPuzzle(n - 1, adj_rod, to_rod, from_rod);
		return 1;
	}

}
