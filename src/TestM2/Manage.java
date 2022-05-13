package TestM2;

public interface Manage<P> {

    void add(P p);

    void showDirectory();

    int seach(String name);

    void edit(String name, P p);

    void remove(String name);







}
