package com.eddyizm.tempus.viewmodel;

import android.app.Application;
import app.homemusic.R;
import com.eddyizm.tempus.model.HomeSector;
import defpackage.hd;
import defpackage.nk1;
import defpackage.ud3;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class a extends hd {
    public List c;

    public a(Application application) {
        super(application);
        this.c = new ArrayList();
    }

    public final List c() {
        List list = this.c;
        if (list != null && !list.isEmpty()) {
            return this.c;
        }
        if (ud3.r() == null || ud3.r().equals("null")) {
            ArrayList arrayList = new ArrayList();
            Application application = this.b;
            application.getClass();
            arrayList.add(new HomeSector("HOME_SECTOR_DISCOVERY", application.getString(R.string.home_title_discovery), true, 1));
            arrayList.add(new HomeSector("HOME_SECTOR_CONTINUE_LISTENING", application.getString(R.string.home_title_continue_listening), true, 2));
            arrayList.add(new HomeSector("HOME_SECTOR_MADE_FOR_YOU", application.getString(R.string.home_title_made_for_you), true, 2));
            arrayList.add(new HomeSector("HOME_SECTOR_BEST_OF", application.getString(R.string.home_title_best_of), true, 3));
            arrayList.add(new HomeSector("HOME_SECTOR_RADIO_STATION", application.getString(R.string.home_title_radio_station), true, 4));
            arrayList.add(new HomeSector("HOME_SECTOR_TOP_SONGS", application.getString(R.string.home_title_top_songs), true, 5));
            arrayList.add(new HomeSector("HOME_SECTOR_STARRED_TRACKS", application.getString(R.string.home_title_starred_tracks), true, 6));
            arrayList.add(new HomeSector("HOME_SECTOR_STARRED_ALBUMS", application.getString(R.string.home_title_starred_albums), true, 7));
            arrayList.add(new HomeSector("HOME_SECTOR_STARRED_ARTISTS", application.getString(R.string.home_title_starred_artists), true, 8));
            arrayList.add(new HomeSector("HOME_SECTOR_NEW_RELEASES", application.getString(R.string.home_title_new_releases), true, 9));
            arrayList.add(new HomeSector("HOME_SECTOR_FLASHBACK", application.getString(R.string.home_title_flashback), true, 10));
            arrayList.add(new HomeSector("HOME_SECTOR_MOST_PLAYED", application.getString(R.string.home_title_most_played), true, 11));
            arrayList.add(new HomeSector("HOME_SECTOR_LAST_PLAYED", application.getString(R.string.home_title_last_played), true, 12));
            arrayList.add(new HomeSector("HOME_SECTOR_RECENTLY_ADDED", application.getString(R.string.home_title_recently_added), true, 13));
            arrayList.add(new HomeSector("HOME_SECTOR_PINNED_PLAYLISTS", application.getString(R.string.home_title_pinned_playlists), true, 14));
            arrayList.add(new HomeSector("HOME_SECTOR_SHARED", application.getString(R.string.home_title_shares), true, 15));
            this.c = arrayList;
        } else {
            this.c = (List) new nk1().f(ud3.r(), new HomeRearrangementViewModel$1().getType());
        }
        return this.c;
    }
}
