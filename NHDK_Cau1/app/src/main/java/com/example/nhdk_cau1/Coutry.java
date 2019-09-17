package com.example.nhdk_cau1;

public class Coutry {
    String name;
    String populate;
    int img;
    int img2;

    public Coutry(){

    }

    public Coutry(String name, String populate){
        this.name=name;
        this.populate=populate;
    }

    public Coutry(String name, String populate,int img,int img2){
        this.name=name;
        this.populate=populate;
        this.img=img;
        this.img2=img2;
    }
    public String getName(){
        return name;
    }

    public  void setName(String name){
        this.name=name;
    }

    public String getPopulate(){
        return populate;
    }

    public  void setPopulate(String populate){
        this.populate=populate;
    }

    public int getImg(){
        return img;
    }

    public void setImg(int img){
        this.img=img;
    }

    public int getImg2(){
        return img2;
    }

    public void setImg2(int img2){
        this.img2=img2;
    }

    @Override
    public String toString(){
        return "Coutry{"+
                "name='"+name+'\'' +
                ",populate='"+populate+'\''+
                ",img="+img+
                ",img2="+img2+
                '}';

    }

}
