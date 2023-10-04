import javax.swing.JOptionPane;

public class cls_opc_conductores {
    static cls_conductores [] conductores = new cls_conductores[10];

    public int int_posicion;

    public cls_opc_conductores(int posicion){
        this.int_posicion = posicion;
    }

    public void fnt_menu_conductores(){
        while (true) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
            "<<< MENU CONDUCTORES >>>\n" +
            "1. Registrar\n"+
            "2. Consultar\n"+
            "3. Actualizar\n"+
            "4. Salir" ));

            if (opcion == 1){
                fnt_registrar_conductores();
            }
    }

}

    public void fnt_registrar_conductores(){
        String nombre = JOptionPane.showInputDialog(null,"Nombre");
        String licencia = JOptionPane.showInputDialog(null,"Licencia");
        String apellido = JOptionPane.showInputDialog(null,"Apellido");
        String contacto = JOptionPane.showInputDialog(null,"Contacto");
        String direccion = JOptionPane.showInputDialog(null,"Dirección");
        String observaciones = JOptionPane.showInputDialog(null,"Observaciones");

        conductores[int_posicion] = new cls_conductores(nombre,licencia,apellido,contacto,direccion,observaciones);
        JOptionPane.showMessageDialog(null, "Registrado con éxito",
        "Registrar",JOptionPane.INFORMATION_MESSAGE);
    }
}