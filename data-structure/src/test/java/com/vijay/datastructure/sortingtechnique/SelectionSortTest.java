package com.vijay.datastructure.sortingtechnique;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SelectionSortTest {

	@Test
	@DisplayName("Test Selection Sort")
	void test() {
		int[] arr = {7,8,5,2,4,6,3};
		int[] expected = {2,3,4,5,6,7,8};
		assertArrayEquals(expected, SelectionSort.selectionSort(arr));
	}

}
