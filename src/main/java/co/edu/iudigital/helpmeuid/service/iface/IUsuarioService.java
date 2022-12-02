package co.edu.iudigital.helpmeuid.service.iface;

import co.edu.iudigital.helpmeuid.dto.UsuarioDTO;
import co.edu.iudigital.helpmeuid.model.Usuario;

import java.util.List;

public interface IUsuarioService {

    public List<UsuarioDTO> findAll();

    public UsuarioDTO findById(Long id);

    public UsuarioDTO save(UsuarioDTO usuarioDTO);

    public Usuario findByUsername(String name);


    void delete(Long id);
}
