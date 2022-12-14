package co.edu.iudigital.helpmeuid.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import java.time.LocalDate;
import static lombok.AccessLevel.PRIVATE;

@Getter
@Setter
@FieldDefaults(level = PRIVATE)
@Builder

public class UsuarioDTO {

    Long id;
    String userName;
    String nombre;
    String apellido;
    LocalDate fechaNacimiento;
    Boolean enabled;
    Boolean redSocial;
    String image;
}
