select m.title, ra.stars from
Movie m  join rating ra on ra.mID = m.mid 
order by title
where 

;

select count(stars), m.title from
Movie m  join rating ra on ra.mID = m.mid 
where m.year < 1980
group by title 
;

select count(stars), m.title, ( )   as average  from
Movie m  join rating ra on ra.mID = m.mid 
where m.year > 1980
group by title 
;
