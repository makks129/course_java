### RPG
Create classes to simulate your favourite game (not necessarily RPG) entities and mechanics.
Design notes:
- think of the main entities that take part in the game
- think about their properties and composition
- figure out inheritance chains between them
- think about their methods and how these entities interact
- remember 5 class design principles!
- don't be afraid to experiment 

Interfaces to implement:
- Lootable (То, с чего возможо получить добычу)
- Consumable (То, что можно употребить)
- Targetable (То, что можно выделить и взаимодействовать с)
- InventoryItem (Предмет, который можно положить в инвентарь)

TODO:
- Add healing action to duels
- Add critical damage chance to attacks (different chance depending on hero type or even on hero items!)
- Change duel logic so that heroes can block/attack different body parts
- Change attack values for different heroes

### Social Network
class User
- saveNewProfile (сохранить новый профиль, например с измененной инфой)
- addFriend
- removeFriend (заменить друга на null в массиве)
- createGroup
- enterGroup
- leaveGroup
- inviteUserToGroup (only if admin of that group)
- giveGroupAdminToUser
- writeNewPost
- likePost
- repostPost
- addNewPhoto
- addNewAudio
- addNewVideo

class UserProfile
- checkIdExists (У юзеров не может быть одинаковых id, поэтому нужно хранить все id в статик массиве. Чтобы проверить занят ли id можно использовать этот метод)
- saveNewId (При помощи этого добавлять новый id)

class Group
- saveNewProfile

class GroupProfile
- checkIdExists (Аналогичная логика как и в UserProfile)
- saveNewId

class Post
- saveNewLike
- saveNewRepost

### School/University
Set of classes to model a school or a university
Examples of classes and their relationships:
University or School
Student
Group
Teacher
Course
etc.

### Geometry
- class Triangle
- class Cylinder
- class Cube
- class Point
    * Description: represents a point on 2D diagram, contains X and Y values
    * Methods: getDistance(Point otherPoint) - find formula online
    * add Point class to our 2D classes: Circle, Rectangle, Triangle

### Math
- method to get random number from X to Y
- method to get max of 2 numbers
- method to get min of 2 numbers
- method to check if the number is even
- method to calculate factorial for number
- method to calculate GCD for 2 numbers
- method to find first N prime numbers and return them as an array

### Arrays
- method to find biggest element in an array of numbers
- method to find a sum of elements in an array of numbers
- method to find an average of elements in an array of numbers
- method to print an array in a format [0, 1, ..., N]
- method to randomly shuffle an array
- method to shift an array to the left
- method to shift an array to the right
- method to reverse an array
- method to copy an array into another array
- method to remove null values from an array of objects (use any class for that)
- method to expand an array (create new bigger array and copy elements into it)
- method to create an array filled with random numbers
- method to create an array filled with numbers from X to Y (example: from 1 to 4 will be [1, 2, 3, 4])
- method to create an array filled with numbers from X to Y with step Z (example: from 1 to 4 with step 2 will be [1, 3])

### Games
- class RockPaperScissorsGame
- class GuessNumberGame (see lesson 3 practice 4)
- class MathTestGame
    * Description: user enters an arithmetic operator (+, -, etc.), difficulty level (1-digit numbers, 2-digit numbers, etc.) 
    and number of questions and gets a test which asks him questions, takes his answers and prints results in the end

### Time
- class Calendar
    * Description: accumulates functionality of Date class, plus has additional methods (from example to check if the 
    year is a leap year, and others)
   
### Bank
- class Loan
    * Description: represents a loan in a bank
    * Fields: loanAmount, loanDate, interestRate, years
    * Methods: getMonthlyPayment, getTotalPayment

### Containers
- class Stack
    * LIFO container
    * data is stored in an array of Objects
    * methods: putItem, takeTopItem, seeTopItem, size, isEmpty
    * make array expand and shrink if needed (see methods to expand an array and to remove null values from an array)
- class Queue
    * FIFO container
    * data is stored in an array of Objects
    * methods: putItem, removeItem, seeFirstItem, seeLastItem, size, isEmpty
    * don't forget to shift an array when you remove items from it
    * make array expand and shrink if needed (see methods to expand an array and to remove null values from an array)
- class List
    * random access container
    * data is stored in an array of Objects
    * methods: addItem, getItem(index), size, isEmpty
    * make array expand and shrink if needed (see methods to expand an array and to remove null values from an array)
- class Range
    * container that models a range of integers
    * only stores first and last element (both inclusive), for example range of (1, 10) stores only 1 and 10 in its fields
    * range must always go up (must be 1 to 10, cannot be 10 to 1)
    * methods: sum ranges, check if two ranges intersect
- class CollectionsPerformanceTester
    * класс в который можно передать разные коллекции из созданных самостоятельно или из JCF
    * класс должен иметь методы для проверки производительности коллекций
    * такие методы должны получать на входе количество элементов для наполнения коллекции и использовать методы shuffle или sort
    * время операции должно засекаться и выводиться в консоль по окончании
    * для подсказки выполнения задания см. стр745 учебника
- JCF
    * Переписать перечисленные здесь задания с использованием классов JCF там, где это удобно