
import vista.frmIngresar;


public class Datos {
  
   int códigoPaís;
   String nombrePaís;
   frmIngresar VistaPrincipal;

    public Datos(int códigoPaís, String nombrePaís) {
        this.códigoPaís = códigoPaís;
        this.nombrePaís = nombrePaís;
    }

    public int getCódigoPaís() {
        return códigoPaís;
    }

    public void setCódigoPaís(int códigoPaís) {
        this.códigoPaís = códigoPaís;
    }

    public String getNombrePaís() {
        return nombrePaís;
    }

    public void setNombrePaís(String nombrePaís) {
        this.nombrePaís = nombrePaís;
    }
   
   public void IngresarDatos(int cod, String nom) 
   {
       this.VistaPrincipal.bttnAceptar(cod, nom);
       this.VistaPrincipal.txtCódigoDePaís.getText();
       this.VistaPrincipal.txtNombreDePaís.getText();
       
       
   }
    
    
}
