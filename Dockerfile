From openjdk:17
copy ./target/tweetapp-0.0.1-SNAPSHOT.jar tweetapp-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","tweetapp-0.0.1-SNAPSHOT.jar"]
