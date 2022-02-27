package com.cdfc.dao;

public class CompanyListFormat {

private String orglevel;
private String state;
private String orgname;
private String transac_type;
public String getTransac_type() {
	return transac_type;
}
public void setTransac_type(String transac_type) {
	this.transac_type = transac_type;
}
public int getTransac_amount() {
	return transac_amount;
}
public void setTransac_amount(int transac_amount) {
	this.transac_amount = transac_amount;
}
private int transac_amount;
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
