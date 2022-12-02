package co.edu.iudigital.helpmeuid.service.impl;


import co.edu.iudigital.helpmeuid.dto.CasoDTO;
import co.edu.iudigital.helpmeuid.model.Caso;
import co.edu.iudigital.helpmeuid.repository.ICasoRepository;
import co.edu.iudigital.helpmeuid.service.iface.ICasoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CasoServiceImpl implements ICasoService {
    private final ICasoRepository casoRepository;

    @Autowired
    public CasoServiceImpl(ICasoRepository casoRepository) {
        this.casoRepository = casoRepository;
    }

    @Transactional(readOnly = true)

    @Override
    public List<CasoDTO> findAll() {
        List<Caso> casos = casoRepository.findAll();
        //TODO : Refactorijg a un mapper en paquete util
        return casos.stream().map(d ->
                CasoDTO.builder()
                        .id(d.getId())
                        .fechaHora(d.getFechaHora())
                        .latitud(d.getLatitud())
                        .longitud(d.getLongitud())
                        .descripcion(d.getDescripcion())
                        .build()
        ).collect(Collectors.toList());
    }

    @Override
    public CasoDTO findById(Long id) {
        return null;
    }

    @Override
    public CasoDTO save(CasoDTO casoDTO) {
        return null;
    }

    @Override
    public Boolean visible(Boolean visible, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}