package org.system.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.system.pojo.Discussion;

public interface DiscussionDao {
     public List<Discussion> queryAllDiscussions();
     public Discussion queryDiscussionByDiscussionById(String id);
     public List<Discussion> queryDiscussionByDiscussionName(String name);
     public void addDiscussion(@Param("topic")String topic,@Param("name")String name,
    		 @Param("teacherId")String teacherId,@Param("studentId")String studentId,
    		 @Param("teacherWords")String teacherWords,@Param("studentWords")String studentWords);
     
}
