package pl.piotrfigura.chat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChatApplication.class, args);
        Car car = new Car.CarBuilder().setCapa(200).setAge(1).setName("as").build();
    }

}
