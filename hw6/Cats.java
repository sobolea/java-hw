package hw6;

public class Cats {
    //Задание
//Реализуйте класс Cat, включающий в себя от трех полей и от двух методов, 
//определяющих базовый функционал класса(за основу можно взять наработки с семинара). 
//Создать два экземпляра класса Cat и вывести информацию о них на экран.


    String nickname;
    Integer age;
    String sex;
    String breed;
    Boolean owner;
    Double weight;
    Double high;

    public String toString(){
        return String.format("Nickname: %s, age: %d, sex: %s, breed: %s", nickname, age, sex, breed);
    }

    public void Owner(){
        if(owner==true) System.out.printf("%s is domestic cat", nickname);
        else System.out.println("Street cat");
    }

    public String Chars(){
        return String.format("%s: weight %f, high %f", nickname, weight, high);
    }
}

