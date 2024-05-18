package co.edu.unbosque.vista;


import co.edu.unbosque.model.dto.WebPropertyDTO;
import co.edu.unbosque.resources.Capitals;
import co.edu.unbosque.services.WebPropertyService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@RequestScoped
public class IndexBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private WebPropertyDTO webPropertyDTO = new WebPropertyDTO();
    private List<Capitals> capitals;
    private List<WebPropertyDTO> tempWebProperties  = new ArrayList<>();
    @Inject
    WebPropertyService webPropertyService;

    //INTENTO DE PROPERTY BEAN, NO FUNCIONAL HASTA AHORA

    public String showWebPropertyDTOByCity() {
        System.out.println("showWebPropertyDTOByCity");
    //tempWebProperties = new ArrayList<>(webPropertyService.findAllFiltered(webPropertyDTO.getCity()));
        webPropertyDTO.setId(1);
        webPropertyDTO.setName("Apartamento");
        webPropertyDTO.setAddress( "calle 1 ");
        webPropertyDTO.setArea(21);
        webPropertyDTO.setPrice(23.3);
    tempWebProperties.add(webPropertyDTO);

    return "inmuebleComprar.xhtml";
    }

    public WebPropertyDTO getWebPropertyDTO() {
        return webPropertyDTO;
    }

    public void setWebPropertyDTO(WebPropertyDTO webPropertyDTO) {
        this.webPropertyDTO = webPropertyDTO;
    }

    public List<Capitals> getCapitals() {
        return capitals;
    }

    public void setCapitals(List<Capitals> capitals) {
        this.capitals = capitals;
    }

    public List<WebPropertyDTO> getTempWebProperties() {
        return tempWebProperties;
    }

    public void setTempWebProperties(List<WebPropertyDTO> tempWebProperties) {
        this.tempWebProperties = tempWebProperties;
    }
}
