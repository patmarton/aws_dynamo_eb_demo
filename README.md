# aws_dynamo_eb_demo
Demo project for connecting a Spring Boot Rest API to AWS DynamoDB and Elastic Beanstalk

<b>Requirements</b>

    1. AWS DynamoDB with a Table named "person" and a primary key "personId" (can be changed from code)
    2. AWS Elastic Beanstalk with Java 8 running on 64bit Amazon Linux
    3. Spring Boot
    4. Lombok Library


Example request:

    {
      "name":"Panna",
      "email":"panna@gmail.com",
      "age":23,
      "address":{
        "city":"Dallas",
        "state":"Texas",
        "pinCode":"560037"
      }
    }
    
Example response:

    {
        "personId":"940cc5d7-14f1-4774-b2ce-64175d5c53c4",
        "name":"Panna",
        "age":23,
        "email":"panna@gmail.com",
        "address":{
          "city":"Dallas",
          "state":"Texas",
          "pinCode":560037
          }
    }
