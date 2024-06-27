import files.Payload;
import files.ReusuableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class firstApiTest {

    public static void main(String[] args) {
        RestAssured.baseURI = "https://rahulshettyacademy.com";
        //Add Place
        String responseForAddplace = given().log().all().queryParam("key", "qaclick123")
                .header("Content-Type","application/json")
                .body(Payload.AddPlace())
                .when().post("maps/api/place/add/json")
                .then().assertThat().statusCode(200).body("scope", equalTo("APP"))
                .extract().response().asString();
        System.out.println(responseForAddplace);
        JsonPath js1= ReusuableMethods.rawToJSon(responseForAddplace); //for parsing Json
        String placeId=js1.getString("place_id");

        System.out.println(placeId);

        // get Place
        String responseForGetPlace = given().log().all()
                .queryParam("key","qaclick123")
                .queryParam("place_id",placeId)
                .header("Content-Type","application/json")
                .when().get("maps/api/place/get/json")
                .then().assertThat().statusCode(200)
                .extract().response().asString();
        System.out.println(responseForGetPlace);
        JsonPath js2=ReusuableMethods.rawToJSon(responseForGetPlace);
        String address = js2.getString("address");
        System.out.println(address);

        //update Place
        String responseForUpdatePlace = given().log().all()
                                        .queryParam("key","qaclick123")
                                        .queryParam("place_id",placeId)
                                        .header("Content-Type","application/json")
                                        .body(Payload.updatePLace(placeId))
                                        .when().put("maps/api/place/update/json")
                                        .then().assertThat().statusCode(200)
                                        .extract().response().asString();

        System.out.println(responseForUpdatePlace);
        JsonPath js3=ReusuableMethods.rawToJSon(responseForUpdatePlace);
        String message = js3.getString("msg");
        System.out.println(message);

        //Delete place
        Response responseForDeletePlace = given().log().all()
                                        .queryParam("key","qaclick123")
                                        .header("Content-Type","application/json")
                                        .body(Payload.deletePlace(placeId))
                                        .when().delete("maps/api/place/delete/json")
                                        .then().assertThat().statusCode(200)
                                        .extract().response();
        JsonPath js4=ReusuableMethods.rawToJSon(responseForDeletePlace.asString());
       // String delMessage = js4.getString("status");
        int statusCode = responseForDeletePlace.getStatusCode();
        long responseTime = responseForDeletePlace.getTime();
        System.out.println("The response status Code  is" + statusCode);
        System.out.println("The response time is"+ responseTime);
       // System.out.println(delMessage);







    }
}
