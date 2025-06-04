public class UsuarioSeguro {

    private String nombreUsuario;
    private String password;

    public void setNombreUsuario(String nombreUsuario) {
        if (nombre != null && !nombreUsuario.isEmpty()){
            this.nombreUsuario = nombreUsuario;
        }else {
            System.out.println("El nombre no puede ser vacio");
        }

    }
    public void setPassword(String password) {
        if (password != null || !password.isEmpty()){
            System.out.println("El password no puede ser vacio");
            return;
        }
        if (nuevaPassword.length() < 8) {
            System.out.println("La contraseña debe tener al menos 8 caracteres.");
            return;
        }
        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneDigito = false;


    }
}
