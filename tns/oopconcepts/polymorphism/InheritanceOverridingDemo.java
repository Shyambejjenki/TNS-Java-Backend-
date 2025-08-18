// ---------- Parent Class ----------
class Parent {
    // ---- Variables (Properties) ----
    String familyName = "Bejjenki";      // inherited
    protected int wealth = 100000;       // inherited
    private String secret = "Top Secret"; // NOT inherited

    // ---- Methods (Behaviors) ----
    void showFamilyName() {
        System.out.println("Family Name: " + familyName);
    }

    void showWealth() {
        System.out.println("Wealth: " + wealth);
    }

    private void showSecret() { // ❌ Not inherited
        System.out.println("Secret: " + secret);
    }
}

// ---------- Child Class 1 ----------
class ChildOne extends Parent {
    @Override
    void showWealth() {   // Overriding parent method
        System.out.println("ChildOne Wealth: " + wealth);
    }

    void showChildOneMessage() {
        System.out.println("This is ChildOne’s own method");
    }
}

// ---------- Child Class 2 ----------
class ChildTwo extends Parent {
    @Override
    void showWealth() {   // Overriding parent method
        System.out.println("ChildTwo Wealth: " + wealth);
    }

    void showChildTwoMessage() {
        System.out.println("This is ChildTwo’s own method");
    }
}

// ---------- Main Class ----------
public class InheritanceOverridingDemo {
    public static void main(String[] args) {

        // --- Parent object ---
        Parent p = new Parent();
        System.out.println("--- Parent Object ---");
        p.showFamilyName();
        p.showWealth();

        System.out.println("\n--- ChildOne Object ---");
        ChildOne c1 = new ChildOne();
        c1.showFamilyName();      // inherited method
        c1.showWealth();          // overridden method
        c1.showChildOneMessage(); // child’s own method

        System.out.println("\n--- ChildTwo Object ---");
        ChildTwo c2 = new ChildTwo();
        c2.showFamilyName();      // inherited method
        c2.showWealth();          // overridden method
        c2.showChildTwoMessage(); // child’s own method
    }
}
