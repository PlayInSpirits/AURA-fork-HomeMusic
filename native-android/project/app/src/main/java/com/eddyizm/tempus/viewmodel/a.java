package com.eddyizm.tempus.viewmodel;

import android.app.Application;
import app.homemusic.R;
import com.eddyizm.tempus.model.HomeSector;
import defpackage.hd;
import defpackage.nk1;
import defpackage.ud3;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class a extends hd {
    public List c;

    public a(Application r1) {
        super(r1);
        this.c = new ArrayList();
    }

    public final List c() {
        List r0 = this.c;
        if (r0 == null) goto L9;
        if (r0.isEmpty() == true) goto L9;
        return this.c;
    L9:
        if (ud3.r() != null) goto L11;
    L13:
        ArrayList r1 = new ArrayList();
        Application r2 = this.b;
        r2.getClass();
        r1.add(new HomeSector("HOME_SECTOR_DISCOVERY", r2.getString(R.string.home_title_discovery), true, 1));
        r1.add(new HomeSector("HOME_SECTOR_CONTINUE_LISTENING", r2.getString(R.string.home_title_continue_listening), true, 2));
        r1.add(new HomeSector("HOME_SECTOR_MADE_FOR_YOU", r2.getString(R.string.home_title_made_for_you), true, 2));
        r1.add(new HomeSector("HOME_SECTOR_BEST_OF", r2.getString(R.string.home_title_best_of), true, 3));
        r1.add(new HomeSector("HOME_SECTOR_RADIO_STATION", r2.getString(R.string.home_title_radio_station), true, 4));
        r1.add(new HomeSector("HOME_SECTOR_TOP_SONGS", r2.getString(R.string.home_title_top_songs), true, 5));
        r1.add(new HomeSector("HOME_SECTOR_STARRED_TRACKS", r2.getString(R.string.home_title_starred_tracks), true, 6));
        r1.add(new HomeSector("HOME_SECTOR_STARRED_ALBUMS", r2.getString(R.string.home_title_starred_albums), true, 7));
        r1.add(new HomeSector("HOME_SECTOR_STARRED_ARTISTS", r2.getString(R.string.home_title_starred_artists), true, 8));
        r1.add(new HomeSector("HOME_SECTOR_NEW_RELEASES", r2.getString(R.string.home_title_new_releases), true, 9));
        r1.add(new HomeSector("HOME_SECTOR_FLASHBACK", r2.getString(R.string.home_title_flashback), true, 10));
        r1.add(new HomeSector("HOME_SECTOR_MOST_PLAYED", r2.getString(R.string.home_title_most_played), true, 11));
        r1.add(new HomeSector("HOME_SECTOR_LAST_PLAYED", r2.getString(R.string.home_title_last_played), true, 12));
        r1.add(new HomeSector("HOME_SECTOR_RECENTLY_ADDED", r2.getString(R.string.home_title_recently_added), true, 13));
        r1.add(new HomeSector("HOME_SECTOR_PINNED_PLAYLISTS", r2.getString(R.string.home_title_pinned_playlists), true, 14));
        r1.add(new HomeSector("HOME_SECTOR_SHARED", r2.getString(R.string.home_title_shares), true, 15));
        this.c = r1;
    L15:
        return this.c;
    L11:
        if (ud3.r().equals("null") == true) goto L13;
        this.c = (List) new nk1().f(ud3.r(), new HomeRearrangementViewModel$1().getType());
        goto L15
    }
}
