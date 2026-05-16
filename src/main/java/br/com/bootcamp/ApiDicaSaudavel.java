package br.com.bootcamp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiDicaSaudavel {

    public static void buscarDica() {

        try {

            URL url = new URL("https://api.adviceslip.com/advice");

            HttpURLConnection conexao =
                    (HttpURLConnection) url.openConnection();

            conexao.setRequestMethod("GET");

            BufferedReader leitor = new BufferedReader(
                    new InputStreamReader(conexao.getInputStream())
            );

            String linha;

            while ((linha = leitor.readLine()) != null) {

                System.out.println("Dica saudável:");
                System.out.println(linha);

            }

            leitor.close();

        } catch (Exception e) {

            System.out.println("Erro ao acessar API.");

        }

    }

}