package com.maziad.hellorest;

import com.maziad.hellorest.model.BasicMessage;
import org.springframework.stereotype.Service;

@Service
public class HelloService implements IHelloService {
    @Override
    public BasicMessage sayHello() {
        return new BasicMessage("test");
    }
}
