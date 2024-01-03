package com.example.bbb;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Getter
@Setter
@RequiredArgsConstructor
public class MainController {
    @GetMapping("/article")
    @ResponseBody
    public String aaa(){
        return "안녕하세요";
    }

}
