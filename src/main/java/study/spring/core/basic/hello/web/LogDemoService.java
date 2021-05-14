package study.spring.core.basic.hello.web;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import study.spring.core.basic.hello.common.MyLogger;

@Service
@RequiredArgsConstructor
public class LogDemoService {

	private final ObjectProvider<MyLogger> myLoggerProvider;

	public void logic(String id) {
		MyLogger myLogger  = myLoggerProvider.getObject();
		myLogger.log("service id  = " + id);
	}
}
