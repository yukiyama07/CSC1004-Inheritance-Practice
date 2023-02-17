package com.itheima.mextends;

public class ExtendsDemo3 {
    /*
    方法重载（Overload）：在同一个类中，方法名相同，参数不同，与返回值无关
    参数不同：类型不同，个数不同，顺序不同
    方法重写（Override)：在子父类当中，出现了方法声明一模一样的方法（方法名，参数，返回值）
    目标1：能够独立识别出方法是不是重写的方法
    -注解：@Override
    目标2：方法重写的使用场景
    当子类需要父类的方法，但是觉得父亲的方法逻辑不好（修改|增强）就可以对父类方法进行重写
     */
    public static void main(String[] args) {
        Son s = new Son();
        s.method();
        s.love();
    }
}

class Father {

    public void method() {
        System.out.println("father...method..");
    }

    public void love() {
        System.out.println("送花");
    }
}

class Son extends Father{

    public void method(){
        System.out.println("son...method..");
    }

    @Override
    public void love() {
        super.love();
        System.out.println("送包");
    }
}
