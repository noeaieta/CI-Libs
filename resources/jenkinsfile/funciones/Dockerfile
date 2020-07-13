FROM ubuntu:latest
MAINTAINER eltano <ghcetraro@gmail.com>

# Install apache.
RUN apt-get update && DEBIAN_FRONTEND=noninteractive apt-get -y install apache2

# Manually set up the apache environment variables
ENV APACHE_RUN_USER www-data
ENV APACHE_RUN_GROUP www-data
ENV APACHE_LOG_DIR /var/log/apache2
ENV APACHE_LOCK_DIR /var/lock/apache2
ENV APACHE_PID_FILE /var/run/apache2.pid

# Expose apache.
EXPOSE 80 443

# ADD apache-config.conf /etc/apache2/sites-enabled/000-default.conf
RUN a2ensite 000-default.conf

# By default start up apache in the foreground, override with /bin/bash for interative.
CMD /usr/sbin/apache2ctl -D FOREGROUND
