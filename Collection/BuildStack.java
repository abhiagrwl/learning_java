import java.util.*;
class BuildStack {
    public static void main(String[] args) {
        Stack<String> animals= new Stack<>();

        // Add elements to Stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Stack: " + animals);
	String element = animals.pop();
        System.out.println("Removed Element: " + element);
        System.out.println("Stack: " + animals);
    }
}
