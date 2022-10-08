package com.example.Yas;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = Arrays.asList(new Topic("Spring", " Spring Framework", "Spring framework description"),
			new Topic("Java", " Java Framework", "Java framework description"),
			new Topic("Javascript", " Javascript Framework", "Javascript framework description"));

	public List<Topic> getAllTopic() {
		return topics;
	}

	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
}
