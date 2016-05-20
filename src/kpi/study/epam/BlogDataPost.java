package kpi.study.epam;


import java.util.Date;
import java.util.Scanner;

/**
 * Epam_homework_4_OOP1
 * Created 5/17/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public class BlogDataPost {

    private String author;
    private String title;
    private String text;
    private Date created;
    private Date update;

    public BlogDataPost(){
        setAuthor("");
        setTitle("");
        setText("");
    }

    public BlogDataPost(String author,String text){
        this.author = author;
        this.title = null;
        this.text = text;
        this.created = new Date(System.currentTimeMillis());
        this.update = new Date(System.currentTimeMillis());
    }
    public BlogDataPost(String author, String title, String text) {
        this.author = author;
        this.title = title;
        this.text = text;
        this.created = new Date(System.currentTimeMillis());
        this.update = new Date(System.currentTimeMillis());
    }
//    public BlogDataPost(String ... args){
//        this.author = args[0];
//        this.title = args[1];
//        this.text = args[2];
//        this.created = new Date(System.currentTimeMillis());
//        this.update = new Date(System.currentTimeMillis());
//    }
    private void update(){
        update = new Date(System.currentTimeMillis());
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        update();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        update();
        this.text = text;
    }

    public Date getCreated() {
        return created;
    }


    public Date getUpdate() {
        return update;
    }

    @Override
    public String toString() {
        return "BlogDataPost{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", created=" + created +
                ", update=" + update +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlogDataPost that = (BlogDataPost) o;

        if (author != null ? !author.equals(that.author) : that.author != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (text != null ? !text.equals(that.text) : that.text != null) return false;
        return  created != null ? !created.equals(that.created) : that.created != null;

    }

    @Override
    public int hashCode() {
        int result = author != null ? author.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        return result;
    }

    public void setAuthor(String author) {
        this.author = author;
        update();

    }

    void setFromTerminal(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Fill all:");
        System.out.println("Author:");
        if (sc.hasNext()){
            setAuthor(sc.next());
            System.out.println("Title:");
            setText(sc.next());
            System.out.println("Text:");
            setTitle(sc.next());
        }
        sc.close();
    }
}
