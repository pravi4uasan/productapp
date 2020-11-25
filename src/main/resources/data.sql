DROP TABLE IF EXISTS product_reviews;
 
CREATE TABLE product_reviews (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  product_id VARCHAR(250) NOT NULL,
  review_score INTEGER ,
  review_comment VARCHAR(250) DEFAULT NULL
);
 
INSERT INTO product_reviews (product_id, review_score, review_comment) VALUES
  ('BB5476', 5, 'Excellent'),
  ('BB5476', 4, 'Good'),
  ('BB5476', 3, 'Average'),
  ('BB5476', 2, 'Ok Ok'),
  ('BB5476', 1, 'Bad'),
  ('M20324', 5, 'Excellent'),
  ('M20324', 4, 'Good'),
  ('M20324', 3, 'avg quality'),
  ('M20324', 2, 'To be ok'),
  ('M20324', 1, 'Very Bad'),
  ('ABC123', 2, 'need ok'),
  ('BB5476', 4, 'good one'),
  ('M20324', 3, 'avg quality'),
  ('ABC123', 2, 'need ok'),
  ('BB5476', 5, 'good one again');