package br.com.luizMaestri;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
@QuarkusTest
public class AlticciResourceTest {
    @Test
    public void baseCase0() {
        given()
            .when().get("/api/alticci/0")
            .then()
            .statusCode(200)
            .body(is("0"));
    }
    @Test
    public void baseCase1() {
        given()
                .when().get("/api/alticci/1")
                .then()
                .statusCode(200)
                .body(is("1"));
    }
    @Test
    public void baseCase2() {
        given()
                .when().get("/api/alticci/2")
                .then()
                .statusCode(200)
                .body(is("1"));
    }
    @Test
    public void baseCase10() {
        given()
                .when().get("/api/alticci/10")
                .then()
                .statusCode(200)
                .body(is("9"));
    }
    @Test
    public void negativeValue() {
        given()
                .when().get("/api/alticci/-1")
                .then()
                .statusCode(400);
    }
}
