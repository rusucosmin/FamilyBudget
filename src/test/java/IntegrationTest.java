import controller.MemberController;
import junit.framework.TestCase;
import model.Entry;
import model.Member;
import repository.MemberRepository;

public class IntegrationTest extends TestCase {
  public void testA() throws Exception {
    MemberRepository mr = new MemberRepository("", "");
    mr.addMember(new Member("cosmin", "1"));
    assertEquals(mr.getAllMembers().size(), 1);
  }

  public void testAB() throws Exception {
    MemberRepository mr = new MemberRepository("", "");
    mr.addMember(new Member("cosmin", "1"));
    assertEquals(mr.getAllMembers().size(), 1);
    mr.addEntry(new Entry("type", 10, 1));
    assertEquals(mr.getAllEntries().size(), 1);
  }

  public void testABC() throws Exception {
    MemberRepository mr = new MemberRepository("", "");
    mr.addMember(new Member("cosmin", "1"));
    assertEquals(mr.getAllMembers().size(), 1);
    mr.addEntry(new Entry("type", 10, 1));
    assertEquals(mr.getAllEntries().size(), 1);
    mr.addMember(new Member("cosmin", "1"));
    assertEquals(mr.getAllEntries().get(0).getValue(), 10);
  }

  public void testIntegrationAll() throws Exception {
    MemberRepository rep = new MemberRepository("src/test/java/membersF.txt", "src/test/java/budgetF.txt");

  }
}
