import java.util.ArrayList;
import java.util.List;

// 抽象课程类，定义课程的基本属性和方法
abstract class Course {
    protected String courseName;

    public String getCourseName() {
        return courseName;
    }
}

// 编程课程类，继承自Course
class ProgrammingCourse extends Course {
    public ProgrammingCourse() {
        this.courseName = "编程";
    }
}

// 数学课程类，继承自Course
class MathCourse extends Course {
    public MathCourse() {
        this.courseName = "数学";
    }
}

// 抽象工厂接口，用于创建课程对象
interface CourseFactory {
    Course createCourse();
}

// 编程课程工厂类，创建编程课程对象
class ProgrammingCourseFactory implements CourseFactory {
    public Course createCourse() {
        return new ProgrammingCourse();
    }
}

// 数学课程工厂类，创建数学课程对象
class MathCourseFactory implements CourseFactory {
    public Course createCourse() {
        return new MathCourse();
    }
}
class CourseManager {
    // 存储课程对象的列表
    private List<Course> courses = new ArrayList<>();

    // 添加课程的方法，根据具体工厂创建并添加课程
    public void addCourse(CourseFactory factory) {
        Course course = factory.createCourse();
        if (course != null) {
            courses.add(course);
            System.out.println(course.getCourseName() + " 已添加");
        } else {
            System.out.println("无效课程");
        }
    }

    // 获取所有课程的方法，返回课程列表
    public List<Course> getCourses() {
        return courses;
    }
}