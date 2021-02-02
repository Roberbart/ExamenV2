/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoclub;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author MSI
 */
public class catalog implements Search  {
    private String name;
    private ArrayList<Film> content;

    public catalog(String name) {
        this.content = new ArrayList<Film>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Film> getContent() {
        return content;
    }

    public void setContent(ArrayList<Film> content) {
        this.content = content;
    }
    public boolean updateCatalog(){
        return true;
    }
    public void Add(Film e) {
        this.content.add(e);
    }
    public String viewAll(){
        String aux = "";
        for(Film d : content){
            aux += d.toString() + "\n";  
        }
        return aux;
    }
    public String viewGenre(Genre e){
        String aux = "";
        for(Film d : content){
            if(d.getGen()==e){
                aux += d.toString() + "\n";  
            }  
        }
        return aux;
    }


    @Override
    public String byTittle(String a) {
        for(Film d : content){
            if(a == d.getName()){
                return d.toString();
            }
        }
        return "No Existe";
    }

    @Override
    public String byView() {
        content.sort(Comparator.comparing(Film::getViews));
        String res = "";
        for(Film d : content){
            res += d.toString() + "\n";
        }
        return res;
    }

    @Override
    public String byHot() {
        String res = "";
        for(Film d : content){
            if(d.getHot()){
                res += d.toString() +"\n";
            }
        }
        if(res != ""){
            return res;
        }else{
            return "No Hay pelis en Novedades";
        }
        
    }

    @Override
    public String byNew() {
        content.sort(Comparator.comparing(Film::getDate));
        String res = "";
        for(Film d : content){
            res += d.toString() + "\n";
        }
        return res;
    }

    
    
}
