package com.oracleproject.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oracleproject.service.OracleService;
import com.oracleprojectmodel.OracleResponse;

@RestController
public class OracleController {

	@Autowired
	private OracleService oracleService;

	@PostMapping("/post/string")
	public List<OracleResponse> countSubString(@RequestBody String file) throws IOException {
		return oracleService.countSubString(file);
	}

}
