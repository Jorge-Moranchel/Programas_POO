public class UsuarioSeguro {

    // Atributos privados
    private String nombreUsuario;
    private String password;

    // Setter para nombre de usuario
    public void setNombreUsuario(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombreUsuario = nombre;
        } else {
            System.out.println("El nombre de usuario no puede estar vacío ni ser nulo.");
        }
    }

    // Setter para la contraseña con validaciones
    public void setPassword(String nuevaPassword) {
        if (nuevaPassword == null || nuevaPassword.isEmpty()) {
            System.out.println("La contraseña no puede estar vacía.");
            return;
        }

        if (nuevaPassword.length() < 8) {
            System.out.println("La contraseña debe tener al menos 8 caracteres.");
            return;
        }

        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneDigito = false;

        for (int i = 0; i < nuevaPassword.length(); i++) {
            char c = nuevaPassword.charAt(i);
            if (Character.isUpperCase(c)) tieneMayuscula = true;
            if (Character.isLowerCase(c)) tieneMinuscula = true;
            if (Character.isDigit(c)) tieneDigito = true;
        }

        if (!tieneMayuscula) {
            System.out.println("La contraseña debe tener al menos una letra mayúscula.");
            return;
        }

        if (!tieneMinuscula) {
            System.out.println("La contraseña debe tener al menos una letra minúscula.");
            return;
        }

        if (!tieneDigito) {
            System.out.println("La contraseña debe tener al menos un número.");
            return;
        }

        this.password = nuevaPassword;
    }
    public boolean autenticas(String intento) {
        return this.password != null && this.password.equals(intento);
    }
}
