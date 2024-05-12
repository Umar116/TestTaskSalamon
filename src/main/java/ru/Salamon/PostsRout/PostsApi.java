package ru.Salamon.PostsRout;

import io.qameta.allure.Step;
import io.restassured.response.ValidatableResponse;
import ru.Salamon.Specifications;

import static io.restassured.RestAssured.given;

public class PostsApi {

    Specifications spec = new Specifications();

    @Step("Создать пост")
    public ValidatableResponse createNewDate() {
        return given(spec.header())
                .post("posts")
                .then();

    }

    @Step("Запросить список юзеров")
    public ValidatableResponse getUserList() {
        return
                given(spec.header())
                        .get("posts/")
                        .then();
    }

    @Step("Запросить данные юзеров")
    public ValidatableResponse getUserDate() {
        return
                given(spec.header())
                        .get("posts/1")
                        .then();
    }

    @Step("Запросить комментарии постов")
    public ValidatableResponse getUserComments() {
        return
                given(spec.header())
                        .get("/posts/1/comments")
                        .then();
    }
    @Step("Запросить комментарии постов по ID")
    public ValidatableResponse getCommentsByPostId() {
        return
                given(spec.header())
                        .get("/comments?postId=1")
                        .then();
    }

    @Step("Изменить данные юзеров")
    public ValidatableResponse changeUserDates() {
        return
                given(spec.header())
                        .put("posts/1")
                        .then();
    }

    @Step("Изменить значения в данных юзеров")
    public ValidatableResponse changeUserValue() {
        return
                given(spec.header())
                        .patch("posts/1")
                        .then();
    }
}
