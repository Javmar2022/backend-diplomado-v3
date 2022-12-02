package co.edu.iudigital.helpmeuid.service.iface;

import co.edu.iudigital.helpmeuid.dto.CasoDTO;

import java.util.List;

public interface ICasoService {


        //consultar los casos
        public List<CasoDTO> findAll();

        //crear casos
        public CasoDTO save(CasoDTO casoDTO);

        //activar/inactivar caso
        public Boolean visible(Boolean visible, Long id);

        //consultar caso por ID
        public CasoDTO findById(Long id);

        void delete(Long id);
}
