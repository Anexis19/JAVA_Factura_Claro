

package Test;

import Modelo.ClsPlan;
import java.util.ArrayList;
import java.util.Scanner;


public class ClsTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
        
        ClsPlan objPlan=crearFactura();
       
         mostrarFactura(objPlan);
    }
    
    public static ClsPlan crearFactura(){
    
        ClsPlan objPlan= new ClsPlan();
        
        Scanner objScanner= new Scanner(System.in);
        System.out.println("Digite el nombre del cliente: ");
        String nombre=objScanner.nextLine();
        objPlan.setNombre(nombre);
        System.out.println("==========================================");
        
        System.out.println("Digite el numero de la facutra");
        String identificadorPlan=objScanner.nextLine();
        objPlan.setIdentificadorPlan(identificadorPlan);
        System.out.println("==========================================");
        
        System.out.println("Tipo de planes ");
        System.out.println(" || Plan Premium = p || Plan Basico = b ||");
        System.out.println("==========================================");
       
        
       
        boolean bandera= true;
        do {
            System.out.println("Digite el tipo de plan: ");
            String tipoPlan=objScanner.nextLine();
            objPlan.setTipoPlan(tipoPlan);
            char plan=objPlan.getTipoPlan().charAt(0);
           if(plan=='b'){
                    
               
                    System.out.println("El plan ingresado es BASICO");
                    System.out.println("==========================================");
                    bandera=false;
                    }  
                    else if(plan =='p'){
        
                    System.out.println("El plan ingresado es PREMIUM");
                    System.out.println("==========================================");
                    bandera=false;
                    } 
                    else{
                    
                    System.out.println("El plan ingresado no es valido, digite de nuevo");
                    System.out.println("==========================================");
                    }
                        
            
            
            
        }while(bandera);
        
      
         
        System.out.println("Numero de llamadas a ingresar:");
        Integer llamadas=objScanner.nextInt();
        System.out.println("==========================================");
        
        for(int i=1; i<=llamadas;i++){
        
            System.out.println("Digite los minutos de la llamada "+i);
            Integer minuto=objScanner.nextInt();         
            objPlan.agregarMinutoALlamadas(minuto);
            
        }
        System.out.println("==========================================");
        
        System.out.println("Digite el porcentaje del iva correspondiente: ");
        float porcentajeIva=objScanner.nextFloat();
        objPlan.setPorcentajeIva(porcentajeIva);
        System.out.println("==========================================");
        return objPlan;
    
    
    }
    
   
           
           
           
           
           
           
   public static void mostrarFactura(ClsPlan objPlan){
       
        System.out.println("===========================================");
        System.out.println("===========================================");
        System.out.println("==============Factura cliente==============");
        System.out.println("Identificacion del plan: "+objPlan.getIdentificadorPlan());
        System.out.println("Nombre del cliente: "+objPlan.getNombre());
        System.out.println("===========================================");
        ArrayList<Integer> LMinutos=objPlan.getListaMinutos();
        
        for(int i=0; i<LMinutos.size();i++){
        
            System.out.print("Minutos de llamada "+(i+1) +"  " );
       
        }
        System.out.println("");
        for (int i=0;i<LMinutos.size();i++){
        
            System.out.print("          "+LMinutos.get(i) +"            ");
            
        }
        System.out.println("");
        String nombreP=objPlan.MostrarNombrePlan();
        System.out.println("===========================================");
        System.out.println("Tipo de plan: "+objPlan.MostrarNombrePlan());
        System.out.println("===========================================");
        int total=objPlan.TotalMinutosUsuario();
        System.out.println("El total de minutos consumidos es: "+objPlan.TotalMinutosUsuario());
        System.out.println("===========================================");
        int TarifaB=objPlan.valorTotalParcial();
        System.out.println("El valor parcial a pagar es: "+objPlan.valorTotalParcial());
        System.out.println("===========================================");
        float promedioN=objPlan.valorPromedioDeMinutos();
        System.out.println("El promedio de minutos consumidos es: "+objPlan.valorPromedioDeMinutos());
        System.out.println("===========================================");
        float valorT=objPlan.valorTotalFactura();
        System.out.println("El valor TOTAL del plan es: "+objPlan.valorTotalFactura());
        System.out.println("===========================================");
      
   
   }
  
        
    
    
}
