package pl.com.tkarolczyk.collection.map;
import pl.com.tkarolczyk.equals_and_hashcode.Person;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
public class FindingPersonsExample {
    public static void main(String[] args) {
        Map<String, Person> ids = new HashMap<>();
        ids.put("80", new Person("dd", "karolczyk", 25));
        ids.put("81", new Person("tdddomasz", "karolczyk", 255));
        ids.put("82", new Person("toggmasz", "karolczyk", 7));
        ids.put("83", new Person("tomdfvasz", "karolczyk", 5));
        ids.put("84", new Person("tomdvdfvasz", "karolczyk", 6));
        ids.put("85", new Person("tomdfvdvasz", "karolczyk", 29));
        ids.put("86", new Person("tomwerasz", "karolczyk", 18));
        ids.put("87", new Person("rujujuj", "karolczyk", 58));
        ids.put("88", new Person("tomawersz", "karolczyk", 60));
        ids.put("89", new Person("tomasz", "karolczyk", 45));
        Person curretPerson;
        List<Person> newList = new LinkedList<>();
        for(String a : ids.keySet()){
            curretPerson = ids.get(a);
            if (curretPerson.getAge() < 25) {
                newList.add(curretPerson);
            }
        }
        for (Person p : newList) {
            System.out.println("Young person: " + p);
        }
    }
}

