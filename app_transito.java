import javax.swing.JOptionPane;



public class app_transito {
    static int int_posiciones = 0;

    public static void main(String[] args){
        fnt_menu_principal();
    }


    public static void fnt_menu_principal(){
        while (true) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
            "<<< MENU PRINCIPAL >>>\n" +
            "1. Menú conductores\n"+
            "2. Menú multas\n"+
            "3. Salir" ));

            if (opcion == 1) { 
                cls_opc_conductores objCls_opc_conductores = new cls_opc_conductores(int_posiciones);
                int_posiciones +=1; 
                objCls_opc_conductores.fnt_menu_conductores();
                
                
                
    }
        
    }




    }}
