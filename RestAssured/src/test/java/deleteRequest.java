import io.restassured.RestAssured;

public class deleteRequest {
    public static void main(String[] args) {
        RestAssured.
                given().
                baseUri("https://reqres.in/api/users/2").
                when().
                delete().
                prettyPrint();
    }
}
