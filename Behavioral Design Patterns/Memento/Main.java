class Main
{
    public static void main(String args[])
    {
        CarSoftwareStatus css1 = new CarSoftwareStatus("change1", "correction1");

        SoftwareCareTaker sct = new SoftwareCareTaker();
        
        sct.add(css1.createMemento());
        css1.setCorrection("correct2");
        sct.add(css1.createMemento());
        css1.setNewChange("change2");
        sct.add(css1.createMemento());

        css1.setStatusFromMemento(sct.getMemento(0));
        css1.getDetails();
        
        css1.setStatusFromMemento(sct.getMemento(1));
        css1.getDetails();
        
        css1.setStatusFromMemento(sct.getMemento(2));
        css1.getDetails();
    }
}


/* OUTPUT - 

Change :change1 ; Correction : correction1  
Change :change1 ;  Correction : correct2 
Change :change2 ;  Correction : correct2 

*/



/* This has 3 parts - memento( that has the state of an object), originator(CarSoftwarestatus - that can create memento and stores the current state of the object) and other is caretaker(that stores the list of memento and return whichever is required); the memento that caretaker provies can be used to set the current status of the software; this pattern can be used just like in git */