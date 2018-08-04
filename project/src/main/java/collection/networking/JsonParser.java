package collection.networking;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JsonParser {

    public static <T> T objectFromJson(String json) {
        Type listType = new TypeToken<T>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

    public static <T> List<T> listFromJson(String json) {
        Type listType = new TypeToken<ArrayList<T>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

}
