package com.mw.mw.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudyController {

    @RequestMapping("/worker")
    public String worker(){
        return "worker";
    }
}
