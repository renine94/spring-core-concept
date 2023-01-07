package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

// 기존에 있던 AppConfig 의 설정정보는 읽지 않기 위해서 옵션을 주었음.
@Configuration
@ComponentScan(
        basePackages = "hello.core",  // 스캔을 시작할 디폴트 시작위치를 정한다. (라이브러리까지 탐색하는것을 방지)
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {
}
