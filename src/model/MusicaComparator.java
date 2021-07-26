/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Comparator;

/**
 *
 * @author raske
 */
public class MusicaComparator implements Comparator<Musica> {
    public int compare(Musica musica, Musica outraMusica) {
        return musica.compareTo(outraMusica);
    }
}
