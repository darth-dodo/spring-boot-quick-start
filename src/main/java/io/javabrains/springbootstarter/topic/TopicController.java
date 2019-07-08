package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("spring", "Spring Framework", "SF Desc"),
				new Topic("rails", "Rails Framework", "Rails Desc"),
				new Topic("django", "Django Framework", "Django Desc")
				);
	}
}
