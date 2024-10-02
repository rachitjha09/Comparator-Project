import java.util.Arrays;
import java.util.Comparator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cat pride[] = {
                new Cat("Franklin", 10),
                new Cat(),
                new Cat("Winston", 2),
                new Cat("Felix", 8),
                new Cat(),
                new Cat()
        };
        Arrays.sort(pride, new Comparator<Cat>() {
            @Override
            public int compare(Cat c1, Cat c2) {
                if(c1.getLives()<c2.getLives()){
                    return 1;
                } else if(c1.getLives()>c2.getLives()){

                    return -1;
                } else{
                    return c1.getName().compareTo(c2.getName());
                }
            }
        });
        for(Cat c:pride){
            System.out.println(c);
        }
    }
}