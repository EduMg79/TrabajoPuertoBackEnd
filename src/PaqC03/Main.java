package PaqC03;

public class Main {
    public static void main(String[] args) {
        Contenedor v= new Contenedor(1,23,"Argentina",1,"Copa del mundo","FIFA","MESSI");
        Contenedor v2= new Contenedor(2,143,"Argentina",3,"fasd","china","TikTok");
        Contenedor v3= new Contenedor(3,232,"España",3," ","casd","verrafasd");
       Hub h = new Hub();
       Puerto p=new Puerto();
       v.setInspeccionado(true);
       p.apilar(v,0);
        p.apilar(v,0);
        p.apilar(v,0);
        p.apilar(v,0);
        p.apilar(v,0);
        p.apilar(v,0);
        p.apilar(v,0);
        p.apilar(v,0);
        p.apilar(v,2);
        p.apilar(v,2);
        p.apilar(v,2);
        p.apilar(v2,1);
        p.apilar(v3,1);
        p.desapilar(1,0);



        System.out.println(p.toString(1));
        System.out.println(p.ocupadocolumna(0));
        System.out.println(p.toString(0));


    }
}
