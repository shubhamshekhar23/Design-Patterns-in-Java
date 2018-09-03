public class OrVoice implements VoiceInputPlan
{
    VoiceInputPlan v1;
    VoiceInputPlan v2;

    OrVoice(VoiceInputPlan v1, VoiceInputPlan v2)
    {
        this.v1 = v1;
        this.v2 = v2;
    }

    public Boolean interpret(String input) {
        if(this.v1.interpret(input) || this.v2.interpret(input)){
            System.out.println("Successfully interpreted the OR");
            return true;
        }else{
            System.out.println("Could not interpret it");
            return false;
        }
    }
}