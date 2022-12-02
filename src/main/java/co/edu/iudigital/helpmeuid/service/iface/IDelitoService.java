package co.edu.iudigital.helpmeuid.service.iface;

import co.edu.iudigital.helpmeuid.dto.DelitoDTO;

import java.util.List;

public interface IDelitoService {

    //Listar todos los delitos
    public List<DelitoDTO> findALL();

    //Listar un delito por ID
    public DelitoDTO findbYid(Long id);


    // guardar un delito

    public DelitoDTO save(DelitoDTO delitoDTO);

    //borrar un delito
    public void delete(Long id);

}
