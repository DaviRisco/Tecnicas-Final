/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.ConjuntoDePlaylists;
import model.Musica;
import model.Playlist;

/**
 *
 * @author raske
 */
public class PlaylistController {
    
    public void adicionarMusica(String nome_playlist, Musica nome_musica){
        ConjuntoDePlaylists.getPlaylist(nome_playlist).adicionarMusica(nome_musica);
        System.out.println(ConjuntoDePlaylists.toStr());
    }
    
    public void adicionarMusica(Musica nome_musica){
        ConjuntoDePlaylists.getPlaylist("Todas as músicas").adicionarMusica(nome_musica);
        System.out.println(ConjuntoDePlaylists.toStr());
    }
    public void removerMusica(String nome_playlist, String nome_musica){
        ConjuntoDePlaylists.getPlaylist(nome_playlist).removerMusica(nome_musica);
        System.out.println(ConjuntoDePlaylists.toStr());
    }
    //Remover do programa
    public static void removerMusica(String nome_musica){
        ConjuntoDePlaylists.getPlaylist("Todas as músicas").removerMusica(nome_musica);
        System.out.println(ConjuntoDePlaylists.toStr());
    }
    
 
}
