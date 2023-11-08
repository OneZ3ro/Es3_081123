package angelomoreno.Es3_081123.entities;

import angelomoreno.Es3_081123.enums.Categoria;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Blog {
    private long id;
    private Categoria categoria;
    private String titolo;
    private String contenuto;
    private long minutiLettura;
}
