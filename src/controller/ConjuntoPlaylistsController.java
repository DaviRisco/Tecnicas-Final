/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Playlist;
import model.ConjuntoDePlaylists;

/**
 *
 * @author raske
 */



public class ConjuntoPlaylistsController {
    
    public static void adicionaPlaylist(String NomePlaylist){
        Playlist playlist = new Playlist(NomePlaylist);
        ConjuntoDePlaylists.adicionaPlaylist(playlist);
        System.out.println(ConjuntoDePlaylists.toStr());
    };
    
    public static void removePlaylist(String nomePlaylist){
        ConjuntoDePlaylists.removePlaylist(nomePlaylist);
    };
    
    public static Playlist getPlaylist(String nomePlaylist){
        return ConjuntoDePlaylists.getPlaylist(nomePlaylist);
    }
}
