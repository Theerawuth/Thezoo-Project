package com.theerawuth.TheZoo.Reptiles;

import com.theerawuth.TheZoo.CanSwim;

/**
 * Created by Theerawuth on 7/13/2016.
 */
public class Snake extends Reptiles implements CanSwim {
    public Snake(String ID){
        Id_Animals = ID;
        Type_Animals = "Reptiles";
        Species = "Snake!!";
        eatMeat();
    }

    @Override
    public void swim(){
        // can Swim
    }

}

