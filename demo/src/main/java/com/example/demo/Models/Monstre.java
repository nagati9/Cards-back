package com.example.demo.Models;

public class Monstre {
    private int id;
    private String nom;
    private  String figureCaption;
    private int hp;
    private String impact;
    private String description;
    private String link;
    private int color;

    public String getLink() {
        return link;
    }

    public void setLink(String link_img) {
        this.link= link_img;
    }

    public Monstre(int id, String nom, String FigureCaption, int hp, String impact, String description, String link, int color){
        super();
       this.id=id;
        this.nom=nom;
        this.figureCaption=FigureCaption;
        this.hp=hp;
        this.impact=impact;
        this.description=description;
        this.link=link;

    }
    public Monstre(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getFigureCaption() {
        return figureCaption;
    }

    public void setFigureCaption(String figureCaption) {
        this.figureCaption = figureCaption;
    }

    public String getImpact() {
        return impact;
    }

    public void setImpact(String impact) {
        this.impact = impact;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
