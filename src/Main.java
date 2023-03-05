import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        List<Person> clients = generateClients();
        Queue<Person> queue = new LinkedList<>(clients);

        while (!queue.isEmpty()) {
            Person person = queue.poll();
            System.out.println(person.getName() + " " + person.getSurname() + " прокатился на аттракционе.");
            int tickets = person.getTickets() - 1;
            person.setTickets(tickets);
            if (tickets > 0) {
                queue.offer(person);
            }
        }
    }

    public static List<Person> generateClients() {
        List<Person> clients = new ArrayList<>();
        clients.add(new Person("Миодраг", "Божович", 3));
        clients.add(new Person("Иван", "Сусанин", 2));
        clients.add(new Person("Ольга", "Полякова", 4));
        clients.add(new Person("Джон", "Малкович", 5));
        clients.add(new Person("Джуд", "Лоу", 1));
        return clients;
    }
}