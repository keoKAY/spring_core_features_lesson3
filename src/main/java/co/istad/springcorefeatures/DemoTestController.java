package co.istad.springcorefeatures;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class DemoTestController {

    // Get the values from the application.yaml file
    // for dynamic configuration

    @Value("${app-info.name}")
    private String appName;
    @Value("${app-info.domain}")
    private String domain;


    @GetMapping("/hello")
    public Map<String,Object> hello() {
        HashMap<String,Object> map = new HashMap<>();
        map.put("app-info.name", appName);
        map.put("domain", domain);
        return map;
    }

    // Check if you use old thread or new thread
    @GetMapping("/thread")
    public String currentThread()  {
        var thread = Thread.currentThread();
        return "thread: " + thread.toString();
    }
}
