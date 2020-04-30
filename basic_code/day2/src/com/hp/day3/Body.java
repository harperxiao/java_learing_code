package com.hp.day3;

public class Body {
    private String name;

    public Body(String name) {
        this.name = name;
    }

    public class Heart{
        public void beat(){
            System.out.println(name);
            System.out.println("心脏跳动");
        }
    }

    public void methodBody(){
        System.out.println("身体运动");
        new Heart().beat();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
