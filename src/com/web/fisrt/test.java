package com.web.fisrt;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.xml.internal.fastinfoset.util.StringArray;

public class test {

    public static void main(String[] args) throws Exception { 
		String[] UseTables = {
				"mkt.dm_tc_list_status",
				"mkt.dm_tc_sale_boid_aim_info",
				"mkt.dm_tc_sale_base_info",
				"mkt.DM_TC_SALE_BOID_INFO",
				"mkt.DM_TC_SALE_BOID_PORT_ITEM",
				"mkt.dm_tc_chnl_exe_lacci",
				"mkt.dm_tc_sale_boid_lacid_info",
				"mkt.dm_tc_sale_boid_channel_more",
				"mkt.dm_tc_sale_boid_channel_list",
				"mkt.DM_TC_CHNL_EXE_META"				
		};
		
		for(String useTable : UseTables){
			if(useTable.equalsIgnoreCase("MKT     ".trim()+"."+"DM_TC_SALE_BOID_INFO".trim())){
				System.out.println("1");
			}else{
				System.out.println("2");
			}
			
		}
    	
    	
    	
//    	if( System.getProperty("os.name").toUpperCase().indexOf("WINDOWS") != -1 &&   
//    			test.class.getResource("test.class").getPath().startsWith("/") ) {
//    		System.out.println("WINDOWS");
//    	}
//    	SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//    	System.out.println(System.getProperties().getProperty("os.name"));
//    	System.out.println(formatter.format(new Date()));
//    	List<String> itfList = new ArrayList<String>();
//    	itfList.add("1");
//    	itfList.add("1");
//    	System.out.println("1\n2");
//    	String aString ="01030101";
//    	System.out.println(aString.matches("^[0-9]{6}[a-zA-Z]{2}$"));
//    	List aimList = new ArrayList<Testbean>();
//    	aimList.add(new Testbean());
//    	aimList.add(new Testbean());
//    	aimList.add(new Testbean());
//    	for(int i=0;i<aimList.size();i++){
//    		Testbean aim = (Testbean)aimList.get(i);
//    		aim.setName("a1");
//    	}
//    	for(int i=0;i<aimList.size();i++){
//    		Testbean aim = (Testbean)aimList.get(i);
//    		System.out.println(aim.getName());
//    	}
//    	
//    	new test().lalala(aimList);
//    	
//    	for(int i=0;i<aimList.size();i++){
//    		Testbean aim = (Testbean)aimList.get(i);
//    		System.out.println(aim.getName());
//    	}
    	
    }  
    protected void lalala(List aimList){
    	Testbean aim = new Testbean();
    	aim.setName("b1");
    	aimList.add(aim);
    }
    }

