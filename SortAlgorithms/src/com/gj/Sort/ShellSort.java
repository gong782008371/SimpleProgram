package com.gj.Sort;

import com.gj.control.SortImage;
import com.gj.frame.MyRectangle;

public class ShellSort extends Algorithm {
	
	private int[] d = new int[]{1, 3, 5, 8, 13, 21, 34, 55, 89, 144};
	
	public ShellSort(SortImage si) {
		super(si);
	}

	public void startSort(MyRectangle[] rects) {
		Algorithm.swapTime = Algorithm.compareTime = 0;
		shellSort(rects);
	}
	
	public void ShellPass(MyRectangle[] rects, int d) {
		for(int i = d; i < rects.length; i ++) {
			int k = i;
			while(k >= d && compareTo(rects[k - d], rects[k]) > 0) {
				swap(rects[k - d], rects[k]);
				k -= d;
			}
		}
	}
	
	void shellSort(MyRectangle[] rects) {
		for(int i=d.length-1;i>=0;i--)
			ShellPass(rects, d[i]);
	}
}
