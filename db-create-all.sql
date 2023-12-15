-- apply changes
create table edificio (
  id                            integer not null,
  nombre                        varchar(255) not null,
  direccion                     varchar(255) not null,
  version                       integer not null,
  created                       timestamp not null,
  modified                      timestamp not null,
  constraint pk_edificio primary key (id)
);

create table persona (
  id                            integer not null,
  rut                           varchar(255) not null,
  nombre                        varchar(255) not null,
  apellidos                     varchar(255) not null,
  email                         varchar(255) not null,
  telefono                      varchar(255) not null,
  version                       integer not null,
  created                       timestamp not null,
  modified                      timestamp not null,
  constraint pk_persona primary key (id)
);

