Pre-requisites

1. Jenkins with installed Notification Plugin
2. MongoDB

Setup

1. Start MongoDB using command:  mongod.exe --dbpath "path to mongo data", for example "D:\Training\mongodata"
2. Run jenkins notification service by running Test Application class.
   Adjust port if needed in application.properties
3. Setup service url in Jenkins, for example: https://www.screencast.com/t/GaJzLiBaz

Usage

Run Jenkins job. Information about number of builds by months will be collected in MongoDB.
For example:
{
 "April 2017": 20,
 "May 2017": 12
}

To get this information use getBuilds service, for example
http://host:8081/api/getBuilds?jobName=UI%20TESTS%20Smoke%20suite%20-%20maintenance%20stable

Note, that white spaces in job name should be replaced on "%" sign,
the same as it is displayed in Jenkins url on job.