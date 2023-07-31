
public class Payloads {
		public static String postPlaceMapPayload()
		{
			return "{\r\n" + 
					"  \"location\": {\r\n" + 
					"    \"lat\": -38.383494,\r\n" + 
					"    \"lng\": 33.427362\r\n" + 
					"  },\r\n" + 
					"  \"accuracy\": 50,\r\n" + 
					"  \"name\": \"Sanjay Patel\",\r\n" + 
					"  \"phone_number\": \"(+91) 983 893 3937\",\r\n" + 
					"  \"address\": \"29, side layout, cohen 09\",\r\n" + 
					"  \"types\": [\r\n" + 
					"    \"shoe park\",\r\n" + 
					"    \"shop\"\r\n" + 
					"  ],\r\n" + 
					"  \"website\": \"http://rahulshettyacademy.com\",\r\n" + 
					"  \"language\": \"French-IN\"\r\n" + 
					"}\r\n" + 
					"";
		}
		
		public static String putPlaceMapPayload(String placeId)
		{
			return "{\r\n" + 
					"\"place_id\":\""+placeId+"\",\r\n" + 
					"\"address\":\"73 winter walk, USA\",\r\n" + 
					"\"key\":\"qaclick123\"\r\n" + 
					"}\r\n" + 
					"";
		}
		
