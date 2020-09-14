package DataStructure;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    List<BlogPost> listOfBlogs;

    public Blog(){
        listOfBlogs = new ArrayList<>();
    }

    public void addBlog(BlogPost blogPost){
        listOfBlogs.add(blogPost);
    }

    public void deleteBlog(int index){
        listOfBlogs.remove(index);
    }

    public void upDateList(int index, BlogPost blogPost){
        listOfBlogs.remove(index);
        listOfBlogs.add(index, blogPost);
    }

    @Override
    public String toString() {
        return "Blog{" +
                "listOfBlogs=" + listOfBlogs +
                '}';
    }
}
