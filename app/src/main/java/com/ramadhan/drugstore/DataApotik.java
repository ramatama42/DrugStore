package com.ramadhan.drugstore;

import java.util.ArrayList;

public class DataApotik {

    public static String [][] data = new String[][]{
            {"Nama Apotik","Tentang","",""}
    };

    public static ArrayList<ModelApotik>
    ambilDataApotik(){
        ArrayList<ModelApotik> dataApotik= new ArrayList<>();
        for(String[] varData : data){
            ModelApotik model = new ModelApotik();
            model.setNama(varData[0]);
            model.setTentang(varData[1]);
            model.setFoto(varData[2]);
            model.setKordinat(varData[3]);

            dataApotik.add(model);
        }
        return dataApotik;
    }
}
