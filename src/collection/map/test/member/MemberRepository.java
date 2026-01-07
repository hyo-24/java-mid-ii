package collection.map.test.member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {

       private Map<String,Member> memberMap = new HashMap<>();

    public void save(Member member) {
        memberMap.put(member.getId(),member);
    }

    public void remove(String id) {
        memberMap.remove(id);
    }

    public Member findById(String id) {
        return memberMap.get(id);
    }

    public Member findByName(String name) {
        for (Member member : memberMap.values()) {
            if (member.getName().equals(name)) {
                return member; // return 이면 메서드 종료
            }
        }
        return null; // 싹 다 돌았는데도 없으면 null
    }
}
