package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class TopicService {
	

	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring", "Spring Framework", "SF Desc"),
			new Topic("rails", "Rails Framework", "Rails Desc"),
			new Topic("django", "Django Framework", "Django Desc")
			));
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getTopic(String id) {
//		iterate over a list and run a map on the id
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	
	public void updateTopic(Topic topic, String id) {
		for(int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
	}
	
	
	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
	}

}
