package com.wipro.automate;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedHashMap;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class FinalJSON_Main {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException
	{
		FileWriter fw=null;
		try {
			fw = new FileWriter("/F:/NewDBtoJson.json");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ObjectMapper om =new ObjectMapper();
		FinalJson fj=new FinalJson();
		fj.set_index("udm_cpl_large_v2");
		fj.set_type("120803670127");
		fj.set_id("120803670127");
		fj.set_routing("C:2051121652");
		
		LinkedHashMap lhm=new LinkedHashMap();
		lhm.put("endDate","2019-01-08T20:27:54.000Z");					
		lhm.put("billToGuName","PORTER BURGESS COMPANY");					
		lhm.put("billToPostalCode","75093-8720");					
		lhm.put("warrantyEndDate","2019-03-10T00:00:00.000Z");					
		lhm.put("parentSerialNumber","FOX1944XG43");					
		lhm.put("hdrCustomerName","FLAIR DATA SYSTEMS INC");					
		lhm.put("serviceLineId",2051121795);					
		lhm.put("itemFamilyGroup","UCSB SERIES PRODUCT");					
		lhm.put("wServiceLineId",new BigInteger("51217262556"));	//find				
		lhm.put("organizationId",900000000);					
		lhm.put("itemName","N20-FAN5");					
		lhm.put("warrantyStartDate","2015-12-10T00:00:00.000Z");					
		lhm.put("endCustomerGuCollapseId","2051121795|3359891|7286557");					
		lhm.put("billToSiteUseId",401615501);					
		lhm.put("serviceLineStsCode","ACTIVE");					
		lhm.put("itemListPrice",0);					
		lhm.put("containerId","C:2051121652");					
		lhm.put("endCustomerPartyName","ISS INC");					
		lhm.put("itemGroup","SYSTEM");					
		lhm.put("esCreateDate","2018-11-06T06:39:47.115Z");					
		lhm.put("billToCustAccId",2582);					
		lhm.put("endCustomerOeName","INTELLIGENT SOFTWARE SOLUTIONS INC");					
		lhm.put("wServiceLineStsCode","ACTIVE");					
		lhm.put("eventType","OTM");					
		lhm.put("endCustomerSiteState","CO");					
		lhm.put("shipDate","2015-12-10T00:00:00.000Z");					
		lhm.put("cplEndDate","2018-11-30T00:00:00.000Z");					
		lhm.put("itemId",13605095);					
		lhm.put("meuGuCollapseId","3359891|7286557");					
		lhm.put("serviceLineStartDate","2008-11-14T00:00:00.000Z");					
		lhm.put("serviceListPrice",null);					
		lhm.put("warrantyType","WARR-3YR-HW-90D-SW");					
		lhm.put("contractScsCode","SERVICE");					
		lhm.put("poNumber","53381");					
		lhm.put("startDate","2008-11-14T00:00:00.000Z");					
		lhm.put("cplStatus","ACTIVE");					
		lhm.put("status","ACTIVE");					
		lhm.put("endCustomerSiteId",403811195);					
		lhm.put("itemTypeGroup","Chassis");					
		lhm.put("billToCustName","FLAIR DATA SYSTEMS INC");					
		lhm.put("serviceLineName","SNTP");	
		
		///adding wBusinessProcess array
		ArrayList wBusPro=new ArrayList();
		LinkedHashMap wBusProLhm1=new LinkedHashMap();
		wBusProLhm1.put("wReactionHour",null);				
		wBusProLhm1.put("wBusinessProcessName","Software Center Access");				
		wBusProLhm1.put("wAttribute2",null);				
		wBusProLhm1.put("wBusinessSubProcessName",null);				
		wBusProLhm1.put("wBusinessProcEndDate","2021-06-21");				
		wBusProLhm1.put("wServiceLevelCode",null);				
		wBusProLhm1.put("wEntitlementKey",null);				
		wBusProLhm1.put("wBusinessProcStartDate","2009-07-17");				
		wBusProLhm1.put("wServiceLevelRank",null);				
		wBusProLhm1.put("wConversionRate",null);				
		wBusProLhm1.put("wServiceLevelId",null);				
		wBusProLhm1.put("wGspSeverity",null);				
		wBusProLhm1.put("wPillarCode","0");				
		wBusProLhm1.put("wBusinessProcessId","1011");				
		wBusProLhm1.put("wPillarDesc","NULL");				
		wBusProLhm1.put("wBusinessProcLineId","3695005760");				
		
		LinkedHashMap wBusProLhm2=new LinkedHashMap();
		wBusProLhm2.put("wReactionHour","24");					
		wBusProLhm2.put("wBusinessProcessName","Hardware Parts Replacement");					
		wBusProLhm2.put("wAttribute2",null);					
		wBusProLhm2.put("wBusinessSubProcessName",null);					
		wBusProLhm2.put("wBusinessProcEndDate","2021-06-21");					
		wBusProLhm2.put("wServiceLevelCode",null);					
		wBusProLhm2.put("wEntitlementKey","4");					
		wBusProLhm2.put("wBusinessProcStartDate","2009-07-17");					
		wBusProLhm2.put("wServiceLevelRank",null);					
		wBusProLhm2.put("wConversionRate",null);					
		wBusProLhm2.put("wServiceLevelId",null);					
		wBusProLhm2.put("wGspSeverity",null);					
		wBusProLhm2.put("wPillarCode","2");					
		wBusProLhm2.put("wBusinessProcessId","1004");					
		wBusProLhm2.put("wPillarDesc","HARDWARE REPLACEMENT");					
		wBusProLhm2.put("wBusinessProcLineId","3695005678");	
		
		LinkedHashMap wBusProLhm3=new LinkedHashMap();
		wBusProLhm3.put("wReactionHour","240");					
		wBusProLhm3.put("wBusinessProcessName","Software Media Replacement");					
		wBusProLhm3.put("wAttribute2","DAY");					
		wBusProLhm3.put("wBusinessSubProcessName","180");					
		wBusProLhm3.put("wBusinessProcEndDate","2021-06-21");					
		wBusProLhm3.put("wServiceLevelCode",null);					
		wBusProLhm3.put("wEntitlementKey",null);					
		wBusProLhm3.put("wBusinessProcStartDate","2009-07-17");					
		wBusProLhm3.put("wServiceLevelRank",null);					
		wBusProLhm3.put("wConversionRate",null);					
		wBusProLhm3.put("wServiceLevelId",null);					
		wBusProLhm3.put("wGspSeverity",null);					
		wBusProLhm3.put("wPillarCode","0");					
		wBusProLhm3.put("wBusinessProcessId","1461");					
		wBusProLhm3.put("wPillarDesc","NULL");					
		wBusProLhm3.put("wBusinessProcLineId","3695005718");					
		
		wBusPro.add(wBusProLhm1);
		wBusPro.add(wBusProLhm2);
		wBusPro.add(wBusProLhm3);
		
		//adding methods array
		ArrayList met=new ArrayList();
		met.add("RTS.OC");
		met.add("RTS.UC");
		met.add("RTS.VC");
		met.add("RRRP.OO");
		met.add("RRRP.UO");
		met.add("RRRP.VO");
		
		///adding to main map
		lhm.put("wBusinessProcess", wBusPro);
		lhm.put("methods", met);
		
		lhm.put("endCustomerSiteAddress4",null);						
		lhm.put("hardwareReplacementFlag","Y");						
		lhm.put("billToGuId",16061);						
		lhm.put("wBillToSiteUseId",401615501);						
		lhm.put("inPartyBasedShipToSiteName",null);						
		lhm.put("instanceId",1744563484);						
		lhm.put("shipToGuId",7286557);						
		lhm.put("derivedWarrantyTypeTac",null);						
		lhm.put("meuOeCollapseId","3359891|7286557|3013737646");						
		lhm.put("pakFlag","N");						
		lhm.put("lineCustomerName","FLAIR DATA SYSTEMS INC");						
		lhm.put("coveredLineId",new BigInteger("120803670127"));		//find				
		lhm.put("coverageTemplateDesc","SMARTnet Premium 24x7x4");						
		lhm.put("wBillToPartyId",2582);						
		lhm.put("isUcsWarranty","F");						
		lhm.put("endCustomerOeCollapseId","2051121795|3359891|3013737646");						
		lhm.put("shipToGuName","INTELLIGENT SOFTWARE SOLUTIONS INC");						
		lhm.put("cplStartDate","2017-12-01T00:00:00.000Z");						
		lhm.put("itemSellingPrice",0);						
		lhm.put("wServiceLineName","WARR-3YR-HW-90D-SW");						
	
		ArrayList busproAr=new ArrayList();
		LinkedHashMap buspro1=new LinkedHashMap();
		buspro1.put("businessProcessId","1021");				
		buspro1.put("pillarDesc","HARDWARE REPLACEMENT");				
		buspro1.put("businessSubProcessName","24X7X4");				
		buspro1.put("businessProcStartDate","2008-11-14");				
		buspro1.put("serviceLevelCode",null);				
		buspro1.put("businessProcessName","Rapid Parts Replacement");				
		buspro1.put("pillarCode","2");				
		buspro1.put("gspSeverity",null);				
		buspro1.put("entitlementKey","28");				
		buspro1.put("serviceLevelId",null);				
		buspro1.put("businessProcLineId","2051121989");				
		buspro1.put("businessProcEndDate","2019-01-08");				
		buspro1.put("serviceLevelRank",null);				
		buspro1.put("reactionHour","4");
		
		LinkedHashMap buspro2=new LinkedHashMap();
		buspro2.put("businessProcessId","1040");					
		buspro2.put("pillarDesc","TAC SUPPORT");					
		buspro2.put("businessSubProcessName","FULL ACCESS 24X7");					
		buspro2.put("businessProcStartDate","2008-11-14");					
		buspro2.put("serviceLevelCode",null);					
		buspro2.put("businessProcessName","Remote Tech Support Access");					
		buspro2.put("pillarCode","1");					
		buspro2.put("gspSeverity",null);					
		buspro2.put("entitlementKey","4");					
		buspro2.put("serviceLevelId",null);					
		buspro2.put("businessProcLineId","2051122221");					
		buspro2.put("businessProcEndDate","2019-01-08");					
		buspro2.put("serviceLevelRank",null);					
		buspro2.put("reactionHour","0");	
		
		LinkedHashMap buspro3=new LinkedHashMap();
		buspro3.put("businessProcessId", "1009");			
		buspro3.put("pillarDesc", null);			
		buspro3.put("businessSubProcessName", "2");			
		buspro3.put("businessProcStartDate", "2008-11-14");			
		buspro3.put("serviceLevelCode", null);			
		buspro3.put("businessProcessName", "CCO Access");			
		buspro3.put("pillarCode", null);			
		buspro3.put("gspSeverity", null);			
		buspro3.put("entitlementKey", null);			
		buspro3.put("serviceLevelId", null);			
		buspro3.put("businessProcLineId", "2051122416");			
		buspro3.put("businessProcEndDate", "2019-01-08");			
		buspro3.put("serviceLevelRank", null);			
		buspro3.put("reactionHour", "0"	);
		
		LinkedHashMap buspro4=new LinkedHashMap();
		buspro4.put("businessProcessId","1011");				
		buspro4.put("pillarDesc","SOFTWARE SUPPORT");				
		buspro4.put("businessSubProcessName","GRANTED");				
		buspro4.put("businessProcStartDate","2008-11-14");				
		buspro4.put("serviceLevelCode",null);				
		buspro4.put("businessProcessName","Software Center Access");				
		buspro4.put("pillarCode","3");				
		buspro4.put("gspSeverity",null);				
		buspro4.put("entitlementKey",null);				
		buspro4.put("serviceLevelId",null);				
		buspro4.put("businessProcLineId","2051122472");				
		buspro4.put("businessProcEndDate","2019-01-08");				
		buspro4.put("serviceLevelRank",null);				
		buspro4.put("reactionHour","0");				
		
		LinkedHashMap buspro5=new LinkedHashMap();
		buspro5.put("businessProcessId","1012");				
		buspro5.put("pillarDesc",null);				
		buspro5.put("businessSubProcessName","GRANTED");				
		buspro5.put("businessProcStartDate","2008-11-14");				
		buspro5.put("serviceLevelCode",null);				
		buspro5.put("businessProcessName","Major Software Updates");				
		buspro5.put("pillarCode",null);				
		buspro5.put("gspSeverity",null);				
		buspro5.put("entitlementKey",null);				
		buspro5.put("serviceLevelId",null);				
		buspro5.put("businessProcLineId","2051122548");				
		buspro5.put("businessProcEndDate","2019-01-08");				
		buspro5.put("serviceLevelRank",null);				
		buspro5.put("reactionHour","0");
		
		LinkedHashMap buspro6=new LinkedHashMap();
		buspro6.put("businessProcessId", "1013");				
		buspro6.put("pillarDesc", null);				
		buspro6.put("businessSubProcessName", "GRANTED");				
		buspro6.put("businessProcStartDate", "2008-11-14");				
		buspro6.put("serviceLevelCode", null);				
		buspro6.put("businessProcessName", "Minor Software Updates");				
		buspro6.put("pillarCode", null);				
		buspro6.put("gspSeverity", null);				
		buspro6.put("entitlementKey", null);				
		buspro6.put("serviceLevelId", null);				
		buspro6.put("businessProcLineId", "2051122634");				
		buspro6.put("businessProcEndDate", "2019-01-08");				
		buspro6.put("serviceLevelRank", null);				
		buspro6.put("reactionHour", "0");
		
		LinkedHashMap buspro7=new LinkedHashMap();
			buspro7.put("businessProcessId","1014");					
			buspro7.put("pillarDesc",null);					
			buspro7.put("businessSubProcessName","GRANTED");					
			buspro7.put("businessProcStartDate","2008-11-14");					
			buspro7.put("serviceLevelCode",null);					
			buspro7.put("businessProcessName","Maintenance Software Releases");					
			buspro7.put("pillarCode",null);					
			buspro7.put("gspSeverity",null);					
			buspro7.put("entitlementKey",null);					
			buspro7.put("serviceLevelId",null);					
			buspro7.put("businessProcLineId","2051122676");					
			buspro7.put("businessProcEndDate","2019-01-08");					
			buspro7.put("serviceLevelRank",null);					
			buspro7.put("reactionHour","0");
			
			LinkedHashMap buspro8=new LinkedHashMap();
			buspro8.put("businessProcessId","1004");					
			buspro8.put("pillarDesc","DOES NOT APPLY");					
			buspro8.put("businessSubProcessName","24X7X4");					
			buspro8.put("businessProcStartDate","2008-11-14");					
			buspro8.put("serviceLevelCode",null);					
			buspro8.put("businessProcessName","Hardware Parts Replacement");					
			buspro8.put("pillarCode","5");					
			buspro8.put("gspSeverity",null);					
			buspro8.put("entitlementKey",null);					
			buspro8.put("serviceLevelId",null);					
			buspro8.put("businessProcLineId","2051122717");					
			buspro8.put("businessProcEndDate","2019-01-08");					
			buspro8.put("serviceLevelRank",null);					
			buspro8.put("reactionHour","0");
			
			//adding bussiness process array
			busproAr.add(buspro1);
			busproAr.add(buspro2);
			busproAr.add(buspro3);
			busproAr.add(buspro4);
			busproAr.add(buspro5);
			busproAr.add(buspro6);
			busproAr.add(buspro7);
			busproAr.add(buspro8);
			
			lhm.put("businessProcess", busproAr);
			
			lhm.put("endCustomerSiteAddress2","DR - STE 400");				
			lhm.put("billToOeId",new BigInteger("3015476635"));	//find			
			lhm.put("endCustomerSiteAddress3",null);				
			lhm.put("endCustomerOeId",new BigInteger("3013737646"));	//find			
			lhm.put("isBlackListed","false");				
			lhm.put("coverageTemplateName","SNTP");				
			lhm.put("endCustomerGUId",7286557);				
			
			lhm.put("vln",new ArrayList());//check
			
			lhm.put("ibItemType","CARD");						
			lhm.put("soNumber","900032327");						
			lhm.put("wCoverageBeginDate","2009-07-17T07:09:43.000Z");						
			lhm.put("wCoverageTemplateName","NBD SW Warranty");						
			lhm.put("serviceLineStatus","ACTIVE");						
			lhm.put("instanceStatusDesc","Latest-INSTALLED");						
			lhm.put("wBillToCountry","US");						
			lhm.put("tacSupportFlag","Y");						
			lhm.put("isSerialized","Y");						
			lhm.put("billToState","TX");						
			lhm.put("inPartyBasedShipToPartyId",13092);						
			lhm.put("billToCity","PLANO");						
			lhm.put("lineCreationDate","2017-12-13T20:57:50.000Z");						
			lhm.put("saPartyBasedShipToSiteName",null);						
			lhm.put("endCustomerSiteCountry","US");						
			lhm.put("endCustomerSiteUseId",403530651);						
			lhm.put("itemDescription","Fan module for UCS 5108");						
			lhm.put("esUpdateDate","2018-11-06T06:39:47.115Z");						
			lhm.put("isCovered","A");						
			lhm.put("isProductGroupS","false");						
			lhm.put("serialNumber","FOX1944XG43");						
			lhm.put("endCustomerGUName","INTELLIGENT SOFTWARE SOLUTIONS INC");						
			
			lhm.put("b2bUsageCode",new ArrayList());//check
			
			lhm.put("inCustAccountId",62678);					
			lhm.put("serviceLineEndDate","2019-01-08T20:27:54.000Z");					
			lhm.put("endCustomerLocationId",403811195);					
			lhm.put("softwareSupportFlag","Y");					
			lhm.put("derivedWarrantyTypeRma","WARR-3YR-HW-90D-SW:=UCS");					
			lhm.put("contractNumber",3359891);					
			lhm.put("warrantyShipToCountry",0);					
			lhm.put("billToSiteUseName","401615501");					
			lhm.put("alternateItemName","N20-FAN5=");					
			lhm.put("serviceLineCollapseId","2051121795|3359891");
			
			LinkedHashMap joinKeyMap=new LinkedHashMap();
			joinKeyMap.put("parent","C:2051121652");		
			joinKeyMap.put("name","assets");
			
			lhm.put("join_key", joinKeyMap);
			
			lhm.put("billToAddress1","2805 DALLAS PKWY STE 240");
			lhm.put("itemFamilyName","UCSB");
			lhm.put("entitledPartyFlag","Install-at");
			lhm.put("itemFamilyId",98439);
			lhm.put("majorSoftwareUpdFlag","Y");
			lhm.put("billToCountry","US");
			lhm.put("endCustomerSiteAddress","5450 TECH CENTER");
			lhm.put("endCustomerPartyCollapseId","2051121795|3359891|62678");
			lhm.put("billToPartySiteUseId",401206915);
			lhm.put("billToSiteId",401353236);
			lhm.put("itemFamilyDesc","UCSB FAMILY");
			lhm.put("contractGuId","C:2051121652|7286557");
			lhm.put("itemType","ASSEMBLY");
			lhm.put("billToPartyName","FLAIR DATA SYSTEMS INC");
			lhm.put("saCustAccountId",2582);
			lhm.put("assetsCollapseId","2051121795|3359891|13605095|403530651|62678");
			lhm.put("wContractNumber","W90125228");
			lhm.put("endCustomerSiteUseStatus","A");
			lhm.put("shipToPartyId",null);
			lhm.put("itemFamilyGroupId",75766);
			lhm.put("doc_type","assets");
			lhm.put("lastDateOfSupport",null);
			lhm.put("billToAddress3",null);
			lhm.put("billToAddress2",null);
			lhm.put("billToAddress4",null);
			lhm.put("beCreateDate","2007-01-09T17:48:32.000Z");
			lhm.put("dupSerialNumber",null);
			lhm.put("meuPartyCollapseId","3359891|7286557|3013737646|62678");
			lhm.put("wBillToCustAccId",2582);
			lhm.put("alternateItemId",13469335);
			lhm.put("billToPartyId",2582);
			lhm.put("itemStatus","SVC-INACTV");
			lhm.put("beUpdateDate","2018-03-12T07:21:28.000Z");
			lhm.put("svcType","Contract");
			lhm.put("wHdrCustomerName","FLAIR DATA SYSTEMS INC");
			lhm.put("endCustomerPartyId",62678);
			lhm.put("orgAtInstall",62678);
			lhm.put("inPartyBasedShipToSiteUseId",228255);
			lhm.put("billToOeName","FLAIR DATA SYSTEMS");
			lhm.put("quantity",1);
			lhm.put("entitledAt","2");
			lhm.put("sfcContractFlag",null);
			lhm.put("saPartyBasedShipToSiteUseId",39162);
			lhm.put("itemTypeFlag","S");
			lhm.put("endCustomerSitePostalCode","80919");
			lhm.put("endCustomerSiteCity","COLORADO SPRINGS");
			lhm.put("saPartyBasedShipToPartyId",2582);
			lhm.put("serviceSellingPrice",null);
			lhm.put("stsCode","ACTIVE");
			lhm.put("endCustomerSiteOrgName","CISCO US OPERATING UNIT");
			lhm.put("wContractId",new BigInteger("50412898352"));
			lhm.put("serviceLineTerminatedDate",null);
			lhm.put("warrantyStatus","ACTIVE");
			lhm.put("agreementsCollapseId","2051121795|3359891|403530651|62678");
			lhm.put("meuAllowedFlag","N");
			lhm.put("contractId",2051121652);
			lhm.put("shipToSiteUseId",403530651);
			lhm.put("wCoverageEndDate","2021-06-21T00:00:00.000Z");
			
			fj.set_source(lhm);
			
			String json=om.writeValueAsString(fj);
			try {
				fw.write(json);
				fw.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
	
	}
	

}
