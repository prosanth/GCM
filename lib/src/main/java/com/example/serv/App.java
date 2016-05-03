package com.example.serv;

/**
 * Created by Agneev on 22-04-2016.
 */
import com.example.server.vo.Content;

public class App {
    public static void main(String[] args) {

        System.out.println("Sending POST to GCM");

        String apiKey = "AIzaSyCId9DVJudfrTWJnYfF3WpD2kRVAtC0GNM";
        Content content = createContent();

        Post2Gcm.post(apiKey, content);
    }

    public static Content createContent() {
        Content c = new Content();

        c.addRegId("APA91bF-v94cz0gLwiElxQXeZb_tyWBSN6rdCrRqfQyXOSv04mKvb-qUr9tscH3ukvYVV5ugFatSLqTMAXfHVeOtWRS-JLt163OpgiDoSDTm1-L6CqGFPjvUw_-XjRrATwmJa8ZYWDBz");

        c.createData("Working!!", "Test message");

        return c;
    }
}

