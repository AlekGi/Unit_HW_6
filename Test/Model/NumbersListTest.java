package Model;

import Controller.Controller;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


public class NumbersListTest {
    int[] listElements1;
    int[] listElements2;
    NumbersList mockNumbersList;
    Controller mockController;


    @BeforeEach
    void setUp() {
        // Создаем мок-объект для NumberList
        mockNumbersList = mock(NumbersList.class);

        // Создаем 2 мок-объекта (списка) для CreateList
        mockController = mock(Controller.class);
        when(mockController.createList()).thenReturn(listElements1 = new int[]{1, 2, 3, 4, 5});
        when(mockController.createList()).thenReturn(listElements2 = new int[]{2, 3, 4, 5, 6});
    }

    /**
     * Тест на проверку корректного создания списков (используем перед этим заглушки)
     */
    @Test
    void testCreateList() {
        // Arrange
        Controller mockController = mock(Controller.class);

        // Act
        when(mockController.createList()).thenReturn(listElements1 = new int[]{6, 7, 8, 9, 10});

        // Assert
        assertArrayEquals(mockController.createList(), new int[]{6, 7, 8, 9, 10});
    }

    /**
     * Тест на проверку вычисления среднего значения списка
     */
    @Test
    void testAverageList(){
        // Arrange
        NumbersList list = new NumbersList();

        // Assert
        assertThat(list.averageList(listElements1), equalTo(3.0));
        assertThat(list.averageList(listElements2), equalTo(4.0));
    }

    /**
     * Тест на проверку сравнения средних значений двух списков
     */
    @Test
    void testCompareList(){
        // Arrange
        NumbersList list = new NumbersList();
        double list1 = list.averageList(listElements1);
        double list2 = list.averageList(listElements2);

        // Act
        list.compareList(list1, list2);

        // Assert
        assertEquals(list1, list2, 1.0);
    }
}

