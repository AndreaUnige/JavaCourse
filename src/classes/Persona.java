package classes;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Persona {

    MyDBConnector myDBConnector = null;

    private int ID;
    private String nome;
    private String cognome;
    private int eta;

    public Persona(MyDBConnector myDBConnector) {
        this.myDBConnector = myDBConnector;
    }

    public Persona(int ID, String nome, String cognome, int eta) {
        this.ID = ID;
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    @Override
    public String toString() {
        return "ID: " + ID + ", nome: " + nome + ", cognome: " + cognome + ", eta: " + eta;
    }

    public ArrayList<Persona> getAll() {
        String query = "SELECT * FROM Persona;";
        ResultSet result = myDBConnector.doQuery(query);
        return parseAllPeople(result);
    }

    public Persona get(int id) {
        String query = "SELECT * FROM Persona WHERE ID = ?;";
        ResultSet result = myDBConnector.doQuery(query, id);

        try {
            result.next();

            ID = result.getInt("ID");
            nome = result.getString("Nome");
            cognome = result.getString("Cognome");
            eta = result.getInt("Eta");
        }
        catch (SQLException e) {}

        return new Persona(ID, nome, cognome, eta);
    }


    private ArrayList<Persona> parseAllPeople(ResultSet result) {
        ArrayList<Persona> people = new ArrayList<>();

        String nome = "", cognome = "";
        int ID, eta = 0;

        try {
            while(result.next()) {
                ID = result.getInt("ID");
                nome = result.getString("Nome");
                cognome = result.getString("Cognome");
                eta = result.getInt("Eta");

                people.add(new Persona(ID, nome, cognome, eta));
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return people;
    }



}
