package vn.its.socialfacebook.config;

import org.springframework.social.connect.support.OAuth2ConnectionFactory;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.connect.FacebookAdapter;

public class FacebookCustomApiVersionConnectionFactory extends OAuth2ConnectionFactory<Facebook> {

    public FacebookCustomApiVersionConnectionFactory(String apiVersion, String appId, String appSecret) {
        super("facebook", new FacebookCustomApiVersionServiceProvider(apiVersion, appId, appSecret, null), new FacebookAdapter());
    }
}
