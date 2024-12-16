class WrongAge extends Exception {
    public WrongAge(String message) {
        super(message);
    }
}

class Father {
    int age;

    public Father(int age) throws WrongAge {
        if (age < 0) {
            throw new WrongAge("Father's age cannot be negative.");
        }
        this.age = age;
        System.out.println("Father's age is " + this.age);
    }
}

class Son extends Father {
    int sonAge;

    public Son(int fatherAge, int sonAge) throws WrongAge {
        super(fatherAge);  
        if (sonAge >= fatherAge) {
            throw new WrongAge("Son's age cannot be greater than or equal to Father's age.");
        }
        this.sonAge = sonAge;
        System.out.println("Son's age is " + this.sonAge);
    }
}

public class WrongAgeMain {
    public static void main(String[] args) {
        try {
            Father father = new Father(45);  
            Son son = new Son(45, 50);      
        } catch (WrongAge e) {
            System.out.println("WrongAge Exception: " + e.getMessage());
        }
    }
}
