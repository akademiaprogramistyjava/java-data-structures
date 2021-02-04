package pl.szymonleyk.queue;

public class PersonQueue {
    private Person[] persons = new Person[10];
    private int qptr;
    private int qcnt;

    public boolean empty(){
        return qcnt == 0;
    }
}
