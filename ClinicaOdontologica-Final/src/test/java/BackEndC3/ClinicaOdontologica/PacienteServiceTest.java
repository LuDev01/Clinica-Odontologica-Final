package BackEndC3.ClinicaOdontologica;

import BackEndC3.ClinicaOdontologica.dao.BD;
import BackEndC3.ClinicaOdontologica.model.Paciente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import BackEndC3.ClinicaOdontologica.service.PacienteService;

public class PacienteServiceTest {
    @Test
    public void buscarPacientePorID(){
        BD.crearTablas();
        PacienteService pacienteService= new PacienteService();
        Integer id=2;
        Paciente paciente= pacienteService.buscarPorID(id);
        Assertions.assertTrue(paciente!=null);
    }
    @Test
    public void buscarPacientePorEmail(){
        BD.crearTablas();
        PacienteService pacienteService= new PacienteService();
        String email="german@german.com";
        Paciente paciente= pacienteService.buscarPorEmail(email);
        Assertions.assertTrue(paciente!=null);
    }
}
