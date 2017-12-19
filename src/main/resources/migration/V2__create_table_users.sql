CREATE TABLE IF NOT EXISTS users (
  ID INT NOT NULL UNIQUE AUTO_INCREMENT,
  user VARCHAR(30) UNIQUE ,
  password VARCHAR(60),
  firstname VARCHAR(20),
  lastname VARCHAR(20),
  role INT NOT NULL,
  PRIMARY KEY (ID),
  FOREIGN KEY (role) REFERENCES roles(ID)
) ENGINE=InnoDB;

INSERT INTO users(user, password, firstname, lastname, role) VALUES (
  'admin@admin.com', '$2a$31$zKXqGJKJizkSfB34rwWZNeIDUHaLQtg72m7Koi6QgMmcNh4O3N3ry', 'Admin', 'Admin', '1'
)