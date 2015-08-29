#!/bin/bash
sbt assembly
aws s3 cp target/scala-2.11/home-ip-assembly-0.1-SNAPSHOT.jar s3://homeip1/
aws lambda update-function-code --region us-east-1 --function-name sample2 --s3-bucket homeip1 --s3-key home-ip-assembly-0.1-SNAPSHOT.jar
