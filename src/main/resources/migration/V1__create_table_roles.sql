CREATE TABLE IF NOT EXISTS roles(
  ID INT NOT NULL,
  role VARCHAR(15) NOT NULL UNIQUE,
  PRIMARY KEY (ID)
)ENGINE=InnoDB;

INSERT INTO roles(ID, role) VALUES
  (1, 'Admin'), (2, 'Gerant'), (3,'Gestionnaire');