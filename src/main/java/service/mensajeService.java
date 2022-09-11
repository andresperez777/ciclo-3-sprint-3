package reto3.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reto3.api.model.Mensajes;
import reto3.api.repository.mensajeRepository;

import java.util.List;

@Service
public class mensajeService {


    @Autowired
    mensajeRepository MensajeRepository;

    public List<Mensajes> obtenerMensajes()
    {
        return MensajeRepository.obtenerMensajes();
    }


    public Mensajes crearMensajes(Mensajes mensajes)
    {
        return  MensajeRepository.crearMensaje(mensajes);
    }
}
