package com.wooga;

import static com.wooga.Constant.API_RESPONSE_TIME;
import static com.wooga.Constant.AVAILABLE;
import static com.wooga.Constant.BAD_REQUEST;
import static com.wooga.Constant.CONTENT_TYPE_JSON;
import static com.wooga.Constant.GET_PET_BY_STATUS_URL;
import static com.wooga.Constant.INVALID_QUERY_PARAM;
import static com.wooga.Constant.OK;
import static com.wooga.Constant.OK_STATUS_LINE;
import static com.wooga.Constant.PENDING;
import static com.wooga.Constant.SOLD;
import static com.wooga.Constant.STATUS;
import static com.wooga.Description.TEST_GET_PETS_BY_ALL_STATUS_AND_LOG_PET_LION;
import static com.wooga.Description.TEST_GET_PETS_BY_STATUS_AVAILABLE_FOR_HTTP_STATUS_CODE_200;
import static com.wooga.Description.TEST_GET_PETS_BY_STATUS_AVAILABLE_FOR_RESPONSE_TIME;
import static com.wooga.Description.TEST_GET_PETS_BY_STATUS_PENDING_AND_VALIDATE_RESPONSE;
import static com.wooga.Description.TEST_GET_PETS_BY_STATUS_PENDING_FOR_HTTP_STATUS_CODE_200;
import static com.wooga.Description.TEST_GET_PETS_BY_STATUS_PENDING_FOR_RESPONSE_TIME;
import static com.wooga.Description.TEST_GET_PETS_BY_STATUS_SOLD_FOR_HTTP_STATUS_CODE_200;
import static com.wooga.Description.TEST_GET_PETS_BY_STATUS_SOLD_FOR_RESPONSE_TIME;
import static com.wooga.Description.TEST_GET_PETS_BY_STATUS_WITHOUT_PASSING_STATUS_QUERY_PARAMETER;
import static com.wooga.Description.TEST_GET_PETS_BY_STATUS_WITH_INVALID_QUERY_PARAMETER;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hamcrest.Matchers;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.wooga.model.PetApiResponse;

import io.restassured.response.Response;

public class PetApiTest {
	
	private static final Logger logger = LogManager.getLogger(PetApiTest.class);
	
	/**
	 * Test case to get the pets by available status and check for 200 HTTP status code
	 */	
	@Test(description = TEST_GET_PETS_BY_STATUS_AVAILABLE_FOR_HTTP_STATUS_CODE_200, priority=0)
	public void testGetPetsByStatusAvailableForHTTPStatusCode200() {
		logger.info("Starting testGetPetsByStatusAvailableForHTTPStatusCode200");
		given()
			.when()
			.queryParam(STATUS, AVAILABLE)
			.get(GET_PET_BY_STATUS_URL)
			.then()
			.contentType(CONTENT_TYPE_JSON)
			.statusCode(OK)
			.statusLine(OK_STATUS_LINE);
		logger.info("Ending testGetPetsByStatusAvailableForHTTPStatusCode200");
	}
	
	/**
	 * Test case to get the pets by available status and check the response time
	 */
	@Test(description = TEST_GET_PETS_BY_STATUS_AVAILABLE_FOR_RESPONSE_TIME, priority=0)
	public void testGetPetsByStatusAvailableForResponseTime() {
		logger.info("Starting testGetPetsByStatusAvailableForResponseTime");
		given()
			.when()
			.queryParam(STATUS, AVAILABLE)
			.get(GET_PET_BY_STATUS_URL)
			.then()
			.time(Matchers.lessThan(API_RESPONSE_TIME), TimeUnit.SECONDS);
		logger.info("Ending testGetPetsByStatusAvailableForResponseTime");
	}
	
	/**
	 * Test case to get the pets by sold status and check for 200 HTTP status code
	 */
	@Test(description = TEST_GET_PETS_BY_STATUS_SOLD_FOR_HTTP_STATUS_CODE_200, priority=0)
	public void testGetPetsByStatusSoldForHTTPStatusCode200() {
		logger.info("Starting testGetPetsByStatusSoldForHTTPStatusCode200");
		given()
			.when()
			.queryParam(STATUS, SOLD)
			.get(GET_PET_BY_STATUS_URL)
			.then()
			.contentType(CONTENT_TYPE_JSON)
			.statusCode(OK)
			.statusLine(OK_STATUS_LINE);
		logger.info("Ending testGetPetsByStatusSoldForHTTPStatusCode200");
	}
	
	/**
	 * Test case to get the pets by sold status and check the response time
	 */
	@Test(description = TEST_GET_PETS_BY_STATUS_SOLD_FOR_RESPONSE_TIME, priority=0)
	public void testGetPetsByStatusSoldForResponseTime() {
		logger.info("Starting testGetPetsByStatusSoldForResponseTime");
		given()
			.when()
			.queryParam(STATUS, SOLD)
			.get(GET_PET_BY_STATUS_URL)
			.then()
			.time(Matchers.lessThan(API_RESPONSE_TIME), TimeUnit.SECONDS);
		logger.info("Ending testGetPetsByStatusSoldForResponseTime");
	}
	
	/**
	 * Test case to get the pets by pending status and check for 200 HTTP status code
	 */
	@Test(description = TEST_GET_PETS_BY_STATUS_PENDING_FOR_HTTP_STATUS_CODE_200, priority=0)
	public void testGetPetsByStatusPendingForHTTPStatusCode200() {
		logger.info("Starting testGetPetsByStatusPendingForHTTPStatusCode200");
		given()
			.when()
			.queryParam(STATUS, PENDING)
			.get(GET_PET_BY_STATUS_URL)
			.then()
			.contentType(CONTENT_TYPE_JSON)
			.statusCode(OK)
			.statusLine(OK_STATUS_LINE);
		logger.info("Ending testGetPetsByStatusPendingForHTTPStatusCode200");
	}
	
