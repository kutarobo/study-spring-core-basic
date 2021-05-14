package study.spring.core.basic.hello.web;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import study.spring.core.basic.hello.common.MyLogger;

@Service
@RequiredArgsConstructor
public class LogDemoService {

	private final MyLogger myLogger;

	public void logic(String id) {
		myLogger.log("service id  = " + id);
	}
}
