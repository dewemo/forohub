create table topicos(
    id bigint not null auto_increment,
    titulo varchar(100) not null,
    mensaje varchar(200) not null,
    fecha_creacion date not null,

primary key(id)
);

