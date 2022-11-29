package de.ketarion.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello World! - From the Primary BEAN";
    }
}
