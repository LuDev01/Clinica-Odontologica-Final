package BackEndC3.ClinicaOdontologica.controller;


import BackEndC3.ClinicaOdontologica.model.Odontologo;
import BackEndC3.ClinicaOdontologica.service.OdontologoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/odontologos")
public class OdontologoController {
    private OdontologoService odontologoService;

    public OdontologoController() {
      odontologoService=new OdontologoService();
    }
    @GetMapping
    public String buscarOdontologoTodos(Model model){
        List<Odontologo>listaOdontogos=odontologoService.buscarOdontologos();
        model.addAttribute("odontologos",listaOdontogos);
        return "listaodontologos.html";
    }
}


