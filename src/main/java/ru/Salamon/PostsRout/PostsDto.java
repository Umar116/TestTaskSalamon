package ru.Salamon.PostsRout;


public class PostsDto {

    public Integer userId;
    public Integer id;
    public String title;
    public String body;


    public Integer getId() {
        return id;
    }

    public PostsDto setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public PostsDto setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getBody() {
        return body;
    }

    public PostsDto setBody(String body) {
        this.body = body;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public PostsDto setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

}
