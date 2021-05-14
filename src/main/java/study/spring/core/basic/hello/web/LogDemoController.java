package study.spring.core.basic.hello.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import study.spring.core.basic.hello.common.MyLogger;

@Controller
@RequiredArgsConstructor
public class LogDemoController {

	private final LogDemoService logDemoService;
	private final MyLogger myLogger;

	@RequestMapping("log-demo")
	@ResponseBody
	public String logDemo(HttpServletRequest request) throws InterruptedException {
		String requestURL = request.getRequestURL().toString();
		System.out.println("myLogger = " + myLogger.getClass());
		myLogger.setRequestUrl(requestURL);

		myLogger.log("controller test");
		Thread.sleep(1000);
		logDemoService.logic("testID");
		return "OK";
	}
}
