import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@Test
public class BasicGraphQLTest {

    public void getAllFilms() {

        //https://hasura.io/learn/graphql/graphiql

        RestAssured.baseURI = "https://hasura.io/";
        String query = "{\\n  users {\\n    id\\n  }\\n}\\n";

        given().log().all()
                .contentType("application/json")
                .body(query)
                .when().log().all()
                .post("learn/graphql/graphiql")
                .then().log().all()
                .assertThat().statusCode(200);

    }

}
