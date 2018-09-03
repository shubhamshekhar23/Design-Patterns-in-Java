public class Transformer {
    RollBehaviour rb;
    JumpBehaviour jb;
    KickBehaviour kb;

    Transformer() {
        this.rb = new BasicRoll();
        this.jb = new BasicJump();
        this.kb = new BasicKick();
    }

    public void setRoll(RollBehaviour rb) {
        this.rb = rb;
    }

    public void setJump(JumpBehaviour jb) {
        this.jb = jb;
    }

    public void setKick(KickBehaviour kb) {
        this.kb = kb;
    }

    public void performAction() {
        this.rb.action();
        this.jb.action();
        this.kb.action();
    }
}