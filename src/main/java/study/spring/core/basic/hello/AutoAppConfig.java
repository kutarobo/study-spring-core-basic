package study.spring.core.basic.hello;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class) // 예제에 존재하는 AppConfig와 설정이 꼬이는 것을 방지하기 위해 예외처리
)
public class AutoAppConfig {
}
