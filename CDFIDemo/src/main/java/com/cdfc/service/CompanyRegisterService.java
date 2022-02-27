package com.cdfc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cdfc.dao.CompanyDAO;
import com.cdfc.dao.CompanyListFormat;
import com.cdfc.dao.GetCompanyList;

@Service
public class CompanyRegisterService {

	@Autowired
	private CompanyDAO compdao;
	
	public List<CompanyListFormat> getCompanyList(String compl) {
		List<CompanyListFormat> getComp=null;
		getComp=compdao.getCompanyList(compl);
		return getComp;
	}


}
