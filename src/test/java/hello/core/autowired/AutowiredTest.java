package hello.core.autowired;

import hello.core.member.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.lang.Nullable;

import java.util.Optional;

public class AutowiredTest {
    @Test
    void AutowiredOption(){
        ApplicationContext ac  = new AnnotationConfigApplicationContext(TestBean.class);
    }

    static class TestBean {
        //의존관계가 없으면 메소드가 호출되지 않음
        @Autowired(required = false)
        public void setNoBean1(Member noBean1){
            System.out.println("noBean1 = " + noBean1);
        }
        
        //호출은 되나 null로 값이 출력
        @Autowired
        public void setNoBean2(@Nullable Member noBean2){
            System.out.println("noBean2 = " + noBean2);
        }
        
        //의존성이 없으면 Optional.empty로 출력
        @Autowired
        public void setNoBean3(Optional<Member> noBean3){
            System.out.println("noBean3 = " + noBean3);
        }
    }
}
