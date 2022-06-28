package ru.yandex.praktikum;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ProgramTest extends TestCase {

    private final int age;
    private final boolean result;

    public ProgramTest(int age, boolean result) {
        // Инициализируй поля класса в конструкторе
        this.age = age;
        this.result = result;
    }

    @Parameterized.Parameters // Пометь метод аннотацией для параметров
    public static Object[][] getTextData() {
        return new Object[][] {
                {17,false},
                {18,true},
                {21,true},
                {22,true}

        };
    }

    @Test
    public void testCheckIsAdult() {
        Program program = new Program();
        boolean actual = program.checkIsAdult(age);
        assertEquals("Проверка",result,actual);
    }
}