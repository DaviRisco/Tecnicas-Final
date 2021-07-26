/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.HashMap;
import controller.ConjuntoPlaylistsController;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author raske
 */
public class Playlist {

    private String nomePlaylist;
    private HashMap<String, Musica> listaMusicas = new HashMap<String, Musica>();

    public Playlist(String nomePlaylist) {
        this.nomePlaylist = nomePlaylist;
    }

    public HashMap<String, Musica> getListaMusicas() {
        return listaMusicas;
    }

    public void setListaMusicas(HashMap<String, Musica> listaMusicas) {
        this.listaMusicas = listaMusicas;
    }

    public String getNomePlaylist() {
        return nomePlaylist;
    }

    public void setNome_playlist(String nome_playlist) {
        this.nomePlaylist = nome_playlist;
    }

    public void adicionarMusica(Musica musica) {
        this.listaMusicas.put(musica.getNomeMusica(), musica);
    }

    public void removerMusica(String nome_musica) {
        this.listaMusicas.remove(nome_musica);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(nomePlaylist + ":");
        String musicasStr = arrayToStr(ordenaPorEstilo(listaMusicas));
        sb.append(musicasStr);
        return sb.toString();

    }

    public ArrayList ordenaPorEstilo(HashMap<String, Musica> listaMusicas) {
        ArrayList<Musica> playlistOrdenada = new ArrayList<Musica>();
        Musica musicaObj;
        for (String k : listaMusicas.keySet()) {
            musicaObj = listaMusicas.get(k);
            playlistOrdenada.add(musicaObj);
        }
        MusicaComparator comparador = new MusicaComparator();
        Collections.sort(playlistOrdenada, comparador);
        
        return playlistOrdenada;
    }
    
    public String arrayToStr(ArrayList<Musica> playlistOrdenada){
        String nomeMusica="";
        ArrayList<String> playlistString = new ArrayList();
        for (int i = 0; i < playlistOrdenada.size(); i++) {
            nomeMusica = playlistOrdenada.get(i).getNomeMusica();
            playlistString.add(nomeMusica);
        }
        return playlistString.toString();
    }
}
