package br.senai.sp.jandira.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    String banco, servidor, senha, usuario;

    public Connection conexao;

    public Conexao (){
        this.servidor = "localhost";
        this.banco = "db_empresa_divos";
        this.usuario = "root";
        this.senha = "bcd127";
    }

    public boolean conectDrive(){
        try {
            this.conexao = DriverManager.getConnection("jdbc:mysql://" +
                    this.servidor + "/" + this.banco, this.usuario, this.senha);
            return true;
        } catch (Exception erro){
            System.out.println(erro);
            return false;
        }
    }

    public Connection getConnection(){
        conectDrive();
        return conexao;
    }
}
