package com.vijay.datastructure.sortingtechnique;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

	@Test
	@DisplayName("Test bubble sort")
	void test() {
		int[] arr = {7,8,5,2,4,6,3};
		int[] expected = {2,3,4,5,6,7,8};
		assertArrayEquals(expected, BubbleSort.bubbleSort(arr));
	}

}
