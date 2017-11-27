package tech.plateauu.shortener;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@SpringBootApplication
public class ShortenerApplication {

    public static void main(String[] args) {
        SpringApplication
                .run(ShortenerApplication.class, args);

    }

    class ScheduledCommandLineRunner implements CommandLineRunner {

        @Scheduled()
        @Override
        public void run(String... args) throws Exception {
            System.out.println("Hello world");
        }
    }
}
