public class TVSet {            // создаем класс Телевизор
    static int channel = 5;            // определяем переменную "Канал"
    boolean isOn = false;       // определяем переменную "Включен?"

    public String toString() {  // используем метод "туСтринг" класса "Обджект" для того, чтобы иметь возможность выводить строку (иначе будут хэш-символы)
        if (!isOn) {
            return "Телевизор выключен";
        }
        else {
            return "Канал № " + channel + " включен.";
        }
    }

    public static class Remote {                  // создаем вложенный класс "Пульт"
        private TVSet tvSet;        // создаем ссылку объект класс "Телевизор"

        public static void setTVSet(TVSet tvSet) {    // создаем метод, который связывает Телевизор с пультом
            tvSet = tvSet;     // получаем доступ к объекту tvSet внутри класса "Пульт"
        }

        public void setChannel() {  // создаем метод, переключающий (задающий) каналы
            tvSet.channel = channel;    // значение канала берем из класса TVSet
        }

        public void turnOn() {      // создаем метод, включающий телевизор
            tvSet.isOn = true;      // меняем значение переменной "Включен?" на "истина"
        }

        public void turnOff() {     // создаем метод, выключающий телевизор
            tvSet.isOn = false;     // Меняем значение переменной "Включен?" на "ложь"
        }
    }
}