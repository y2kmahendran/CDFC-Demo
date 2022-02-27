package com.cdfc.dao;

import java.util.List;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class CompanyDAO extends DBConfiguration{
	public List<CompanyListFormat> getCompanyList(String state){
		List<CompanyListFormat> result=null;
		String sql="";
		try{
		MapSqlParameterSource params=new MapSqlParameterSource();
		System.out.println("State Value="+state);
		params.addValue("state",state);
		//sql="select a.state_name,b.org_level,b.org_name from states a,company_type b where a.state_id=b.state_id and a.state_name=:state";
		sql="select a.state_name,b.org_level,b.org_name,t.transac_type,amount,transac_date  from states a,company_type b,transaction t where a.state_id=b.state_id and b.org_id=t.org_id  and a.state_name=:state";
		result=(List<CompanyListFormat>) namedJdbcTemplate.query(sql,params,new CompanyListRowMapper());
		}
		catch(Exception err) {
			System.out.println(""+err);
		}
		return result;
		
	}

}
