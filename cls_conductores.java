public class cls_conductores{
    private String str_nombre;
    private String str_licencia;
    private String str_apellido;
    private String str_contacto;
    private String str_direccion;
    private String str_observaciones;
    
    //en el metodo constructor se hace registro inicial de todas las variables o datos de la persona  
    public cls_conductores(String nombre, String licencia, String apellido, String contacto, String direccion, String observaciones){
        this.str_nombre = nombre;
        this.str_licencia = licencia;
        this.str_apellido = apellido;
        this.str_contacto = contacto;
        this.str_direccion = direccion;
        this.str_observaciones = observaciones;
    }

    //los setters son metodos para modificar las variables 
    public void setNombre(String nombre){this.str_nombre = nombre;}
    public void setApellido(String apellido){this.str_apellido = apellido;}
    public void setContacto(String contacto){this.str_contacto = contacto;}
    public void setDireccion(String direccion){this.str_direccion = direccion;}
    public void setObservaciones(String observaciones){this.str_observaciones = observaciones;}

    //los getters son metodos para retornar las variables 
    public String getNombre(){return this.str_nombre;}
    public String getLicencia(){return this.str_licencia;}
    public String getApellido(){return this.str_apellido;}
    public String getContacto(){return this.str_contacto;}
    public String getDireccion(){return this.str_direccion;}
    public String getObservaciones(){return this.str_observaciones;}


}