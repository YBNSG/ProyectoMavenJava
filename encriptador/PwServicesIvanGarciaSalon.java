package pio.daw.IvanGarciaSalon.encriptador;
import org.jasypt.util.password.BasicPasswordEncryptor;

public class PwServicesIvanGarciaSalon { // Cambia 'Apellido' por tu apellido
    private BasicPasswordEncryptor passwordEncryptor;

    public PwServicesIvanGarciaSalon() {
        this.passwordEncryptor = new BasicPasswordEncryptor();
    }

    /**
     * Método que encripta una contraseña.
     * 
     * @param contrasena Contraseña en texto plano.
     * @return Contraseña encriptada.
     */
    public String encriptarContrasena(String contrasena) {
        return passwordEncryptor.encryptPassword(contrasena);
    }

    /**
     * Método que verifica si una contraseña es válida.
     * 
     * @param contrasena Contraseña en texto plano.
     * @param contrasenaEncriptada Contraseña encriptada.
     * @return True si coinciden, false en caso contrario.
     */
    public boolean verificarContrasena(String contrasena, String contrasenaEncriptada) {
        return passwordEncryptor.checkPassword(contrasena, contrasenaEncriptada);
    }
}


