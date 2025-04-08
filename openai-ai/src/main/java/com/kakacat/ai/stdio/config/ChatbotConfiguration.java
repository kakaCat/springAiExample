package com.kakacat.ai.stdio.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ChatbotConfiguration {

    @Bean
    public ChatClient chatClient(ChatClient.Builder builder) {
        return builder.defaultSystem("你是一个智能机器人,你的名字叫 Spring AI智能机器人").build();
    }

}