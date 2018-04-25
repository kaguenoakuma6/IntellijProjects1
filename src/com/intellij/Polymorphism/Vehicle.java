package com.intellij.Polymorphism;

class Vehicle
{
    class car
    {
        private boolean engine;
        private int weels, cylinders;
        private String name;

        public car(int cylinders, String name)
        {
            this.cylinders = cylinders;
            this.name = name;
            this.weels = 4;
            this.engine = true;
        }

        public String startEngine()
        {
            return "No Start Engine";
        }

        public String accelerate()
        {
            return "No Accelerate";
        }

        public String Break()
        {
            return "Breaking car";
        }
    }

    class Charger extends car
    {
        public Charger()
        {
            super(4, "Charger");
        }

        @Override
        public String startEngine()
        {
            return "Start Engine Charger";
        }

        @Override
        public String accelerate()
        {
            return "Accelerate Charger";
        }

        @Override
        public String Break()
        {
            return "Charger is breaking";
        }
    }

    public static void main(String [] Args)
    {

    }
}
