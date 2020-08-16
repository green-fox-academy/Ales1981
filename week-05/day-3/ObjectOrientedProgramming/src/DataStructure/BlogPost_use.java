package DataStructure;

public class BlogPost_use {
    public static void main(String[] args){
        BlogPost book1;
        book1 = new BlogPost();
        book1.authorName = "John Doe";
        book1.title = "Lorem Ipsum";
        book1.text = "Lorem ipsum dolor sit amet.";
        book1.publicationDate = "2000.05.04.";

        BlogPost book2;
        book2 = new BlogPost();
        book2.authorName = "Tim Urban";
        book2.title = "Wait but why";
        book2.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        book2.publicationDate = "2010.10.10.";

        BlogPost book3;
        book3 = new BlogPost();
        book3.authorName = "William Turton";
        book3.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        book3.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
        book3.publicationDate = "2017.03.28.";
    }
}
