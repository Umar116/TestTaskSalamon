import org.junit.jupiter.api.Test;
import ru.Salamon.PostsRout.PostsApi;
import ru.Salamon.PostsRout.PostsDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestTask2 {
    PostsApi postsApi = new PostsApi();
    public List<PostsDto> postDto;

    @Test
    public void worldsCount() {
        postDto = List.of(postsApi.getUserList()
                .extract()
                .response()
                .as(PostsDto[].class));

        for (PostsDto postsDto : postDto) {
            Map<String, Integer> counter = new HashMap<>();
            String[] ab = postsDto.getBody().split(" ");

            System.out.println(" ");

            for (String s : ab) {
                int newValue = counter.getOrDefault(s, 0) + 1;
                counter.put(s, newValue);
            }

            List<Map.Entry<String, Integer>> entryList = new ArrayList<>(counter.entrySet());
            entryList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

            for (int c = 0; c < Math.min(10, entryList.size()); c++) {
                Map.Entry<String, Integer> entry = entryList.get(c);
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

    }
}
