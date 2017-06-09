package st.malike.data.cloud.bot.sink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * malike_st
 */
@SpringBootApplication
@EnableAutoConfiguration
public class FacebookBotSink {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(FacebookBotSink.class, args);
    }


}
