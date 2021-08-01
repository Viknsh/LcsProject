package com.lcs.service;

import org.springframework.stereotype.Component;

@Component
//@Configurable
public class LcsService {

	public String getLcs(String firstString, String secondString) {
		int firstStrLength = firstString.length();
		int secondStrLength = secondString.length();
		
		int[][] LCSuff = new int[firstStrLength + 1][secondStrLength + 1];
		int len = 0;
		int row = 0, col = 0;
		for (int i = 0; i <= firstStrLength; i++) {
			for (int j = 0; j <= secondStrLength; j++) {
				if (i == 0 || j == 0)
					LCSuff[i][j] = 0;

				else if (firstString.charAt(i - 1) == secondString.charAt(j - 1)) {
					LCSuff[i][j] = LCSuff[i - 1][j - 1] + 1;
					if (len < LCSuff[i][j]) {
						len = LCSuff[i][j];
						row = i;
						col = j;
					}
				}
				else
					LCSuff[i][j] = 0;
			}
		}

		if (len == 0) {
			return "No Common Substring";
		}

		String resultStr = "";
		while (LCSuff[row][col] != 0) {
			resultStr = firstString.charAt(row - 1) + resultStr; // or Y[col-1]
			--len;

			row--;
			col--;
		}
		
		return resultStr;
	}
	
}
