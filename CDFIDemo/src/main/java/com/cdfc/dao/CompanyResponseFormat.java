package com.cdfc.dao;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class CompanyResponseFormat {
	private String orglevel;
	private String state;
	private String orgname;
	List<CompanyListFormat> complist;
	public List<CompanyListFormat> getComplist() {
		return complist;
	}
	public void setComplist(List<CompanyListFormat> complist) {
		this.complist = complist;
	}
	public String getOrglevel() {
		return orglevel;
	}
	public void setOrglevel(String orglevel) {
		this.orglevel = orglevel;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getOrgname() {
		return orgname;
	}
	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}

}
