/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.mpatric.mp3agic.ID3v2;
import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;
import java.io.IOException;
import model.ConjuntoDePlaylists;
import static model.ConjuntoDePlaylists.toStr;
import model.Musica;
import model.Playlist;


/**
 *
 * @author raske
 */
public class MusicaController {

    public void importarMusica(String caminho) throws IOException, UnsupportedTagException, InvalidDataException {
        Musica mp3 = new Musica(caminho);
        mp3.salvarMusica();
        System.out.println(ConjuntoDePlaylists.toStr());
        //System.out.println(mp3.toString());
    }
}
