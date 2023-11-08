package angelomoreno.Es3_081123.service;

import angelomoreno.Es3_081123.entities.Blog;
import angelomoreno.Es3_081123.exceptions.NotFoundException;
import angelomoreno.Es3_081123.repositories.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

@Service
public class BlogService {
    @Autowired
    private BlogRepository blogRepo;

    public Blog save(Blog body) {
        return blogRepo.save(body);
    }

    public List<Blog> getBlogs() {
        return blogRepo.findAll();
    }

    public Blog findById(long id) {
        return blogRepo.findById(id).orElseThrow(() ->  new NotFoundException("Non è stato trovato nessun autore con id " + id));
    }

    public Blog modifyBlog(long id, Blog body) {
    }

    public void deleteBlog(long id) {

    }
}
