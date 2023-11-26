package seminars.Aktybaev.seminar_007.creational.singleton;

public class SimpleResource {
    private static SimpleResource singleResourse;

    public synchronized static SimpleResource getSingleResourse() {
        if (singleResourse == null){
            singleResourse = new SimpleResource();
        }
        return singleResourse;
    }

    private SimpleResource() {
    }
}
