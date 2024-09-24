package pe.edu.cibertec.rueditas_backend_b.service.interfaces;
import pe.edu.cibertec.rueditas_backend_b.dto.AutoRequest;

import java.io.IOException;

public interface AutoService {
    String[] buscarAuto(AutoRequest request) throws IOException;
}
