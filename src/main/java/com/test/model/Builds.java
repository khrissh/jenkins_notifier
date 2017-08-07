package com.test.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Builds {

   private String name;
   private String url;
   private Build build;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getUrl() {
      return url;
   }

   public void setUrl(String url) {
      this.url = url;
   }

   public Build getBuild() {
      return build;
   }

   public void setBuild(Build build) {
      this.build = build;
   }

   public class Build {
      private String full_url;
      private String number;
      private String phase;
      private String queue_id;
      private String url;
      private Scm scm;
      private Parameters parameters;
      private String log;
      private Artifacts artifacts;

      public String getFull_url() {
         return full_url;
      }

      public void setFull_url(String full_url) {
         this.full_url = full_url;
      }

      public String getNumber() {
         return number;
      }

      public void setNumber(String number) {
         this.number = number;
      }

      public String getPhase() {
         return phase;
      }

      public void setPhase(String phase) {
         this.phase = phase;
      }

      public String getQueue_id() {
         return queue_id;
      }

      public void setQueue_id(String queue_id) {
         this.queue_id = queue_id;
      }

      public String getUrl() {
         return url;
      }

      public void setUrl(String url) {
         this.url = url;
      }

      public Scm getScm() {
         return scm;
      }

      public void setScm(Scm scm) {
         this.scm = scm;
      }

      public Parameters getParameters() {
         return parameters;
      }

      public void setParameters(Parameters parameters) {
         this.parameters = parameters;
      }

      public String getLog() {
         return log;
      }

      public void setLog(String log) {
         this.log = log;
      }

      public Artifacts getArtifacts() {
         return artifacts;
      }

      public void setArtifacts(Artifacts artifacts) {
         this.artifacts = artifacts;
      }

      public class Scm {
         private String url;
         private String branch;
         private String commit;

         public String getUrl() {
            return url;
         }

         public void setUrl(String url) {
            this.url = url;
         }

         public String getBranch() {
            return branch;
         }

         public void setBranch(String branch) {
            this.branch = branch;
         }

         public String getCommit() {
            return commit;
         }

         public void setCommit(String commit) {
            this.commit = commit;
         }

         @Override
         public String toString() {
            return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
         }

      }

      public class Parameters {
         private String environment;
         private String remoteWebDriver;
         private String browser;

         public String getEnvironment() {
            return environment;
         }

         public void setEnvironment(String environment) {
            this.environment = environment;
         }

         public String getRemoteWebDriver() {
            return remoteWebDriver;
         }

         public void setRemoteWebDriver(String remoteWebDriver) {
            this.remoteWebDriver = remoteWebDriver;
         }

         public String getBrowser() {
            return browser;
         }

         public void setBrowser(String browser) {
            this.browser = browser;
         }

         @Override
         public String toString() {
            return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
         }

      }

      public class Artifacts {
         private AsgardWar asgardWar;
         private AsgardStandaloneJar asgardStandaloneJar;

         public AsgardWar getAsgardWar() {
            return asgardWar;
         }

         public void setAsgardWar(AsgardWar asgardWar) {
            this.asgardWar = asgardWar;
         }

         public AsgardStandaloneJar getAsgardStandaloneJar() {
            return asgardStandaloneJar;
         }

         public void setAsgardStandaloneJar(AsgardStandaloneJar asgardStandaloneJar) {
            this.asgardStandaloneJar = asgardStandaloneJar;
         }

         public class AsgardWar {
            private String archive;

            public String getArchive() {
               return archive;
            }

            public void setArchive(String archive) {
               this.archive = archive;
            }

            @Override
            public String toString() {
               return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
            }

         }

         public class AsgardStandaloneJar {
            private String archive;
            private String s3;

            public String getArchive() {
               return archive;
            }

            public void setArchive(String archive) {
               this.archive = archive;
            }

            public String getS3() {
               return s3;
            }

            public void setS3(String s3) {
               this.s3 = s3;
            }

            @Override
            public String toString() {
               return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
            }

         }

         @Override
         public String toString() {
            return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
         }


      }

      @Override
      public String toString() {
         return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
      }

   }

   @Override
   public String toString() {
      return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
   }

}

