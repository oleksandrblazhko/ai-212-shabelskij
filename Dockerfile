FROM postgres
LABEL description="Second container"
LABEL maintainer="Dmitriy Shchabelskiy"
LABEL version="1.0"

ENV POSTGRES_USER postgres
ENV POSTGRES_PASSWORD root
ENV POSTGRES_DB blazko

COPY ./dbscript.sql /docker-entrypoint-initdb.d/
