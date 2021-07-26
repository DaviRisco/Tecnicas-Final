/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author raske
 */
public final class ConjuntoDePlaylists {
    private static HashMap<String, Playlist> hashPlaylists = new HashMap<String, Playlist>();
    private static Playlist todasAsMusicas = new Playlist("Todas as músicas");
    static{
        adicionaPlaylist(todasAsMusicas);
    }
    
    public static void adicionaPlaylist(Playlist playlist){
        hashPlaylists.put(playlist.getNomePlaylist(), playlist);
    };
    
    public static void removePlaylist(String nomePlaylist){
        hashPlaylists.remove(nomePlaylist);
    };
    
    public static Playlist getPlaylist(String nomePlaylist){
        return hashPlaylists.get(nomePlaylist);
    }
    
    public static HashMap<String, Playlist> getHashPlaylists() {
        return hashPlaylists;
    }  
    
    
    public static String toStr(){
        StringBuilder sb = new StringBuilder();
         for (String k: hashPlaylists.keySet()) {
            String playlist = hashPlaylists.get(k).toString();
            sb.append(playlist.toString()+"\n");
        }
        return sb.toString();
    }
}
