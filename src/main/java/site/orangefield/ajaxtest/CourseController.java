package site.orangefield.ajaxtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
