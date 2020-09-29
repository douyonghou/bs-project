package org.system.service.impl;

import java.util.List;

import org.system.dao.DiscussionDao;
import org.system.pojo.Discussion;
import org.system.service.DiscussionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscussionServiceImpl implements DiscussionService {

	@Autowired
	private DiscussionDao dd;
	public List<Discussion> queryAllDiscussions() {
		return dd.queryAllDiscussions();
	}

	public Discussion queryDiscussionByDiscussionById(String id) {
		return dd.queryDiscussionByDiscussionById(id);
	}

	@Override
	public List<Discussion> queryDiscussionByDiscussionName(String name) {
		return dd.queryDiscussionByDiscussionName(name);
	}

	@Override
	public void addDiscussion(String topic, String name, String teacherId, String studentId,
			String teacherWords, String studentWords) {
		dd.addDiscussion(topic, name, teacherId, studentId, teacherWords, studentWords);
		
	}

}
