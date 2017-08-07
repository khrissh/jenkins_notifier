package com.test.data.entity;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Job {

   @Id
   private String name;
   private List<Build> builds;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public List<Build> getBuilds() {
      return builds;
   }

   public void setBuilds(List<Build> builds) {
      this.builds = builds;
   }

   @Override
   public String toString() {
      return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
   }
}
