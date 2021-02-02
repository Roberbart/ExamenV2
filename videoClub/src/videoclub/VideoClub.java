/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoclub;

/**
 *
 * @author MSI
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VideoClub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        User ppp = new User();
        Film p1 = new Film();
        Film p2 = new Film();
        Film p3 = new Film();
        p2.setHot(false);
        p3.setGen(Genre.DRAMA);
        p3.setLikes(30205);
        catalog c1 = new catalog("c1");
        c1.Add(p1);
        c1.Add(p3);
        c1.Add(p2);
        String cmd="";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(cmd!="0"){
        System.out.println("Bienvenido " + ppp.getName());
        System.out.println("Opciones:-----------");
        System.out.println("Ordenar View--------1");
        System.out.println("Ordenar Hot---------2");
        System.out.println("Ordenar New---------3");
        System.out.println("Buscar por Nombre---4");
        System.out.println("Ver todo------------5");
        System.out.println("Ordenar genero------6");
        System.out.println("Salir---------------0");
        cmd = br.readLine();
        if(Integer.parseInt(cmd)==1){
            System.out.println(c1.byView());
        }
        if(Integer.parseInt(cmd)==2){
            System.out.println(c1.byHot());
        }
        if(Integer.parseInt(cmd)==3){
            System.out.println(c1.byNew());
        }
        if(Integer.parseInt(cmd)==4){
            System.out.println("Introduce Nombre");
            cmd = br.readLine();
            System.out.println(c1.byTittle(cmd));
        }
        if(Integer.parseInt(cmd)==5){
            System.out.println(c1.viewAll());
        }
        if(Integer.parseInt(cmd)==6){
            System.out.println("Drama  1");
            System.out.println("Accion 2");
            System.out.println("Romace 3");
            cmd = br.readLine();
            System.out.println("Mostrando");
            if(cmd=="1"){
                System.out.println(c1.viewGenre(Genre.DRAMA));
            }
            if(cmd=="2"){
                System.out.println(c1.viewGenre(Genre.ACTION));
            }
            if(cmd=="3"){
                System.out.println(c1.viewGenre(Genre.ROMANTIC));
            }
        }
        if(Integer.parseInt(cmd)==0){
            break;
        }
        }
        
        
        
    }
    
}
