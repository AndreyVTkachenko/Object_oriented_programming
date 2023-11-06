package seminars.Badeev.seminar_004.task_001;

public class Main {

    public static void main(String[] args) {

        Gen<Integer> iob = new Gen<Integer>(88);

        iob.showType();

        int v = iob.getOb();

        System.out.println("значение iob: " + v);

        Gen<String> job = new Gen<String>("строка");

        job.showType();

        String w = job.getOb();

        System.out.println("значение job: " + w);
    }
}
