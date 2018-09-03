public class VoiceInput implements VoiceInputPlan
{
    String data;
    VoiceInput( String data)
    {
        this.data = data;
    }
    public Boolean interpret(String input)
    {
        if(input.contains(this.data)){
            return true;
        }
        return false;
    }
}