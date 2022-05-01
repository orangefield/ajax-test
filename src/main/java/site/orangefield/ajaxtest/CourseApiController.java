package site.orangefield.ajaxtest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class CourseApiController {

    // 공공데이터 다운로드
    @RequestMapping(value = "/course-detail/download/{courseId}", method = RequestMethod.GET, produces = "application/json; charset=UTF8")
    public String download(@PathVariable Integer courseId, Model model) {
        String addr = "http://apis.data.go.kr/1360000/TourStnInfoService/getTourStnVilageFcst?serviceKey=BXb2vXKpIghQcjKLcpcSdLYZ5BRJoGWdmI3j7SumCqLcWAAFG2c5cJiROSElRYOiJyAI41utgKgsAKg%2FLbfmRg%3D%3D&pageNo=1&numOfRows=10&dataType=JSON&CURRENT_DATE=2019122209&HOUR=24&COURSE_ID="
                + courseId;

        try {
            URL url = new URL(addr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
            String responseJson = br.readLine();

            return responseJson;

        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }

    }

}
