package DataStructure;

import java.util.List;

public class BlogPostMain {
    public static void main(String[] args) {
        Blog list = new Blog();
        BlogPost blogPost1 = new BlogPost("John Smith", "Money", "i do not have enough","20-05-1952");
        BlogPost blogPost2 = new BlogPost("Mark Hill", "What!?", "i have no idea", "15-9-1987");
        BlogPost blogPost3 = new BlogPost("Lucky Joe", "Disaster", "Funny stories","13-12-2005");
        BlogPost blogPost4 = new BlogPost("Steve Sanders", "Beverly H.", "about us","1-1-1995");
        BlogPost blogPost5 = new BlogPost("David Poe", "My diary", "all my secrets","25-6-1999");
        list.addBlog(blogPost1);
        list.addBlog(blogPost2);
        list.addBlog(blogPost3);
        list.addBlog(blogPost4);
        list.addBlog(blogPost5);
        System.out.println(list.listOfBlogs.size());
        System.out.println(list.toString());
        list.deleteBlog(0);
        System.out.println(list.listOfBlogs.size());
        System.out.println(list.toString());
        list.upDateList(1, new BlogPost("Lucky", "Happines", "all my succeses","24-12-2004"));
        System.out.println(list.toString());
    }
}
