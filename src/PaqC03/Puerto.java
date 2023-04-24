package PaqC03;

import java.io.Serializable;

public class Puerto implements Serializable {
    private Hub[] P;
    boolean lleno;

    public Puerto() {
        P = new Hub[3];
        for (int i = 0; i < P.length; i++) {
            Hub aux = new Hub();
            P[i] = aux;



        }


    }

    public boolean Ocupado (int hub){  //ok
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 12; j++) {
                if(P[hub].getContenedor()[i][j]==null){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean ocupadocolumna(int hub){
        for (int i = 0; i <10; i++) {
            if (P[hub].getContenedor()[i][0] == null){
                return false;
            }
        }
        return true;
    }


    public boolean ocupadocolumna2(int hub){
        for (int i = 0; i <10; i++) {
            if (P[hub].getContenedor()[i][1] == null){
                return false;
            }
        }
        return true;
    }

    public Contenedor apilar(Contenedor c, int hub) {
      if (Ocupado(hub)){
          return null;

      }
      else{
          P[hub].apilar(c);
          return c;
      }
    }
//public String toStringcolumna(int hub, int col){
 //       return P[hub].toStringcolumna(col);
//}

    public void desapilar(int hub, int col) {
        P[hub].desapila(col);
    }

    public String toString(int hub) {
return P[hub].toString();
    }
    public Contenedor muestraDatosid(int hub, int id){
        return P[hub].muestraDatos(id);
    }
    public int ContadorPaises(String pais,int hub){
        return P[hub].calcularPais(pais);
    }
   /* public String Puertoentero(){
        String s="";
        for (int i = 0; i <P.length ; i++) {
            s+=P[i].toString();
            s+="\n";
        }

    */

      //  return s;

   // }
}







