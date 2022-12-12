package com.wy.qa.controller;

import com.wy.qa.exception.QaException;
import com.wy.qa.pojo.Bankcard;
import com.wy.qa.pojo.Role;
import com.wy.qa.pojo.User;
import com.wy.qa.service.BankcardService;
import com.wy.qa.service.RoleService;
import com.wy.qa.service.UserService;
import com.wy.qa.util.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private BankcardService bankcardService;

    @RequestMapping(value = "doRegister", method = RequestMethod.POST)
    @ResponseBody
    public String register(User user, String answer, HttpSession session) {
        String serverAnswer = (String) session.getAttribute("answer");
        if (!answer.equals(serverAnswer)) {
            //人类验证失败
            session.removeAttribute("answer");
            return "验证码错误";
        } else {
            //人类验证成功
            session.removeAttribute("answer");
            try {
                userService.register(user);
            } catch (QaException e) {
                e.printStackTrace();
            }
            return "200";
        }
    }

    @RequestMapping(value = "doLogin", method = RequestMethod.POST)
    @ResponseBody
    public String login(String email, String pwd, String answer, HttpSession session) {
        String severAnswer = (String) session.getAttribute("answer");
        if (!answer.equals(severAnswer)) {
            //人类验证失败
            session.removeAttribute("answer");
            return "wrong code";
        } else {
            //人类验证成功
            session.removeAttribute("answer");
            try {
                User user = userService.login(email, pwd);
                Role role = roleService.getById(user.getRoleId());
                Bankcard bankcard = bankcardService.getById(user.getUserId());
                if (user.getStatus() == 2) {
                    //账号被封禁
                    return "status error";
                } else {
                    //账号未被封禁
                    session.setAttribute("user", user);
                    session.setAttribute("role", role);
                    session.setAttribute("bankcard", bankcard);
                }
            } catch (QaException e) {
                e.printStackTrace();
            }
            return "200";
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

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public void update(String username, String sex, String city, String motto, HttpSession session) {
        User user = (User) session.getAttribute("user");
        try {
            userService.updateSelfInfo(username, Integer.valueOf(sex), city, motto, user.getUserId());
        } catch (QaException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("exit")
    public String exit(HttpSession session) {
        session.invalidate();
        return "user/login";
    }

    @RequestMapping("login")
    public String login() {
        return "user/login";
    }

    @RequestMapping("register")
    public String register() {
        return "user/reg";
    }

    @RequestMapping("home")
    public String home() {
        return "user/home";
    }

    @RequestMapping("index")
    public String index() {
        return "user/index";
    }

    @RequestMapping("set")
    public String set() {
        return "user/set";
    }

    @RequestMapping("message")
    public String message() {
        return "user/message";
    }

    @RequestMapping("vip")
    public String vip() {
        return "user/vip";
    }

    @RequestMapping("report")
    public String report() {
        return "user/report";
    }


}
