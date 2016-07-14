package com.theerawuth.TheZoo;


import com.theerawuth.TheZoo.Birds.Eagle;
import com.theerawuth.TheZoo.Fishs.Shark;
import com.theerawuth.TheZoo.Mammols.Buffalo;
import com.theerawuth.TheZoo.Reptiles.Snake;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainCentral {
    public static void main(String[] args){


        Staff staff1 = new Staff("S1","Zookeeper","Theerawuth","Pattrapong");
        Staff staff2 = new Staff("S2","Zookeeper","Therdsakit","Paradeewia");
        Staff staff3 = new Staff("S3","Cook","Tanaphonit","Auanhinkon","Meat");
        Staff staff4 = new Staff("S4","Cook","Punnakhung","Rattanakon","Plane");
        List<Staff> listStaff = new ArrayList<>();
        listStaff.add(staff1);
        listStaff.add(staff2);
        listStaff.add(staff3);
        listStaff.add(staff4);

        for(int count=0; count < listStaff.size();count++){
            System.out.println("ID: "+ listStaff.get(count).getIDStaff() + "  Role: "+ listStaff.get(count).getRole()+ "  FirstName: "+listStaff.get(count).getFirstName()+ "  LastName: "+listStaff.get(count).getLastName());
        }
        System.out.println("------------------------------------------------------------");

        List<Animals> Animal = new ArrayList<>();
        Shark shark1 = new Shark("F1");
        Animal.add(shark1);
        for(int count=0; count < Animal.size();count++){
            System.out.println("ID = "+ Animal.get(count).getId_Animals() + "  Name = "+ Animal.get(count).getSpecies() + " How To Eat = "+ Animal.get(count).getEat());
        }

        List<Animals> Animal1 = new ArrayList<>();
        Buffalo buffalo1 = new Buffalo("M1");
        Animal1.add(buffalo1);
        for(int count1=0; count1 < Animal1.size();count1++){
            System.out.println("ID = "+ Animal1.get(count1).getId_Animals() + "  Name = "+ Animal1.get(count1).getSpecies() + " How To Eat = "+ Animal1.get(count1).getEat());
        }

        List<Animals> Animal2 = new ArrayList<>();
        Snake snake1 = new Snake("R1");
        Animal2.add(snake1);
        for(int count2=0; count2 < Animal2.size();count2++){
            System.out.println("ID = "+ Animal2.get(count2).getId_Animals() + "  Name = "+ Animal2.get(count2).getSpecies() + " How To Eat = "+ Animal2.get(count2).getEat());
        }

        List<Animals> Animal3 = new ArrayList<>();
        Eagle eagle1 = new Eagle("R1");
        Animal3.add(eagle1);
        for(int count3=0; count3 < Animal3.size();count3++){
            System.out.println("ID = "+ Animal3.get(count3).getId_Animals() + "  Name = "+ Animal3.get(count3).getSpecies() + " How To Eat = "+ Animal3.get(count3).getEat());
        }
        System.out.println("------------------------------------------------------------");

        System.out.println("ZOOKEEPER");
            System.out.println("   FirstName: "+ listStaff.get(0).firstName+ "   Takecare: "+ Animal.get(0).getSpecies() +" ,"+ Animal1.get(0).getSpecies());
            System.out.println("   FirstName: "+ listStaff.get(1).firstName+ "   Takecare: "+ Animal2.get(0).getSpecies() +" ,"+ Animal3.get(0).getSpecies());

        System.out.println("COOK");
            System.out.println("   FirstName: "+ listStaff.get(2).firstName+ "   Feed: "+ listStaff.get(2).getFeed());
            System.out.println("   FirstName: "+ listStaff.get(3).firstName+ "   Feed: "+ listStaff.get(3).getFeed());

    }

}

