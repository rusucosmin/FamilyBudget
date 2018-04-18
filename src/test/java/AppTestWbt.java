import controller.MemberController;
import junit.framework.TestCase;
import model.Entry;
import repository.MemberRepository;

public class AppTestWbt extends TestCase {
  private MemberRepository rep;
  private MemberController ctrl;

  public void test_tc_1_GetAllEntries() {
    rep = new MemberRepository("src/test/java/membersF.txt", "src/test/java/budgetF.txt");
    ctrl = new MemberController(rep);
    assertEquals(3, ctrl.allEntries().size());
  }

  public void test_tc_2_ControllerLoads() {
    rep = new MemberRepository("src/test/java/membersF.txt", "src/test/java/budgetF.txt");
    ctrl = new MemberController(rep);
    assertEquals(3, ctrl.allEntries().size());
  }

  public void test_tc_3_S3_True() {
    rep = new MemberRepository("src/test/java/membersF.txt", "src/test/java/budgetF.txt");
    ctrl = new MemberController(rep);
    assertEquals(true, ctrl.hasMinimumEconomySalary());
  }

  public void test_tc_4_Path1() {
    rep = new MemberRepository("src/test/java/membersF1.txt", "src/test/java/budgetF1.txt");
    ctrl = new MemberController(rep);
    assertEquals(0, ctrl.getNumberOfExpensiveEntries());
  }

  public void test_tc_5_Loop1() {
    rep = new MemberRepository("src/test/java/membersF.txt", "src/test/java/budgetF.txt");
    ctrl = new MemberController(rep);
    assertEquals(1, ctrl.getNumberOfExpensiveEntries());
  }

  public void test_tc_5_Loop2() {
    rep = new MemberRepository("src/test/java/membersF2.txt", "src/test/java/budgetF2.txt");
    ctrl = new MemberController(rep);
    assertEquals(1, ctrl.getNumberOfExpensiveEntries());
  }
}
