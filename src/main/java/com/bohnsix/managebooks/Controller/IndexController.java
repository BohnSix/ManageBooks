package com.bohnsix.managebooks.Controller;


import com.bohnsix.managebooks.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @ResponseBody
    @GetMapping("/sql")
    public String queryFromDB() {
        Long aLong = jdbcTemplate.queryForObject("SELECT count(*) FROM account_tb1", Long.class);
        return aLong.toString();
    }

    @GetMapping(value={"/", "/login"})
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String mainPage(User user, HttpSession session, Model model) {
        if(!"".equals(user.getUserName()) && "123456".equals(user.getPassword())) {
            session.setAttribute("loginUser", user);
            return "redirect:/main.html";
        }
        else {
            model.addAttribute("msg", "账号密码错误");
            return "login";
        }
    }

    @GetMapping("/main.html")
    public String mainPage(HttpSession session, Model model) {
        Object user = session.getAttribute("loginUser");
        if(user != null) {
            return "main";
        }
        else {
            model.addAttribute("msg", "请重新登陆");
            return "login";
        }
    }
}
