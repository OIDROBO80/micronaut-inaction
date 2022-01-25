FROM amazonlinux:latest

VOLUME /tmp

# Install packages AWS CLI 2.x
RUN curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip";  \
    yum install unzip -y; \
    unzip awscliv2.zip;\
    ./aws/install -i /usr/local/aws-cli -b /usr/local/bin; \
    aws --version
COPY build/native-image/application docker/run.sh /

RUN bash -c 'touch /application' \
    && chmod 755 /run.sh &&  chmod u+x application

ENTRYPOINT ["./run.sh"]
