package com.wy.qa.controller;

import com.wy.qa.exception.QaException;
import com.wy.qa.pojo.User;
import com.wy.qa.service.UserService;
import com.wy.qa.util.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "register", method = RequestMethod.POST)
    @ResponseBody
    public String register(User user, String answer, HttpSession session) {
        String serverAnswer = (String) session.getAttribute("answer");
        if (!answer.equals(serverAnswer)) {
            //人类验证失败
            session.removeAttribute("answer");
            return "fail";
        } else {
            //人类验证成功
            session.removeAttribute("answer");
            try {
                userService.register(user);
            } catch (QaException e) {
                e.printStackTrace();
            }
            return "success";
        }
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public String login(String email, String pwd, String answer, HttpSession session) {
        String severAnswer = (String) session.getAttribute("answer");
        if (!answer.equals(severAnswer)) {
            //人类验证失败
            session.removeAttribute("answer");
            return "fail";
        } else {
            //人类验证成功
            session.removeAttribute("answer");
            try {
                User user = userService.login(email, pwd);
                session.setAttribute("user", user);
            } catch (QaException e) {
                e.printStackTrace();
            }
            return "success";
        }

    }

    @RequestMapping(value = "question", method = RequestMethod.GET)
    @ResponseBody
    public String question(HttpSession session) {
        String questionAndAnswer = RandomUtil.generateQuestion();
        String question = questionAndAnswer.substring(0, 5);
        String answer = questionAndAnswer.substring(5);
        session.setAttribute("answer", answer);
        return question;
    }

}
