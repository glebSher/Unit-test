# Unit-test homework

## HW_1

__*Задание 1*:__

В классе Calculator создайте метод calculateDiscount, который принимает сумму покупки и процент скидки и возвращает сумму с учетом скидки. Ваша задача - проверить этот метод с использованием библиотеки AssertJ. Если метод calculateDiscount получает недопустимые аргументы, он должен выбрасывать исключение ArithmeticException. Не забудьте написать тесты для проверки этого поведения.


## HW_2

__*Задание 1*:__

*Проект Vehicle.*
 Написать следующие тесты с использованием JUnit5:
 - Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя
оператор instanceof).
 - Проверить, что объект Car создается с 4-мя колесами.
 - Проверить, что объект Motorcycle создается с 2-мя колесами.
 - Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
 - Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод
testDrive()).
 - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина
останавливается (speed = 0).
 - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл
останавливается (speed = 0).

**Vehicle:**
В этом проекте, вы будете работать с проектом "Vehicle", который представляет собой иерархию классов,
включающую абстрактный базовый класс "Vehicle" и два его подкласса "Car" и "Motorcycle".

**Базовый класс "Vehicle":** содержит абстрактные методы "testDrive()" и "park()", а также поля "company",
"model", "yearRelease", "numWheels" и "speed".

**Класс "Car"** расширяет "Vehicle" и реализует его абстрактные методы. При создании объекта "Car", число
колес устанавливается в 4, а скорость в 0. В методе "testDrive()" скорость устанавливается на 60, а в методе
"park()" - обратно в 0.

**Класс "Motorcycle"** также расширяет "Vehicle" и реализует его абстрактные методы. При создании объекта
"Motorcycle", число колес устанавливается в 2, а скорость в 0. В методе "testDrive()" скорость
устанавливается на 75, а в методе "park()" - обратно в 0.


## HW_3

__*Задание 1*:__

Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет, является ли переданное число четным или нечетным (код приложен в презентации).

__*Задание 2*:__

Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли
переданное число в интервал (25;100)



## HW_4

__*Задание 1*:__

__Ответьте письменно на вопросы:__

1)  Почему использование тестовых заглушек может быть полезным при написании модульных тестов?

2) Какой тип тестовой заглушки следует использовать, если вам нужно проверить, что метод был вызван с определенными аргументами?

3) Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть определенное значение или исключение в ответ на вызов метода?

4) Какой тип тестовой заглушки вы бы использовали для имитации  взаимодействия с внешним API или базой данных?

__*Задание 2*:__

У вас есть класс BookService, который использует интерфейс BookRepository для получения информации о книгах из базы данных. Ваша задача написать unit-тесты для BookService, используя Mockito для создания мок-объекта BookRepository.


## HW_5

__*Задание 1*:__

Представьте, что вы работаете над разработкой простого приложения для записной книжки, которое позволяет пользователям добавлять, редактировать и удалять контакты.

Ваша задача - придумать как можно больше различных тестов (юнит-тесты, интеграционные тесты, сквозные тесты) для этого приложения. Напишите название каждого теста, его тип и краткое описание того, что этот тест проверяет.

__*Задание 2*:__

Ниже список тестовых сценариев. Ваша задача - определить тип каждого теста (юнит-тест, интеграционный тест, сквозной тест) и объяснить, почему вы так решили:

- "Проверка того, что функция addContact корректно добавляет новый контакт в список контактов".
- "Проверка того, что при добавлении контакта через пользовательский интерфейс, контакт корректно отображается в списке контактов".
- "Проверка полного цикла работы с контактом: создание контакта, его редактирование и последующее удаление".


## HW_6

__*Задание 1*:__

a. Рассчитывает среднее значение каждого списка.

b. Сравнивает эти средние значения и выводит соответствующее сообщение:
- "Первый список имеет большее среднее значение", если среднее значение первого списка больше.
- "Второй список имеет большее среднее значение", если среднее значение второго списка больше.
- "Средние значения равны", если средние значения списков равны.

Важно:

Приложение должно быть написано в соответствии с принципами объектно-ориентированного программирования.

Используйте Pytest (для Python) или JUnit (для Java) для написания тестов, которые проверяют правильность работы программы. Тесты должны учитывать различные сценарии использования вашего приложения.

Используйте pylint (для Python) или Checkstyle (для Java) для проверки качества кода.

Сгенерируйте отчет о покрытии кода тестами. Ваша цель - достичь минимум 90% покрытия.