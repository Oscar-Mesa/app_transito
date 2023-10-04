import javax.swing.JOptionPane;



public class app_transito {
    static int int_posiciones = 0;

    public static void main(String[] args){
        fnt_menu_principal();
    }


    private static void fnt_menu_principal(){
        while (true) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
            "<<< MENU PRINCIPAL >>>\n" +
            "1. Menú conductores\n"+
            "2. Menú multas\n"+
            "4. Salir" ));

            if (opcion == 1) { 
                cls_opc_conductores objCls_opc_conductores = new cls_opc_conductores(int_posiciones);
                objCls_opc_conductores.fnt_menu_conductores();
                int_posiciones +=1;
                
    }
        
    }




    }}
