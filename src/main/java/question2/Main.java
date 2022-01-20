package question2;

class Main{

    public static void DoPrint(Base o) {
        o.Print();
    }

    public static void main(String[] args) {
        Base x = new Base();
        //This print "Derived" because it is instantiated as the Derived class.
        Base y = new Derived();
        Derived z = new Derived();
        DoPrint(x);
        DoPrint(y);
        DoPrint(z);
    }
}
