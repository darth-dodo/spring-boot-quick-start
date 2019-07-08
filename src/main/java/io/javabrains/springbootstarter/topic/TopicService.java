package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class TopicService {
	

	private List<Topic> topics = Arrays.asList(
			new Topic("spring", "Spring Framework", "SF Desc"),
			new Topic("rails", "Rails Framework", "Rails Desc"),
			new Topic("django", "Django Framework", "Django Desc")
			);
	
	public List<Topic> getAllTopics() {
		return topics;
	}

}
