package com.example.Yas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicServise;
	
	@RequestMapping("/topics")
	public List<Topic> gettAllTopics() {
		return topicServise.getAllTopic();
	}
		@RequestMapping("/topics/{id}")
		public Topic getTopic (@PathVariable String id) {
			return topicServise.getTopic(id);
			
		}
	
	}
	
	
