SELECT BOOK_ID
     , to_char(PUBLISHED_DATE, 'YYYY-mm-dd') AS "PUBLISHED_DATE"
from book
where to_char(PUBLISHED_DATE, 'YYYY') = '2021'
    AND category = '인문'
ORDER BY PUBLISHED_DATE ASC;
