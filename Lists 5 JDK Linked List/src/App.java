import java.util.Iterator;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);

        printList(list);

        list.add(billEnd);
        list.remove();

        printList(list);
    }

    private static void printList(LinkedList<Employee> list) {
        Iterator iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()){
            System.out.print(iter.next());
            if (iter.hasNext()) {
                System.out.print(" <=> ");
            }
        }
        System.out.println(" -> NULL");
    }
}
