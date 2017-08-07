package com.test.service;


import com.test.data.entity.Build;
import com.test.data.entity.Job;
import com.test.data.repository.BuildRepository;
import com.test.data.repository.JobRepository;
import com.test.model.Builds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@Service("jenkins_notifier")
public class JenkinsService {

   @Autowired
   BuildRepository buildRepository;
   @Autowired
   JobRepository jobRepository;

   public Job setBuildForUser(Builds builds) {

      Build build = new Build();
      build.setBuildNumber(builds.getBuild().getNumber());
      build.setDate(LocalDate.now());

      Job job = new Job();
      job.setName(builds.getName());

      if (jobRepository != null && jobRepository.exists(builds.getName())) {
         List<Build> buildList = jobRepository.findOne(builds.getName()).getBuilds();
         buildList.add(build);
         job.setBuilds(buildList);
         jobRepository.save(job);
      } else {
         List<Build> buildList = new ArrayList<>();
         buildList.add(build);
         job.setBuilds(buildList);
         jobRepository.insert(job);
      }

      return job;
   }

   public Map<String, Integer> getBuilds(String jobName) {
      try {
         List<Build> builds = jobRepository.findOne(jobName).getBuilds();
         Map<String, Integer> buildsPerMonth = new HashMap<>();
         builds.forEach(b -> {
            String month = b.getDate().format(DateTimeFormatter.ofPattern("MMMM yyyy"));
            if (buildsPerMonth.isEmpty() || !buildsPerMonth.containsKey(month)) {
               buildsPerMonth.put(month, 1);
            } else {
               int numberOfBuilds = buildsPerMonth.get(month);
               buildsPerMonth.replace(month, numberOfBuilds + 1);
            }
         });
         return buildsPerMonth;

      } catch (NullPointerException e) {
         Logger.getGlobal().warning("Job name " + jobName + "does not exists in database");
         throw new NullPointerException();
      }


   }
}
