package site.orangefield.ajaxtest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CourseController {

    @GetMapping("/")
    public String main() {
        return "/main";
    }

    @GetMapping("/course-detail")
    public String detail() {
        return "/courseDetail";
    }

}
