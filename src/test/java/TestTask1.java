import io.qameta.allure.Severity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.Salamon.PostsRout.PostsApi;

import static io.qameta.allure.SeverityLevel.*;

public class TestTask1 {
    PostsApi postsApi = new PostsApi();

    @Severity(CRITICAL)
    @DisplayName("Создание нового юзера")
    @Test
    public void newUserIdIsDisplayed() {
        postsApi.createNewDate()
                .statusCode(201);
    }

    @Severity(CRITICAL)
    @DisplayName("Список юзеров отображается")
    @Test
    public void userListIsDisplayed() {
        postsApi.getUserList()
                .statusCode(200);
    }

    @Severity(CRITICAL)
    @DisplayName("Отображаются данные юзера")
    @Test
    public void userDateIsDisplayed() {
        postsApi.getUserDate()
                .statusCode(200);
    }

    @Severity(MINOR)
    @DisplayName("Отображаются комментарии юзеров")
    @Test
    public void userCommentIsDisplayed() {
        postsApi.getUserComments()
                .statusCode(200);
    }

    @Severity(MINOR)
    @DisplayName("Отображаются данные юзеров по ID")
    @Test
    public void userPostIdIsDisplayed() {
        postsApi.getCommentsByPostId()
                .statusCode(200);
    }

    @Severity(NORMAL)
    @DisplayName("Данные юзеров обновляются")
    @Test
    public void userDateIsChanged() {
        postsApi.changeUserDates()
                .statusCode(200);
    }

    @Severity(NORMAL)
    @DisplayName("Значения в данных юзеров изменяются")
    @Test
    public void userDateValueIsChanged() {
        postsApi.changeUserValue()
                .statusCode(200);
    }
}
