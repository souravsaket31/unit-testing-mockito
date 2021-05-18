package com.learning.may.ut.business;

import com.learning.may.ut.data.SomeDataService;

public class SomeBusinessImpl {

	private SomeDataService someDataService;

	public void setSomeDataService(SomeDataService someDataService) {
		this.someDataService = someDataService;
	}

	public int calculateSum(int[] data) {
		int sum = 0;
		for (int ele : data) {
			sum += ele;
		}
		return sum;
	}

	public int calculateSumUsingDataService() {
		int sum = 0;
		int[] data = someDataService.retrieveAllData();
		for (int ele : data) {
			sum += ele;
		}
		return sum;
	}

}
