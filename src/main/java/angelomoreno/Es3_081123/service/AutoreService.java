package angelomoreno.Es3_081123.service;

import angelomoreno.Es3_081123.entities.Autore;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
@Service
public class AutoreService {
    private List<Autore> autori = new ArrayList<>();

    public Autore save(Autore body) {
        Random rndm = new Random();
        body.setId(rndm.nextLong(1, 100000L));
        this.autori.add(body);
        return body;
    }

    public List<Autore> getAutores() {
        return this.autori;
    }

    public Autore findById(long id) {
        Autore appAutore = new Autore();
        for (Autore autore : this.autori) {
            if (autore.getId() == id) {
                appAutore = autore;
            }
        }
        if (appAutore == null) {
            throw new RuntimeException("Autore non trovato");
        } else {
            return appAutore;
        }
    }

    public Autore modifyAutore(long id, Autore body) {
        Autore app = null;
        for (Autore blog : this.autori) {
            if (blog.getId() == id) {
                app = blog;
                app.setId(id);
                app.setNome(body.getNome());
                app.setCognome(body.getCognome());
                app.setEmail(body.getEmail());
                app.setDataDiNascita(body.getDataDiNascita());
            }
        }
        if (app == null) {
            throw new RuntimeException("Autore non trovato");
        } else {
            return app;
        }
    }

    public void deleteAutore(long id) {
        ListIterator<Autore> iterator = this.autori.listIterator();
        while (iterator.hasNext()) {
            Autore current = iterator.next();
            if (current.getId() == id){
                iterator.remove();
            }
        }
    }
}
