package study.spring.core.basic.hello.autowired;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.lang.Nullable;

import study.spring.core.basic.hello.member.Member;

public class AutowiredTest {

	 @Test
	void AutowiredOption() {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
	}

	static class TestBean {

		@Autowired(required = false)
		public void setBean1(Member noBean1) {
			System.out.println("noBean1 = " + noBean1);
		}

		@Autowired
		public void setBean2(@Nullable Member noBean2) {
			System.out.println("noBean2 = " + noBean2);
		}

		@Autowired
		public void setBean3(Optional<Member> noBean3) {
			System.out.println("noBean3 = " + noBean3);
		}

	}

}
