package com.ddi.bloque6rubrica2;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Bloque6rubrica2Controller {
    @RequestMapping("/sample")
    public Map<String,String> sample(@RequestParam(value="name", defaultValue="World") String name) {
    Map<String,String> result = new HashMap<>();
    result.put("message", String.format("Hello, %s", name));
    return result;
    }
}


