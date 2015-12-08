FROM ubuntu:14.04.3

RUN apt-get update -y && apt-get upgrade -y && apt-get install -y dnsutils curl
COPY ip.sh /
CMD ["./ip.sh"]
