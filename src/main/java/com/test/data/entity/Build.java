package com.test.data.entity;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;


@Document
public class Build {
   @Id
   private String buildNumber;
   private LocalDate date;

   public String getBuildNumber() {
      return buildNumber;
   }

   public void setBuildNumber(String buildNumber) {
      this.buildNumber = buildNumber;
   }

   public LocalDate getDate() {
      return date;
   }

   public void setDate(LocalDate date) {
      this.date = date;
   }

   @Override
   public String toString() {
      return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
   }

}
