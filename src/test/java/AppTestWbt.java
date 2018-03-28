import controller.MemberController;
import junit.framework.TestCase;
import model.Entry;
import repository.MemberRepository;

public class AppTestWbt extends TestCase {
  private MemberRepository rep;
  private MemberController ctrl;

  public void testControllerGetAllEntries() {
    rep = new MemberRepository("src/test/java/membersF.txt", "src/test/java/budgetF.txt");
    ctrl = new MemberController(rep);
    assertEquals(3, ctrl.allEntries().size());
  }

  public void testControllerLoads() {
    rep = new MemberRepository("src/test/java/membersF.txt", "src/test/java/budgetF.txt");
    ctrl = new MemberController(rep);
    assertEquals(3, ctrl.allEntries().size());
    Entry one = ctrl.allEntries().get(0);
    Entry two = ctrl.allEntries().get(1);
    Entry three = ctrl.allEntries().get(2);
    assertEquals(one.getType(), "salary");
    assertEquals(one.getIdMember(), 1);
    assertEquals(one.getValue(), 10);
    assertEquals(two.getType(), "salary");
    assertEquals(two.getIdMember(), 2);
    assertEquals(two.getValue(), 100);
    assertEquals(three.getType(), "salary");
    assertEquals(three.getIdMember(), 3);
    assertEquals(three.getValue(), 100);
  }
}
