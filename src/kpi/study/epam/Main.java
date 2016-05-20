package kpi.study.epam;


public class Main {

    public static void main(String[] args) {
        BlogDataPost post = new BlogDataPost();
        post.setFromTerminal();

        BlogDataPost post1 = new BlogDataPost("Author","Title","Text");

        if (post.equals(post1)){
            System.out.println("equals");
        }
    }
}
