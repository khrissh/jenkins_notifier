package com.test.controller;

import com.test.data.entity.Job;
import com.test.model.Builds;
import com.test.service.JenkinsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(value = "/api")
public class JenkinsServiceController {

   @Autowired
   private JenkinsService jenkinsService;

   @RequestMapping(value = "/saveBuild", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity<Job> addBuildToDatabase(@RequestBody Builds builds) {
      return new ResponseEntity<>(jenkinsService.setBuildForUser(builds), HttpStatus.OK);
   }

   @RequestMapping(value = "/getBuilds", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity<Map<String, Integer>> getBuildsByMonthFromDatabase(@RequestParam("jobName") String jobName) {
      return new ResponseEntity<>(jenkinsService.getBuilds(jobName), HttpStatus.OK);
   }
}

