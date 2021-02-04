package pl.szymonleyk.queue;

public class PersonQueue {
    private Person[] persons = new Person[10];
    private int qptr;
    private int qcnt;

    public boolean empty(){
        return qcnt == 0;
    }

    public Person front(){
        if(!empty()){
            return persons[qptr];
        }
        return null;
    }

    public void push(Person person){
        if(qcnt != persons.length){
            int i = qptr + qcnt;
            if(i >= persons.length){
                i -= persons.length;
            }
            persons[i] = person;
            qcnt++;
        }
    }

    public void pop(){
        if(!empty()){
            qcnt--;
            qptr++;
            if(qptr == persons.length){
                qptr = 0;
            }
        }
    }
}
