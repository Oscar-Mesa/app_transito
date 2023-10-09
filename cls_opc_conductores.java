import javax.swing.JOptionPane;

public class cls_opc_conductores {
    static cls_conductores [] conductores = new cls_conductores[10];

    public int int_posicion;
    app_transito objApp_transito = new app_transito(); 

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
            else if(opcion == 2){
                fnt_consultar_conductores();
            }

            else if(opcion == 4){
                objApp_transito.fnt_menu_principal();
            }

}}

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

        objApp_transito.fnt_menu_principal();
    }

    public void fnt_consultar_conductores(){
        String licencia = JOptionPane.showInputDialog(null,"Ingrese la Licencia:");
        if (licencia.equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar una licencia");
            fnt_consultar_conductores();
        }else{
            boolean conductorEncontrado = false;

            for (int i = 0; i < conductores.length; i++) {
                if (conductores[i] != null && conductores[i].getLicencia().equals(licencia)) {
                    // Si se encuentra el conductor por su licencia
                    JOptionPane.showMessageDialog(null, "Información del Conductor:\n" +
                            "Nombre: " + conductores[i].getNombre() + "\n" +
                            "Licencia: " + conductores[i].getLicencia() + "\n" +
                            "Apellido: " + conductores[i].getApellido() + "\n" +
                            "Contacto: " + conductores[i].getContacto() + "\n" +
                            "Dirección: " + conductores[i].getDireccion() + "\n" +
                            "Observaciones: " + conductores[i].getObservaciones());
                    conductorEncontrado = true;
                    break;
                }
            }
    
            if (!conductorEncontrado) {
                JOptionPane.showMessageDialog(null, "Conductor no encontrado");
            }
        }
    }

    public void fnt_actualizar_conductores(){
        fnt_consultar_conductores();
        
    }


}