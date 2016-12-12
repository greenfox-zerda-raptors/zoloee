select distinct m.title, max(ra.stars) from
Movie m  join rating ra on ra.mID = m.mid 
group by title


;