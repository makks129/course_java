package collection.networking;

import collection.social_network.User;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(final String[] args) {

        AppWindow appWindow = new AppWindow();
        JTextArea textArea = appWindow.getTextArea();
        JButton buttonLoad = appWindow.getButtonLoad();
        buttonLoad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadUsers(textArea, buttonLoad);
            }
        });

    }

    private static void loadUsers(JTextArea textArea, JButton buttonLoad) {
        String url = "https://raw.githubusercontent.com/makks129/course_java/master/project/src/main/java/collection/networking/users.json";
        HttpClient.getInstance().get(url, null, new HttpClient.Listener() {
            @Override
            public void onSuccess(String responseBody) {
                System.out.println("onSuccess: " + responseBody);

                List<User> users = parseUsersJson(responseBody);

                for (User user : users) {
                    textArea.append(user.toString() + "\n\n");
                }

                buttonLoad.setVisible(false);
            }

            @Override
            public void onFailure(int statusCode, Exception e) {
                System.out.println("onFailure: " + statusCode + ", " + e.getMessage());
                textArea.append("Failed to load data: status code = " + statusCode + ", error = " + e.getMessage());
            }
        });
    }

    private static List<User> parseUsersJson(String json) {
        Type listType = new TypeToken<ArrayList<User>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

}
