package com.kakacat.ai.anthropic.controller;


import com.kakacat.ai.anthropic.aimodel.DeepSeekService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ai")
@CrossOrigin
public class DeepSeekController {

    @Resource
    private DeepSeekService deepSeekService;

    /**
      * 对接文本模型
      *
      * @param message 消息内容
      * @return AI答案
      */
    @GetMapping("/chat")
    public String completion(@RequestParam(value = "message", defaultValue = "Tell me a joke") String message) {
        return deepSeekService.completion(message);
    }
}
