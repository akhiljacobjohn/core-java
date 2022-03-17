package singleton_design_pattern;

public class Singleton {

    private Singleton(){}



    public static class SingletonHolder{
        private static final Singleton instance = new Singleton();
    }


    public static Singleton getInstance(){

        return SingletonHolder.instance;
    }

    public static void main(String[] args) {
        Singleton inst = Singleton.getInstance();
        System.out.println(inst.hashCode());
        Singleton instAnother = Singleton.getInstance();
        System.out.println(instAnother.hashCode());
    }


}