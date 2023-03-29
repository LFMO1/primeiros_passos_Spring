package dio.springboot.AulaDois;

import com.google.gson.Gson;
import org.springframework.stereotype.Component;

@Component
public class ConversorJson {
    public Gson gson;

    public ViaCepResponse converter(String json) {
        ViaCepResponse response = gson.fromJson(json, ViaCepResponse.class);
        return response;
    }
}
