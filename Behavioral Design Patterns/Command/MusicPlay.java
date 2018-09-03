public class MusicPlay implements CommandPlan
{
    MusicSystem ms;
    MusicPlay(MusicSystem ms)
    {
        this.ms = ms;
    }
    public void execute()
    {
        this.ms.powerOn();
        this.ms.selectSong();
        this.ms.playSong();
    }
}