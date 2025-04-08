package com.kakacat.ai.flux;

import com.kakacat.ai.flux.mcp.WeatherService;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class FluxServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FluxServerApplication.class, args);
    }


}
