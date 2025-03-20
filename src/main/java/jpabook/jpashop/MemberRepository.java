package jpabook.jpashop;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository // component scan의 대상
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(Member member){
        em.persist(member); // command와 query를 분리하라 side effect 조심
        return member.getId();
    }

    public Member find(Long id){
        return em.find(Member.class, id);
    }
    // shift ctrl T -> Navigate : test code만들기
}
