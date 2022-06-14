package activities;

abstract class Book {
    String title = "Java";
    abstract void setTitle(String s);
    public void getTitle(){
        System.out.println(title);
    }
}
public class Activity5 extends Book {
    @Override
    void setTitle(String s) {
        title = s;
    }
    public static void main(String[] args) {
        Activity5 newNovel = new Activity5();
        newNovel.setTitle(newNovel.title);
        newNovel.getTitle();
    }
}
