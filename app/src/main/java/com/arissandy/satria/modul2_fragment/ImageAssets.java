package com.arissandy.satria.modul2_fragment;

import java.util.ArrayList;
import java.util.List;

//buat cetakan tubuh
public class ImageAssets {

    //membuat list array untuk pengelompokan head
    private static List<Integer> heads =new ArrayList<Integer>(){{
        add(R.drawable.baju1);
        add(R.drawable.baju2);
        add(R.drawable.baju3);
        add(R.drawable.baju4);
        add(R.drawable.baju5);
        add(R.drawable.baju6);
        add(R.drawable.baju7);
        add(R.drawable.baju8);
    }};

    //membuat list array untuk pengelompokan body
    private static List<Integer> bodies =new ArrayList<Integer>(){{
        add(R.drawable.celana1);
        add(R.drawable.celana2);
        add(R.drawable.celana3);
        add(R.drawable.celana4);
        add(R.drawable.celana5);
        add(R.drawable.celana6);
        add(R.drawable.celana7);
        add(R.drawable.celana8);
    }};

    //membuat list array untuk pengelompokan leg
//    private static List<Integer> legs =new ArrayList<Integer>(){{
//        add(R.drawable.legs1);
//        add(R.drawable.legs2);
//        add(R.drawable.legs3);
//        add(R.drawable.legs3);
//        add(R.drawable.legs4);
//        add(R.drawable.legs5);
//        add(R.drawable.legs6);
//        add(R.drawable.legs7);
//        add(R.drawable.legs8);
//        add(R.drawable.legs9);
//        add(R.drawable.legs8);
//        add(R.drawable.legs11);
//        add(R.drawable.legs12);
//    }};
    //method utk memanggil/mengambil variabel heads
    public static List<Integer> getHeads(){
        return heads;
    }
    //method utk memanggil/mengambil variabel bodies
    public static List<Integer> getBodies(){
        return bodies;
    }
    //method utk memanggil/mengambil variabel legs
//    public static List<Integer> getLegs(){
//        return legs;
//    }


}
