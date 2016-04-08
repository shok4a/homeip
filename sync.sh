#!/bin/bash
hostedZoneId=$(aws route53 list-hosted-zones | jq '.HostedZones[] | select(.Name == "homeip1.net.")' | jq -r '.Id')
currentRegisteredIpAddress=$(aws route53 list-resource-record-sets --hosted-zone-id $hostedZoneId | jq --arg DOMAIN_NAME $DOMAIN_NAME '.ResourceRecordSets[] | select(.Type == "A") | select(.Name == "[$DOMAIN_NAME].")' | jq '.ResourceRecords[].Value')
echo $currentRegisteredIpAddress
