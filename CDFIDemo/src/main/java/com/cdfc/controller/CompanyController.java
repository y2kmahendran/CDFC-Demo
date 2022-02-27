package com.cdfc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cdfc.dao.CompanyListFormat;
import com.cdfc.service.CompanyRegisterService;

@RestController
@RequestMapping(path="/cdfi")
public class CompanyController {

    @Autowired
    CompanyRegisterService compreg;
    
//    @GetMapping(path="/getCompanyList")
//    public String getCompanyList(@RequestParam String compl) {
//    	CompanyResponseFormat compres= new CompanyResponseFormat();
//    	List  complist=compreg.getCompanyList(compl);
//    	compres.setComplist(complist);
//    	return ApplicationUtils.createJsonFormat(complist);
//    }
    @RequestMapping("/")    
    public String index()  
    {    
    return"index";    
    }    
    
    @GetMapping(path="/getCompanyList/{state}")
    public ResponseEntity<List<CompanyListFormat>> getCompanyList(@PathVariable("state") String compl) {
    	//CompanyResponseFormat compres= new CompanyResponseFormat();
    	List<CompanyListFormat>  complist=compreg.getCompanyList(compl);
    	//compres.setComplist(complist);
    	return new ResponseEntity<>(complist,HttpStatus.OK);
    	//return ApplicationUtils.createJsonFormat(complist);
    }
    
    
    @RequestMapping(path="/registerCompany" , method=RequestMethod.POST)
   public ModelAndView  registerCompany(@ModelAttribute CompanyListFormat model) {
	  ModelAndView modelAndView = new ModelAndView();    
	  modelAndView.setViewName("user-data");        
	  modelAndView.addObject("user", model);      
	  return modelAndView;  
    }
     

}
