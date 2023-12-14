package com.pluralsight.db;

import com.pluralsight.models.Actor;
import com.pluralsight.models.Film;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class NorthwindDataManager {
    private DataSource dataSource;

    public NorthwindDataManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Actor> searchActorsByName(String lastNameInput){
        Actor actor = null;
        List<Actor> actors = null;

        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(
                        "SELECT a.actor_id, a.first_name, a.last_name " +
                             "FROM actors a" +
                             "WHERE last_name LIKE ? ");
        ) {
            statement.setString(1, lastNameInput);
            try (ResultSet resultSet = statement.executeQuery())
            {
                 do {
                    int actorId = resultSet.getInt("actor_id");
                    String firstName = resultSet.getString("first_name");
                    String lastName = resultSet.getString("last_name");

                    actors.add(new Actor(actorId, firstName, lastName));

                } while (resultSet.next());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    return actors;
    }

    public List<Film> getActorMovies(Actor actor){
        List<Film> films = null;
        String filmsQuery = "SELECT title FROM film f JOIN film_actor fa ON f.film_id = fa.film_id " +
                            "JOIN actor a ON fa.actor_id = a.actor_id " +
                            "WHERE a.first_name = ? AND a.last_name = ?";
        try (Connection connection = dataSource.getConnection();
            PreparedStatement filmsStatement = connection.prepareStatement(filmsQuery)) {
            filmsStatement.setString(1, actor.getFirstName());
            filmsStatement.setString(2, actor.getLastName());

            try (ResultSet filmsResult = filmsStatement.executeQuery()) {
                do {
                    String filmTitle = filmsResult.getString("title");
                    films.add(new Film(filmTitle));
                } while (filmsResult.next());
            }
        } catch (SQLException e) {
        e.printStackTrace();
    }
        return films;
    }
}
