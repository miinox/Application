package com.example.application;

import java.io.Serializable;

public class Profil implements Serializable {
    // Attributs de la classe
    private String user;
    private String email;
    private String password;
    private int role;

    // Constructeur de la classe Profil
    public Profil(String user, String email, String password, int role) {
        this.user = user;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    // GETTERS pour accéder aux attributs de la classe
    public String getUser() {
        return user;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getRole() {
        return role;
    }

    // Méthode toString pour obtenir une représentation textuelle de l'objet Profil
    @Override
    public String toString() {
        return "Profil{" +
                "user='" + user + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role='" + roleProfil() + '\'' +
                '}';
    }

    // Méthode privée pour convertir le rôle en chaîne de caractères
    private String roleProfil() {
        if(getRole() == 2) {
            return "Admin";
        } else if(getRole() == 1) {
            return "Employé";
        } else {
            return "Client";
        }
    }
}
