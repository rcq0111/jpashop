package jpabook.jpashop;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue // 식별자를 id mapping을 해주고 GeneratedValue로 자동 생성하게 해준다
    private long id;
    private String username;
}
