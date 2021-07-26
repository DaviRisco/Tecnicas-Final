/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.mpatric.mp3agic.ID3v2;
import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;
import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author raske
 */
public class Musica implements Comparable<Musica> {

    private File musica;
    private String nomeMusica;
    private String artista;
    private String album;
    private String ano;
    private String caminho;
    private String estilo;
    private double duracao;

    public Musica(String caminho) throws IOException, UnsupportedTagException, InvalidDataException {
        Mp3File mp3file = new Mp3File(caminho);
        this.musica = new File(caminho);
        if (mp3file.hasId3v2Tag()) {
            ID3v2 id3v2Tag = mp3file.getId3v2Tag();
            this.setNomeMusica(id3v2Tag.getTitle());
            this.setArtista(id3v2Tag.getArtist());
            this.setAlbum(id3v2Tag.getAlbum());
            this.setAno(id3v2Tag.getYear());
            this.setCaminho(caminho);
            this.setDuracao(mp3file.getLengthInSeconds());
            this.setEstilo(id3v2Tag.getGenreDescription());
        }
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nome_musica) {
        this.nomeMusica = nome_musica;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String toString() {
        return "Nome: " + nomeMusica
                + "\nArtista: " + artista
                + "\nÁlbum: " + album
                + "\nDuração: " + duracao
                + "\nAno: " + ano
                + "\nEstilo: " + estilo;
    }

    public void salvarMusica() throws IOException, UnsupportedTagException, InvalidDataException {
        ConjuntoDePlaylists.getPlaylist("Todas as músicas").adicionarMusica(this);
    }
    
    public int compareTo(Musica outraMusica) {
        if (this.estilo.equals(outraMusica.estilo)) {
            return 1;
        }
        return 0;
    }
}
