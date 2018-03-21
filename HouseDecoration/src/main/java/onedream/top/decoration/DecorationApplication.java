package onedream.top.decoration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by yinan.zhang on 2018/3/19.
 */
@SpringBootApplication
public class DecorationApplication implements CommandLineRunner{
    private Logger logger = LoggerFactory.getLogger(DecorationApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DecorationApplication.class, args);
    }


    @Override
    public void run(String... strings) throws Exception {
        logger.info("House Decoration start ...");
    }
}
