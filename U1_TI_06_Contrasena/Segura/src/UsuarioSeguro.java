public class UsuarioSeguro {

    private String nombreUsuario;
    private String password;

    public void setNombreUsuario(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombreUsuario = nombre;
        } else {
            System.out.println("El nombre de usuario no puede estar vacío ni ser nulo.");
        }
    }

    public void setPassword(String nuevaPassword) {
        if (nuevaPassword == null || nuevaPassword.isEmpty()) {
            System.out.println("La contraseña no puede estar vacía.");
            return;
        }

        if (nuevaPassword.length() < 8) {
            System.out.println("La contraseña debe tener al menos 8 caracteres.");
            return;
        }

        boolean Mayuscula = false;
        boolean Minuscula = false;
        boolean Digito = false;

        for (int i = 0; i < nuevaPassword.length(); i++) {
            char c = nuevaPassword.charAt(i);
            if (Character.isUpperCase(c)) Mayuscula = true;
            if (Character.isLowerCase(c)) Minuscula = true;
            if (Character.isDigit(c)) Digito = true;
        }

        if (!Mayuscula) {
            System.out.println("La contraseña debe tener al menos una letra mayúscula.");
            return;
        }

        if (!Minuscula) {
            System.out.println("La contraseña debe tener al menos una letra minúscula.");
            return;
        }

        if (!Digito) {
            System.out.println("La contraseña debe tener al menos un número.");
            return;
        }

        this.password = nuevaPassword;
    }
    public boolean autenticar(String intento) {
        return this.password != null && this.password.equals(intento);
    }
}
