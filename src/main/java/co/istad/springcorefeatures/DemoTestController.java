package co.istad.springcorefeatures;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class DemoTestController {
    // Constructor injection
    private final AppProperties appProperties;
    public DemoTestController(AppProperties appProperties) {
        this.appProperties = appProperties;
    }

    @GetMapping("/config")
    public Map<String, Object> config(){
        Map<String, Object> map = new HashMap<>();
        map.put("name", appProperties.getName());
        map.put("version", appProperties.getVersion());
        map.put("description", appProperties.getDescription());
        map.put("jwtSecret", appProperties.getSecurity().getJwtSecret());
        map.put("jwtExpiration", appProperties.getSecurity().getExpiration());

        map.put("Kafka Topic: ", appProperties.getKafka().getTopic());
        return map;
    }

    // Check if you use old thread or new thread
    @GetMapping("/thread")
    public String currentThread()  {
        var thread = Thread.currentThread();
        return "thread: " + thread.toString();
    }
}
