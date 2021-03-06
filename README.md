# Course on Java Development

### Содержание репозитория

- **project** - IntelliJ IDEA проект, в котором мы пишем и тестируем Java код. В IDEA необходимо выбирать именно эту папку для открытия проекта!
  - **src**
    - **collection** - Коллекция классов, собранных за весь курс, разбитая по темам
    - **lessonN** - Папки Java файлов с заданиями на каждый урок и домашними заданиями.
    - **teacher** - Папка, в которую я буду выкладывать тот код, который **я** писал на учительском компьютере во время урока. Если во время урока вы что-то не успели и хотели бы сравнить с тем, что писал на уроке я - здесь вы можете найти мой код.
- **resources** - Материалы уроков (презентации и т.д.). Дополнительные ресурсы для самостоятелього изучения будут тоже добавляться сюда.


### Полезные ресурсы

Основной учебник по Java:
  - [Liang Y.D. - Introduction to Java programming](https://www.dropbox.com/s/2n590tuyfr9cdph/Liang_Y_D_-_Introduction_to_Java_Programming.pdf?dl=0)

Обучающие онлайн игры по Java:
  - [CodinGame](https://www.codingame.com/)
  - [CodeWars](http://www.codewars.com/)

Ресурсы по SQL:
  - [SQLiteOnline.com](https://sqliteonline.com/) - website for executing statements and viewing SQLite databases
  - [Khan Academy - SQL Course](https://www.khanacademy.org/computing/computer-programming/sql) - good course for SQL beginners

Networking:
- [How I Explained REST to My Wife](http://www.looah.com/source/view/2284)

Programming Patterns:
- [Паттерны ООП в метафорах](https://habr.com/post/136766/)


### Инструкции для установки Java и IDEA:

1. Проверяем какая у вас ОС: 32-битная или 64-битная. Заходим в Пуск > Система и там будет написано.
2. Заходим на http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
Cмотрим на секцию Java SE Development Kit 8u171
Тыкаем на Accept License Agreement и выбираем либо Windows x86 (если 32-битная ОС) либо Windows x64 (если 64-битная ОС).
3. Скачиваем, устанавливаем. По ходу установки будет написано куда сохраняется JDK, надо его запомнить. По дефолту должно быть C:/ProgramFiles/Java/jdk_xxx
4. Заходим на https://www.jetbrains.com/idea/download/#section=windows и скачиваем Community версию.
5. Устанавливаем. Выбираем все дефолтные настройки.
6. Создаем у себя на компе папочки куда вы будете сохранять материалы и проекты по ходу курса.
7. Скачиваем проект с нашего репозитория https://github.com/makks129/course_java и сохраняем у себя на компе.
8. В ИДЕЕ выбираем Open и открываем скаченный проект (именно папку project0). Если ИДЕЯ не поймет как прочитать проект, потому что она не видит JDK, кликните правой кнопкой на верхнюю папку проекта слева, выберите Open module settings, в появившемся окне выберите Project и в Project SDK нужно добавить путь к JDK, который мы запоминали ранее.
9. Проект должен запускаться. Попробуйте запустить файлик Program1, вы должны увидеть "Hello, World!" в консоли.
