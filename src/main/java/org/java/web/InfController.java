package org.java.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import javax.xml.ws.RequestWrapper;

@Controller
public class InfController {

    @RequestMapping("/load")
    public String load(HttpSession ses) {
        System.out.println("进入");
        ses.setAttribute("name","Lsitong");
        return "/show";
    }
}
