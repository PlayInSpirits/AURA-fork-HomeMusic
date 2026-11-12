package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import app.homemusic.R;
import com.eddyizm.tempus.subsonic.models.MusicFolder;
import com.eddyizm.tempus.ui.fragment.AlbumCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.AlbumListPageFragment;
import com.eddyizm.tempus.ui.fragment.ArtistCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.ArtistListPageFragment;
import com.eddyizm.tempus.ui.fragment.FilterFragment;
import com.eddyizm.tempus.ui.fragment.GenreCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.IndexFragment;
import com.eddyizm.tempus.ui.fragment.LoginFragment;
import com.eddyizm.tempus.ui.fragment.PlaylistCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.PodcastChannelCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.SongListPageFragment;
import com.google.android.material.appbar.MaterialToolbar;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u7 implements af {
    public final /* synthetic */ int a;
    public final /* synthetic */ kc1 b;

    public /* synthetic */ u7(int r1, kc1 r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // defpackage.af
    public final void a(int r4) {
        int r0 = this.a;
        kc1 r3 = this.b;
        switch(r0) {
            case 0: goto L88;
            case 1: goto L80;
            case 2: goto L72;
            case 3: goto L64;
            case 4: goto L56;
            case 5: goto L48;
            case 6: goto L36;
            case 7: goto L28;
            case 8: goto L20;
            case 9: goto L12;
            default: goto L4;
        };
    L4:
        SongListPageFragment r5 = (SongListPageFragment) r3;
        up0 r1 = r5.l0;
        if (r1 == null) goto L97;
        int r2 = ((ConstraintLayout) r1.a).getHeight() + r4;
        MaterialToolbar r6 = (MaterialToolbar) r5.l0.i;
        WeakHashMap r7 = j65.a;
        int r8 = r6.getMinimumHeight() * 2;
        up0 r9 = r5.l0;
        if (r2 >= r8) goto L10;
        ((MaterialToolbar) r9.i).setTitle(r5.n0.f);
        return;
    L10:
        ((MaterialToolbar) r9.i).setTitle(R.string.empty_string);
        return;
    L97:
        return;
    L12:
        PodcastChannelCatalogueFragment r10 = (PodcastChannelCatalogueFragment) r3;
        bq4 r11 = r10.l0;
        if (r11 == null) goto L99;
        int r12 = ((ConstraintLayout) r11.p).getHeight() + r4;
        MaterialToolbar r13 = (MaterialToolbar) r10.l0.q;
        WeakHashMap r14 = j65.a;
        int r15 = r13.getMinimumHeight() * 2;
        bq4 r16 = r10.l0;
        if (r12 >= r15) goto L18;
        ((MaterialToolbar) r16.q).setTitle(R.string.podcast_channel_catalogue_title);
        return;
    L18:
        ((MaterialToolbar) r16.q).setTitle(R.string.empty_string);
        return;
    L99:
        return;
    L20:
        PlaylistCatalogueFragment r17 = (PlaylistCatalogueFragment) r3;
        rc1 r18 = r17.l0;
        if (r18 == null) goto L101;
        int r19 = r18.a.getHeight() + r4;
        MaterialToolbar r20 = r17.l0.e;
        WeakHashMap r21 = j65.a;
        int r22 = r20.getMinimumHeight() * 2;
        rc1 r23 = r17.l0;
        if (r19 >= r22) goto L26;
        r23.e.setTitle(R.string.playlist_catalogue_title);
        return;
    L26:
        r23.e.setTitle(R.string.empty_string);
        return;
    L101:
        return;
    L28:
        LoginFragment r24 = (LoginFragment) r3;
        ml3 r25 = r24.l0;
        if (r25 == null) goto L103;
        int r26 = ((ConstraintLayout) r25.d).getHeight() + r4;
        MaterialToolbar r27 = (MaterialToolbar) r24.l0.f;
        WeakHashMap r28 = j65.a;
        int r29 = r27.getMinimumHeight() * 2;
        ml3 r30 = r24.l0;
        if (r26 >= r29) goto L34;
        ((MaterialToolbar) r30.f).setTitle(R.string.login_title);
        return;
    L34:
        ((MaterialToolbar) r30.f).setTitle(R.string.empty_string);
        return;
    L103:
        return;
    L36:
        IndexFragment r31 = (IndexFragment) r3;
        ey r32 = r31.l0;
        if (r32 == null) goto L105;
        int r33 = ((ConstraintLayout) r32.e).getHeight() + r4;
        MaterialToolbar r34 = (MaterialToolbar) r31.l0.h;
        WeakHashMap r35 = j65.a;
        int r36 = r34.getMinimumHeight() * 2;
        ey r37 = r31.l0;
        if (r33 >= r36) goto L46;
        MaterialToolbar r38 = (MaterialToolbar) r37.h;
        MusicFolder r39 = r31.n0.d;
        if (r39 == null) goto L44;
        String r40 = r39.getName();
    L45:
        r38.setTitle(r40);
        return;
    L44:
        r40 = "";
        goto L45
    L46:
        ((MaterialToolbar) r37.h).setTitle(R.string.empty_string);
        return;
    L105:
        return;
    L48:
        GenreCatalogueFragment r41 = (GenreCatalogueFragment) r3;
        ml3 r42 = r41.l0;
        if (r42 == null) goto L107;
        int r43 = ((ConstraintLayout) r42.d).getHeight() + r4;
        MaterialToolbar r44 = (MaterialToolbar) r41.l0.f;
        WeakHashMap r45 = j65.a;
        int r46 = r44.getMinimumHeight() * 2;
        ml3 r47 = r41.l0;
        if (r43 >= r46) goto L54;
        ((MaterialToolbar) r47.f).setTitle(R.string.genre_catalogue_title);
        return;
    L54:
        ((MaterialToolbar) r47.f).setTitle(R.string.empty_string);
        return;
    L107:
        return;
    L56:
        FilterFragment r48 = (FilterFragment) r3;
        lv4 r49 = r48.m0;
        if (r49 == null) goto L109;
        int r50 = ((ConstraintLayout) r49.r).getHeight() + r4;
        MaterialToolbar r51 = (MaterialToolbar) r48.m0.t;
        WeakHashMap r52 = j65.a;
        int r53 = r51.getMinimumHeight() * 2;
        lv4 r54 = r48.m0;
        if (r50 >= r53) goto L62;
        ((MaterialToolbar) r54.t).setTitle(R.string.filter_title);
        return;
    L62:
        ((MaterialToolbar) r54.t).setTitle(R.string.empty_string);
        return;
    L109:
        return;
    L64:
        ArtistListPageFragment r55 = (ArtistListPageFragment) r3;
        oc1 r56 = r55.l0;
        if (r56 == null) goto L111;
        int r57 = r56.b.getHeight() + r4;
        MaterialToolbar r58 = r55.l0.g;
        WeakHashMap r59 = j65.a;
        int r60 = r58.getMinimumHeight() * 2;
        oc1 r61 = r55.l0;
        if (r57 >= r60) goto L70;
        r61.g.setTitle(R.string.artist_list_page_title);
        return;
    L70:
        r61.g.setTitle(R.string.empty_string);
        return;
    L111:
        return;
    L72:
        ArtistCatalogueFragment r62 = (ArtistCatalogueFragment) r3;
        rc1 r63 = r62.l0;
        if (r63 == null) goto L113;
        int r64 = r63.a.getHeight() + r4;
        MaterialToolbar r65 = r62.l0.e;
        WeakHashMap r66 = j65.a;
        int r67 = r65.getMinimumHeight() * 2;
        rc1 r68 = r62.l0;
        if (r64 >= r67) goto L78;
        r68.e.setTitle(R.string.artist_catalogue_title);
        return;
    L78:
        r68.e.setTitle(R.string.empty_string);
        return;
    L113:
        return;
    L80:
        AlbumListPageFragment r69 = (AlbumListPageFragment) r3;
        oc1 r70 = r69.l0;
        if (r70 == null) goto L115;
        int r71 = r70.b.getHeight() + r4;
        MaterialToolbar r72 = r69.l0.g;
        WeakHashMap r73 = j65.a;
        int r74 = r72.getMinimumHeight() * 2;
        oc1 r75 = r69.l0;
        if (r71 >= r74) goto L86;
        r75.g.setTitle(R.string.album_list_page_title);
        return;
    L86:
        r75.g.setTitle(R.string.empty_string);
        return;
    L115:
        return;
    L88:
        AlbumCatalogueFragment r76 = (AlbumCatalogueFragment) r3;
        lv4 r77 = r76.l0;
        if (r77 == null) goto L117;
        int r78 = ((ConstraintLayout) r77.o).getHeight() + r4;
        MaterialToolbar r79 = (MaterialToolbar) r76.l0.t;
        WeakHashMap r80 = j65.a;
        int r81 = r79.getMinimumHeight() * 2;
        lv4 r82 = r76.l0;
        if (r78 >= r81) goto L94;
        ((MaterialToolbar) r82.t).setTitle(R.string.album_catalogue_title);
        return;
    L94:
        ((MaterialToolbar) r82.t).setTitle(R.string.empty_string);
        return;
    }
}
