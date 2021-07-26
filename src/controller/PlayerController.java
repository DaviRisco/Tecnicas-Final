/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author raske
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
;


import javazoom.jl.decoder.JavaLayerException;
import java.io.FileInputStream;
import javax.swing.JLabel;
import javazoom.jl.player.Player;
import jmusic.JMusicPlayerList;
import jmusic.JMusicSong;
import jmusic.MusicPlayerControl;

/**
 *
 * @author raske
 */


public class PlayerController {

    private static JLabel jLInfo;
    private static boolean pausado = false;
    private static boolean repetindo = false;

    public static void start() {
        JMusicPlayerList list = new JMusicPlayerList();

        list.addSongToPlayerList(new JMusicSong(1,
                "IN-THE-END",
                "",
                "",
                ""));

        list.addSongToPlayerList(new JMusicSong(2,
                "Piano",
                "",
                "",
                ""));

        list.addSongToPlayerList(new JMusicSong(3,
                "Hero",
                "",
                "",
                ""));

        MusicPlayerControl.initMusicPlayer("src/musicas", jLInfo);
        MusicPlayerControl.loadSongs(list);
        MusicPlayerControl.playAllSongs();
    }

    
    public static void tocarPausar() throws JavaLayerException {
        if (pausado) {
            tocar();
            pausado = false;
        } else {
            pausar();
            pausado = true;
        }

    }

    public static void repetir() {
        if (repetindo) {
            MusicPlayerControl.repeatSong(false);
            repetindo = false;
        } else {
            MusicPlayerControl.repeatSong(true);
            repetindo = true;
        }

    }
    
     public static void tocar(){
        MusicPlayerControl.resumeSong();
    }
    
    public static void pausar() {
        MusicPlayerControl.pauseSong();
    }

    public static void parar() {
        MusicPlayerControl.stopSong();
    }

    public static void retroceder() {
        MusicPlayerControl.prevSong();
    }

    public static void avancar() {
        MusicPlayerControl.nextSong();
    }

}
