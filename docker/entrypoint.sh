#!/bin/bash -eux

IP=$(dig +short myip.opendns.com @resolver1.opendns.com)
curl --header "x-api-key: $KEY" -d "\"$IP\"" $END_POINT
