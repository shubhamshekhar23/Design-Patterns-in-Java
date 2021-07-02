class Main
{
    public static void main(String args[])
    {
        Transformer t = new Transformer();
        t.setJump(new SuperJump());
        t.setKick(new SuperKick());
        t.performAction();
    }
}

/* This example has a transformer that can perform 3 actions kick,jump and roll; each action has 2 types basic and super; so created a class
separated for each behaviour and then setting the transformer properties with these objects at runtime; and then letting it perfrom action */