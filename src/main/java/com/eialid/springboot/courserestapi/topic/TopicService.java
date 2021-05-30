package com.eialid.springboot.courserestapi.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

//  hardcoded collection of Topics
//  creating a 'new ArrayList' object since Arrays.asList() gives an immutable list which is not changeable. By 'new ArrayList', we are just creating a copy of of that immutable list which is changeable now.
    List<Topic> topics=new ArrayList<>(Arrays.asList(
            new Topic("cse320","Networking","first course of data communications"),
            new Topic("cse321","Operating System","first course of computer OS"),
            new Topic("cse341","Computer Architecture","only course of computer architecture")
    ));


    public List<Topic> getAllTopics(){
        return topics;
    }

    public Topic getSingleTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }


    public void addNewTopic(Topic topic) {
            topics.add(topic);
        }

    public void updateTopic(String id, Topic topic) {
        for (int i=0; i<topics.size(); i++){
            Topic iteratedTopic=topics.get(i);
            if (iteratedTopic.getId().equals(id)){
                topics.set(i,topic);
            }
        }
    }

    public void deleteTopic(String id) {
        topics.removeIf(t -> t.getId().equals(id));
    }
}

