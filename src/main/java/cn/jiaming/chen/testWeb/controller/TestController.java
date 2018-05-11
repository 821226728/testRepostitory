package cn.jiaming.chen.testWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

@Controller
@RequestMapping("/controller/")
public class TestController {

    @RequestMapping("test")
    public void test(Model model , HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("test");
        OutputStream out = response.getOutputStream();
        out.write("test".getBytes());
    }
}
