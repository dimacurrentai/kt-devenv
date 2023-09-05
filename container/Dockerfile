FROM alpine:latest

RUN apk update

RUN apk add bash gradle git vim

RUN addgroup dev
RUN adduser -D -G dev dev

RUN mkdir -p /usr/local/bin
RUN echo -e '#!/bin/bash\necho "\033[01;34mversion:\033[0m __HERE_BE_DRAGONS__"\necho "\033[01;32mbuild:\033[0m   '$(date)'"' >/usr/local/bin/v
RUN echo -e '#!/bin/bash\ngradle clean' >/usr/local/bin/c
RUN echo -e '#!/bin/bash\ngradle build -x test' >/usr/local/bin/b
RUN echo -e '#!/bin/bash\ngradle run -q' >/usr/local/bin/r
RUN echo -e '#!/bin/bash\ngradle test -q -Dtestlogger.logLevel=quiet --rerun' >/usr/local/bin/t
RUN chmod +x /usr/local/bin/v
RUN chmod +x /usr/local/bin/c
RUN chmod +x /usr/local/bin/b
RUN chmod +x /usr/local/bin/r
RUN chmod +x /usr/local/bin/t

USER dev
WORKDIR /home/dev

ENV PS1='\[\033[01;35m\]{kt-devenv}\033[00m\] \w \$ '

ENTRYPOINT ["/bin/bash"]
