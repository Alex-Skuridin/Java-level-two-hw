package com.batiaev.java2.lesson1.homework;

import com.batiaev.java2.lesson1.Cat;
import com.batiaev.java2.lesson1.Dog;

public class Course {
    private Barrier[] barriers;

    public Course(Barrier[] barriers) {
        this.barriers = barriers;
    }



    protected void doIt(Team team) {
//        Member[] members = team.getMembers();
//        for (int i = 0; i < members.length; i++) {
//            Member member = members[i];
//
//        }


        for (Member member : team.getMembers()) {
            boolean result = true;
            for (Barrier barrier : barriers) {
                result &= barrier.doIt(member);
            }
            member.setResult(result);
        }
    }
}
