select re.name, 
	m.title, 
	ra.stars, 
    ra.ratingDate 
    from Movie m  join Rating ra on m.mid = ra.mid 
     join Reviewer re on re.rid = ra.rid 
    order by re.name asc, m.title asc, stars asc

    ;