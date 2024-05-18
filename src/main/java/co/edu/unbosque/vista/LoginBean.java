package co.edu.unbosque.vista;

import co.edu.unbosque.model.dto.WebUserDTO;
import co.edu.unbosque.services.WebUserService;
import jakarta.annotation.ManagedBean;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;

import java.io.Serializable;

@ManagedBean
@SessionScoped
public class LoginBean  implements Serializable {
    private static final long serialVersionUID = 1L;

    private WebUserDTO userDTO;
    @Inject
    WebUserService userService;



}
