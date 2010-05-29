/*
 * This file is part of VLCJ.
 *
 * VLCJ is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * VLCJ is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with VLCJ.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Copyright 2009, 2010 Caprica Software Limited.
 */

package uk.co.caprica.vlcj.player;

/**
 * Default implementation of the media player event listener.
 * <p>
 * Simply override the methods you're interested in.
 */
public class MediaPlayerEventAdapter implements MediaPlayerEventListener {

  @Override
  public void playing(MediaPlayer mediaPlayer) {
  }

  @Override
  public void paused(MediaPlayer mediaPlayer) {
  }

  @Override
  public void stopped(MediaPlayer mediaPlayer) {
  }

  @Override
  public void finished(MediaPlayer mediaPlayer) {
  }

  @Override
  public void metaDataAvailable(MediaPlayer mediaPlayer, VideoMetaData videoMetaData) {
  }

  @Override
  public void lengthChanged(MediaPlayer mediaPlayer, long newLength) {
  }

  @Override
  public void positionChanged(MediaPlayer mediaPlayer, float newPosition) {
  }

  @Override
  public void timeChanged(MediaPlayer mediaPlayer, long newTime) {
  }
}