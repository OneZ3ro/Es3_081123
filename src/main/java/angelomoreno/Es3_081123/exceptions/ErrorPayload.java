package angelomoreno.Es3_081123.exceptions;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@Setter
@Getter
public class ErrorPayload {
    private String message;
    private Date timeOfError;
}
