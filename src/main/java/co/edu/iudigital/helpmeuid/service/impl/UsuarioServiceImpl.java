package co.edu.iudigital.helpmeuid.service.impl;

import co.edu.iudigital.helpmeuid.dto.UsuarioDTO;
import co.edu.iudigital.helpmeuid.model.Usuario;
import co.edu.iudigital.helpmeuid.repository.IUsuarioRepository;
import co.edu.iudigital.helpmeuid.service.iface.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service

public class UsuarioServiceImpl implements IUsuarioService{

    private final IUsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioServiceImpl(IUsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public List<UsuarioDTO> findAll() {
        List<Usuario> usuarios = (List<Usuario>) usuarioRepository.findAll();
        //TODO : Refactorijg a un mapper en paquete util
        return usuarios.stream().map(d ->
                UsuarioDTO.builder()
                        .id(d.getId())
                        .nombre(d.getNombre())
                        .build()
        ).collect(Collectors.toList());
    }

    @Override
    public UsuarioDTO findById(Long id) {
        return null;
    }

    @Override
    public UsuarioDTO save(UsuarioDTO usuarioDTO) {
        return null;
    }

    @Override
    public Usuario findByUsername(String name) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}