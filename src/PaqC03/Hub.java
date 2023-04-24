package PaqC03;

import java.io.Serializable;

public class Hub implements Serializable {
    protected Contenedor[][] c;

    public Hub() {
        this.c = new Contenedor[10][12];
    }
    public Contenedor[][] getContenedor(){
        return c;
    }




    public String toString() {
        String s = "";
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                if (c[i][j] == null) {
                    s += "[L]"; //L de que esta libre
                } else s += "[O]"; //O de que esta ocupado

            }
            s += "\n";
        }

        return s;

    }

   /* public String toStringcolumna(int col){
        String s="";
        for (int i = 0; i < c.length; i++) {
            if (c[i][col] == null){
                s+= "[L]";
            }
            else{
                s += "[O]";
            }
            s+="\n";
        }
        return s;

    }

    */

    public void apilar(Contenedor c1) {
        if (c1 != null) {
            if (c1.getPrioridad() == 1 || c1.getPrioridad() == 2) {
                int columna = c1.getPrioridad() - 1;
                for (int i = c.length - 1; i >= 0; i--) {
                    if (c[i][columna] == null) {
                        c[i][columna] = c1;
                        return;
                    }

                }


            }
        }

        if (c1.getPrioridad() == 3) {
            for (int j = 2; j < c[0].length; j++) {
                for (int i = c.length - 1; i >= 0; i--) {
                    if (c[i][j] == null) {
                        c[i][j] = c1;
                        return;
                    }

                }

            }

        }
    }










public Contenedor desapila(int columna){
    for (int i = 0; i < c.length; i++) {
            if(c[i][columna] != null){
               Contenedor aux=c[i][columna];
                c[i][columna]=null;
                return aux;

            }

        }
    return null;

    }



public Contenedor muestraDatos(int nidentificador){

    for (int i = 0; i < c.length ; i++) {
        for (int j = 0; j <c[0].length ; j++) {
            if(c[i][j] != null && c[i][j].getNidentificador()==nidentificador){
                return c[i][j];

            }

        }
    }
    return null;
}

public int calcularPais(String pais){
    int contador=0;
    for (int i = 0; i < c.length; i++) {
        for (int j = 0; j < c[0].length; j++) {
            if( c[i][j] !=null && c[i][j].getPais().equals(pais)){
                contador++;
            }

        }

    }
 return contador;
}




}



