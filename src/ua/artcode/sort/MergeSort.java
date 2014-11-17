package ua.artcode.sort;

import java.util.Arrays;

public class MergeSort {

	int[] res;
	
	
	public int[] sort(int[] mas){
		res = new int[mas.length];
		sort(mas, 0, mas.length-1);
		return mas;
	}
	
	public void sort(int[] mas, int start, int end){
		if(start >= end){
			return;
		}
		
		int mid = start + (end - start) / 2;
		
		sort(mas, start, mid);
		sort(mas, mid+1, end);
		merge(mas, start, mid, end);
		
	} 
	
	public void merge(int[] mas, int start, int mid, int end){
		for(int k = start; k <= end; k++){
			res[k] = mas[k];
		}
		int i = start;
		int j = mid + 1;
		for(int k = start; k <= end; k++){
            if(j > end){
				mas[k] = res[i++];
			} else if(i > mid){
				mas[k] = res[j++];
			} else if(res[i] < res[j]){
				mas[k] = res[i++];
			} else {
				mas[k] = res[j++];
			}
		}
	}


	public static void main(String[] args) {
		int[] mas = {56,23,55,3,7,99,12,76};
		int[] sorted = new MergeSort().sort(mas);
		System.out.println(Arrays.toString(sorted));
	}
	
}
