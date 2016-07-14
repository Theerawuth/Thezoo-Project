package com.theerawuth.TheZoo;

/**
 * Created by Theerawuth on 7/13/2016.
 */
    public class Animals {

        protected String Id_Animals;
        protected String Type_Animals;
        protected String Species;
        protected String food;


        public Animals(){

        }
            @Override
            public String toString() {
                return "Type = "+ getType_Animals() +", Id = " + getId_Animals() + ", Name = " +getSpecies() +", Howtoeat = " +getEat();
            }

        public void setId_Animals(String Id_Animals){
            this.Id_Animals = Id_Animals ;
        }

        public String getId_Animals() {
            return Id_Animals;
        }

        public void setType_Animals(String Type_Animalse){
            this.Type_Animals = Type_Animals;
        }

        public String getType_Animals() {
            return Type_Animals;
        }

        public String getSpecies(){
            return Species;
        }

        public void eatPlane(){

            this.food = "Plane";
        }
        public void eatMeat(){

            this.food = "Meat";
        }

        public String getEat(){
            return food;
        }

}

