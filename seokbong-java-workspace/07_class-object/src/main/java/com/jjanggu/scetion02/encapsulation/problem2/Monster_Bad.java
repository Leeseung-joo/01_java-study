package com.jjanggu.scetion02.encapsulation.problem2;

public class Monster_Bad {

    String name;
    int hp;

    public void setHp(int hp) {
        if(hp < 0){
            this.hp = 0;
        }else{
            this.hp = hp;
        }
    }

}
