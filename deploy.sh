#!/bin/bash -x
sbt assembly
aws s3 cp target/scala-2.11/home-ip-assembly-0.1-SNAPSHOT.jar s3://homeip1/
