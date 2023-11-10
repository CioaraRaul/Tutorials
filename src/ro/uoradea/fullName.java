package ro.uoradea;
import ro.uoradea.classes.FullNameClass;

public class fullName {
        public static void main(String[] args) {
            FullNameClass[] students = new FullNameClass[] {
                    new FullNameClass("Morgan", "Freeman"),
                    new FullNameClass("Brad", "Pitt"),
                    new FullNameClass("Kevin", "Spacey"),
            };
            for (FullNameClass s : students) {
                System.out.println(s.printFullName());
            }
        }
}
