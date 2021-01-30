package top.woohsi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
public class HomeController {

    @RequestMapping("/isalive")
    @ResponseBody
    public String isAlive(HttpServletResponse response) {
//        response.addHeader("Access-Control-Allow-Origin", "*");
        //cross-origin-resource-policy: cross-origin
        return "{\"status\":\"OK\"}";
    }
}
