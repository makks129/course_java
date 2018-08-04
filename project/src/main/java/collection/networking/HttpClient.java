package collection.networking;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.ParseException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.util.Map;

public class HttpClient {

    private static HttpClient instance;

    private final CloseableHttpClient http;

    private HttpClient() {
        http = HttpClients.createDefault();
    }

    public static HttpClient getInstance() {
        if (instance == null) {
            instance = new HttpClient();
        }
        return instance;
    }

    public void get(String url, Map<String, String> params, Listener listener) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                sendGetRequest(url, params, listener);
            }
        }).start();
    }

    private void sendGetRequest(String url, Map<String, String> params, Listener listener) {
        try {

            URIBuilder uriBuilder = new URIBuilder(url);
            if (params != null) {
                for (String key : params.keySet()) {
                    uriBuilder.setParameter(key, params.get(key));
                }
            }
            URI uri = uriBuilder.build();
            HttpGet httpget = new HttpGet(uri);

            http.execute(httpget, new ResponseHandler<String>() {
                @Override
                public String handleResponse(HttpResponse response) throws IOException {
                    int statusCode = response.getStatusLine().getStatusCode();
                    if (statusCode >= HttpStatus.SC_OK && statusCode < HttpStatus.SC_MULTIPLE_CHOICES) {
                        HttpEntity entity = response.getEntity();
                        try {
                            if (entity != null) {
                                String responseBody = EntityUtils.toString(entity);
                                listener.onSuccess(responseBody);
                            } else {
                                listener.onFailure(-1, null);
                            }
                        } catch (ParseException e) {
                            listener.onFailure(-1, e);
                        }
                    } else {
                        listener.onFailure(statusCode, null);
                    }
                    return null;
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                http.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public interface Listener {
        void onSuccess(@NotNull String responseBody);

        void onFailure(int statusCode, @Nullable Exception e);
    }

}
