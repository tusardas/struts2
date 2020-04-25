create table if not exists news(
	id int(10) not null auto_increment,
	headline varchar(500) not null,
	content text not null,
	primary key (id)
);

insert into news(headline, content) values(
	'Republic Day Celebration Going on',
	'Today 26th January marks 70th Republic Day in India. Many people gathered in Delhi Rajpath. The atmosphere is energitic. Happy Republic day to all Indians!'
);

insert into news(headline, content) values(
	'New Cheif of Defence',
	'New Cheif of Defence appointed. Warm regards are shown through out the day by netizens.'
);