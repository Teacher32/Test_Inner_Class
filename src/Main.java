public class Main {                             // класс "Мэйн"
    public static void main(String[] args) {        // метод "мэйн"
        TVSet tv = new TVSet();                 // создаем объект класса "Телевизор"
        TVSet.Remote remote = new TVSet.Remote();
        TVSet.Remote.setTVSet(tv);

        // System.out.println(tv.toString());      // печатаем сообщение в зависимости от переменной isOn
    }
}
