package collection.networking;

import collection.social_network.User;

import javax.swing.*;
import java.util.List;

public class App {

    public static void main(final String[] args) {

        AppWindow appWindow = new AppWindow();
        JTextArea textArea = appWindow.getTextArea();

        HttpClient.getInstance().get("https://github.com/makks129/course_java", null, new HttpClient.Listener() {
            @Override
            public void onSuccess(String responseBody) {
                System.out.println("onSuccess: " + responseBody);

                List<User> users = JsonParser.listFromJson(responseBody);
                for (User user : users) {
                    textArea.append(user.toString() + "\n");
                }
            }

            @Override
            public void onFailure(int statusCode, Exception e) {
                System.out.println("onFailure: " + statusCode + ", " + e.getMessage());
                textArea.append("Failed to load data: status code = " + statusCode + ", error = " + e.getMessage());
            }
        });




    }

}
