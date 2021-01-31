public class TVSet {            // создаем класс Телевизор
    int channel = 5;            // определяем переменную "Канал"
    boolean isOn = false;       // определяем переменную "Включен?"

    public String toString() {
        if (!isOn) {
            return "Телевизор выключен";
        }
        else {
            return "Канал № " + channel + " включен.";
        }
    }
}