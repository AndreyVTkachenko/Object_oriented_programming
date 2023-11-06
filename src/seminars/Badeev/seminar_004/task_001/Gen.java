package seminars.Badeev.seminar_004.task_001;

public class Gen<E> {

    E ob;

    public Gen(E o) {
        ob = o;
    }

    public E getOb() {
        return ob;
    }

    public void showType() {
        System.out.println("Тип объекта: " + ob.getClass().getName());
    }
}
