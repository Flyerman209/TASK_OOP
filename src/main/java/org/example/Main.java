/*
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // 1. Класс Person
    class Person {
        private String name;
        private int age;
        private String gender;

        public Person(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public void displayInfo() {
            System.out.println("Имя: " + name + ", Возраст: " + age + ", Пол: " + gender);
        }

        public void increaseAge() {
            age++;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    // 2. Классы Worker и Manager
    class Worker extends Person {
        private double salary;

        public Worker(String name, int age, String gender, double salary) {
            super(name, age, gender);
            this.salary = salary;
        }

        public void displayInfo() {
            super.displayInfo();
            System.out.println("Зарплата: " + salary);
        }
    }

    class Manager extends Worker {
        private int teamSize;

        public Manager(String name, int age, String gender, double salary, int teamSize) {
            super(name, age, gender, salary);
            this.teamSize = teamSize;
        }

        public void displayInfo() {
            super.displayInfo();
            System.out.println("Размер команды: " + teamSize);
        }
    }

    // 3. Классы животных
    abstract class Animal {
        public abstract void makeSound();
    }

    class Dog extends Animal {
        public void makeSound() {
            System.out.println("Гав!");
        }
    }

    class Cat extends Animal {
        public void makeSound() {
            System.out.println("Мяу!");
        }
    }

    class Cow extends Animal {
        public void makeSound() {
            System.out.println("Муу!");
        }
    }

    // 4. Классы транспорта
    abstract class Transport {
        public abstract void move();
    }

    class Car extends Transport {
        public void move() {
            System.out.println("Машина едет.");
        }
    }

    class Bike extends Transport {
        public void move() {
            System.out.println("Велосипед крутит педали.");
        }
    }

    // 5. Классы библиотеки
    class Book {
        private String title;
        private String author;
        private int year;

        public Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        public String getAuthor() {
            return author;
        }

        public int getYear() {
            return year;
        }

        public void displayInfo() {
            System.out.println("Название: " + title + ", Автор: " + author + ", Год: " + year);
        }
    }

    class Library {
        private List<Book> books = new ArrayList<>();

        public void addBook(Book book) {
            books.add(book);
        }

        public void searchByAuthor(String author) {
            for (Book book : books) {
                if (book.getAuthor().equals(author)) {
                    book.displayInfo();
                }
            }
        }

        public void searchByYear(int year) {
            for (Book book : books) {
                if (book.getYear() == year) {
                    book.displayInfo();
                }
            }
        }
    }

    // 6. Класс BankAccount
    class BankAccount {
        private String accountNumber;
        private double balance;

        public BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.println("Пополнение: " + amount);
        }

        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Снятие: " + amount);
            } else {
                System.out.println("Недостаточно средств для снятия " + amount);
            }
        }

        public double getBalance() {
            return balance;
        }
    }

    // 7. Класс Counter
    class Counter {
        private static int objectCount = 0;

        public Counter() {
            objectCount++;
        }

        public static int getObjectCount() {
            return objectCount;
        }
    }

    // 8. Классы для фигур
    abstract class Shape {
        public abstract double getArea();
    }

    class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

    class Rectangle extends Shape {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getArea() {
            return width * height;
        }
    }

    // 9. Движение животных
    class Fish extends Animal {
        public void move() {
            System.out.println("Рыба плывёт.");
        }
    }

    class Bird extends Animal {
        public void move() {
            System.out.println("Птица летит.");
        }
    }

    // 10. Класс University
    class Student {
        private String name;
        private String group;
        private double grade;

        public Student(String name, String group, double grade) {
            this.name = name;
            this.group = group;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public double getGrade() {
            return grade;
        }

        public void displayInfo() {
            System.out.println("Имя: " + name + ", Группа: " + group + ", Оценка: " + grade);
        }
    }

    class University {
        private List<Student> students = new ArrayList<>();

        public void addStudent(Student student) {
            students.add(student);
        }

        public void displayAllStudents() {
            for (Student student : students) {
                student.displayInfo();
            }
        }

        public void sortByName() {
            students.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
        }

        public void filterByGrade(double minGrade) {
            for (Student student : students) {
                if (student.getGrade() >= minGrade) {
                    student.displayInfo();
                }
            }
        }
    }

    // 11. Класс Store
    class Product {
        private String name;
        private double price;
        private int quantity;

        public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public void displayProduct() {
            System.out.println("Продукт: " + name + ", Цена: " + price + ", Количество: " + quantity);
        }
    }

    class Store {
        private List<Product> products = new ArrayList<>();

        public void addProduct(Product product) {
            products.add(product);
        }

        public Product searchProduct(String name) {
            for (Product product : products) {
                if (product.getName().equals(name)) {
                    return product;
                }
            }
            return null;
        }

        public void removeProduct(String name) {
            products.removeIf(product -> product.getName().equals(name));
        }
    }

    // 12. Классы для платёжных систем
    abstract class PaymentSystem {
        public abstract void pay(double amount);

        public abstract void refund(double amount);
    }

    class CreditCard extends PaymentSystem {
        public void pay(double amount) {
            System.out.println("Оплата кредитной картой: " + amount);
        }

        public void refund(double amount) {
            System.out.println("Возврат по кредитной карте: " + amount);
        }
    }

    class PayPal extends PaymentSystem {
        public void pay(double amount) {
            System.out.println("Оплата через PayPal: " + amount);
        }

        public void refund(double amount) {
            System.out.println("Возврат через PayPal: " + amount);
        }
    }

    // 13. Класс UniqueID
    class UniqueID {
        private static int currentID = 0;
        private int id;

        public UniqueID() {
            id = ++currentID;
        }

        public int getId() {
            return id;
        }

        public static int getCurrentID() {
            return currentID;
        }
    }

    // 14. Класс Point и прямоугольник
    class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    class RectangleArea {
        private Point topLeft;
        private Point bottomRight;

        public RectangleArea(Point topLeft, Point bottomRight) {
            this.topLeft = topLeft;
            this.bottomRight = bottomRight;
        }

        public double getArea() {
            return Math.abs((topLeft.getX() - bottomRight.getX()) * (topLeft.getY() - bottomRight.getY()));
        }
    }

    // 15. Класс ComplexNumber
    class ComplexNumber {
        private double real;
        private double imaginary;

        public ComplexNumber(double real, double imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }

        public ComplexNumber add(ComplexNumber other) {
            return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
        }

        public ComplexNumber subtract(ComplexNumber other) {
            return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
        }

        public void display() {
            System.out.println(real + " + " + imaginary + "i");
        }
    }

    // 16. Класс Employee
    class Employee {
        private String name;
        private double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public double calculateAnnualSalary() {
            return salary * 12;
        }

        public void displayInfo() {
            System.out.println("Имя: " + name + ", Зарплата: " + salary);
        }
    }

    // 17. Класс ShapeCalculator
    class ShapeCalculator {
        public static double calculateArea(Shape shape) {
            return shape.getArea();
        }
    }

    // 18. Класс Inventory
    class Inventory {
        private List<Product> products = new ArrayList<>();

        public void addProduct(Product product) {
            products.add(product);
        }

        public void listProducts() {
            for (Product product : products) {
                product.displayProduct();
            }
        }
    }

    // 19. Класс Invoice
    class Invoice {
        private List<Product> products = new ArrayList<>();
        private double total;

        public void addProduct(Product product) {
            products.add(product);
            total += product.getPrice();
        }

        public void displayInvoice() {
            for (Product product : products) {
                product.displayProduct();
            }
            System.out.println("Итого: " + total);
        }
    }

    // 20. Главный класс для тестирования
    public class Main {
        public static void main(String[] args) {
            // Тестирование всех классов

            // 1. Person
            Person person = new Person("Алексей", 30, "Мужской");
            person.displayInfo();
            person.increaseAge();
            person.displayInfo();

            // 2. Worker и Manager
            Worker worker = new Worker("Мария", 28, "Женский", 50000);
            worker.displayInfo();
            Manager manager = new Manager("Иван", 35, "Мужской", 70000, 5);
            manager.displayInfo();

            // 3. Животные
            Animal dog = new Dog();
            dog.makeSound();
            Animal cat = new Cat();
            cat.makeSound();
            Animal cow = new Cow();
            cow.makeSound();

            // 4. Транспорт
            Transport car = new Car();
            car.move();
            Transport bike = new Bike();
            bike.move();

            // 5. Библиотека
            Library library = new Library();
            library.addBook(new Book("1984", "Джордж Оруэлл", 1949));
            library.addBook(new Book("Война и мир", "Лев Толстой", 1869));
            library.searchByAuthor("Джордж Оруэлл");
            library.searchByYear(1869);

            // 6. Банковский счёт
            BankAccount account = new BankAccount("123456789", 1000);
            account.deposit(500);
            account.withdraw(200);
            System.out.println("Баланс: " + account.getBalance());

            // 7. Счётчик объектов
            new Counter();
            new Counter();
            System.out.println("Создано объектов: " + Counter.getObjectCount());

            // 8. Фигуры
            Shape circle = new Circle(5);
            System.out.println("Площадь круга: " + circle.getArea());
            Shape rectangle = new Rectangle(4, 6);
            System.out.println("Площадь прямоугольника: " + rectangle.getArea());

            // 9. Движение животных
            Animal fish = new Fish();
            fish.move();
            Animal bird = new Bird();
            bird.move();

            // 10. Университет
            University university = new University();
            university.addStudent(new Student("Сергей", "Группа A", 4.5));
            university.addStudent(new Student("Анна", "Группа B", 3.7));
            university.displayAllStudents();

            // 11. Магазин
            Store store = new Store();
            store.addProduct(new Product("Яблоки", 100, 50));
            store.addProduct(new Product("Бананы", 150, 30));
            Product foundProduct = store.searchProduct("Яблоки");
            if (foundProduct != null) {
                foundProduct.displayProduct();
            }
            store.removeProduct("Бананы");

            // 12. Платежные системы
            PaymentSystem payment = new CreditCard();
            payment.pay(200);
            payment.refund(50);
            PaymentSystem paypal = new PayPal();
            paypal.pay(300);
            paypal.refund(100);

            // 13. Уникальные ID
            UniqueID uid1 = new UniqueID();
            UniqueID uid2 = new UniqueID();
            System.out.println("Текущий ID: " + UniqueID.getCurrentID());

            // 14. Прямоугольник
            Point topLeft = new Point(0, 10);
            Point bottomRight = new Point(10, 0);
            RectangleArea rectangleArea = new RectangleArea(topLeft, bottomRight);
            System.out.println("Площадь прямоугольника: " + rectangleArea.getArea());

            // 15. Комплексные числа
            ComplexNumber num1 = new ComplexNumber(3, 4);
            ComplexNumber num2 = new ComplexNumber(1, 2);
            ComplexNumber sum = num1.add(num2);
            System.out.print("Сумма: ");
            sum.display();

            // 16. Сотрудники
            Employee emp = new Employee("Пётр", 40000);
            emp.displayInfo();
            System.out.println("Годовая зарплата: " + emp.calculateAnnualSalary());

            // 17. Калькулятор форм
            Shape shape = new Circle(7);
            System.out.println("Площадь фигуры: " + ShapeCalculator.calculateArea(shape));

            // 18. Инвентарь
            Inventory inventory = new Inventory();
            inventory.addProduct(new Product("Книга", 500, 10));
            inventory.listProducts();

            // 19. Чек
            Invoice invoice = new Invoice();
            invoice.addProduct(new Product("Компьютер", 50000, 1));
            invoice.addProduct(new Product("Монитор", 15000, 2));
            invoice.displayInvoice();

            // 20. Конец программы
            System.out.println("Все задачи выполнены!");
        }
    }
}


 */