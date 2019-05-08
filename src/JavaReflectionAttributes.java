import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class JavaReflectionAttributes {

    public static void main(String[] args) {
        Class student = new Student1().getClass();
        Method[] methods = student.getDeclaredMethods();


        ArrayList<String> methodList = new ArrayList<>();
        for (Method m : methods) {
            methodList.add(m.toString());
        }
        Collections.sort(methodList);
        for (String name : methodList) {
            System.out.println(name);
        }
    }


}


class Student1 {
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void anothermethod() {
    }

}
