package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.ui.fragment.ArtistPageFragment;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v8 extends dw3 {
    public final ArtistPageFragment q;
    public ss0 r;
    public Map s;
    public final Map t;
    public final List u;

    public v8(Context r10, ArtistPageFragment r11) {
        Object[] r0 = {"album", "ep", "single", "compilation", "soundtrack", "live", "remix"};
        ArrayList r1 = new ArrayList(7);
        int r3 = 0;
        int r4 = 0;
    L3:
        if (r4 >= 7) goto L5;
        Object r5 = r0[r4];
        Objects.requireNonNull(r5);
        r1.add(r5);
        r4 = r4 + 1;
        goto L3
    L5:
        this.u = Collections.unmodifiableList(r1);
        this.q = r11;
        this.s = Collections.EMPTY_MAP;
        Map.Entry[] r12 = {new AbstractMap.SimpleEntry("album", r10.getString(R.string.artist_page_title_album_section)), new AbstractMap.SimpleEntry("ep", r10.getString(R.string.artist_page_title_ep_section)), new AbstractMap.SimpleEntry("single", r10.getString(R.string.artist_page_title_single_section)), new AbstractMap.SimpleEntry("compilation", r10.getString(R.string.artist_page_title_compilation_section)), new AbstractMap.SimpleEntry("soundtrack", r10.getString(R.string.artist_page_title_soundtrack_section)), new AbstractMap.SimpleEntry("live", r10.getString(R.string.artist_page_title_live_section)), new AbstractMap.SimpleEntry("remix", r10.getString(R.string.artist_page_title_remix_section))};
        HashMap r13 = new HashMap(7);
    L7:
        if (r3 >= 7) goto L13;
        Map.Entry r2 = r12[r3];
        Object r6 = r2.getKey();
        Objects.requireNonNull(r6);
        Object r7 = r2.getValue();
        Objects.requireNonNull(r7);
        if (r13.put(r6, r7) != null) goto L11;
        r3 = r3 + 1;
        goto L7
    L11:
        mj0.l(r6, "duplicate key: ");
        throw null;
    L13:
        this.t = Collections.unmodifiableMap(r13);
        this.r = null;
    }

    @Override // defpackage.dw3
    public final int a() {
        return this.s.size();
    }

    @Override // defpackage.dw3
    public final void g(cx3 r6, int r7) {
        u8 r8 = (u8) r6;
        Stream r0 = this.s.keySet().stream().sorted();
        final List r1 = this.u;
        Objects.requireNonNull(r1);
        int r2 = 0;
        String r9 = r0.sorted(Comparator.comparingInt(new s8(r1))).sorted(Comparator.comparing(new t8(0, this))).toArray()[r7].toString();
        Map r3 = this.t;
        if (r3.containsKey(r9) == false) goto L5;
        String r4 = (String) r3.get(r9);
    L6:
        ss0 r10 = r8.u;
        TextView r5 = (TextView) r10.q;
        TextView r11 = (TextView) r10.p;
        r5.setText(r4);
        RecyclerView r12 = (RecyclerView) r10.o;
        r11.setTag(r9);
        List r13 = (List) this.s.get(r9);
        r12.setLayoutManager(new LinearLayoutManager(0));
        r12.setHasFixedSize(true);
        r12.setNestedScrollingEnabled(false);
        l7 r14 = new l7(this.q, false);
        r12.setAdapter(r14);
        if (r13 != null) goto L9;
        return;
    L9:
        if (r13.size() > 5) goto L12;
        r2 = 8;
    L12:
        r11.setVisibility(r2);
        r14.r = r13;
        r14.d();
        return;
    L5:
        r4 = Character.toUpperCase(r9.charAt(0)) + r9.substring(1);
        goto L6
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup r4, int r5) {
        View r6 = b11.i(r4, R.layout.item_artist_release_section, r4, false);
        int r7 = R.id.album_section_title;
        if (((LinearLayout) uo.s(r6, R.id.album_section_title)) == null) goto L12;
        r7 = R.id.main_albums_recycler_view;
        RecyclerView r0 = (RecyclerView) uo.s(r6, R.id.main_albums_recycler_view);
        if (r0 == null) goto L12;
        r7 = R.id.main_albums_see_all_text_view;
        TextView r1 = (TextView) uo.s(r6, R.id.main_albums_see_all_text_view);
        if (r1 == null) goto L12;
        r7 = R.id.type_title;
        TextView r2 = (TextView) uo.s(r6, R.id.type_title);
        if (r2 == null) goto L12;
        this.r = new ss0((ConstraintLayout) r6, r0, r1, r2);
        return new u8(this, this.r);
    L12:
        nz2.n("Missing required view with ID: ".concat(r6.getResources().getResourceName(r7)));
        return null;
    }
}
