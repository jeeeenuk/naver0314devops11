package day0326;

interface StudyInter{
    public void javaStudy();
    public void springStudy();
}
interface PlayInter{
    public void run();
    public void game();
}
class MyStudy implements StudyInter{
    @Override
    public void javaStudy() {
        System.out.println("Java-Study");
    }

    @Override
    public void springStudy() {
        System.out.println("Spring-Study");
    }
}
class MyPlay implements PlayInter{
    @Override
    public void run() {
        System.out.println("Run");
    }

    @Override
    public void game() {
        System.out.println("Game");
    }
}
public class Ex07Interface {
    public static void study(StudyInter studyInter){
        studyInter.javaStudy();
        studyInter.springStudy();
    }
    public static void play(PlayInter playInter){
        playInter.game();
        playInter.run();
    }
    public static void main(String[] args) {
        study(new MyStudy());
        play(new MyPlay());
    }
}
