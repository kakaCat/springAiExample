package com.kakacat.ai.stdio.config;

import com.kakacat.ai.stdio.mcp.WeatherService;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.ToolCallbacks;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;


@Configuration
public class ToolCallbackProviderRegister {
    @Bean
    public ToolCallbackProvider weatherTools(WeatherService weatherService) {
        return MethodToolCallbackProvider.builder().toolObjects(weatherService).build();
    }

//    @Bean
//    public List<ToolCallback> tools(WeatherService weatherService) {
//        return new java.util.ArrayList<>(List.of(ToolCallbacks.from(weatherService)));
//    }


//    @Bean
//    public ToolCallbackProvider stockTools(StockService stockService) {
//        return MethodToolCallbackProvider.builder().toolObjects(stockService).build();
//    }
}
