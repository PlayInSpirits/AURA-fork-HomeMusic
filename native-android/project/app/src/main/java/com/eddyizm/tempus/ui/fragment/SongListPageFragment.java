package com.eddyizm.tempus.ui.fragment;

import android.content.ComponentName;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SearchView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import app.homemusic.R;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.Genre;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.SongListPageFragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.aj2;
import defpackage.au;
import defpackage.av4;
import defpackage.b11;
import defpackage.b75;
import defpackage.bd1;
import defpackage.bj2;
import defpackage.bl2;
import defpackage.bo2;
import defpackage.bq4;
import defpackage.cb4;
import defpackage.e75;
import defpackage.eg0;
import defpackage.ei4;
import defpackage.f35;
import defpackage.fi0;
import defpackage.g12;
import defpackage.gb;
import defpackage.gh0;
import defpackage.i30;
import defpackage.jx3;
import defpackage.jz4;
import defpackage.k03;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.le1;
import defpackage.li3;
import defpackage.mb0;
import defpackage.nc1;
import defpackage.ni4;
import defpackage.nz2;
import defpackage.o;
import defpackage.oi4;
import defpackage.p6;
import defpackage.pi4;
import defpackage.rb0;
import defpackage.ri4;
import defpackage.rm3;
import defpackage.s7;
import defpackage.sb0;
import defpackage.si4;
import defpackage.sk2;
import defpackage.ss2;
import defpackage.ti4;
import defpackage.u7;
import defpackage.ui4;
import defpackage.uo;
import defpackage.up0;
import defpackage.v13;
import defpackage.v23;
import defpackage.vo1;
import defpackage.w7;
import defpackage.wb0;
import defpackage.wd1;
import defpackage.wn1;
import defpackage.wo1;
import defpackage.x7;
import defpackage.xc5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class SongListPageFragment extends kc1 implements ClickCallback {
    public up0 l0;
    public MainActivity m0;
    public ui4 n0;
    public li3 o0;
    public ni4 p0;
    public bl2 q0;
    public boolean r0 = true;
    public int s0;

    @Override // defpackage.kc1
    public final void F(Bundle bundle) {
        super.F(bundle);
        d0();
    }

    @Override // defpackage.kc1
    public final void G(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.toolbar_menu, menu);
        SearchView searchView = (SearchView) menu.findItem(R.id.action_search).getActionView();
        searchView.setImeOptions(6);
        searchView.setOnQueryTextListener(new w7(this, searchView, 6));
        searchView.setPadding(-32, 0, 0, 0);
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        v23 v23Var;
        this.m0 = (MainActivity) e();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_song_list_page, viewGroup, false);
        int i = R.id.album_info_sector;
        ConstraintLayout constraintLayout = (ConstraintLayout) uo.s(viewInflate, R.id.album_info_sector);
        if (constraintLayout != null) {
            i = R.id.app_bar_layout;
            AppBarLayout appBarLayout = (AppBarLayout) uo.s(viewInflate, R.id.app_bar_layout);
            if (appBarLayout != null) {
                i = R.id.page_subtitle_label;
                TextView textView = (TextView) uo.s(viewInflate, R.id.page_subtitle_label);
                if (textView != null) {
                    i = R.id.page_title_label;
                    TextView textView2 = (TextView) uo.s(viewInflate, R.id.page_title_label);
                    if (textView2 != null) {
                        i = R.id.song_list_recycler_view;
                        RecyclerView recyclerView = (RecyclerView) uo.s(viewInflate, R.id.song_list_recycler_view);
                        if (recyclerView != null) {
                            i = R.id.song_list_shuffle_image_view;
                            Button button = (Button) uo.s(viewInflate, R.id.song_list_shuffle_image_view);
                            if (button != null) {
                                i = R.id.song_list_sort_image_view;
                                Button button2 = (Button) uo.s(viewInflate, R.id.song_list_sort_image_view);
                                if (button2 != null) {
                                    i = R.id.swipe_song_list_to_refresh;
                                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) uo.s(viewInflate, R.id.swipe_song_list_to_refresh);
                                    if (swipeRefreshLayout != null) {
                                        i = R.id.toolbar;
                                        MaterialToolbar materialToolbar = (MaterialToolbar) uo.s(viewInflate, R.id.toolbar);
                                        if (materialToolbar != null) {
                                            LinearLayout linearLayout = (LinearLayout) viewInflate;
                                            this.l0 = new up0(linearLayout, constraintLayout, appBarLayout, textView, textView2, recyclerView, button, button2, swipeRefreshLayout, materialToolbar);
                                            nc1 nc1VarX = X();
                                            e75 e75VarD = nc1VarX.d();
                                            b75 b75VarR = gh0.r(nc1VarX);
                                            bq4 bq4Var = new bq4(e75VarD, b75VarR, b11.e(nc1VarX, b75VarR));
                                            i30 i30VarA = kx3.a(ui4.class);
                                            String strB = i30VarA.b();
                                            if (strB == null) {
                                                kf2.n("Local and anonymous classes can not be ViewModels");
                                                return null;
                                            }
                                            this.n0 = (ui4) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                                            nc1 nc1VarX2 = X();
                                            e75 e75VarD2 = nc1VarX2.d();
                                            b75 b75VarR2 = gh0.r(nc1VarX2);
                                            bq4 bq4Var2 = new bq4(e75VarD2, b75VarR2, b11.e(nc1VarX2, b75VarR2));
                                            i30 i30VarA2 = kx3.a(li3.class);
                                            String strB2 = i30VarA2.b();
                                            if (strB2 == null) {
                                                kf2.n("Local and anonymous classes can not be ViewModels");
                                                return null;
                                            }
                                            this.o0 = (li3) bq4Var2.l(i30VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB2));
                                            Bundle bundle2 = this.s;
                                            if (bundle2 == null) {
                                                MainActivity mainActivity = this.m0;
                                                if (mainActivity != null && (v23Var = mainActivity.T) != null) {
                                                    v23Var.o();
                                                    return linearLayout;
                                                }
                                            } else {
                                                if (bundle2.getString("MEDIA_RECENTLY_PLAYED") != null) {
                                                    ui4 ui4Var = this.n0;
                                                    ui4Var.e = "MEDIA_RECENTLY_PLAYED";
                                                    ui4Var.f = s(R.string.song_list_page_recently_played);
                                                    ((TextView) this.l0.d).setText(R.string.song_list_page_recently_played);
                                                } else if (bundle2.getString("MEDIA_MOST_PLAYED") != null) {
                                                    ui4 ui4Var2 = this.n0;
                                                    ui4Var2.e = "MEDIA_MOST_PLAYED";
                                                    ui4Var2.f = s(R.string.song_list_page_most_played);
                                                    ((TextView) this.l0.d).setText(R.string.song_list_page_most_played);
                                                } else if (bundle2.getString("MEDIA_RECENTLY_ADDED") != null) {
                                                    ui4 ui4Var3 = this.n0;
                                                    ui4Var3.e = "MEDIA_RECENTLY_ADDED";
                                                    ui4Var3.f = s(R.string.song_list_page_recently_added);
                                                    ((TextView) this.l0.d).setText(R.string.song_list_page_recently_added);
                                                } else if (bundle2.getString("MEDIA_BY_GENRE") != null) {
                                                    ui4 ui4Var4 = this.n0;
                                                    ui4Var4.e = "MEDIA_BY_GENRE";
                                                    ui4Var4.g = (Genre) bundle2.getParcelable("GENRE_OBJECT");
                                                    ui4 ui4Var5 = this.n0;
                                                    ui4Var5.f = ui4Var5.g.getGenre();
                                                    ((TextView) this.l0.d).setText(this.n0.g.getGenre());
                                                } else if (bundle2.getString("MEDIA_BY_ARTIST") != null) {
                                                    ui4 ui4Var6 = this.n0;
                                                    ui4Var6.e = "MEDIA_BY_ARTIST";
                                                    ui4Var6.h = (ArtistID3) bundle2.getParcelable("ARTIST_OBJECT");
                                                    ui4 ui4Var7 = this.n0;
                                                    ui4Var7.f = t(R.string.song_list_page_top, ui4Var7.h.getName());
                                                    ((TextView) this.l0.d).setText(t(R.string.song_list_page_top, this.n0.h.getName()));
                                                } else if (bundle2.getString("MEDIA_BY_GENRES") != null) {
                                                    ui4 ui4Var8 = this.n0;
                                                    ui4Var8.e = "MEDIA_BY_GENRES";
                                                    ui4Var8.k = bundle2.getStringArrayList("filters_list");
                                                    this.n0.l = bundle2.getStringArrayList("filter_name_list");
                                                    ui4 ui4Var9 = this.n0;
                                                    ui4Var9.f = TextUtils.join(", ", ui4Var9.l);
                                                    ((TextView) this.l0.d).setText(TextUtils.join(", ", this.n0.l));
                                                } else if (bundle2.getString("MEDIA_BY_YEAR") != null) {
                                                    ui4 ui4Var10 = this.n0;
                                                    ui4Var10.e = "MEDIA_BY_YEAR";
                                                    ui4Var10.m = bundle2.getInt("year_object");
                                                    ui4 ui4Var11 = this.n0;
                                                    ui4Var11.f = t(R.string.song_list_page_year, Integer.valueOf(ui4Var11.m));
                                                    ((TextView) this.l0.d).setText(t(R.string.song_list_page_year, Integer.valueOf(this.n0.m)));
                                                } else if (bundle2.getString("MEDIA_STARRED") != null) {
                                                    ui4 ui4Var12 = this.n0;
                                                    ui4Var12.e = "MEDIA_STARRED";
                                                    ui4Var12.f = s(R.string.song_list_page_starred);
                                                    ((TextView) this.l0.d).setText(R.string.song_list_page_starred);
                                                    up0 up0Var = this.l0;
                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) up0Var.a;
                                                    TextView textView3 = (TextView) up0Var.d;
                                                    k03 k03Var = wn1.a;
                                                    Context context = constraintLayout2.getContext();
                                                    Resources resources = context.getResources();
                                                    float f = resources.getDisplayMetrics().density;
                                                    int iMin = (int) (Math.min(resources.getConfiguration().screenWidthDp - 128, (resources.getConfiguration().screenHeightDp * 2) / 5) * f);
                                                    int i2 = (iMin * 14) / 52;
                                                    Drawable drawable = context.getDrawable(R.drawable.bg_homemusic_liked);
                                                    drawable.getClass();
                                                    Drawable drawableMutate = drawable.mutate();
                                                    drawableMutate.getClass();
                                                    GradientDrawable gradientDrawable = drawableMutate instanceof GradientDrawable ? (GradientDrawable) drawableMutate : null;
                                                    if (gradientDrawable != null) {
                                                        gradientDrawable.setCornerRadius(12.0f * f);
                                                    }
                                                    ImageView imageView = new ImageView(context);
                                                    imageView.setId(View.generateViewId());
                                                    imageView.setBackground(drawableMutate);
                                                    imageView.setImageResource(R.drawable.ic_favorite);
                                                    imageView.setImageTintList(ColorStateList.valueOf(-1));
                                                    imageView.setPadding(i2, i2, i2, i2);
                                                    imageView.setElevation(6.0f * f);
                                                    imageView.setImportantForAccessibility(2);
                                                    constraintLayout2.addView(imageView, new mb0(iMin, iMin));
                                                    constraintLayout2.getLayoutParams().height = -2;
                                                    wb0 wb0Var = new wb0();
                                                    wb0Var.b(constraintLayout2);
                                                    wb0Var.c(imageView.getId(), 3, 3, (int) (8.0f * f));
                                                    int id = imageView.getId();
                                                    wb0Var.c(id, 1, 1, 0);
                                                    wb0Var.c(id, 2, 2, 0);
                                                    Integer numValueOf = Integer.valueOf(id);
                                                    HashMap map = wb0Var.c;
                                                    rb0 rb0Var = (rb0) map.get(numValueOf);
                                                    if (rb0Var != null) {
                                                        rb0Var.d.w = 0.5f;
                                                    }
                                                    int id2 = textView3.getId();
                                                    int id3 = imageView.getId();
                                                    if (!map.containsKey(Integer.valueOf(id2))) {
                                                        map.put(Integer.valueOf(id2), new rb0());
                                                    }
                                                    rb0 rb0Var2 = (rb0) map.get(Integer.valueOf(id2));
                                                    if (rb0Var2 != null) {
                                                        sb0 sb0Var = rb0Var2.d;
                                                        sb0Var.m = id3;
                                                        sb0Var.l = -1;
                                                        sb0Var.p = -1;
                                                        sb0Var.q = -1;
                                                        sb0Var.r = -1;
                                                    }
                                                    wb0Var.a(constraintLayout2);
                                                    constraintLayout2.setConstraintSet(null);
                                                    constraintLayout2.requestLayout();
                                                } else if (bundle2.getString("MEDIA_DOWNLOADED") != null) {
                                                    ui4 ui4Var13 = this.n0;
                                                    ui4Var13.e = "MEDIA_DOWNLOADED";
                                                    ui4Var13.f = s(R.string.song_list_page_downloaded);
                                                    ((TextView) this.l0.d).setText(s(R.string.song_list_page_downloaded));
                                                } else if (bundle2.getParcelable("ALBUM_OBJECT") != null) {
                                                    this.n0.i = (AlbumID3) bundle2.getParcelable("ALBUM_OBJECT");
                                                    ui4 ui4Var14 = this.n0;
                                                    ui4Var14.e = "MEDIA_FROM_ALBUM";
                                                    ui4Var14.f = ui4Var14.i.getName();
                                                    ((TextView) this.l0.d).setText(this.n0.i.getName());
                                                }
                                                this.m0.o((MaterialToolbar) this.l0.i);
                                                if (this.m0.n() != null) {
                                                    this.m0.n().f0(true);
                                                    this.m0.n().g0();
                                                }
                                                ((MaterialToolbar) this.l0.i).setNavigationOnClickListener(new pi4(this, 0));
                                                ((AppBarLayout) this.l0.b).a(new u7(10, this));
                                                this.n0.c().e(v(), new oi4(this, 1));
                                                RecyclerView recyclerView2 = (RecyclerView) this.l0.e;
                                                Z();
                                                recyclerView2.setLayoutManager(new LinearLayoutManager(1));
                                                ((RecyclerView) this.l0.e).setHasFixedSize(true);
                                                ni4 ni4Var = new ni4(v(), this, true, false, null);
                                                this.p0 = ni4Var;
                                                ((RecyclerView) this.l0.e).setAdapter(ni4Var);
                                                final ni4 ni4Var2 = this.p0;
                                                MaterialToolbar materialToolbar2 = (MaterialToolbar) this.l0.i;
                                                final boolean zEquals = "MEDIA_STARRED".equals(this.n0.e);
                                                final String strC = v13.c(this.n0.e);
                                                final ei4 ei4Var = new ei4(1, this);
                                                final si4 si4Var = new si4(this, 1);
                                                ni4Var2.getClass();
                                                final rm3 rm3Var = new rm3(20);
                                                final Context context2 = materialToolbar2.getContext();
                                                MaterialToolbar materialToolbar3 = new MaterialToolbar(context2);
                                                materialToolbar3.setBackgroundColor(g12.s(materialToolbar2.getContext(), R.attr.colorSurface, -16777216));
                                                materialToolbar3.setNavigationIcon(R.drawable.ic_close);
                                                materialToolbar3.setNavigationContentDescription(R.string.homemusic_selection_close);
                                                materialToolbar3.m(R.menu.homemusic_song_selection);
                                                materialToolbar3.setVisibility(8);
                                                ViewParent parent = materialToolbar2.getParent();
                                                parent.getClass();
                                                ViewGroup viewGroup2 = (ViewGroup) parent;
                                                viewGroup2.addView(materialToolbar3, viewGroup2.indexOfChild(materialToolbar2) + 1, new ViewGroup.LayoutParams(-1, materialToolbar2.getLayoutParams().height));
                                                bd1 bd1Var = new bd1(2, rm3Var);
                                                X().i().a(v(), bd1Var);
                                                rm3Var.o = new vo1(rm3Var, materialToolbar3, materialToolbar2, bd1Var, context2, zEquals, ni4Var2);
                                                materialToolbar3.setNavigationOnClickListener(new p6(18, rm3Var));
                                                materialToolbar3.setOnMenuItemClickListener(new av4() { // from class: so1
                                                    /* JADX WARN: Code duplicated, block: B:31:0x00a3 A[LOOP:3: B:29:0x009d->B:31:0x00a3, LOOP_END] */
                                                    @Override // defpackage.av4
                                                    public final boolean onMenuItemClick(MenuItem menuItem) {
                                                        Iterator it;
                                                        rm3 rm3Var2 = rm3Var;
                                                        LinkedHashSet linkedHashSet = (LinkedHashSet) rm3Var2.n;
                                                        SongListPageFragment songListPageFragment = (SongListPageFragment) ei4Var.b;
                                                        ni4 ni4Var3 = ni4Var2;
                                                        ArrayList arrayListG = jz4.g(rm3Var2, ni4Var3);
                                                        ArrayList arrayList = new ArrayList();
                                                        int size = arrayListG.size();
                                                        int i3 = 0;
                                                        int i4 = 0;
                                                        int i5 = 0;
                                                        while (i5 < size) {
                                                            Object obj = arrayListG.get(i5);
                                                            i5++;
                                                            if (!ot1.c(((Child) obj).getId())) {
                                                                arrayList.add(obj);
                                                            }
                                                        }
                                                        SongListPageFragment songListPageFragment2 = this.n;
                                                        nc1 nc1VarE = songListPageFragment2.e();
                                                        MainActivity mainActivity2 = nc1VarE instanceof MainActivity ? (MainActivity) nc1VarE : null;
                                                        int itemId = menuItem.getItemId();
                                                        int i6 = 1;
                                                        if (itemId == R.id.homemusic_selection_all) {
                                                            List list = ni4Var3.v.f;
                                                            list.getClass();
                                                            if (list.isEmpty()) {
                                                                it = list.iterator();
                                                                while (it.hasNext()) {
                                                                    linkedHashSet.add(((Child) it.next()).getId());
                                                                }
                                                            } else {
                                                                if (!list.isEmpty()) {
                                                                    Iterator it2 = list.iterator();
                                                                    while (true) {
                                                                        if (it2.hasNext()) {
                                                                            Child child = (Child) it2.next();
                                                                            child.getClass();
                                                                            if (!linkedHashSet.contains(child.getId())) {
                                                                                it = list.iterator();
                                                                                while (it.hasNext()) {
                                                                                    linkedHashSet.add(((Child) it.next()).getId());
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                Iterator it3 = list.iterator();
                                                                while (it3.hasNext()) {
                                                                    linkedHashSet.remove(((Child) it3.next()).getId());
                                                                }
                                                            }
                                                            vo1 vo1Var = (vo1) rm3Var2.o;
                                                            if (vo1Var != null) {
                                                                vo1Var.invoke();
                                                            }
                                                            return true;
                                                        }
                                                        Context context3 = context2;
                                                        if (itemId == R.id.homemusic_selection_like) {
                                                            if (arrayListG.isEmpty()) {
                                                                jz4.P(songListPageFragment2, ni4Var3, arrayListG, zEquals, si4Var);
                                                            } else {
                                                                int size2 = arrayListG.size();
                                                                int i7 = 0;
                                                                while (i7 < size2) {
                                                                    Object obj2 = arrayListG.get(i7);
                                                                    i7++;
                                                                    if (!jz4.C((Child) obj2)) {
                                                                        context3.getClass();
                                                                        ArrayList arrayList2 = new ArrayList();
                                                                        int size3 = arrayListG.size();
                                                                        while (i3 < size3) {
                                                                            Object obj3 = arrayListG.get(i3);
                                                                            i3++;
                                                                            if (!jz4.C((Child) obj3)) {
                                                                                arrayList2.add(obj3);
                                                                            }
                                                                        }
                                                                        jz4.J(context3, arrayList2, true);
                                                                    }
                                                                }
                                                                jz4.P(songListPageFragment2, ni4Var3, arrayListG, zEquals, si4Var);
                                                            }
                                                            rm3Var2.z();
                                                            return true;
                                                        }
                                                        if (itemId == R.id.homemusic_selection_play) {
                                                            bo2.q(songListPageFragment.q0, arrayListG, 0, strC);
                                                            if (mainActivity2 != null) {
                                                                ((au) mainActivity2.V.n).d(true);
                                                            }
                                                            rm3Var2.z();
                                                            return true;
                                                        }
                                                        if (itemId == R.id.homemusic_selection_play_next || itemId == R.id.homemusic_selection_queue) {
                                                            bo2.e(songListPageFragment.q0, arrayListG, menuItem.getItemId() == R.id.homemusic_selection_play_next);
                                                            if (mainActivity2 != null) {
                                                                ((au) mainActivity2.V.n).d(true);
                                                            }
                                                            rm3Var2.z();
                                                            return true;
                                                        }
                                                        if (itemId == R.id.homemusic_selection_playlist) {
                                                            fl3 fl3Var = new fl3();
                                                            Bundle bundle3 = new Bundle();
                                                            bundle3.putParcelableArrayList("TRACKS_OBJECT", new ArrayList<>(arrayList));
                                                            fl3Var.c0(bundle3);
                                                            fl3Var.m0(songListPageFragment2.q(), null);
                                                            rm3Var2.z();
                                                            return true;
                                                        }
                                                        if (itemId == R.id.homemusic_selection_download) {
                                                            context3.getClass();
                                                            ArrayList arrayList3 = new ArrayList();
                                                            int size4 = arrayList.size();
                                                            while (i4 < size4) {
                                                                Object obj4 = arrayList.get(i4);
                                                                i4++;
                                                                if (!jz4.D(context3, (Child) obj4)) {
                                                                    arrayList3.add(obj4);
                                                                }
                                                            }
                                                            jz4.p(context3, arrayList3);
                                                            rm3Var2.z();
                                                            return true;
                                                        }
                                                        if (itemId != R.id.homemusic_selection_remove) {
                                                            return false;
                                                        }
                                                        ArrayList arrayList4 = new ArrayList();
                                                        int size5 = arrayList.size();
                                                        int i8 = 0;
                                                        while (i8 < size5) {
                                                            Object obj5 = arrayList.get(i8);
                                                            i8++;
                                                            context3.getClass();
                                                            if (jz4.D(context3, (Child) obj5)) {
                                                                arrayList4.add(obj5);
                                                            }
                                                        }
                                                        vg2 vg2VarO = new vg2(context3, 0).o(context3.getResources().getQuantityString(R.plurals.homemusic_selection_remove_title, arrayList4.size(), Integer.valueOf(arrayList4.size())));
                                                        vg2VarO.i(R.string.homemusic_selection_remove_message);
                                                        vg2VarO.l(R.string.homemusic_selection_remove_ok, new rn1(context3, arrayList4, rm3Var2, i6)).j(R.string.homemusic_cancel, null).h();
                                                        return true;
                                                    }
                                                });
                                                if (zEquals) {
                                                    q().a0("homemusic_remove_from_liked", v(), new eg0(ni4Var2, this, si4Var, 2));
                                                }
                                                le1 le1VarV = v();
                                                le1VarV.e();
                                                le1VarV.r.a(new wo1(0, rm3Var));
                                                jz4.h(rm3Var, materialToolbar3, materialToolbar2, bd1Var, context2, zEquals, ni4Var2);
                                                ni4Var2.B = rm3Var;
                                                this.p0.A = this.q0;
                                                j0();
                                                int i3 = this.s0 + 1;
                                                this.s0 = i3;
                                                this.n0.c().e(v(), new ri4(i3, 1, this));
                                                RecyclerView recyclerView3 = (RecyclerView) this.l0.e;
                                                recyclerView3.j(new ti4(this, (LinearLayoutManager) recyclerView3.getLayoutManager()));
                                                ((RecyclerView) this.l0.e).setOnTouchListener(new s7(10, this));
                                                ((Button) this.l0.g).setOnClickListener(new pi4(this, 2));
                                                ((SwipeRefreshLayout) this.l0.h).setOnRefreshListener(new ss2(19, this));
                                                if ("MEDIA_STARRED".equals(this.n0.e)) {
                                                    si4 si4Var2 = new si4(this, 0);
                                                    jx3 jx3Var = new jx3();
                                                    k03 k03Var2 = wn1.a;
                                                    jx3Var.n = k03Var2.d();
                                                    k03Var2.e(v(), new wd1(new o(10, jx3Var, si4Var2), 1));
                                                }
                                            }
                                            return linearLayout;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        nz2.n("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        this.l0 = null;
    }

    @Override // defpackage.kc1
    public final void P() {
        this.R = true;
        this.p0.A = this.q0;
        if ("MEDIA_STARRED".equals(this.n0.e)) {
            i0();
        }
    }

    @Override // defpackage.kc1
    public final void R() {
        this.R = true;
        Context contextZ = Z();
        cb4 cb4Var = new cb4(Z(), new ComponentName(Z(), (Class<?>) MediaService.class));
        Bundle bundle = Bundle.EMPTY;
        aj2 aj2Var = new aj2();
        Looper looperX = f35.x();
        bl2 bl2Var = new bl2(looperX);
        b11.w(bl2Var, new bj2(contextZ, cb4Var, bundle, aj2Var, looperX, bl2Var, cb4Var.a.e() ? new xc5(4, new fi0(new x7(contextZ))) : null), new Handler(looperX));
        this.q0 = bl2Var;
        bo2.j(bl2Var, this.o0);
        this.o0.b.e(v(), new oi4(this, 0));
        this.o0.c.e(v(), new oi4(this, 2));
    }

    @Override // defpackage.kc1
    public final void S() {
        sk2.Z0(this.q0);
        this.R = true;
    }

    public final void h0(View view) {
        ((InputMethodManager) X().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public final void i0() {
        final int i = this.s0 + 1;
        this.s0 = i;
        if ("MEDIA_STARRED".equals(this.n0.e)) {
            wn1.a(new Consumer() { // from class: qi4
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    List list = (List) obj;
                    SongListPageFragment songListPageFragment = this.a;
                    if (songListPageFragment.l0 != null) {
                        if (i != songListPageFragment.s0) {
                            return;
                        }
                        songListPageFragment.r0 = false;
                        songListPageFragment.p0.r(list);
                        songListPageFragment.j0();
                        songListPageFragment.k0(list);
                    }
                }
            });
        } else {
            this.n0.c().e(v(), new ri4(i, 0, this));
        }
    }

    public final void j0() {
        if (this.p0 != null) {
            String str = (String) this.o0.b.d();
            Boolean bool = (Boolean) this.o0.c.d();
            this.p0.s(str, bool != null && bool.booleanValue());
        }
    }

    public final void k0(List list) {
        if (list == null) {
            return;
        }
        String str = this.n0.e;
        str.getClass();
        switch (str) {
            case "MEDIA_BY_GENRE":
                TextView textView = (TextView) this.l0.c;
                int size = list.size();
                int i = this.n0.o;
                textView.setText(size < i ? t(R.string.generic_list_page_count, Integer.valueOf(list.size())) : t(R.string.generic_list_page_count_unknown, Integer.valueOf(i)));
                break;
            case "MEDIA_STARRED":
            case "MEDIA_BY_ARTIST":
            case "MEDIA_BY_GENRES":
                ((TextView) this.l0.c).setText(t(R.string.generic_list_page_count, Integer.valueOf(list.size())));
                break;
            case "MEDIA_BY_YEAR":
                TextView textView2 = (TextView) this.l0.c;
                int size2 = list.size();
                int i2 = this.n0.n;
                textView2.setText(size2 < i2 ? t(R.string.generic_list_page_count, Integer.valueOf(list.size())) : t(R.string.generic_list_page_count_unknown, Integer.valueOf(i2)));
                break;
        }
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMediaClick(Bundle bundle) {
        h0(a0());
        bo2.q(this.q0, bundle.getParcelableArrayList("TRACKS_OBJECT"), bundle.getInt("ITEM_POSITION"), v13.c(this.n0.e));
        ((au) this.m0.V.n).d(true);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onMediaLongClick(Bundle bundle) {
        if ("MEDIA_STARRED".equals(this.n0.e)) {
            bundle.putBoolean("homemusic_song_sheet_from_liked", true);
        }
        gb.x(a0()).m(R.id.songBottomSheetDialog, bundle, null);
    }
}
