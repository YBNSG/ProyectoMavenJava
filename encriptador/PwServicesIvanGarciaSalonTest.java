package pio.daw.IvanGarciaSalon.encriptador; // Cambia 'apellido' por tu apellido

public class PwServicesIvanGarciaSalonTest { // Cambia 'Apellido' por tu apellido
    public static void main(String[] args) {
        // Crear instancia del servicio de encriptación
        PwServicesIvanGarciaSalon servicio = new PwServicesIvanGarciaSalon();// Cambia 'Apellido' por tu apellido

        // Contraseña en texto plano
        String password = "miSuperPassword";

        // Encriptar la contraseña
        String passwordEncriptada = servicio.encriptarContrasena(password);
        System.out.println("Prueba de Ivan Garcia Salon");
        System.out.println("La contraseña encriptada es: " + passwordEncriptada);

        // Verificar si la contraseña es válida
        boolean esValida = servicio.verificarContrasena(password, passwordEncriptada);
        System.out.println("La contraseña encriptada es válida: " + esValida);
    }
}

