package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.util.Log;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.model.LyricsCache;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.ArtistWithAlbumsID3;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.Directory;
import com.eddyizm.tempus.subsonic.models.Genre;
import com.eddyizm.tempus.subsonic.models.Index;
import com.eddyizm.tempus.subsonic.models.Indexes;
import com.eddyizm.tempus.subsonic.models.PodcastChannel;
import com.eddyizm.tempus.subsonic.models.PodcastEpisode;
import com.eddyizm.tempus.subsonic.models.Share;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.AlbumListPageFragment;
import com.eddyizm.tempus.ui.fragment.ArtistCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.ArtistListPageFragment;
import com.eddyizm.tempus.ui.fragment.DirectoryFragment;
import com.eddyizm.tempus.ui.fragment.FilterFragment;
import com.eddyizm.tempus.ui.fragment.GenreCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.IndexFragment;
import com.eddyizm.tempus.ui.fragment.LoginFragment;
import com.eddyizm.tempus.ui.fragment.PlaylistCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.PodcastChannelCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.PodcastChannelPageFragment;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.ArtistBottomSheetDialog;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d8 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d8(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // defpackage.a83
    public final void b(Object r15) {
        int r0 = this.a;
        byte r3 = 3;
        int r4 = 8;
        int r5 = 2;
        boolean r6 = true;
        boolean r7 = true;
        int r8 = 0;
        Object r14 = this.b;
        switch(r0) {
            case 0: goto L228;
            case 1: goto L220;
            case 2: goto L215;
            case 3: goto L210;
            case 4: goto L204;
            case 5: goto L187;
            case 6: goto L176;
            case 7: goto L164;
            case 8: goto L155;
            case 9: goto L153;
            case 10: goto L148;
            case 11: goto L146;
            case 12: goto L125;
            case 13: goto L111;
            case 14: goto L97;
            case 15: goto L95;
            case 16: goto L93;
            case 17: goto L89;
            case 18: goto L73;
            case 19: goto L71;
            case 20: goto L63;
            case 21: goto L55;
            case 22: goto L51;
            case 23: goto L24;
            case 24: goto L18;
            case 25: goto L11;
            default: goto L4;
        };
    L4:
        cl4 r16 = (cl4) r14;
        List r17 = (List) r15;
        k03 r1 = r16.d;
        if (r17 != null) goto L7;
    L9:
        r1.i(new ArrayList());
        return;
    L7:
        if (r17.isEmpty() == true) goto L9;
        Objects.requireNonNull(r1);
        r16.c(r17, new xj(r1, 3));
        return;
    L11:
        bl4 r18 = (bl4) r14;
        List r19 = (List) r15;
        k03 r2 = r18.d;
        if (r19 != null) goto L14;
    L16:
        r2.i(new ArrayList());
        return;
    L14:
        if (r19.isEmpty() == true) goto L16;
        Objects.requireNonNull(r2);
        r18.c(r19, new xj(r2, 2));
        return;
    L18:
        ui4 r110 = (ui4) r14;
        List r111 = (List) r15;
        r110.getClass();
        if (r111 != null) goto L21;
        return;
    L21:
        if (r111.isEmpty() == true) goto L299;
        List r9 = (List) r110.j.d();
        r9.addAll(r111);
        r110.j.k(r9);
        return;
    L299:
        return;
    L24:
        PodcastChannelPageFragment r112 = (PodcastChannelPageFragment) r14;
        List r113 = (List) r15;
        z40 r10 = r112.l0;
        if (r113 != null) goto L29;
        if (r10 == null) goto L28;
        ((RecyclerView) r10.p).setVisibility(8);
    L28:
        r112.o0.p(Collections.EMPTY_LIST);
        return;
    L29:
        if (r10 == null) goto L32;
        ((RecyclerView) r10.p).setVisibility(0);
    L32:
        if (r113.isEmpty() == false) goto L34;
    L46:
        z40 r114 = r112.l0;
        if (r114 == null) goto L49;
        ((RecyclerView) r114.p).setVisibility(8);
    L49:
        r112.o0.p(Collections.EMPTY_LIST);
        return;
    L34:
        if (r113.get(0) == null) goto L46;
        if (((PodcastChannel) r113.get(0)).getEpisodes() == null) goto L46;
        List<PodcastEpisode> r115 = ((PodcastChannel) r113.get(0)).getEpisodes();
        z40 r11 = r112.l0;
        if (r11 == null) goto L45;
        if (r115 == null) goto L45;
        RecyclerView r12 = (RecyclerView) r11.p;
        if (r115.isEmpty() == true) goto L44;
        r4 = 0;
    L44:
        r12.setVisibility(r4);
        r112.o0.p(r115);
        return;
    L45:
        r112.o0.p(Collections.EMPTY_LIST);
        return;
    L51:
        PodcastChannelCatalogueFragment r116 = (PodcastChannelCatalogueFragment) r14;
        List r117 = (List) r15;
        if (r117 == null) goto L303;
        ej r118 = r116.o0;
        r118.r = r117;
        r118.s = new ArrayList(r117);
        r118.d();
        return;
    L303:
        return;
    L55:
        im3 r119 = (im3) r14;
        Boolean r120 = (Boolean) r15;
        if (r120 != null) goto L58;
        return;
    L58:
        if (r120.booleanValue() == true) goto L60;
        return;
    L60:
        if (r119.e == null) goto L306;
        r119.h();
        return;
    L306:
        return;
    L63:
        wl3 r121 = (wl3) r14;
        List r122 = (List) r15;
        if (r122 == null) goto L307;
        r121.j = Integer.valueOf(r122.size());
        d8 r123 = r121.k;
        if (r123 == null) goto L308;
        r121.g.j(r123);
        r121.k = null;
        return;
    L308:
        return;
    L307:
        return;
    L71:
        sl3 r124 = (sl3) r14;
        ((ClipboardManager) r124.X().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(r124.s(R.string.app_name), ((Share) r15).getUrl()));
        return;
    L73:
        fl3 r125 = (fl3) r14;
        List r126 = (List) r15;
        if (r126 == null) goto L309;
        boolean r13 = r126.isEmpty();
        ml3 r20 = r125.B0;
        if (r13 == true) goto L83;
        if (r20 == null) goto L79;
        ((TextView) r20.b).setVisibility(8);
    L79:
        ml3 r21 = r125.B0;
        if (r21 == null) goto L82;
        ((RecyclerView) r21.f).setVisibility(0);
    L82:
        zd0 r127 = r125.D0;
        r127.r = r126;
        r127.d();
        return;
    L83:
        if (r20 == null) goto L85;
        ((TextView) r20.b).setVisibility(0);
    L85:
        ml3 r128 = r125.B0;
        if (r128 == null) goto L311;
        ((RecyclerView) r128.f).setVisibility(8);
        return;
    L311:
        return;
    L309:
        return;
    L89:
        PlaylistCatalogueFragment r129 = (PlaylistCatalogueFragment) r14;
        List r130 = (List) r15;
        if (r130 == null) goto L312;
        Log.d("TempusLog", "UI Update: Received " + r130.size() + " items");
        q7 r22 = r129.o0;
        r22.getClass();
        ArrayList r23 = new ArrayList(r130);
        r22.s = r23;
        r22.t = su3.q((String) r22.v, r23);
        r22.d();
        r129.o0.d();
        return;
    L312:
        return;
    L93:
        ((aj3) r14).e((LyricsCache) r15);
        return;
    L95:
        Long r131 = (Long) r15;
        ((Runnable) r14).run();
        return;
    L97:
        LoginFragment r132 = (LoginFragment) r14;
        List r133 = (List) r15;
        boolean r24 = r133.isEmpty();
        ml3 r25 = r132.l0;
        if (r24 == true) goto L105;
        if (r25 == null) goto L101;
        ((TextView) r25.c).setVisibility(8);
    L101:
        ml3 r26 = r132.l0;
        if (r26 == null) goto L104;
        ((RecyclerView) r26.e).setVisibility(0);
    L104:
        zd0 r134 = r132.o0;
        r134.r = r133;
        r134.d();
        return;
    L105:
        if (r25 == null) goto L107;
        ((TextView) r25.c).setVisibility(0);
    L107:
        ml3 r135 = r132.l0;
        if (r135 == null) goto L314;
        ((RecyclerView) r135.e).setVisibility(8);
        return;
    L314:
        return;
    L111:
        IndexFragment r136 = (IndexFragment) r14;
        Indexes r137 = (Indexes) r15;
        if (r137 != null) goto L114;
        return;
    L114:
        if (r137.getIndices() != null) goto L116;
        List r138 = Collections.EMPTY_LIST;
    L123:
        r136.s0 = r138;
        r136.h0();
        return;
    L116:
        ArrayList r27 = new ArrayList();
        Iterator<Index> r139 = r137.getIndices().iterator();
    L118:
        if (r139.hasNext() == false) goto L122;
        Index r28 = r139.next();
        if (r28.getArtists() == null) goto L118;
        r27.addAll(r28.getArtists());
        goto L118
    L122:
        r138 = r27;
        goto L123
    L125:
        hp1 r140 = (hp1) r14;
        List r141 = (List) r15;
        z40 r29 = r140.l0;
        if (r141 != null) goto L132;
        if (r29 == null) goto L129;
        ((RecyclerView) r29.q).setVisibility(8);
    L129:
        z40 r142 = r140.l0;
        if (r142 == null) goto L316;
        ((LinearLayout) r142.n).setVisibility(8);
        return;
    L316:
        return;
    L132:
        if (r29 == null) goto L138;
        RecyclerView r30 = (RecyclerView) r29.q;
        if (r141.isEmpty() == true) goto L136;
        int r31 = 0;
    L137:
        r30.setVisibility(r31);
        goto L138
    L136:
        r31 = 8;
    L138:
        z40 r32 = r140.l0;
        if (r32 == null) goto L144;
        LinearLayout r33 = (LinearLayout) r32.n;
        if (r141.isEmpty() == false) goto L143;
        r4 = 0;
    L143:
        r33.setVisibility(r4);
    L144:
        zd0 r143 = r140.o0;
        r143.r = r141;
        r143.d();
        return;
    L146:
        List r144 = (List) r15;
        ej r145 = ((GenreCatalogueFragment) r14).o0;
        r145.r = r144;
        r145.s = new ArrayList(r144);
        r145.d();
        return;
    L148:
        FilterFragment r146 = (FilterFragment) r14;
        ((ProgressBar) r146.m0.s).setVisibility(8);
        ((NestedScrollView) r146.m0.o).setVisibility(0);
        Iterator r147 = ((List) r15).iterator();
    L150:
        if (r147.hasNext() == false) goto L152;
        Genre r34 = (Genre) r147.next();
        Chip r35 = (Chip) r146.X().getLayoutInflater().inflate(R.layout.chip_search_filter_genre, null, false);
        r35.setText(r34.getGenre());
        r35.setChecked(r146.n0.d.contains(r34.getGenre()));
        r35.setOnCheckedChangeListener(new w11(r6 ? 1 : 0, r146, r34));
        ((ChipGroup) r146.m0.p).addView(r35);
        goto L150
    L152:
        return;
    L153:
        ((bu0) r14).d.i((List) ((List) r15).stream().map(new m7(22)).collect(Collectors.toList()));
        return;
    L155:
        qq0 r148 = (qq0) r14;
        Directory r149 = (Directory) r15;
        DirectoryFragment r36 = r148.n;
        if (r36.B() == true) goto L158;
        return;
    L158:
        if (r36.l() == null) goto L319;
        List r150 = (List) r149.getChildren().stream().filter(new c7(r5)).collect(Collectors.toList());
        if (ud3.o() != null) goto L162;
        au0.w(r36.Z()).a(gi1.H(r150), (List) r150.stream().map(new hu3(6)).collect(Collectors.toList()), false);
        return;
    L162:
        r150.forEach(new d7(3, r148));
        return;
    L319:
        return;
    L164:
        final DirectoryFragment r151 = (DirectoryFragment) r14;
        final Directory r152 = (Directory) r15;
        ((AppBarLayout) r151.l0.a).a(new pq0(r151, r152));
        ((TextView) r151.l0.e).setText(r152.getName());
        zd0 r37 = r151.o0;
        List<Child> r38 = r152.getChildren();
        r37.getClass();
        if (r38 == null) goto L167;
        ArrayList r39 = new ArrayList(r38);
        r39.sort(new n7(18));
        r37.r = r39;
    L168:
        r37.d();
        MenuItem r153 = r151.r0;
        if (r152.getChildren() != null) goto L171;
    L173:
        r7 = false;
    L174:
        r153.setVisible(r7);
        return;
    L171:
        if (r152.getChildren().stream().filter(new c7(r6 ? 1 : 0)).findFirst().orElse(null) == null) goto L173;
    L167:
        r37.r = Collections.EMPTY_LIST;
        goto L168
    L176:
        wj r154 = (wj) r14;
        ArtistID3 r155 = (ArtistID3) r15;
        k03 r40 = r154.f;
        k03 r41 = r154.g;
        if (r155 != null) goto L179;
        return;
    L179:
        if ((r155 instanceof ArtistWithAlbumsID3) == false) goto L322;
        tj r42 = new tj(r8, r154);
        List<AlbumID3> r156 = ((ArtistWithAlbumsID3) r155).getAlbums();
        if (r156 == null) goto L183;
        r156.sort(Comparator.comparing(new m7(2)).reversed());
        r41.k((Map) ((List) r156.stream().filter(r42).collect(Collectors.toList())).stream().collect(Collectors.groupingBy(new m7(14))));
    L184:
        if (r156 == null) goto L323;
        r156.sort(Comparator.comparing(new m7(2)).reversed());
        r40.k((List) r156.stream().filter(new tj(r6 ? 1 : 0, r42)).collect(Collectors.toList()));
        return;
    L323:
        return;
    L183:
        r41.k(Collections.EMPTY_MAP);
        r40.k(Collections.EMPTY_LIST);
        goto L184
    L322:
        return;
    L187:
        ArtistListPageFragment r157 = (ArtistListPageFragment) r14;
        List r158 = (List) r15;
        b8 r43 = r157.o0;
        if (r158 == null) goto L190;
        List r44 = r158;
    L191:
        r43.s = r44;
        ((o7) r43.v).filter(r43.u);
        r43.d();
        String r45 = r157.n0.e;
        r45.getClass();
        if (r45.equals("ARTIST_STARRED") == false) goto L194;
    L196:
        r157.l0.e.setText(r157.t(R.string.generic_list_page_count, new Object[]{Integer.valueOf(r158.size())}));
    L197:
        String r159 = r157.n0.e;
        r159.getClass();
        if (r159.equals("ARTIST_STARRED") == false) goto L200;
    L202:
        r157.l0.d.setVisibility(0);
        return;
    L200:
        if (r159.equals("ARTIST_DOWNLOADED") == true) goto L202;
        return;
    L194:
        if (r45.equals("ARTIST_DOWNLOADED") == true) goto L196;
    L190:
        r43.getClass();
        r44 = Collections.EMPTY_LIST;
        goto L191
    L204:
        ArtistCatalogueFragment r160 = (ArtistCatalogueFragment) r14;
        List r161 = (List) r15;
        ej r46 = r160.o0;
        r46.r = r161;
        r46.s = new ArrayList(r161);
        r46.d();
        ej r162 = r160.o0;
        App.b().getClass();
        boolean r163 = App.c().getBoolean("artist_sort_by_album_count", false);
        Log.d("Preferences", "getSortOrder");
        if (r163 == false) goto L207;
        String r164 = "ARTIST_ORDER_BY_ALBUM_COUNT";
    L208:
        r162.q(r164);
        return;
    L207:
        r164 = "ARTIST_ORDER_BY_NAME";
        goto L208
    L210:
        ArtistBottomSheetDialog r165 = (ArtistBottomSheetDialog) r14;
        List r166 = (List) r15;
        e03.o(r166);
        if (r166.isEmpty() == true) goto L213;
        bo2.q(r165.D0, r166, 0, "artist");
        ((au) ((MainActivity) r165.X()).V.n).d(true);
    L213:
        r165.h0();
        return;
    L215:
        n8 r167 = (n8) r14;
        AlbumID3 r168 = (AlbumID3) r15;
        if (r168 == null) goto L218;
        r167.h.k(r168);
        return;
    L218:
        r167.getClass();
        return;
    L220:
        ToggleButton r169 = (ToggleButton) r14;
        AlbumID3 r170 = (AlbumID3) r15;
        if (r170 == null) goto L326;
        String r47 = r170.getId();
        if (r170.getStarred() != null) goto L226;
        r6 = false;
    L226:
        r169.setChecked(n61.f(2, r47, r6));
        return;
    L326:
        return;
    L228:
        AlbumListPageFragment r171 = (AlbumListPageFragment) r14;
        List r172 = (List) r15;
        b8 r48 = r171.o0;
        if (r172 == null) goto L231;
        List r49 = r172;
    L232:
        r48.s = r49;
        ((o7) r48.v).filter(r48.u);
        r48.d();
        String r50 = r171.n0.d;
        r50.getClass();
        switch(r50.hashCode()) {
            case -1245588193: goto L248;
            case 909521647: goto L244;
            case 928429018: goto L240;
            case 1124239097: goto L236;
            default: goto L234;
        };
    L234:
        char r51 = 65535;
    L251:
        switch(r51) {
            case 0: goto L254;
            case 1: goto L253;
            case 2: goto L254;
            case 3: goto L254;
            default: goto L259;
        };
    L253:
        r171.l0.e.setText(r171.t(R.string.generic_list_page_count, new Object[]{Integer.valueOf(r172.size())}));
        goto L259
    L254:
        TextView r52 = r171.l0.e;
        int r53 = r172.size();
        int r173 = r171.n0.h;
        if (r53 >= r173) goto L257;
        String r174 = r171.t(R.string.generic_list_page_count, new Object[]{Integer.valueOf(r172.size())});
    L258:
        r52.setText(r174);
        goto L259
    L257:
        r174 = r171.t(R.string.generic_list_page_count_unknown, new Object[]{Integer.valueOf(r173)});
    L259:
        String r175 = r171.n0.d;
        r175.getClass();
        switch(r175.hashCode()) {
            case -1245588193: goto L274;
            case 909521647: goto L270;
            case 928429018: goto L266;
            case 1124239097: goto L263;
            default: goto L261;
        };
    L261:
        r3 = -1;
    L277:
        switch(r3) {
            case 0: goto L280;
            case 1: goto L279;
            case 2: goto L280;
            case 3: goto L280;
            default: goto L328;
        };
    L279:
        r171.l0.d.setVisibility(0);
        return;
    L280:
        r171.l0.d.setVisibility(8);
        return;
    L328:
        return;
    L263:
        if (r175.equals("ALBUM_RECENTLY_ADDED") == true) goto L277;
        r3 = -1;
        goto L277
    L266:
        if (r175.equals("ALBUM_RECENTLY_PLAYED") == false) goto L293;
        r3 = 2;
        goto L277
    L293:
        r3 = -1;
        goto L277
    L270:
        if (r175.equals("ALBUM_STARRED") == false) goto L294;
        r3 = 1;
        goto L277
    L294:
        r3 = -1;
        goto L277
    L274:
        if (r175.equals("ALBUM_MOST_PLAYED") == false) goto L295;
        r3 = 0;
        goto L277
    L295:
        r3 = -1;
        goto L277
    L236:
        if (r50.equals("ALBUM_RECENTLY_ADDED") == false) goto L288;
        r51 = 3;
        goto L251
    L288:
        r51 = 65535;
        goto L251
    L240:
        if (r50.equals("ALBUM_RECENTLY_PLAYED") == false) goto L289;
        r51 = 2;
        goto L251
    L289:
        r51 = 65535;
        goto L251
    L244:
        if (r50.equals("ALBUM_STARRED") == false) goto L290;
        r51 = 1;
        goto L251
    L290:
        r51 = 65535;
        goto L251
    L248:
        if (r50.equals("ALBUM_MOST_PLAYED") == false) goto L291;
        r51 = 0;
        goto L251
    L291:
        r51 = 65535;
        goto L251
    L231:
        r48.getClass();
        r49 = Collections.EMPTY_LIST;
        goto L232
    }
}
