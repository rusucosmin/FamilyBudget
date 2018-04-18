package controller;

import repository.MemberRepository;

import model.Member;
import model.Entry;



import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MemberController {
	
    private MemberRepository mr;
    
    public MemberController(MemberRepository newMr){    	
    	this.mr =newMr;    	
    }
    
    public void addMember(Member aMemebr) {
        mr.addMember(aMemebr);    	
    }

    public void addEntry(Entry oneEntry) {
        mr.addEntry(oneEntry);    	
    }

    public List<Entry> allEntries() {
        List<Entry> allE = new ArrayList<Entry>();
        allE = this.mr.getAllEntries();
        return allE;
    }

    public int getNumberOfExpensiveEntries() {
      int cnt = 0;
      for(Entry e : this.mr.getAllEntries()) {
        if(e.getValue() >= 2000) {
          ++ cnt;
        }
      }
      return cnt;
    }

    public boolean hasMinimumEconomySalary() {
      for(Entry e: this.mr.getAllEntries()) {
          if(e.getType().equals("income") && e.getValue() >= 2000) {
              return true;
          }
      }
      return false;
    }
}