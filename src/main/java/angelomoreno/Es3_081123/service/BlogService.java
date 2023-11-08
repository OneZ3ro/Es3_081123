package angelomoreno.Es3_081123.service;

import angelomoreno.Es3_081123.entities.Blog;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

@Service
public class BlogService {
    private List<Blog> blogs = new ArrayList<>();

    public Blog save(Blog body) {
        Random rndm = new Random();
        body.setId(rndm.nextLong(1, 100000L));
        this.blogs.add(body);
        return body;
    }

    public List<Blog> getBlogs() {
        return this.blogs;
    }

    public Blog findById(long id) {
        Blog appBlog = new Blog();
        for (Blog blog : this.blogs) {
            if (blog.getId() == id) {
                appBlog = blog;
            }
        }
        if (appBlog == null) {
            throw new RuntimeException("Blog non trovato");
        } else {
            return appBlog;
        }
    }

    public Blog modifyBlog(long id, Blog body) {
        Blog app = null;
        for (Blog blog : this.blogs) {
            if (blog.getId() == id) {
                app = blog;
                app.setId(id);
                app.setCategoria(body.getCategoria());
                app.setTitolo(body.getTitolo());
                app.setContenuto(body.getContenuto());
                app.setMinutiLettura(body.getMinutiLettura());
            }
        }
        if (app == null) {
            throw new RuntimeException("Blog non trovato");
        } else {
            return app;
        }
    }

    public void deleteBlog(long id) {
        ListIterator<Blog> iterator = this.blogs.listIterator();
        while (iterator.hasNext()) {
            Blog current = iterator.next();
            if (current.getId() == id){
                iterator.remove();
            }
        }
    }
}
