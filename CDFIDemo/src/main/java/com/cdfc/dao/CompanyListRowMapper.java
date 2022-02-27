package com.cdfc.dao;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;



public class CompanyListRowMapper implements RowMapper<CompanyListFormat> {
	public CompanyListFormat mapRow(ResultSet rs, int arg1) throws SQLException{
	CompanyListFormat comp= new CompanyListFormat();
	try {
		ResultSetMetaData rsmd=rs.getMetaData();
		comp.setState(rs.getString("STATE_NAME"));
		comp.setOrglevel(rs.getString("ORG_LEVEL"));
		comp.setOrgname(rs.getString("ORG_NAME"));
		comp.setTransac_type(rs.getString("TRANSAC_TYPE"));
		comp.setTransac_amount(rs.getInt("AMOUNT"));
	}
	catch(Exception e){
	}
	return comp;
}
	
}
