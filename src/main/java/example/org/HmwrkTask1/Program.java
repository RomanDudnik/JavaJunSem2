package example.org.HmwrkTask1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Program {
    /**
     * Задача 1:
     * Создайте абстрактный класс "Animal" с полями "name" и "age".
     * Реализуйте два класса-наследника от "Animal" (например, "Dog" и "Cat") с уникальными полями и методами.
     * Создайте массив объектов типа "Animal" и с использованием Reflection API выполните следующие действия:
     * Выведите на экран информацию о каждом объекте.
     * Вызовите метод "makeSound()" у каждого объекта, если такой метод присутствует.
     */
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Dog("Шарик", 5, "Шпиц");
        animals[1] = new Cat("Мурзик", 3, "Белый");
        animals[2] = new Dog("Джесси", 5, "Джек-Рассел-Терьер");
        animals[3] = new Cat("Рыжик", 5, "Рыжий");

        try {
            Class<?> arrayClass = animals.getClass();
            Class<?> componentType = arrayClass.getComponentType();
            System.out.println("Класс массива: " + arrayClass.getName());
            System.out.println("Компонентный тип массива: " + componentType.getName());

            for (int i = 0; i < animals.length; i++) {
                Object obj = animals[i];
                Class<?> objClass = obj.getClass();
                System.out.println("Объект " + i + ": " + objClass.getName());
                System.out.println(obj.toString());

                try {
                    Method method = objClass.getMethod("makeSound");
                    method.invoke(obj);
                } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                    System.out.println("Метод makeSound() не найден.\n" + e.getMessage());
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
