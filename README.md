# Практические задачи по курсу ООП

[Правила оформления и сдачи практических задач](https://docs.google.com/document/d/1rGBNsl5-POQg3t4Lbn6Qad6yrAGWCqndiEnUrpYjHos/edit?usp=sharing)

## Задачи

### 1.1 Пирамидальная сортировка — **Task_1_1_1**  
Реализуйте классический алгоритм пирамидальной сортировки.  
Кроме настроенной сборки через gradle, необходимо предоставить shell-скрипт, который без использования системы сборки с помощью комбинации утилит `javac`, `jar` и `java` компилирует исходники, генерирует документацию и запускает приложение.  

Протестируйте свой код с помощью [юнит-тестов](https://en.wikipedia.org/wiki/Unit_testing). При сдаче задания преподавателю объясните, как выбранный набор тестов обеспечивает корректность вашего алгоритма.  
Покажите, что теоретическая сложность алгоритма подтверждается на практике.

#### Пример:
|Вход|`heapsort(new int[] {5, 4, 3, 2, 1});`|
|:-|:-|
|Выход|`[1,2,3,4,5]`|

### 1.2 Консольный блэкджек (2 недели) — **Task_1_1_2**
Реализуйте консольный вариант карточной игры [Блэкджек](https://ru.wikipedia.org/wiki/%D0%91%D0%BB%D1%8D%D0%BA%D0%B4%D0%B6%D0%B5%D0%BA) по следующим правилам:
1. В игре используется одна или несколько колод из 52 карт.
2. В игре участвуют Игрок (пользователь) и Дилер (эмулируется приложением).
3. Каждой карте соответствует значение очков, которые начисляются тому, кто ее
открыл. В комбинации карт их значения суммируются.
Числовые карты дают значение по указанному на них числу (от 2 до 10), карты с
картинками (дама, валет, король) – 10 очков, тузы дают по 11 очков, если
итоговая сумма карт на руках (учитывая тузы) не превышает 21, и 1, если
превышает.
4. Игра состоит из раундов. В начале раунда Дилер раздает по две карты Игроку и
себе, оставляя одну свою карту закрытой.
5. Комбинация из двух карт, дающая сумму 21, называется блэкджек и
автоматически делает своего обладателя победителем.
6. После раздачи карт, если Игрок не стал обладателем блек-джека, он делает
свой ход. Цель Игрока – победить Дилера, набрав за раунд сумму очков выше,
чем у Дилера, но не превышающую значение 21. Для этого в течение своего
хода он может открывать по одной очередной карте из колоды до тех пор, пока
не пожелает остановиться.
7. По завершении хода Игрока Дилер открывает закрытую карту и, пока сумма
комбинации на руках Дилера не превысит или не станет равной значению 17, он
обязан открывать по очередной карте из колоды. По достижении этого значения
Дилер завершает ход.
8. Любой участник игры сразу проигрывает, если сумма очков его комбинации карт
превысила 21.
9. Если в течение раунда не было блекджеков и обе комбинации не превысили
значение 21, побеждает участник с наибольшей суммой очков.

В решении используйте объектно-ориентированный подход: продумайте объектную
модель приложения и отношения между абстракциями.

|Выход|Добро пожаловать в Блэкджек!<br>Раунд 1<br>Дилер раздал карты<br>Ваши карты: [Пиковая дама (10), Тройка Червы (3)] > 13|
|:-|:-|