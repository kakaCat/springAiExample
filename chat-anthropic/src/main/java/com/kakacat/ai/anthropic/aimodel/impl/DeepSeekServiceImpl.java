package com.kakacat.ai.anthropic.aimodel.impl;

import com.kakacat.ai.anthropic.aimodel.DeepSeekService;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.stereotype.Service;


@Service
public class DeepSeekServiceImpl implements DeepSeekService {
    private final ChatClient chatClient;

    public  DeepSeekServiceImpl(ChatClient.Builder  chatClientBuilder) {
    // 构造方法注入 ChatClient.Builder，用于构建 ChatClient 实例
        this.chatClient = chatClientBuilder.build();
    }
    /**
             * 文本模型
             *
             *  @param  message 消息内容
             *  @return  AI答案
             */
    @Override
    public String completion(String message) {
//        log.info("DeepSeek response");
        // 调用 ChatClient 的 prompt 方法生成响应
        // 1. new Prompt(message): 创建一个包含用户输入消息的 Prompt 对象
        // 2. call(): 调用ChatClient与AI模型交互以获取响应
        // 3. content(): 获取响应的内容部分
        return chatClient.prompt(new Prompt(message)).call().content();
    }

}
