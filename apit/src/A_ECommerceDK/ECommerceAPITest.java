package A_ECommerceDK;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import pojo.LoginRequest;
import pojo.LoginResponse;

import static io.restassured.RestAssured.given;

import java.io.File;

import A_PojoDK.createProduct;
import A_PojoDK.createProductResponse;

public class ECommerceAPITest {

	public static void main(String[] args) {
		RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com/")
				.setContentType(ContentType.JSON).build();
		LoginRequest loginRequest = new LoginRequest();
		loginRequest.setUserEmail("debolinatester@gmail.com");
		loginRequest.setUserPassword("Welcome@1");
		
		// Creating the Login Request
		RequestSpecification reqLogin = given().log().all().spec(req).body(loginRequest);
		LoginResponse loginResponse = reqLogin.when().post("/api/ecom/auth/login").then().log().all().extract()
				.response().as(LoginResponse.class);
		System.out.println(loginResponse.getToken());
		String token = loginResponse.getToken();
		String userId = loginResponse.getUserId();
		
		//Adding the Product
		RequestSpecification reqWithAuthorization = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com/")
				.addHeader("authorization",token)
				.build();
		

	
		String productSubCategory;
		String productPrice;
		

		
		RequestSpecification reqCreateProduct = given().log().all().spec(reqWithAuthorization)
				.param("productName","Mac_MakeUP_Products")
				.param("productAddedBy",userId)
				.param("productCategory", "fashion")
				.param("productSubCategory", "fashion")
				.param("productPrice", "3500")
				.param("productDescription", "Make Up for Women")
				.param("productFor", "Make Up Item")
				.multiPart("productImage",new File("C://Users//hp//Downloads//product_Image.jpg"));
		
		String addProductResponse =reqCreateProduct.when().post("/api/ecom/product/add-product").
				then().log().all().extract().response().asString();
				JsonPath js = new JsonPath(addProductResponse);
				String productId =js.get("productId");
			
		//		body(createProductobj);
	//	createProductResponse createProductResponse = reqCreateProduct.when().post("/api/ecom/product/add-product").then().log().all().extract()
				                          //   .response().as(createProductResponse.class);
	}

}
