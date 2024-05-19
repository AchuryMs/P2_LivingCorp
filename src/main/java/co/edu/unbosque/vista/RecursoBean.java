package co.edu.unbosque.vista;

import co.edu.unbosque.modelo.dto.RecursoDTO;
import co.edu.unbosque.servicios.RecursoServicios;
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.context.ExternalContext;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.servlet.http.HttpSession;

import java.io.Serializable;
import java.util.Set;

@Named
@RequestScoped
public class RecursoBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private RecursoDTO recursoDTO = new RecursoDTO();

    ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
    HttpSession session = (HttpSession) externalContext.getSession(false);
    @Inject
    private RecursoServicios recursoServicios;

    public RecursoDTO crearRecurso(RecursoDTO recurso) {
        return recursoServicios.crearRecurso(recurso);
    }
    public RecursoDTO actualizarRecurso(RecursoDTO recurso) {
        return recursoServicios.actualizarRecurso(recurso);
    }
    public void eliminarRecurso(RecursoDTO recurso) {
        recursoServicios.eliminarRecurso(recurso);
    }
    public RecursoDTO obtenerRecurso(Integer id) {
        return recursoServicios.buscarRecursoPorId(id);
    }
    public Set<RecursoDTO>obtenerRecursos(){
        return recursoServicios.buscarRecursos();
    }

    public RecursoDTO getRecursoDTO() {
        return recursoDTO;
    }

    public void setRecursoDTO(RecursoDTO recursoDTO) {
        this.recursoDTO = recursoDTO;
    }
}
