class Parent {

    private void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {

    void show() {
        System.out.println("Child");
    }
}

class Doubt{public static void main(String[] args){Child c=new Child(); c.show(); Parent p=new Parent(); p.show();}}


