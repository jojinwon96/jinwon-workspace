package com.jw.sp_pro.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class memberController {
    @GetMapping("/")
    public String index() {
        return "index"; // => index.jsp 출력
    }
}
