import javax.swing.*;

public class Main {
    public static void main(String[] args) {

    UsuarioSeguro usuario = new UsuarioSeguro();

    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del usuario");
    usuario.setNombreUsuario(nombre);

        System.out.println("Probando contraseñas inválidas:");
        usuario.setPassword("abc");
        usuario.setPassword("abcdefgh");
        usuario.setPassword("ABCDEFGH");
        usuario.setPassword("Abcdefgh");

        String buena = JOptionPane.showInputDialog("Ingresa una contraseña válida:");
        usuario.setPassword(buena);

        String intento1 = JOptionPane.showInputDialog("Escribe tu contraseña:");
        if (usuario.autenticar(intento1)) {
            JOptionPane.showMessageDialog(null, "Acceso concedido.");
        } else {
            JOptionPane.showMessageDialog(null, "Acceso denegado.");
        }
        String intento2 = JOptionPane.showInputDialog("Escribe una contraseña incorrecta:");
        if (usuario.autenticar(intento2)) {
            JOptionPane.showMessageDialog(null, "Acceso concedido.");
        } else {
            JOptionPane.showMessageDialog(null, "Acceso denegado.");
        }
    }
}