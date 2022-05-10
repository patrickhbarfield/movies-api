CREATE DATABASE IF NOT EXISTS movies_db;

USE movies_db;

CREATE TABLE IF NOT EXISTS movies(
                                     id INT UNSIGNED NOT NULL AUTO_INCREMENT,
                                     title VARCHAR(255) NOT NULL,
                                     year CHAR(4) NOT NULL,
                                     plot TEXT,
                                     PRIMARY KEY (id)
);

# # 1. go get the json file from glitch
# # 2. copypasta into a new json file under /resources
# # --> You may need to establish a connection to your localhost db here
#
# # 3. create the movies_db
# CREATE DATABASE IF NOT EXISTS movies_db;
# # 4. use the movies_db
# USE movies_db;
# # 5. drop the table(s) to which no other tables are dependent (none at first)
#
# DROP TABLE IF EXISTS movie_genre;
# DROP TABLE IF EXISTS movie_actors;
# DROP TABLE IF EXISTS actors;
# DROP TABLE IF EXISTS genres;
# DROP TABLE IF EXISTS movies;
# DROP TABLE IF EXISTS directors;
#
#
# # 6. map the json movie properties to movies table columns
# # --> start with just a movies table with all the columns found in the movie json properties
# CREATE TABLE IF NOT EXISTS directors
# (
#     id   INT UNSIGNED NOT NULL AUTO_INCREMENT,
#     name VARCHAR(128),
#     primary key (id)
# );
#
# CREATE TABLE IF NOT EXISTS movies
# (
#     id          INT UNSIGNED NOT NULL AUTO_INCREMENT,
#     title       VARCHAR(255) NOT NULL,
#     year        char(4),
#     plot        TEXT,
#     poster      text,
#     rating      char(1),
#     director_id INT unsigned NOT NULL,
#     primary key (id),
#     foreign key (director_id) references directors (id)
# );
#
# CREATE TABLE IF NOT EXISTS genres
# (
#     id INT UNSIGNED NOT NULL AUTO_INCREMENT,
#     name VARCHAR(32),
#     PRIMARY KEY (id)
# );
#
# describe movies;
# create table if not exists movie_genre
# (
#     movie_id int unsigned not null,
#     genre_id int unsigned not null,
#     foreign key (movie_id) references movies(id),
#     foreign key (genre_id) references genres(id)
# );
#
# # 7. refactor to extract the directors to a new table with just an id and name
#
# # 6a. Run the script to make sure it works
#
# # --> change the movies table to reference the directors table via Foreign Key
# # --> now that movies is dependent on directors, you need to move directors above movies in the script
#
# CREATE TABLE IF NOT EXISTS movie_genre(
#     movie_id INT UNSIGNED NOT NULL,
#     genre_id INT UNSIGNED NOT NULL,
#     FOREIGN KEY (movie_id) REFERENCES movies (id),
#     FOREIGN KEY (genre_id) REFERENCES genres (id)
# );
#
# CREATE TABLE IF NOT EXISTS actors(
#     id INT UNSIGNED NOT NULL AUTO_INCREMENT,
#     name VARCHAR(255),
#     PRIMARY KEY (id)
# );
#
# CREATE TABLE IF NOT EXISTS movie_actor(
#     movie_id INT UNSIGNED NOT NULL
#
# )
#
# # 8. Go add DROP IF EXIST statements for movies and directors
#
# # 9. RUN IT!
#
#
#
#
