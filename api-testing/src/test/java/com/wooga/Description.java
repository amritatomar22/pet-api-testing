package com.wooga;

public class Description {
	// Positive test scenarios descriptions
	public static final String TEST_GET_PETS_BY_STATUS_AVAILABLE_FOR_HTTP_STATUS_CODE_200 = "Get the details of pets with available status and check for 200 HTTP status code.";
	public static final String TEST_GET_PETS_BY_STATUS_AVAILABLE_FOR_RESPONSE_TIME = "Get the details of pets with available status and check for response time.";
	public static final String TEST_GET_PETS_BY_STATUS_SOLD_FOR_HTTP_STATUS_CODE_200 = "Get the details of pets with sold status and check for 200 HTTP status code.";
	public static final String TEST_GET_PETS_BY_STATUS_SOLD_FOR_RESPONSE_TIME = "Get the details of pets with sold status and check for response time.";
	public static final String TEST_GET_PETS_BY_STATUS_PENDING_FOR_HTTP_STATUS_CODE_200 = "Get the details of pets with pending status and check for 200 HTTP status code.";
	public static final String TEST_GET_PETS_BY_STATUS_PENDING_FOR_RESPONSE_TIME = "Get the details of pets with pending status and check for response time.";
	public static final String TEST_GET_PETS_BY_ALL_STATUS_AND_LOG_PET_LION = "Get the details of pets with all status and log lions as pet.";
	public static final String TEST_GET_PETS_BY_STATUS_PENDING_AND_VALIDATE_RESPONSE = "Get the details of pets with pending status and validate the response.";
	
	// Negative test scenarios descriptions
	public static final String TEST_GET_PETS_BY_STATUS_WITHOUT_PASSING_STATUS_QUERY_PARAMETER = "Get the pets by status without passing the status query parameter.";
	public static final String TEST_GET_PETS_BY_STATUS_WITH_INVALID_QUERY_PARAMETER = "Get the pets by status with invalid query parameter.";
}
