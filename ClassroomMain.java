public class ClassroomMain {
    public static void main(String[] args) {
        Classroom c = new Classroom("Morris", 32, 33);
        Classroom c1 = new Classroom("Kessler");

        c1.setDesks(30);
        System.out.println(c.teacher() + " Desk:" + c.desks() + " Student:" + c.students());
    }
}
