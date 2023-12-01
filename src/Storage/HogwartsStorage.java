package Storage;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class HogwartsStorage {
    private ArrayList<Character> characters = new ArrayList<>();

    public HogwartsStorage() {
        this.characters = characters;
        Gson gson = new GsonBuilder().create();
        HttpClient client = HttpClient.newHttpClient();
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://hp-api.onrender.com/api/characters"))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
            characters = gson.fromJson(response.body(), new TypeToken<List<Character>>(){}.getType());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
