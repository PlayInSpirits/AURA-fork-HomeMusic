package defpackage;

import com.eddyizm.tempus.model.Chronology;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.model.Favorite;
import com.eddyizm.tempus.model.InternetRadioStationCache;
import com.eddyizm.tempus.model.LyricsCache;
import com.eddyizm.tempus.model.PlaylistSong;
import com.eddyizm.tempus.model.Queue;
import com.eddyizm.tempus.model.RecentSearch;
import com.eddyizm.tempus.model.Server;
import com.eddyizm.tempus.subsonic.models.ReplayGainInfo;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class q20 extends au0 {
    public final /* synthetic */ int G;

    public /* synthetic */ q20(int i) {
        this.G = i;
    }

    private final void W(z34 z34Var, Object obj) {
        Queue queue = (Queue) obj;
        if (queue.getId() == null) {
            z34Var.e(1);
        } else {
            z34Var.r(1, queue.getId());
        }
        z34Var.c(2, queue.getTrackOrder());
        z34Var.c(3, queue.getLastPlay());
        z34Var.c(4, queue.getPlayingChanged());
        if (queue.getStreamId() == null) {
            z34Var.e(5);
        } else {
            z34Var.r(5, queue.getStreamId());
        }
        if (queue.getParentId() == null) {
            z34Var.e(6);
        } else {
            z34Var.r(6, queue.getParentId());
        }
        z34Var.c(7, queue.isDir() ? 1L : 0L);
        if (queue.getTitle() == null) {
            z34Var.e(8);
        } else {
            z34Var.r(8, queue.getTitle());
        }
        if (queue.getAlbum() == null) {
            z34Var.e(9);
        } else {
            z34Var.r(9, queue.getAlbum());
        }
        if (queue.getArtist() == null) {
            z34Var.e(10);
        } else {
            z34Var.r(10, queue.getArtist());
        }
        if (queue.getTrack() == null) {
            z34Var.e(11);
        } else {
            z34Var.c(11, queue.getTrack().intValue());
        }
        if (queue.getYear() == null) {
            z34Var.e(12);
        } else {
            z34Var.c(12, queue.getYear().intValue());
        }
        if (queue.getGenre() == null) {
            z34Var.e(13);
        } else {
            z34Var.r(13, queue.getGenre());
        }
        if (queue.getCoverArtId() == null) {
            z34Var.e(14);
        } else {
            z34Var.r(14, queue.getCoverArtId());
        }
        if (queue.getSize() == null) {
            z34Var.e(15);
        } else {
            z34Var.c(15, queue.getSize().longValue());
        }
        if (queue.getContentType() == null) {
            z34Var.e(16);
        } else {
            z34Var.r(16, queue.getContentType());
        }
        if (queue.getSuffix() == null) {
            z34Var.e(17);
        } else {
            z34Var.r(17, queue.getSuffix());
        }
        if (queue.getTranscodedContentType() == null) {
            z34Var.e(18);
        } else {
            z34Var.r(18, queue.getTranscodedContentType());
        }
        if (queue.getTranscodedSuffix() == null) {
            z34Var.e(19);
        } else {
            z34Var.r(19, queue.getTranscodedSuffix());
        }
        if (queue.getDuration() == null) {
            z34Var.e(20);
        } else {
            z34Var.c(20, queue.getDuration().intValue());
        }
        if (queue.getBitrate() == null) {
            z34Var.e(21);
        } else {
            z34Var.c(21, queue.getBitrate().intValue());
        }
        if (queue.getSamplingRate() == null) {
            z34Var.e(22);
        } else {
            z34Var.c(22, queue.getSamplingRate().intValue());
        }
        if (queue.getBitDepth() == null) {
            z34Var.e(23);
        } else {
            z34Var.c(23, queue.getBitDepth().intValue());
        }
        if (queue.getPath() == null) {
            z34Var.e(24);
        } else {
            z34Var.r(24, queue.getPath());
        }
        z34Var.c(25, queue.isVideo() ? 1L : 0L);
        if (queue.getUserRating() == null) {
            z34Var.e(26);
        } else {
            z34Var.c(26, queue.getUserRating().intValue());
        }
        if (queue.getAverageRating() == null) {
            z34Var.e(27);
        } else {
            z34Var.d(queue.getAverageRating().doubleValue(), 27);
        }
        if (queue.getPlayCount() == null) {
            z34Var.e(28);
        } else {
            z34Var.c(28, queue.getPlayCount().longValue());
        }
        if (queue.getDiscNumber() == null) {
            z34Var.e(29);
        } else {
            z34Var.c(29, queue.getDiscNumber().intValue());
        }
        Long lJ = i80.j(queue.getCreated());
        if (lJ == null) {
            z34Var.e(30);
        } else {
            z34Var.c(30, lJ.longValue());
        }
        Long lJ2 = i80.j(queue.getStarred());
        if (lJ2 == null) {
            z34Var.e(31);
        } else {
            z34Var.c(31, lJ2.longValue());
        }
        if (queue.getAlbumId() == null) {
            z34Var.e(32);
        } else {
            z34Var.r(32, queue.getAlbumId());
        }
        if (queue.getArtistId() == null) {
            z34Var.e(33);
        } else {
            z34Var.r(33, queue.getArtistId());
        }
        if (queue.getType() == null) {
            z34Var.e(34);
        } else {
            z34Var.r(34, queue.getType());
        }
        if (queue.getBookmarkPosition() == null) {
            z34Var.e(35);
        } else {
            z34Var.c(35, queue.getBookmarkPosition().longValue());
        }
        if (queue.getOriginalWidth() == null) {
            z34Var.e(36);
        } else {
            z34Var.c(36, queue.getOriginalWidth().intValue());
        }
        if (queue.getOriginalHeight() == null) {
            z34Var.e(37);
        } else {
            z34Var.c(37, queue.getOriginalHeight().intValue());
        }
        if (queue.getAlbumArtist() == null) {
            z34Var.e(38);
        } else {
            z34Var.r(38, queue.getAlbumArtist());
        }
        ReplayGainInfo replayGain = queue.getReplayGain();
        if (replayGain == null) {
            z34Var.e(39);
            z34Var.e(40);
            z34Var.e(41);
            z34Var.e(42);
            z34Var.e(43);
            z34Var.e(44);
            return;
        }
        if (replayGain.getTrackGain() == null) {
            z34Var.e(39);
        } else {
            z34Var.d(replayGain.getTrackGain().floatValue(), 39);
        }
        if (replayGain.getAlbumGain() == null) {
            z34Var.e(40);
        } else {
            z34Var.d(replayGain.getAlbumGain().floatValue(), 40);
        }
        if (replayGain.getTrackPeak() == null) {
            z34Var.e(41);
        } else {
            z34Var.d(replayGain.getTrackPeak().floatValue(), 41);
        }
        if (replayGain.getAlbumPeak() == null) {
            z34Var.e(42);
        } else {
            z34Var.d(replayGain.getAlbumPeak().floatValue(), 42);
        }
        if (replayGain.getBaseGain() == null) {
            z34Var.e(43);
        } else {
            z34Var.d(replayGain.getBaseGain().floatValue(), 43);
        }
        if (replayGain.getFallbackGain() == null) {
            z34Var.e(44);
        } else {
            z34Var.d(replayGain.getFallbackGain().floatValue(), 44);
        }
    }

    @Override // defpackage.au0
    public final void c(z34 z34Var, Object obj) {
        switch (this.G) {
            case 0:
                Chronology chronology = (Chronology) obj;
                if (chronology.getId() == null) {
                    z34Var.e(1);
                } else {
                    z34Var.r(1, chronology.getId());
                }
                z34Var.c(2, chronology.getTimestamp());
                if (chronology.getServer() == null) {
                    z34Var.e(3);
                } else {
                    z34Var.r(3, chronology.getServer());
                }
                if (chronology.getParentId() == null) {
                    z34Var.e(4);
                } else {
                    z34Var.r(4, chronology.getParentId());
                }
                z34Var.c(5, chronology.isDir() ? 1L : 0L);
                if (chronology.getTitle() == null) {
                    z34Var.e(6);
                } else {
                    z34Var.r(6, chronology.getTitle());
                }
                if (chronology.getAlbum() == null) {
                    z34Var.e(7);
                } else {
                    z34Var.r(7, chronology.getAlbum());
                }
                if (chronology.getArtist() == null) {
                    z34Var.e(8);
                } else {
                    z34Var.r(8, chronology.getArtist());
                }
                if (chronology.getTrack() == null) {
                    z34Var.e(9);
                } else {
                    z34Var.c(9, chronology.getTrack().intValue());
                }
                if (chronology.getYear() == null) {
                    z34Var.e(10);
                } else {
                    z34Var.c(10, chronology.getYear().intValue());
                }
                if (chronology.getGenre() == null) {
                    z34Var.e(11);
                } else {
                    z34Var.r(11, chronology.getGenre());
                }
                if (chronology.getCoverArtId() == null) {
                    z34Var.e(12);
                } else {
                    z34Var.r(12, chronology.getCoverArtId());
                }
                if (chronology.getSize() == null) {
                    z34Var.e(13);
                } else {
                    z34Var.c(13, chronology.getSize().longValue());
                }
                if (chronology.getContentType() == null) {
                    z34Var.e(14);
                } else {
                    z34Var.r(14, chronology.getContentType());
                }
                if (chronology.getSuffix() == null) {
                    z34Var.e(15);
                } else {
                    z34Var.r(15, chronology.getSuffix());
                }
                if (chronology.getTranscodedContentType() == null) {
                    z34Var.e(16);
                } else {
                    z34Var.r(16, chronology.getTranscodedContentType());
                }
                if (chronology.getTranscodedSuffix() == null) {
                    z34Var.e(17);
                } else {
                    z34Var.r(17, chronology.getTranscodedSuffix());
                }
                if (chronology.getDuration() == null) {
                    z34Var.e(18);
                } else {
                    z34Var.c(18, chronology.getDuration().intValue());
                }
                if (chronology.getBitrate() == null) {
                    z34Var.e(19);
                } else {
                    z34Var.c(19, chronology.getBitrate().intValue());
                }
                if (chronology.getSamplingRate() == null) {
                    z34Var.e(20);
                } else {
                    z34Var.c(20, chronology.getSamplingRate().intValue());
                }
                if (chronology.getBitDepth() == null) {
                    z34Var.e(21);
                } else {
                    z34Var.c(21, chronology.getBitDepth().intValue());
                }
                if (chronology.getPath() == null) {
                    z34Var.e(22);
                } else {
                    z34Var.r(22, chronology.getPath());
                }
                z34Var.c(23, chronology.isVideo() ? 1L : 0L);
                if (chronology.getUserRating() == null) {
                    z34Var.e(24);
                } else {
                    z34Var.c(24, chronology.getUserRating().intValue());
                }
                if (chronology.getAverageRating() == null) {
                    z34Var.e(25);
                } else {
                    z34Var.d(chronology.getAverageRating().doubleValue(), 25);
                }
                if (chronology.getPlayCount() == null) {
                    z34Var.e(26);
                } else {
                    z34Var.c(26, chronology.getPlayCount().longValue());
                }
                if (chronology.getDiscNumber() == null) {
                    z34Var.e(27);
                } else {
                    z34Var.c(27, chronology.getDiscNumber().intValue());
                }
                Long lJ = i80.j(chronology.getCreated());
                if (lJ == null) {
                    z34Var.e(28);
                } else {
                    z34Var.c(28, lJ.longValue());
                }
                Long lJ2 = i80.j(chronology.getStarred());
                if (lJ2 == null) {
                    z34Var.e(29);
                } else {
                    z34Var.c(29, lJ2.longValue());
                }
                if (chronology.getAlbumId() == null) {
                    z34Var.e(30);
                } else {
                    z34Var.r(30, chronology.getAlbumId());
                }
                if (chronology.getArtistId() == null) {
                    z34Var.e(31);
                } else {
                    z34Var.r(31, chronology.getArtistId());
                }
                if (chronology.getType() == null) {
                    z34Var.e(32);
                } else {
                    z34Var.r(32, chronology.getType());
                }
                if (chronology.getBookmarkPosition() == null) {
                    z34Var.e(33);
                } else {
                    z34Var.c(33, chronology.getBookmarkPosition().longValue());
                }
                if (chronology.getOriginalWidth() == null) {
                    z34Var.e(34);
                } else {
                    z34Var.c(34, chronology.getOriginalWidth().intValue());
                }
                if (chronology.getOriginalHeight() == null) {
                    z34Var.e(35);
                } else {
                    z34Var.c(35, chronology.getOriginalHeight().intValue());
                }
                if (chronology.getAlbumArtist() == null) {
                    z34Var.e(36);
                } else {
                    z34Var.r(36, chronology.getAlbumArtist());
                }
                ReplayGainInfo replayGain = chronology.getReplayGain();
                if (replayGain == null) {
                    z34Var.e(37);
                    z34Var.e(38);
                    z34Var.e(39);
                    z34Var.e(40);
                    z34Var.e(41);
                    z34Var.e(42);
                } else {
                    if (replayGain.getTrackGain() == null) {
                        z34Var.e(37);
                    } else {
                        z34Var.d(replayGain.getTrackGain().floatValue(), 37);
                    }
                    if (replayGain.getAlbumGain() == null) {
                        z34Var.e(38);
                    } else {
                        z34Var.d(replayGain.getAlbumGain().floatValue(), 38);
                    }
                    if (replayGain.getTrackPeak() == null) {
                        z34Var.e(39);
                    } else {
                        z34Var.d(replayGain.getTrackPeak().floatValue(), 39);
                    }
                    if (replayGain.getAlbumPeak() == null) {
                        z34Var.e(40);
                    } else {
                        z34Var.d(replayGain.getAlbumPeak().floatValue(), 40);
                    }
                    if (replayGain.getBaseGain() == null) {
                        z34Var.e(41);
                    } else {
                        z34Var.d(replayGain.getBaseGain().floatValue(), 41);
                    }
                    if (replayGain.getFallbackGain() != null) {
                        z34Var.d(replayGain.getFallbackGain().floatValue(), 42);
                    } else {
                        z34Var.e(42);
                    }
                }
                break;
            case 1:
                Download download = (Download) obj;
                if (download.getId() == null) {
                    z34Var.e(1);
                } else {
                    z34Var.r(1, download.getId());
                }
                if (download.getPlaylistId() == null) {
                    z34Var.e(2);
                } else {
                    z34Var.r(2, download.getPlaylistId());
                }
                if (download.getPlaylistName() == null) {
                    z34Var.e(3);
                } else {
                    z34Var.r(3, download.getPlaylistName());
                }
                z34Var.c(4, download.getDownloadState());
                if (download.getDownloadUri() == null) {
                    z34Var.e(5);
                } else {
                    z34Var.r(5, download.getDownloadUri());
                }
                if (download.getParentId() == null) {
                    z34Var.e(6);
                } else {
                    z34Var.r(6, download.getParentId());
                }
                z34Var.c(7, download.isDir() ? 1L : 0L);
                if (download.getTitle() == null) {
                    z34Var.e(8);
                } else {
                    z34Var.r(8, download.getTitle());
                }
                if (download.getAlbum() == null) {
                    z34Var.e(9);
                } else {
                    z34Var.r(9, download.getAlbum());
                }
                if (download.getArtist() == null) {
                    z34Var.e(10);
                } else {
                    z34Var.r(10, download.getArtist());
                }
                if (download.getTrack() == null) {
                    z34Var.e(11);
                } else {
                    z34Var.c(11, download.getTrack().intValue());
                }
                if (download.getYear() == null) {
                    z34Var.e(12);
                } else {
                    z34Var.c(12, download.getYear().intValue());
                }
                if (download.getGenre() == null) {
                    z34Var.e(13);
                } else {
                    z34Var.r(13, download.getGenre());
                }
                if (download.getCoverArtId() == null) {
                    z34Var.e(14);
                } else {
                    z34Var.r(14, download.getCoverArtId());
                }
                if (download.getSize() == null) {
                    z34Var.e(15);
                } else {
                    z34Var.c(15, download.getSize().longValue());
                }
                if (download.getContentType() == null) {
                    z34Var.e(16);
                } else {
                    z34Var.r(16, download.getContentType());
                }
                if (download.getSuffix() == null) {
                    z34Var.e(17);
                } else {
                    z34Var.r(17, download.getSuffix());
                }
                if (download.getTranscodedContentType() == null) {
                    z34Var.e(18);
                } else {
                    z34Var.r(18, download.getTranscodedContentType());
                }
                if (download.getTranscodedSuffix() == null) {
                    z34Var.e(19);
                } else {
                    z34Var.r(19, download.getTranscodedSuffix());
                }
                if (download.getDuration() == null) {
                    z34Var.e(20);
                } else {
                    z34Var.c(20, download.getDuration().intValue());
                }
                if (download.getBitrate() == null) {
                    z34Var.e(21);
                } else {
                    z34Var.c(21, download.getBitrate().intValue());
                }
                if (download.getSamplingRate() == null) {
                    z34Var.e(22);
                } else {
                    z34Var.c(22, download.getSamplingRate().intValue());
                }
                if (download.getBitDepth() == null) {
                    z34Var.e(23);
                } else {
                    z34Var.c(23, download.getBitDepth().intValue());
                }
                if (download.getPath() == null) {
                    z34Var.e(24);
                } else {
                    z34Var.r(24, download.getPath());
                }
                z34Var.c(25, download.isVideo() ? 1L : 0L);
                if (download.getUserRating() == null) {
                    z34Var.e(26);
                } else {
                    z34Var.c(26, download.getUserRating().intValue());
                }
                if (download.getAverageRating() == null) {
                    z34Var.e(27);
                } else {
                    z34Var.d(download.getAverageRating().doubleValue(), 27);
                }
                if (download.getPlayCount() == null) {
                    z34Var.e(28);
                } else {
                    z34Var.c(28, download.getPlayCount().longValue());
                }
                if (download.getDiscNumber() == null) {
                    z34Var.e(29);
                } else {
                    z34Var.c(29, download.getDiscNumber().intValue());
                }
                Long lJ3 = i80.j(download.getCreated());
                if (lJ3 == null) {
                    z34Var.e(30);
                } else {
                    z34Var.c(30, lJ3.longValue());
                }
                Long lJ4 = i80.j(download.getStarred());
                if (lJ4 == null) {
                    z34Var.e(31);
                } else {
                    z34Var.c(31, lJ4.longValue());
                }
                if (download.getAlbumId() == null) {
                    z34Var.e(32);
                } else {
                    z34Var.r(32, download.getAlbumId());
                }
                if (download.getArtistId() == null) {
                    z34Var.e(33);
                } else {
                    z34Var.r(33, download.getArtistId());
                }
                if (download.getType() == null) {
                    z34Var.e(34);
                } else {
                    z34Var.r(34, download.getType());
                }
                if (download.getBookmarkPosition() == null) {
                    z34Var.e(35);
                } else {
                    z34Var.c(35, download.getBookmarkPosition().longValue());
                }
                if (download.getOriginalWidth() == null) {
                    z34Var.e(36);
                } else {
                    z34Var.c(36, download.getOriginalWidth().intValue());
                }
                if (download.getOriginalHeight() == null) {
                    z34Var.e(37);
                } else {
                    z34Var.c(37, download.getOriginalHeight().intValue());
                }
                if (download.getAlbumArtist() == null) {
                    z34Var.e(38);
                } else {
                    z34Var.r(38, download.getAlbumArtist());
                }
                ReplayGainInfo replayGain2 = download.getReplayGain();
                if (replayGain2 == null) {
                    z34Var.e(39);
                    z34Var.e(40);
                    z34Var.e(41);
                    z34Var.e(42);
                    z34Var.e(43);
                    z34Var.e(44);
                } else {
                    if (replayGain2.getTrackGain() == null) {
                        z34Var.e(39);
                    } else {
                        z34Var.d(replayGain2.getTrackGain().floatValue(), 39);
                    }
                    if (replayGain2.getAlbumGain() == null) {
                        z34Var.e(40);
                    } else {
                        z34Var.d(replayGain2.getAlbumGain().floatValue(), 40);
                    }
                    if (replayGain2.getTrackPeak() == null) {
                        z34Var.e(41);
                    } else {
                        z34Var.d(replayGain2.getTrackPeak().floatValue(), 41);
                    }
                    if (replayGain2.getAlbumPeak() == null) {
                        z34Var.e(42);
                    } else {
                        z34Var.d(replayGain2.getAlbumPeak().floatValue(), 42);
                    }
                    if (replayGain2.getBaseGain() == null) {
                        z34Var.e(43);
                    } else {
                        z34Var.d(replayGain2.getBaseGain().floatValue(), 43);
                    }
                    if (replayGain2.getFallbackGain() != null) {
                        z34Var.d(replayGain2.getFallbackGain().floatValue(), 44);
                    } else {
                        z34Var.e(44);
                    }
                }
                break;
            case 2:
                Download download2 = (Download) obj;
                if (download2.getId() == null) {
                    z34Var.e(1);
                } else {
                    z34Var.r(1, download2.getId());
                }
                if (download2.getPlaylistId() == null) {
                    z34Var.e(2);
                } else {
                    z34Var.r(2, download2.getPlaylistId());
                }
                if (download2.getPlaylistName() == null) {
                    z34Var.e(3);
                } else {
                    z34Var.r(3, download2.getPlaylistName());
                }
                z34Var.c(4, download2.getDownloadState());
                if (download2.getDownloadUri() == null) {
                    z34Var.e(5);
                } else {
                    z34Var.r(5, download2.getDownloadUri());
                }
                if (download2.getParentId() == null) {
                    z34Var.e(6);
                } else {
                    z34Var.r(6, download2.getParentId());
                }
                z34Var.c(7, download2.isDir() ? 1L : 0L);
                if (download2.getTitle() == null) {
                    z34Var.e(8);
                } else {
                    z34Var.r(8, download2.getTitle());
                }
                if (download2.getAlbum() == null) {
                    z34Var.e(9);
                } else {
                    z34Var.r(9, download2.getAlbum());
                }
                if (download2.getArtist() == null) {
                    z34Var.e(10);
                } else {
                    z34Var.r(10, download2.getArtist());
                }
                if (download2.getTrack() == null) {
                    z34Var.e(11);
                } else {
                    z34Var.c(11, download2.getTrack().intValue());
                }
                if (download2.getYear() == null) {
                    z34Var.e(12);
                } else {
                    z34Var.c(12, download2.getYear().intValue());
                }
                if (download2.getGenre() == null) {
                    z34Var.e(13);
                } else {
                    z34Var.r(13, download2.getGenre());
                }
                if (download2.getCoverArtId() == null) {
                    z34Var.e(14);
                } else {
                    z34Var.r(14, download2.getCoverArtId());
                }
                if (download2.getSize() == null) {
                    z34Var.e(15);
                } else {
                    z34Var.c(15, download2.getSize().longValue());
                }
                if (download2.getContentType() == null) {
                    z34Var.e(16);
                } else {
                    z34Var.r(16, download2.getContentType());
                }
                if (download2.getSuffix() == null) {
                    z34Var.e(17);
                } else {
                    z34Var.r(17, download2.getSuffix());
                }
                if (download2.getTranscodedContentType() == null) {
                    z34Var.e(18);
                } else {
                    z34Var.r(18, download2.getTranscodedContentType());
                }
                if (download2.getTranscodedSuffix() == null) {
                    z34Var.e(19);
                } else {
                    z34Var.r(19, download2.getTranscodedSuffix());
                }
                if (download2.getDuration() == null) {
                    z34Var.e(20);
                } else {
                    z34Var.c(20, download2.getDuration().intValue());
                }
                if (download2.getBitrate() == null) {
                    z34Var.e(21);
                } else {
                    z34Var.c(21, download2.getBitrate().intValue());
                }
                if (download2.getSamplingRate() == null) {
                    z34Var.e(22);
                } else {
                    z34Var.c(22, download2.getSamplingRate().intValue());
                }
                if (download2.getBitDepth() == null) {
                    z34Var.e(23);
                } else {
                    z34Var.c(23, download2.getBitDepth().intValue());
                }
                if (download2.getPath() == null) {
                    z34Var.e(24);
                } else {
                    z34Var.r(24, download2.getPath());
                }
                z34Var.c(25, download2.isVideo() ? 1L : 0L);
                if (download2.getUserRating() == null) {
                    z34Var.e(26);
                } else {
                    z34Var.c(26, download2.getUserRating().intValue());
                }
                if (download2.getAverageRating() == null) {
                    z34Var.e(27);
                } else {
                    z34Var.d(download2.getAverageRating().doubleValue(), 27);
                }
                if (download2.getPlayCount() == null) {
                    z34Var.e(28);
                } else {
                    z34Var.c(28, download2.getPlayCount().longValue());
                }
                if (download2.getDiscNumber() == null) {
                    z34Var.e(29);
                } else {
                    z34Var.c(29, download2.getDiscNumber().intValue());
                }
                Long lJ5 = i80.j(download2.getCreated());
                if (lJ5 == null) {
                    z34Var.e(30);
                } else {
                    z34Var.c(30, lJ5.longValue());
                }
                Long lJ6 = i80.j(download2.getStarred());
                if (lJ6 == null) {
                    z34Var.e(31);
                } else {
                    z34Var.c(31, lJ6.longValue());
                }
                if (download2.getAlbumId() == null) {
                    z34Var.e(32);
                } else {
                    z34Var.r(32, download2.getAlbumId());
                }
                if (download2.getArtistId() == null) {
                    z34Var.e(33);
                } else {
                    z34Var.r(33, download2.getArtistId());
                }
                if (download2.getType() == null) {
                    z34Var.e(34);
                } else {
                    z34Var.r(34, download2.getType());
                }
                if (download2.getBookmarkPosition() == null) {
                    z34Var.e(35);
                } else {
                    z34Var.c(35, download2.getBookmarkPosition().longValue());
                }
                if (download2.getOriginalWidth() == null) {
                    z34Var.e(36);
                } else {
                    z34Var.c(36, download2.getOriginalWidth().intValue());
                }
                if (download2.getOriginalHeight() == null) {
                    z34Var.e(37);
                } else {
                    z34Var.c(37, download2.getOriginalHeight().intValue());
                }
                if (download2.getAlbumArtist() == null) {
                    z34Var.e(38);
                } else {
                    z34Var.r(38, download2.getAlbumArtist());
                }
                ReplayGainInfo replayGain3 = download2.getReplayGain();
                if (replayGain3 == null) {
                    z34Var.e(39);
                    z34Var.e(40);
                    z34Var.e(41);
                    z34Var.e(42);
                    z34Var.e(43);
                    z34Var.e(44);
                } else {
                    if (replayGain3.getTrackGain() == null) {
                        z34Var.e(39);
                    } else {
                        z34Var.d(replayGain3.getTrackGain().floatValue(), 39);
                    }
                    if (replayGain3.getAlbumGain() == null) {
                        z34Var.e(40);
                    } else {
                        z34Var.d(replayGain3.getAlbumGain().floatValue(), 40);
                    }
                    if (replayGain3.getTrackPeak() == null) {
                        z34Var.e(41);
                    } else {
                        z34Var.d(replayGain3.getTrackPeak().floatValue(), 41);
                    }
                    if (replayGain3.getAlbumPeak() == null) {
                        z34Var.e(42);
                    } else {
                        z34Var.d(replayGain3.getAlbumPeak().floatValue(), 42);
                    }
                    if (replayGain3.getBaseGain() == null) {
                        z34Var.e(43);
                    } else {
                        z34Var.d(replayGain3.getBaseGain().floatValue(), 43);
                    }
                    if (replayGain3.getFallbackGain() != null) {
                        z34Var.d(replayGain3.getFallbackGain().floatValue(), 44);
                    } else {
                        z34Var.e(44);
                    }
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                Favorite favorite = (Favorite) obj;
                z34Var.c(1, favorite.getTimestamp());
                if (favorite.getSongId() == null) {
                    z34Var.e(2);
                } else {
                    z34Var.r(2, favorite.getSongId());
                }
                if (favorite.getAlbumId() == null) {
                    z34Var.e(3);
                } else {
                    z34Var.r(3, favorite.getAlbumId());
                }
                if (favorite.getArtistId() == null) {
                    z34Var.e(4);
                } else {
                    z34Var.r(4, favorite.getArtistId());
                }
                z34Var.c(5, favorite.getToStar() ? 1L : 0L);
                break;
            case 4:
                InternetRadioStationCache internetRadioStationCache = (InternetRadioStationCache) obj;
                if (internetRadioStationCache.getId() == null) {
                    z34Var.e(1);
                } else {
                    z34Var.r(1, internetRadioStationCache.getId());
                }
                if (internetRadioStationCache.getName() == null) {
                    z34Var.e(2);
                } else {
                    z34Var.r(2, internetRadioStationCache.getName());
                }
                if (internetRadioStationCache.getStreamUrl() == null) {
                    z34Var.e(3);
                } else {
                    z34Var.r(3, internetRadioStationCache.getStreamUrl());
                }
                if (internetRadioStationCache.getHomePageUrl() == null) {
                    z34Var.e(4);
                } else {
                    z34Var.r(4, internetRadioStationCache.getHomePageUrl());
                }
                if (internetRadioStationCache.getSource() == null) {
                    z34Var.e(5);
                } else {
                    z34Var.r(5, internetRadioStationCache.getSource());
                }
                if (internetRadioStationCache.getCoverArtUrl() != null) {
                    z34Var.r(6, internetRadioStationCache.getCoverArtUrl());
                } else {
                    z34Var.e(6);
                }
                break;
            case 5:
                LyricsCache lyricsCache = (LyricsCache) obj;
                if (lyricsCache.getSongId() == null) {
                    z34Var.e(1);
                } else {
                    z34Var.r(1, lyricsCache.getSongId());
                }
                if (lyricsCache.getArtist() == null) {
                    z34Var.e(2);
                } else {
                    z34Var.r(2, lyricsCache.getArtist());
                }
                if (lyricsCache.getTitle() == null) {
                    z34Var.e(3);
                } else {
                    z34Var.r(3, lyricsCache.getTitle());
                }
                if (lyricsCache.getLyrics() == null) {
                    z34Var.e(4);
                } else {
                    z34Var.r(4, lyricsCache.getLyrics());
                }
                if (lyricsCache.getStructuredLyrics() == null) {
                    z34Var.e(5);
                } else {
                    z34Var.r(5, lyricsCache.getStructuredLyrics());
                }
                z34Var.c(6, lyricsCache.getUpdatedAt());
                break;
            case 6:
                PlaylistSong playlistSong = (PlaylistSong) obj;
                if (playlistSong.getPlaylistId() == null) {
                    z34Var.e(1);
                } else {
                    z34Var.r(1, playlistSong.getPlaylistId());
                }
                if (playlistSong.getId() == null) {
                    z34Var.e(2);
                } else {
                    z34Var.r(2, playlistSong.getId());
                }
                if (playlistSong.getTitle() == null) {
                    z34Var.e(3);
                } else {
                    z34Var.r(3, playlistSong.getTitle());
                }
                if (playlistSong.getArtist() == null) {
                    z34Var.e(4);
                } else {
                    z34Var.r(4, playlistSong.getArtist());
                }
                if (playlistSong.getAlbum() == null) {
                    z34Var.e(5);
                } else {
                    z34Var.r(5, playlistSong.getAlbum());
                }
                if (playlistSong.getTrack() == null) {
                    z34Var.e(6);
                } else {
                    z34Var.c(6, playlistSong.getTrack().intValue());
                }
                if (playlistSong.getCoverArtId() == null) {
                    z34Var.e(7);
                } else {
                    z34Var.r(7, playlistSong.getCoverArtId());
                }
                if (playlistSong.getDuration() == null) {
                    z34Var.e(8);
                } else {
                    z34Var.c(8, playlistSong.getDuration().intValue());
                }
                if (playlistSong.getAlbumId() == null) {
                    z34Var.e(9);
                } else {
                    z34Var.r(9, playlistSong.getAlbumId());
                }
                if (playlistSong.getArtistId() != null) {
                    z34Var.r(10, playlistSong.getArtistId());
                } else {
                    z34Var.e(10);
                }
                break;
            case 7:
                W(z34Var, obj);
                break;
            case 8:
                RecentSearch recentSearch = (RecentSearch) obj;
                if (recentSearch.getSearch() == null) {
                    z34Var.e(1);
                } else {
                    z34Var.r(1, recentSearch.getSearch());
                }
                z34Var.c(2, recentSearch.getTimestamp());
                break;
            default:
                Server server = (Server) obj;
                if (server.getServerId() == null) {
                    z34Var.e(1);
                } else {
                    z34Var.r(1, server.getServerId());
                }
                if (server.getServerName() == null) {
                    z34Var.e(2);
                } else {
                    z34Var.r(2, server.getServerName());
                }
                if (server.getUsername() == null) {
                    z34Var.e(3);
                } else {
                    z34Var.r(3, server.getUsername());
                }
                if (server.getPassword() == null) {
                    z34Var.e(4);
                } else {
                    z34Var.r(4, server.getPassword());
                }
                if (server.getAddress() == null) {
                    z34Var.e(5);
                } else {
                    z34Var.r(5, server.getAddress());
                }
                if (server.getLocalAddress() == null) {
                    z34Var.e(6);
                } else {
                    z34Var.r(6, server.getLocalAddress());
                }
                z34Var.c(7, server.getTimestamp());
                z34Var.c(8, server.isLowSecurity() ? 1L : 0L);
                if (server.getClientCert() != null) {
                    z34Var.r(9, server.getClientCert());
                } else {
                    z34Var.e(9);
                }
                break;
        }
    }

    @Override // defpackage.au0
    public final String i() {
        switch (this.G) {
            case 0:
                return "INSERT OR REPLACE INTO `chronology` (`id`,`timestamp`,`server`,`parent_id`,`is_dir`,`title`,`album`,`artist`,`track`,`year`,`genre`,`cover_art_id`,`size`,`content_type`,`suffix`,`transcoding_content_type`,`transcoded_suffix`,`duration`,`bitrate`,`sampling_rate`,`bit_depth`,`path`,`is_video`,`user_rating`,`average_rating`,`play_count`,`disc_number`,`created`,`starred`,`album_id`,`artist_id`,`type`,`bookmark_position`,`original_width`,`original_height`,`album_artist`,`rg_track_gain`,`rg_album_gain`,`rg_track_peak`,`rg_album_peak`,`rg_base_gain`,`rg_fallback_gain`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `download` (`id`,`playlist_id`,`playlist_name`,`download_state`,`download_uri`,`parent_id`,`is_dir`,`title`,`album`,`artist`,`track`,`year`,`genre`,`cover_art_id`,`size`,`content_type`,`suffix`,`transcoding_content_type`,`transcoded_suffix`,`duration`,`bitrate`,`sampling_rate`,`bit_depth`,`path`,`is_video`,`user_rating`,`average_rating`,`play_count`,`disc_number`,`created`,`starred`,`album_id`,`artist_id`,`type`,`bookmark_position`,`original_width`,`original_height`,`album_artist`,`rg_track_gain`,`rg_album_gain`,`rg_track_peak`,`rg_album_peak`,`rg_base_gain`,`rg_fallback_gain`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 2:
                return "INSERT OR IGNORE INTO `download` (`id`,`playlist_id`,`playlist_name`,`download_state`,`download_uri`,`parent_id`,`is_dir`,`title`,`album`,`artist`,`track`,`year`,`genre`,`cover_art_id`,`size`,`content_type`,`suffix`,`transcoding_content_type`,`transcoded_suffix`,`duration`,`bitrate`,`sampling_rate`,`bit_depth`,`path`,`is_video`,`user_rating`,`average_rating`,`play_count`,`disc_number`,`created`,`starred`,`album_id`,`artist_id`,`type`,`bookmark_position`,`original_width`,`original_height`,`album_artist`,`rg_track_gain`,`rg_album_gain`,`rg_track_peak`,`rg_album_peak`,`rg_base_gain`,`rg_fallback_gain`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return "INSERT OR IGNORE INTO `favorite` (`timestamp`,`songId`,`albumId`,`artistId`,`toStar`) VALUES (?,?,?,?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `internet_radio_station_cache` (`id`,`name`,`stream_url`,`home_page_url`,`source`,`cover_art_url`) VALUES (?,?,?,?,?,?)";
            case 5:
                return "INSERT OR REPLACE INTO `lyrics_cache` (`song_id`,`artist`,`title`,`lyrics`,`structured_lyrics`,`updated_at`) VALUES (?,?,?,?,?,?)";
            case 6:
                return "INSERT OR REPLACE INTO `playlist_song` (`playlist_id`,`id`,`title`,`artist`,`album`,`track`,`cover_art_id`,`duration`,`album_id`,`artist_id`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            case 7:
                return "INSERT OR REPLACE INTO `queue` (`id`,`track_order`,`last_play`,`playing_changed`,`stream_id`,`parent_id`,`is_dir`,`title`,`album`,`artist`,`track`,`year`,`genre`,`cover_art_id`,`size`,`content_type`,`suffix`,`transcoding_content_type`,`transcoded_suffix`,`duration`,`bitrate`,`sampling_rate`,`bit_depth`,`path`,`is_video`,`user_rating`,`average_rating`,`play_count`,`disc_number`,`created`,`starred`,`album_id`,`artist_id`,`type`,`bookmark_position`,`original_width`,`original_height`,`album_artist`,`rg_track_gain`,`rg_album_gain`,`rg_track_peak`,`rg_album_peak`,`rg_base_gain`,`rg_fallback_gain`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 8:
                return "INSERT OR REPLACE INTO `recent_search` (`search`,`timestamp`) VALUES (?,?)";
            default:
                return "INSERT OR REPLACE INTO `server` (`id`,`server_name`,`username`,`password`,`address`,`local_address`,`timestamp`,`low_security`,`client_cert`) VALUES (?,?,?,?,?,?,?,?,?)";
        }
    }

    public /* synthetic */ q20(int i, Object obj) {
        this.G = i;
    }
}
