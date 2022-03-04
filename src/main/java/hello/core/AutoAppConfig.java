package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        //basePackages = "hello.core.member",
        //basePackageClasses = AutoAppConfig.class,

        // basePackage를 지정하지 않으면 @ComponentScan이 붙은 설정정보 클래스의 패키지가 시작 위치가 된다.

        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
) //예제 코드를 살리기 위해서
public class AutoAppConfig {

    /*@Bean(name="memoryMemberRepository")
    MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }*/

}
