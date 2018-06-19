create user choizidane identified by 11111111;

grant dba to choizidane;

create table day(
    id number primary key,
    u_id varchar2(15),
    title varchar2(50),
    content clob not null,
    regdate date not null
);

create sequence seq_day_id;

insert into day values(seq_day_id.nextval, 'gogogo', '첫번째 글', '곧 점심시간이다', sysdate);
insert into day values(seq_day_id.nextval, 'kkkkkk', '두번째 글', '식빵', sysdate);

