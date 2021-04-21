/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class ClsPlan {
    
    private String nombre;
    private String identificadorPlan ;
    private String tipoPlan;
    private ArrayList<Integer> ListaMinutos; 
    private float porcentajeIva;
   
    
   public ClsPlan() {
        
        this.ListaMinutos= new ArrayList();
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificadorPlan() {
        return identificadorPlan;
    }

    public void setIdentificadorPlan(String identificadorPlan) {
        this.identificadorPlan = identificadorPlan;
    }

    public String getTipoPlan() {
        return tipoPlan;
    }

    public void setTipoPlan(String tipoPlan) {
        this.tipoPlan = tipoPlan;
    }

    public float getPorcentajeIva() {
        return porcentajeIva;
    }

    public void setPorcentajeIva(float porcentajeIva) {
        this.porcentajeIva = porcentajeIva;
    }

    
   
    public void agregarMinutoALlamadas (Integer minuto){
    
        this.ListaMinutos.add(minuto);
    
    }
      public ArrayList<Integer> getListaMinutos() {
        return ListaMinutos;
    }

   public String MostrarNombrePlan(){
   
       String nombreP="";
       char var=tipoPlan.charAt(0);
       if(var=='b'){
           
           nombreP="Basico";
           return nombreP;
       }
       else if (var=='p'){
       
           nombreP="Premium";
       }
           return nombreP;
   }   
      
   public Integer TotalMinutosUsuario(){
    
    int totalminutos=0;   
    for(int i=0; i<ListaMinutos.size();i++){
       
       totalminutos=totalminutos+ListaMinutos.get(i);
   
   }   
    return totalminutos;
   }
  public Integer valorTotalParcial(){
  
      int PlanP=0;  
      int PlanB=0;
      char plan=tipoPlan.charAt(0);
      if(plan=='b'){
          PlanB=50*TotalMinutosUsuario();
          return PlanB;
      }
      else if (plan=='p'){
          PlanP=10*TotalMinutosUsuario();
         
        }
      return PlanP;
    
    }
  
  public float valorTotalFactura(){
       
      float valorTotal=(float) valorTotalParcial()+(valorTotalParcial()*porcentajeIva)/100;
     
      return valorTotal;
  
     }
  
  public float valorPromedioDeMinutos(){
      
      float promedio=(float) TotalMinutosUsuario()/ListaMinutos.size();
      return promedio;
  
    }
  }
   
   
   

