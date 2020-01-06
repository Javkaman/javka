package samouczek.programisty.publiczny;

public class MaliciousUser {
    public void countMyVisit(PublicCounter cojones){

        cojones.increment();
        cojones.userCount = -10;
    }
}
