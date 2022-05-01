package site.orangefield.ajaxtest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String tm;
    private String thema;
    private String courseId;
    private Integer courseAreaId;
    private String courseName;
    private Integer spotAreaId;
    private String sportAreaName;
    private String spotName;
    private Integer th3;
    private Integer wd;
    private Integer ws;
    private String sky;
    private Integer rhm;
    private Integer pop;

}
