package com.eialid.springboot.courserestapi.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    public TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getSingleTopic(@PathVariable String id){
        return topicService.getSingleTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addNewTopic(@RequestBody Topic topic){
        topicService.addNewTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@PathVariable  String id, @RequestBody Topic topic){
        topicService.updateTopic(id,topic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "topics/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }
}
