package day01;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Concert {
    private List<Person> personList = new ArrayList<>();

    public void addPerson(Person person){
        LocalTime yourEntry = LocalTime.of(20,00);
        if(yourEntry.isBefore(person.getTicket().getTimeOfConcert().toLocalTime()) &&
//                person.getTicket().entryTime().isAfter(person.getTicket().entryTime())){
                yourEntry.isAfter(person.getTicket().entryTime())){
            personList.add(person);
        }
    }

    public List<Person> getPersonList() {
        return personList;
    }
}
