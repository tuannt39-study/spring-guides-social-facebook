package vn.its.socialfacebook.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.social.config.annotation.ConnectionFactoryConfigurer;
import org.springframework.social.config.annotation.EnableSocial;
import org.springframework.social.config.annotation.SocialConfigurer;

@Configuration
@EnableSocial
public abstract class SocialConfiguration implements SocialConfigurer {

    @Override
    public void addConnectionFactories(ConnectionFactoryConfigurer cfConfig, Environment env) {
        cfConfig.addConnectionFactory(new FacebookCustomApiVersionConnectionFactory("2.12", "2080187512270241","fa8b57b72b8a01295f40140543bf0ed6"));

    }
}
