package com.oracleproject.service;

import java.io.IOException;
import java.util.List;

import com.oracleprojectmodel.OracleResponse;

public interface OracleService {
	public List<OracleResponse> countSubString(String file) throws IOException;
}
