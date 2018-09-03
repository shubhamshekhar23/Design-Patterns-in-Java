class Strategy
{
    public static void main(String args[])
    {
        Transformer t = new Transformer();
        t.setJump(new SuperJump());
        t.setKick(new SuperKick());
        t.performAction();
    }
}

/* this example has a transformer that can perform 3 actions kick,jump and roll; each action has 2 types basic and super; so craeted a class
separated for each behaviour ands then setting the transforer properties with these objects at runtime; and then letting the perfrom action */