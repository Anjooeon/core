package hello.core.annotation;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@Qualifier("mainDiscountPolicy")
//annotaion 만들기!! text를 쓰다보면 오타가 날 수도 있으니까~~
//왠만하면 기본 annotation을 쓰는 것이 좋다.
public @interface MainDiscountPolicy {

}
