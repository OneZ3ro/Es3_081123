package angelomoreno.Es3_081123.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class Autore {
    private long id;
    private String nome;
    private String cognome;
    private String email;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataDiNascita;
}
