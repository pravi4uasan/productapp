DROP TABLE IF EXISTS product_reviews;
 
CREATE TABLE product_reviews (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  product_id VARCHAR(250) NOT NULL,
  review_score INTEGER ,
  review_comment VARCHAR(250) DEFAULT NULL
);
 
INSERT INTO product_reviews (product_id, review_score, review_comment) VALUES
  ('BB5476', 4, 'good one'),
  ('M20324', 3, 'avg quality'),
  ('ABC123', 2, 'need ok'),
  ('BB5476', 4, 'good one'),
  ('M20324', 3, 'avg quality'),
  ('ABC123', 2, 'need ok'),
  ('BB5476', 5, 'good one again');