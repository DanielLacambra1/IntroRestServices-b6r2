package com.ddi.bloque6rubrica2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
@SpringBootApplication
public class Bloque6rubrica2Application {

    @RequestMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String home() {
        return "Nothing here. Go to <a href='/sample'>/sample</a>";
    }

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Bloque6rubrica2Application.class, args);
	}

}
