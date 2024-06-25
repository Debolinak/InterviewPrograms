import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pojo.request.response.*;
import RawJSON.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
public class TestForAPI {
    public static String accesstoken = "";
    public static String userId = "";
    public static String productId = "";

//@org.testng.annotations.Test(priority = 0)
    //@BeforeTest
    public static void login() {

        RequestSpecification loginReq = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com/")
                                        .setContentType(ContentType.JSON).build();
        LoginRequest loginRequestObj = new LoginRequest();
        loginRequestObj.setUserEmail("debolinatester@gmail.com");
        loginRequestObj.setUserPassword("Welcome@1");

        // Forming the Login Request
        LoginResponse loginResponseObj = given().log().all().spec(loginReq).body(loginRequestObj).
                                         when().post("/api/ecom/auth/login").
                                         then().log().all().extract().response().as(LoginResponse.class);

         accesstoken = (loginResponseObj.getToken());
         userId = (loginResponseObj.getUserId());


    }
    //@org.testng.annotations.Test (priority = 1)
    public static void createProduct(){
        RequestSpecification createProductSpec = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
                                                 .addHeader("Authorization", accesstoken)
                                                .build();

        String createProductResponse = given().log().all().spec(createProductSpec)
                                                        .param("productName","Mac_MakeUP_Products")
                                                        .param("productAddedBy",userId)
                                                        .param("productCategory", "fashion")
                                                        .param("productSubCategory", "fashion")
                                                        .param("productPrice", "3500")
                                                        .param("productDescription", "Make Up for Women")
                                                        .param("productFor", "Make Up Item")
                                                        .multiPart("productImage",new File( "C://Users//hp//Downloads//product_Image.jpg"))
                                                        .when().post("/api/ecom/product/add-product")
                                                        .then().log().all().extract().response().asString();
        JsonPath js = new JsonPath(createProductResponse);
        String productId =js.get("productId");
        String userName = js.get("message");
        System.out.println(productId);

    }
   // @org.testng.annotations.Test(priority = 3)
    public static void createOrder()
    {
        RequestSpecification createOrderSpec = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com/")
                                               .addHeader("Authorization", userId)
                                               .setContentType(ContentType.JSON)
                                               .build();

        OrderDetail orderDetailObj = new OrderDetail();
        orderDetailObj.setCountry("India");
        orderDetailObj.setProductOrderedId(productId);
        List<OrderDetail> orderDetail = new ArrayList<OrderDetail>();
        orderDetail.add(orderDetailObj);
        OrderDetailRequest orderDetailRequestObj = new OrderDetailRequest();
        orderDetailRequestObj.setOrders(orderDetail);


        String createOrderResponse = given().log().all().spec(createOrderSpec)
                .when().post("/api/ecom/order/create-order")
                .then().log().all().extract().response().asString();
        JsonPath js = new JsonPath(createOrderResponse);
        String message = js.get("message");
        System.out.println(message);

    }
  //  @org.testng.annotations.Test(priority = 4)
    @Test
     public static void deleteOrder()
    {
 RequestSpecification delOrderSpec = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
         .setContentType(ContentType.JSON)
         .addHeader("authorization", userId)
         .build();
 Response deleteOrderResponse = given().log().all().spec(delOrderSpec)
         .when().delete("/api/ecom/product/delete-product/6614c21da86f8f74dcbad82d")
         .then().log().all().extract().response();
        System.out.println(deleteOrderResponse.getTime());
        String responseBody = deleteOrderResponse.getBody().asString();
 JsonPath js = new JsonPath(responseBody);
 String message = js.get("message");
        System.out.println(message);
    }

   // @Test
    public static void nestedJSONTest()
    {
    JsonPath js = new JsonPath(CoursePrice());
    int sizeCount = js.getInt("courses.size()");
        System.out.println(sizeCount);
        //To Print the title of the 1st course
        String firstCourseTitle = js.get("courses[0].title");
        System.out.println(firstCourseTitle);
        //to print the title of the 2nd and 3rd course
        String secondTitle = js.get("courses[1].title");
        String thirdTitle = js.get("courses[2].title");
        System.out.println(secondTitle);
        System.out.println(thirdTitle);
        //To Print all the price and Copies
        int price1 = js.get("courses[0].price");
        int price2 = js.get("courses[1].price");
        int price3 = js.get("courses[2].price");
        System.out.println(price1);
        System.out.println(price2);
        System.out.println(price3);

        int copies1 = js.get("courses[0].copies");
        int copies2 = js.get("courses[1].copies");
        int copies3 = js.get("courses[2].copies");
        System.out.println(copies1);
        System.out.println(copies2);
        System.out.println(copies3);
    }

    public static String CoursePrice() {
        return "{\n" +
                "    \"dashboard\": {\n" +
                "        \"purchaseAmount\": 910,\n" +
                "        \"website\": \"rahulshettyacademy.com\"\n" +
                "    },\n" +
                "    \"courses\": [\n" +
                "        {\n" +
                "            \"title\": \"Selenium Python\",\n" +
                "            \"price\": 50,\n" +
                "            \"copies\": 6\n" +
                "        },\n" +
                "        {\n" +
                "            \"title\": \"Cypress\",\n" +
                "            \"price\": 40,\n" +
                "            \"copies\": 4\n" +
                "        },\n" +
                "        {\n" +
                "            \"title\": \"RPA\",\n" +
                "            \"price\": 45,\n" +
                "            \"copies\": 10\n" +
                "        }\n" +
                "    ]\n" +
                "}";
    }
}
