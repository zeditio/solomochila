/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import modelo.Evento;
;
import persistencia.BaseDatos;
import persistencia.EscaladorDAO;
import persistencia.OrganizadorDAO;

/**
 *
 * @author jose
 */


@Path("eventos")
public class EventoREST {

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Evento> todosLosEventosInscriptos() {
        EscaladorDAO escaladorDAO = new EscaladorDAO();
        return escaladorDAO.getEventos();
    }

}
