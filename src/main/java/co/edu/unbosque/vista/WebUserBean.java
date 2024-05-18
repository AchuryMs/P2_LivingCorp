package co.edu.unbosque.vista;

import co.edu.unbosque.model.dto.WebUserDTO;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class WebUserBean {
    private WebUserDTO webUserDTO;


    public WebUserDTO getWebUserDTO() {
        return webUserDTO;
    }

    public void setWebUserDTO(WebUserDTO webUserDTO) {
        this.webUserDTO = webUserDTO;
    }
}