	/**
	 * Test case to get the pets by pending status and the response time
	 */
	@Test(description = TEST_GET_PETS_BY_STATUS_PENDING_FOR_RESPONSE_TIME, priority=0)
	public void testGetPetsByStatusPendingForResponseTime() {
		logger.info("Starting testGetPetsByStatusPendingForResponseTime");
		given()
			.when()
			.queryParam(STATUS, PENDING)
			.get(GET_PET_BY_STATUS_URL)
			.then()
			.time(Matchers.lessThan(API_RESPONSE_TIME), TimeUnit.SECONDS);
		logger.info("Ending testGetPetsByStatusPendingForResponseTime");
	}
	
	/**
	 * Test case to get the pets by status without passing the status query parameter
	 */
	@Test(description = TEST_GET_PETS_BY_STATUS_WITHOUT_PASSING_STATUS_QUERY_PARAMETER, priority=1)
	public void testGetPetsByStatusWithoutPassingStatusQueryParameter() {
		logger.info("Starting testGetPetsByStatusWithoutPassingStatusQueryParameter");
		given()
			.when()
			.get(GET_PET_BY_STATUS_URL)
			.then()
			.statusCode(BAD_REQUEST);
		logger.info("Ending testGetPetsByStatusWithoutPassingStatusQueryParameter");
	}
	
	/**
	 * Test case to get the pets by status with invalid query parameter
	 */
	@Test(description = TEST_GET_PETS_BY_STATUS_WITH_INVALID_QUERY_PARAMETER, priority=1)
	public void testGetPetsByStatusWithInvalidQueryParameter() {
		logger.info("Starting testGetPetsByStatusWithInvalidQueryParameter");
		String expectedErrorMessage = "Input error: query parameter `status value `invalid` is not in the allowable values `[available, pending, sold]`";
		
		given()
			.when()
			.queryParam(STATUS, INVALID_QUERY_PARAM)
			.get(GET_PET_BY_STATUS_URL)
			.then()
			.contentType(CONTENT_TYPE_JSON)
			.statusCode(BAD_REQUEST)
			.body("code", Matchers.equalTo(400))
            .body("message", Matchers.equalTo(expectedErrorMessage));
		logger.info("Ending testGetPetsByStatusWithInvalidQueryParameter");
	}
	
	
	/**
	 * Test case to get the details of pets with all status and log lions 
	 * as pet
	 */
	@Test(description = TEST_GET_PETS_BY_ALL_STATUS_AND_LOG_PET_LION, priority=0)
	public void testGetPetsByAllStatusAndLogPetLion() {
		logger.info("Starting testGetPetsByAllStatusAndLogPetLion");
		List<Object> finalList = new ArrayList<>();
		Response availableStatusResponse = given()
			.when()
			.queryParam(STATUS, AVAILABLE)
			.get(GET_PET_BY_STATUS_URL);
		Response soldStatusResponse = given()
			.when()
			.queryParam(STATUS, SOLD)
			.get(GET_PET_BY_STATUS_URL);
		Response pendingStatusResponse = given()
			.when()
			.queryParam(STATUS, PENDING)
			.get(GET_PET_BY_STATUS_URL);
		
		String findAllLionsExpression = "findAll{it.category.name == 'Lions'}";
		List<Object> availableStatusLionList = availableStatusResponse.jsonPath().getList(findAllLionsExpression);
		if(availableStatusLionList!= null && availableStatusLionList.size() > 0) {
			finalList.addAll(availableStatusLionList);
		}
		
		List<Object> soldStatusLionList = soldStatusResponse.jsonPath().getList(findAllLionsExpression);
		if(soldStatusLionList != null && soldStatusLionList.size() > 0) {
			finalList.addAll(soldStatusLionList);
		}
		
		List<Object> pendingStatusLionList = pendingStatusResponse.jsonPath().getList(findAllLionsExpression);
		if(pendingStatusLionList != null && pendingStatusLionList.size() > 0) {
			finalList.addAll(pendingStatusLionList);
		}
		
		logger.info(finalList);
		logger.info("Ending testGetPetsByAllStatusAndLogPetLion");
	}
	
	/**
	 * Test case to get the details of pets with pending status and validate the response 
	 */
	@Test(description = TEST_GET_PETS_BY_STATUS_PENDING_AND_VALIDATE_RESPONSE, priority=0)
	@Ignore
	public void testGetPetsByStatusPendingAndValidateResponse() {
		logger.info("Starting testGetPetsByStatusPendingAndValidateResponse");
		
		int expectedSize = 1;
		int expectedId = 6;
		String expectedName = "Dog 3";
		String expectedCategoryName = "Dogs";
		String expectedStatus = "pending";
		
		PetApiResponse[] response = given()
			.when()
			.queryParam(STATUS, PENDING)
			.get(GET_PET_BY_STATUS_URL)
			.as(PetApiResponse[].class);
		 
		List<PetApiResponse> petApiResponses = Arrays.asList(response);
		// check the array size
		assertEquals(petApiResponses.size(), expectedSize);
		
		for(PetApiResponse petApiResponse : petApiResponses) {
			if(petApiResponse.getId() == 6) {
				// check for id
				assertEquals(petApiResponse.getId(), expectedId);
				
				// check for name
				assertEquals(petApiResponse.getName(), expectedName);
				
				// check for status
				assertEquals(petApiResponse.getStatus(), expectedStatus);
				
				// check for category name
				assertEquals(petApiResponse.getCategory().getName(), expectedCategoryName);
				
			}
		}
		
		logger.info("Ending testGetPetsByStatusPendingAndValidateResponse");
	}
	
}
