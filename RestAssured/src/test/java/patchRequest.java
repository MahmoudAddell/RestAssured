import io.restassured.RestAssured;

public class patchRequest {
    public static void main(String[] args) {
        RestAssured.
                given().
                baseUri("https://reqres.in/api/users/2").
                header("Content-Type" ,"application/json").
                body("{\"name\": \"Mahmoud\"," + " \"job\": \"Tester\"}").
                when().
                patch().
                prettyPrint();
    }
}
