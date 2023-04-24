package PaqC03;

import java.io.Serializable;

public class Contenedor extends Hub implements Serializable {

    private int nidentificador;
    private int peso;
    private String pais;
    private boolean inspeccionado=false;
    private int prioridad=3;
    private String desccontenido;
    private String empresaenvio;
    private String empresareceptor;

    public Contenedor( int nidentificador,int peso, String pais, int prioridad, String desccontenido, String empresaenvio, String empresareceptor ){
        this.nidentificador=nidentificador;
        if(peso>0) this.peso=peso;
      if(pais != null)  this.pais=pais;
        if(prioridad>=1 && prioridad<=3) this.prioridad=prioridad;
      if(desccontenido != null)  this.desccontenido=desccontenido;
      if(empresaenvio != null)  this.empresaenvio=empresaenvio;
      if(empresareceptor != null)  this.empresareceptor=empresareceptor;



    }




    public int getNidentificador() {
        return nidentificador;
    }

    public void setNidentificador(int nidentificador) {
        this.nidentificador = nidentificador;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        if(peso>0) this.peso = peso;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
      if(pais != null)  this.pais = pais;
    }

    public boolean isInspeccionado() {
        return inspeccionado;
    }

    public void setInspeccionado(boolean inspeccionado) {
        this.inspeccionado = inspeccionado;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        if(prioridad>=1 && prioridad<=3)  this.prioridad = prioridad;
    }

    public String getDesccontenido() {
        return desccontenido;
    }

    public void setDesccontenido(String desccontenido) {
      if(desccontenido != null)  this.desccontenido = desccontenido;
    }

    public String getEmpresaenvio() {
        return empresaenvio;
    }

    public void setEmpresaenvio(String empresaenvio) {
       if(empresaenvio != null) this.empresaenvio = empresaenvio;
    }

    public String getEmpresareceptor() {
        return empresareceptor;
    }

    public void setEmpresareceptor(String empresareceptor) {
       if(empresareceptor != null) this.empresareceptor = empresareceptor;
    }

    public String toString() {
        String s= new String();
        s+="Numero de identificador:"+this.nidentificador+"\t"+"Pais:"+this.pais+"\t"+"Prioridad:"+this.prioridad+"\t"+"Peso:"+this.peso+"\t"+"Empresa de Envío:"+this.empresaenvio+"\t"+"Contenido:"+this.desccontenido+"\t"+"Empresa Receptora:"+this.empresareceptor+" ";
        if(inspeccionado) s+="Inspeccionado";
        else s+="No inspeccionado";

        return s;


    }

}
