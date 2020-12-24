class Memento
{
    public static void main(String args[])
    {
        CarSoftwareStatus cs1 = new CarSoftwareStatus("change1", "correction1");

        CurrentSoftwareStatus css1 = new CurrentSoftwareStatus(cs1);
        CarSoftwareMemento csm = css1.createMemento();
        SoftwareCareTaker sct = new SoftwareCareTaker();
        sct.add(csm);
        css1.setCorrection("correct2");
        sct.add(css1.createMemento());
        // css1.setNewChange("change2");
        sct.add(css1.createMemento());

        css1.setStatusFromMemento(sct.getMemento(0));
        css1.getDetails();
    }
}

/* This has 3 parts - memento( that has the state of an object), originator(CarSoftwarestatus - that can create memento and stores the current state of the object) and other is caretaker(that stores the list of memento and return whichever is required); the memento that caretaker provies can be used to set the current status of the software; this pattern can be used just like in git */