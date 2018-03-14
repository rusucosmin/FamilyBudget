package repository;

import junit.framework.TestCase;
import model.Entry;
import model.Member;

public class MemberRepositoryTest extends TestCase {
  public void testAddMember() throws Exception {
    MemberRepository mr = new MemberRepository();
    mr.addEntry(new Entry("type", 10, 1));
    mr.addEntry(new Entry("type", 20, 1));
    assertEquals(mr.getAllEntries().size(), 2);
  }

  public void testAddEntry() throws Exception {
    MemberRepository mr = new MemberRepository();
    mr.addMember(new Member("cosmin", "1"));
    mr.addMember(new Member("raluca", "2"));
    assertEquals(mr.getAllEntries().size(), 0);
  }

  public void testGetAllEntries() throws Exception {
    MemberRepository mr = new MemberRepository();
    mr.addMember(new Member("cosmin", "1"));
    mr.addMember(new Member("raluca", "2"));
    mr.addEntry(new Entry("type", 10, 1));
    mr.addEntry(new Entry("type", 20, 1));
    mr.addEntry(new Entry("type", 30, 1));
    assertEquals(mr.getAllEntries().size(), 3);
  }

}