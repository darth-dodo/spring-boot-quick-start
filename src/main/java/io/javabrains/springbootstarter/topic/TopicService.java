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
	
	public Topic getTopic(String id) {
//		iterate over a list and run a map on the id
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

}
