package com.tharun;

public class Player1 {
    private String name;
    private String weapon;
    private int health;

    public Player1(String name, String weapon, int health){
        this.name = name;
        this.weapon = weapon;
        if(health < 0 || health > 100){
            this.health = 100;
        } else {
            this.health = health;
        }
    }

    public void damageByGun1(){
        this.health -= 30;
        if(this.health <= 0 ){
            this.health = 0;
        }
        System.out.println("Got hit by gun1 and the health is reduced by 30, new heath is " + this.health);
        if (this.health == 0){
            System.out.println(getName()+ " is dead");
        }
    }

    public void damageByGun2(){
        this.health -= 50;
        if(this.health <= 0 ){
            this.health = 0;
        }
        System.out.println("Got hit by gun2 and the health is reduced by 50, new heath is " + this.health);
        if (this.health == 0){
            System.out.println(getName()+ " is dead");
        }
    }

    public void setHealth(int health){
        this.health = health;
    }
    public int getHealth(){
        return this.health;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setWeapon(String weapon){
        this.weapon = weapon;
    }
    public String getWeapon(){
        return this.weapon;
    }

}
