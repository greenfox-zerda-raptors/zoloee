select m.title, max(ra.stars)-min(ra.stars) as spread from
Movie m  join rating ra on ra.mID = m.mid 
group by title 
order by spread desc
;