insert into user(account, password, name) values
('user1', '1234', 'test1', '홍길동'),
('user2', password('1234'), 'test2', '홍길동2'),
('user3', password('1234'), 'test3', '홍길동3'),
('user4', password('1234'), 'test4', '홍길동4'),
('user5', password('1234'), 'test5', '홍길동5'),
('user6', password('1234'), 'test6', '홍길동6');

insert into post(user_id, title, content) value
(1, 'title 1', 'content 1'),
(1, 'title 2', 'content 2'),
(1, 'title 3', 'content 3'),
(2, 'title 4', 'content 4'),
(3, 'title 5', 'content 5');