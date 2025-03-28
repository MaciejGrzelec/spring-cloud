package org.mgrzelec.ms1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//dynamiczna zmiana konfiguracji - oprócz tego w application properties potrzebny jest refresh
@RefreshScope
@RestController
public class Ms1Controller {

	@Value("${message:without config server}")
	private String message;

	@GetMapping
	public String hello() {
		return message;
	}
}
