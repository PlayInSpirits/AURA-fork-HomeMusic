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
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class v8 extends dw3 {
    public final ArtistPageFragment q;
    public ss0 r;
    public Map s;
    public final Map t;
    public final List u;

    public v8(Context context, ArtistPageFragment artistPageFragment) {
        Object[] objArr = {"album", "ep", "single", "compilation", "soundtrack", "live", "remix"};
        ArrayList arrayList = new ArrayList(7);
        for (int i = 0; i < 7; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        this.u = Collections.unmodifiableList(arrayList);
        this.q = artistPageFragment;
        this.s = Collections.EMPTY_MAP;
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("album", context.getString(R.string.artist_page_title_album_section)), new AbstractMap.SimpleEntry("ep", context.getString(R.string.artist_page_title_ep_section)), new AbstractMap.SimpleEntry("single", context.getString(R.string.artist_page_title_single_section)), new AbstractMap.SimpleEntry("compilation", context.getString(R.string.artist_page_title_compilation_section)), new AbstractMap.SimpleEntry("soundtrack", context.getString(R.string.artist_page_title_soundtrack_section)), new AbstractMap.SimpleEntry("live", context.getString(R.string.artist_page_title_live_section)), new AbstractMap.SimpleEntry("remix", context.getString(R.string.artist_page_title_remix_section))};
        HashMap hashMap = new HashMap(7);
        for (int i2 = 0; i2 < 7; i2++) {
            Map.Entry entry = entryArr[i2];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (hashMap.put(key, value) != null) {
                mj0.l(key, "duplicate key: ");
                throw null;
            }
        }
        this.t = Collections.unmodifiableMap(hashMap);
        this.r = null;
    }

    @Override // defpackage.dw3
    public final int a() {
        return this.s.size();
    }

    @Override // defpackage.dw3
    public final void g(cx3 cx3Var, int i) {
        String str;
        u8 u8Var = (u8) cx3Var;
        Stream sorted = this.s.keySet().stream().sorted();
        final List list = this.u;
        Objects.requireNonNull(list);
        String obj = sorted.sorted(Comparator.comparingInt(new ToIntFunction() { // from class: s8
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj2) {
                return list.indexOf((String) obj2);
            }
        })).sorted(Comparator.comparing(new t8(0, this))).toArray()[i].toString();
        Map map = this.t;
        if (map.containsKey(obj)) {
            str = (String) map.get(obj);
        } else {
            str = Character.toUpperCase(obj.charAt(0)) + obj.substring(1);
        }
        ss0 ss0Var = u8Var.u;
        TextView textView = (TextView) ss0Var.q;
        TextView textView2 = (TextView) ss0Var.p;
        textView.setText(str);
        RecyclerView recyclerView = (RecyclerView) ss0Var.o;
        textView2.setTag(obj);
        List list2 = (List) this.s.get(obj);
        recyclerView.setLayoutManager(new LinearLayoutManager(0));
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
        l7 l7Var = new l7(this.q, false);
        recyclerView.setAdapter(l7Var);
        if (list2 != null) {
            textView2.setVisibility(list2.size() <= 5 ? 8 : 0);
            l7Var.r = list2;
            l7Var.d();
        }
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup viewGroup, int i) {
        View i2 = b11.i(viewGroup, R.layout.item_artist_release_section, viewGroup, false);
        int i3 = R.id.album_section_title;
        if (((LinearLayout) uo.s(i2, R.id.album_section_title)) != null) {
            i3 = R.id.main_albums_recycler_view;
            RecyclerView recyclerView = (RecyclerView) uo.s(i2, R.id.main_albums_recycler_view);
            if (recyclerView != null) {
                i3 = R.id.main_albums_see_all_text_view;
                TextView textView = (TextView) uo.s(i2, R.id.main_albums_see_all_text_view);
                if (textView != null) {
                    i3 = R.id.type_title;
                    TextView textView2 = (TextView) uo.s(i2, R.id.type_title);
                    if (textView2 != null) {
                        this.r = new ss0((ConstraintLayout) i2, recyclerView, textView, textView2);
                        return new u8(this, this.r);
                    }
                }
            }
        }
        nz2.n("Missing required view with ID: ".concat(i2.getResources().getResourceName(i3)));
        return null;
    }
}
