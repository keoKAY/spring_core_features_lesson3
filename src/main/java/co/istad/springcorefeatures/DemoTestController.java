package co.istad.springcorefeatures;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoTestController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
    @GetMapping("/thread")
    public String currentThread()  {
        var thread = Thread.currentThread();
        return "thread: " + thread.toString();
    }
}
