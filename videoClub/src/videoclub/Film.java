/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoclub;

import java.util.Date;

/**
 *
 * @author MSI
 */

public class Film {
    private Genre gen;
    private Calif cal;
    private String name;
    private Date date;
    private String director;
    private String[] actors;
    private long durac;
    private int views;
    private int likes;
    private boolean hot;
    private String imgURL;
    public Film(){
        this.name = "Default";
        this.date = null;
        this.director = "Seng";
        this.actors = null;
        this.durac = 200;
        this.views = 200;
        this.likes = 200;
        this.hot = true;
    }

    public Genre getGen() {
        return gen;
    }

    public Calif getCal() {
        return cal;
    }

    public Film(Genre gen, Calif cal, String name, Date date, String director, String[] actors, long durac, int views, int likes, boolean hot, String imgURL) {
        this.gen = gen;
        this.cal = cal;
        this.name = name;
        this.date = date;
        this.director = director;
        this.actors = actors;
        this.durac = durac;
        this.views = views;
        this.likes = likes;
        this.hot = hot;
        this.imgURL = imgURL;
    }

    public Film(String name, Date date, String director, String[] actors, long durac, int views, int likes, boolean hot) {
        this.name = name;
        this.date = date;
        this.director = director;
        this.actors = actors;
        this.durac = durac;
        this.views = views;
        this.likes = likes;
        this.hot = hot;
    }

    public Date getDate() {
        return date;
    }
    public boolean getHot() {
        return hot;
    }

    public long getDurac() {
        return durac;
    }

    public int getViews() {
        return views;
    }

    public int getLikes() {
        return likes;
    }

    public boolean isHot() {
        return hot;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Film{" + "gen=" + gen + ", cal=" + cal + ", name=" + name + ", date=" + date + ", director=" + director + ", actors=" + actors + ", durac=" + durac + ", views=" + views + ", likes=" + likes + ", hot=" + hot + ", imgURL=" + imgURL + '}';
    }
   
    

    public void setGen(Genre gen) {
        this.gen = gen;
    }

    public void setCal(Calif cal) {
        this.cal = cal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }

    public void setDurac(long durac) {
        this.durac = durac;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void setHot(boolean hot) {
        this.hot = hot;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }
    
    
}
