package com.homework.cookie.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.homework.cookie.model.Color;
import com.homework.cookie.util.CookieUtil;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomeController {
    // Frag, Cleancode
    private static final int COOKIE_MAX_AGE = 20; // Số giây cho đến khi hết hạn (chỉnh 1 chỗ này là đủ.)
    private static final boolean COOKIE_IS_SECURE = true; // isSecured, yêu cầu cookie gửi lên bằng HTTPS
    private static final boolean COOKIE_HTTP_ONLY = false; // HttpOnly, nếu bằng true thì js phía client sẽ không đọc
                                                           // được, chỉ server đọc
    private static final String COOKIE_PATH = "/"; // cookie này có hiệu lực từ đường dẫn nào

    @GetMapping("/")
    public String showHome(Model model) {
        return "home";
    }

    @GetMapping("/blog")
    public String showBlog(Model model) {
        return "blog";
    }
    @GetMapping("setting")
    public String setting(Model model){
        model.addAttribute("color", new Color());
        return "setting";
    }

    @PostMapping("/setting")
    public String showSetting(HttpServletRequest request,
            HttpServletResponse response, Model model,
            @ModelAttribute Color color) {
        String backgroundColor = color.getBackgroundColor();
        String fontColor = color.getFontColor();
        String fontSize = color.getFontSize() + "em";
        if (backgroundColor != null) {
            Cookie backgroundcolor = CookieUtil.createCookie(
            "bgColor", 
            backgroundColor, 
            COOKIE_MAX_AGE, 
            COOKIE_IS_SECURE, 
            COOKIE_HTTP_ONLY, 
            COOKIE_PATH,
            request.getServerName());
            response.addCookie(backgroundcolor);
        }

        if (fontColor != null) {
            Cookie fColor = CookieUtil.createCookie(
            "fontColor", 
            fontColor, 
            COOKIE_MAX_AGE, 
            COOKIE_IS_SECURE, 
            COOKIE_HTTP_ONLY, 
            COOKIE_PATH,
            request.getServerName());
            response.addCookie(fColor);
        }

        if (fontSize != null) {
            Cookie fSize = CookieUtil.createCookie(
            "fontSize", 
            fontSize, 
            COOKIE_MAX_AGE, 
            COOKIE_IS_SECURE, 
            COOKIE_HTTP_ONLY, 
            COOKIE_PATH,
            request.getServerName());
            response.addCookie(fSize);
        }

        return "setting";
    }
}