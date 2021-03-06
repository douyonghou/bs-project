package org.system.service;

import java.util.List;

import org.system.pojo.Discussion;

public interface DiscussionService {
    public List<Discussion> queryAllDiscussions();
    public Discussion queryDiscussionByDiscussionById(String id);
    public List<Discussion> queryDiscussionByDiscussionName(String name);
    public void addDiscussion(String topic,String name,String teacherId,String studentId,
   		             String teacherWords,String studentWords);
}