		public static String getMPayload()
		{
			return "{\r\n" + 
					"  \"data\" : [ {\r\n" + 
					"    \"mpiId\" : 10001,\r\n" + 
					"    \"createdBy\" : \"Admin\",\r\n" + 
					"    \"createdDate\" : \"2022-12-19T17:10:24.175Z\",\r\n" + 
					"    \"lastUpdatedBy\" : \"mfrederick\",\r\n" + 
					"    \"lastUpdatedDate\" : \"2023-03-19T16:10:24.175Z\",\r\n" + 
					"    \"deleted\" : false,\r\n" + 
					"    \"title\" : \"Mr.\",\r\n" + 
					"    \"firstName\" : \"Winstein\",\r\n" + 
					"    \"lastName\" : \"Barngully\",\r\n" + 
					"    \"middleName\" : \"Jay\",\r\n" + 
					"    \"birthDate\" : \"1953-03-19\",\r\n" + 
					"    \"placeOfBirth\" : \"London\",\r\n" + 
					"    \"maritalStatus\" : \"Widowed\",\r\n" + 
					"    \"gender\" : \"MALE\",\r\n" + 
					"    \"address\" : {\r\n" + 
					"      \"addressLine1\" : \"325 North Fourth Avenue\",\r\n" + 
					"      \"addressLine2\" : \"P.O.Box # 21678-9087\",\r\n" + 
					"      \"addressLine3\" : \"Station A\",\r\n" + 
					"      \"city\" : \"Minneapolis\",\r\n" + 
					"      \"district\" : \"Hennepin\",\r\n" + 
					"      \"state\" : \"MN\",\r\n" + 
					"      \"postalCode\" : \"55401\",\r\n" + 
					"      \"country\" : \"United States\"\r\n" + 
					"    },\r\n" + 
					"    \"religion\" : \"Catholic\",\r\n" + 
					"    \"races\" : [ \"White, not of Hispanic origin\", \"Native Hawaiian/Pacific Islander\" ],\r\n" + 
					"    \"primaryLanguage\" : \"English\",\r\n" + 
					"    \"secondaryLanguage\" : \"French\",\r\n" + 
					"    \"citizenship\" : \"U.S.\",\r\n" + 
					"    \"height\" : 72.0,\r\n" + 
					"    \"ibwRange\" : \"198.0\",\r\n" + 
					"    \"veteranNumber\" : \"141565\",\r\n" + 
					"    \"publicTrusteeNumber\" : \"5547773\",\r\n" + 
					"    \"education\" : \"High School\",\r\n" + 
					"    \"occupations\" : \"Public Speaker\",\r\n" + 
					"    \"phoneHome\" : \"323-555-3333\",\r\n" + 
					"    \"phoneCell\" : \"323-555-4321\",\r\n" + 
					"    \"phoneOffice\" : \"323-555-1111\",\r\n" + 
					"    \"phoneOfficeExt\" : \"321\",\r\n" + 
					"    \"fax\" : \"434-555-1255\",\r\n" + 
					"    \"emailAddress\" : \"wbarn@aol.com\",\r\n" + 
					"    \"webAddress\" : \"http://geocities.com/~wbarn/\",\r\n" + 
					"    \"sbi\" : \"00-010-2424\",\r\n" + 
					"    \"suffix\" : \"Sr.\",\r\n" + 
					"    \"highRisk\" : false,\r\n" + 
					"    \"doNotMerge\" : false,\r\n" + 
					"    \"medicareNumber\" : \"6144242V\",\r\n" + 
					"    \"sbiRequired\" : false,\r\n" + 
					"    \"ethnicity\" : \"Bi-racial\",\r\n" + 
					"    \"links\" : [ {\r\n" + 
					"      \"linkId\" : 1,\r\n" + 
					"      \"linkType\" : \"replaces\",\r\n" + 
					"      \"other\" : {\r\n" + 
					"        \"mpiId\" : 10002,\r\n" + 
					"        \"mergeSbi\" : \"\",\r\n" + 
					"        \"mergeMedicare\" : \"\",\r\n" + 
					"        \"deleted\" : true,\r\n" + 
					"        \"createdBy\" : \"pcc-demo\",\r\n" + 
					"        \"createdDate\" : \"1970-01-01T00:00:00.000Z\",\r\n" + 
					"        \"lastUpdatedBy\" : \"pcc-demo\",\r\n" + 
					"        \"lastUpdatedDate\" : \"1970-01-01T00:00:00.000Z\"\r\n" + 
					"      }\r\n" + 
					"    }, {\r\n" + 
					"      \"linkId\" : 1,\r\n" + 
					"      \"linkType\" : \"replaces\",\r\n" + 
					"      \"other\" : {\r\n" + 
					"        \"mpiId\" : 10002,\r\n" + 
					"        \"mergeSbi\" : \"\",\r\n" + 
					"        \"mergeMedicare\" : \"\",\r\n" + 
					"        \"deleted\" : false,\r\n" + 
					"        \"createdBy\" : \"pcc-demo\",\r\n" + 
					"        \"createdDate\" : \"2023-03-19T16:10:24.175Z\",\r\n" + 
					"        \"lastUpdatedBy\" : \"pcc-demo\",\r\n" + 
					"        \"lastUpdatedDate\" : \"2023-03-19T16:10:24.175Z\"\r\n" + 
					"      }\r\n" + 
					"    } ]\r\n" + 
					"  }, {\r\n" + 
					"    \"mpiId\" : 10002,\r\n" + 
					"    \"createdBy\" : \"Admin\",\r\n" + 
					"    \"createdDate\" : \"2022-12-19T17:10:24.175Z\",\r\n" + 
					"    \"lastUpdatedBy\" : \"mfrederick\",\r\n" + 
					"    \"lastUpdatedDate\" : \"2023-03-19T16:10:24.175Z\",\r\n" + 
					"    \"deleted\" : false,\r\n" + 
					"    \"title\" : \"Mrs.\",\r\n" + 
					"    \"firstName\" : \"Amanda\",\r\n" + 
					"    \"lastName\" : \"Smitherson\",\r\n" + 
					"    \"middleName\" : \"Gwen\",\r\n" + 
					"    \"birthDate\" : \"1953-03-19\",\r\n" + 
					"    \"placeOfBirth\" : \"New York\",\r\n" + 
					"    \"maritalStatus\" : \"Widowed\",\r\n" + 
					"    \"gender\" : \"FEMALE\",\r\n" + 
					"    \"address\" : {\r\n" + 
					"      \"addressLine1\" : \"325 North Fourth Avenue\",\r\n" + 
					"      \"addressLine2\" : \"P.O.Box # 21678-9087\",\r\n" + 
					"      \"addressLine3\" : \"Station A\",\r\n" + 
					"      \"city\" : \"Minneapolis\",\r\n" + 
					"      \"district\" : \"Hennepin\",\r\n" + 
					"      \"state\" : \"MN\",\r\n" + 
					"      \"postalCode\" : \"55401\",\r\n" + 
					"      \"country\" : \"United States\"\r\n" + 
					"    },\r\n" + 
					"    \"religion\" : \"Jewish\",\r\n" + 
					"    \"races\" : [ \"White, not of Hispanic origin\", \"Native Hawaiian/Pacific Islander\" ],\r\n" + 
					"    \"primaryLanguage\" : \"English\",\r\n" + 
					"    \"secondaryLanguage\" : \"Spanish\",\r\n" + 
					"    \"citizenship\" : \"U.S.\",\r\n" + 
					"    \"height\" : 64.0,\r\n" + 
					"    \"ibwRange\" : \"180.0\",\r\n" + 
					"    \"education\" : \"High School\",\r\n" + 
					"    \"occupations\" : \"Nurse\",\r\n" + 
					"    \"phoneHome\" : \"499-555-3434\",\r\n" + 
					"    \"emailAddress\" : \"asmith@aol.com\",\r\n" + 
					"    \"webAddress\" : \"http://geocities.com/~asmith/\",\r\n" + 
					"    \"sbi\" : \"00-074-3677\",\r\n" + 
					"    \"highRisk\" : false,\r\n" + 
					"    \"doNotMerge\" : false,\r\n" + 
					"    \"medicareNumber\" : \"345542V\",\r\n" + 
					"    \"sbiRequired\" : false,\r\n" + 
					"    \"ethnicity\" : \"Bi-racial\",\r\n" + 
					"    \"links\" : [ {\r\n" + 
					"      \"linkId\" : 1,\r\n" + 
					"      \"linkType\" : \"replaced-by\",\r\n" + 
					"      \"other\" : {\r\n" + 
					"        \"mpiId\" : 10002,\r\n" + 
					"        \"mergeSbi\" : \"\",\r\n" + 
					"        \"mergeMedicare\" : \"\",\r\n" + 
					"        \"deleted\" : true,\r\n" + 
					"        \"createdBy\" : \"pcc-demo\",\r\n" + 
					"        \"createdDate\" : \"1970-01-01T00:00:00.000Z\",\r\n" + 
					"        \"lastUpdatedBy\" : \"pcc-demo\",\r\n" + 
					"        \"lastUpdatedDate\" : \"1970-01-01T00:00:00.000Z\"\r\n" + 
					"      }\r\n" + 
					"    }, {\r\n" + 
					"      \"linkId\" : 1,\r\n" + 
					"      \"linkType\" : \"replaced-by\",\r\n" + 
					"      \"other\" : {\r\n" + 
					"        \"mpiId\" : 10002,\r\n" + 
					"        \"mergeSbi\" : \"\",\r\n" + 
					"        \"mergeMedicare\" : \"\",\r\n" + 
					"        \"deleted\" : false,\r\n" + 
					"        \"createdBy\" : \"pcc-demo\",\r\n" + 
					"        \"createdDate\" : \"2023-03-19T16:10:24.175Z\",\r\n" + 
					"        \"lastUpdatedBy\" : \"pcc-demo\",\r\n" + 
					"        \"lastUpdatedDate\" : \"2023-03-19T16:10:24.175Z\"\r\n" + 
					"      }\r\n" + 
					"    } ]\r\n" + 
					"  } ],\r\n" + 
					"  \"paging\" : {\r\n" + 
					"    \"offset\" : 3,\r\n" + 
					"    \"limit\" : 2,\r\n" + 
					"    \"maxLimit\" : 200,\r\n" + 
					"    \"hasMore\" : true\r\n" + 
					"  }\r\n}" + 
					"";
		}
}
