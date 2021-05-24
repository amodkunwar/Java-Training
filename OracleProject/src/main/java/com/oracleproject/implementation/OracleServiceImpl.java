package com.oracleproject.implementation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.oracleproject.service.OracleService;
import com.oracleprojectmodel.OracleModel;
import com.oracleprojectmodel.OracleResponse;

@Service
public class OracleServiceImpl implements OracleService {

	@Override
	public List<OracleResponse> countSubString(String file) throws IOException {

		String dictionary = "surprise efficiency spanish";
		List<OracleResponse> listResponse = new ArrayList<>();
		String[] split = dictionary.split(" ");
		for (String string : split) {
			listResponse = checkString(file.toLowerCase(), string, listResponse);
		}
		return listResponse;
	}

	private static List<OracleResponse> checkString(String file, String str, List<OracleResponse> listResponse) {
		char[] c1 = file.toCharArray();
		char[] c2 = str.toCharArray();
		int count = 0;

		for (int i = 0; i < c1.length; i++) {
			int k = i;
			int j = 0;
			while (k < c1.length && j < c2.length && c1[k] == c2[j]) {
				j++;
				k++;
			}

			if (j == c2.length) {
				count++;
			}

		}
		OracleResponse oracleResponse = new OracleResponse();
		OracleModel oracleModel = new OracleModel();
		oracleResponse.setStringValue(str);
		oracleResponse.setCount(count);
		listResponse.add(oracleResponse);
		oracleModel.setLists(listResponse);
		return listResponse;
	}

}
