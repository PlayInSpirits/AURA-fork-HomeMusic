package com.eddyizm.tempus.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.AlbumListPageFragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.a83;
import defpackage.b75;
import defpackage.b8;
import defpackage.bq4;
import defpackage.d8;
import defpackage.e75;
import defpackage.f8;
import defpackage.gb;
import defpackage.gh0;
import defpackage.i30;
import defpackage.k03;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kx3;
import defpackage.le1;
import defpackage.nz2;
import defpackage.oc1;
import defpackage.rm3;
import defpackage.rv2;
import defpackage.s7;
import defpackage.tf0;
import defpackage.u7;
import defpackage.uo;
import defpackage.v23;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class AlbumListPageFragment extends kc1 implements ClickCallback {
    public oc1 l0;
    public MainActivity m0;
    public f8 n0;
    public b8 o0;

    @Override // defpackage.kc1
    public final void F(Bundle bundle) {
        super.F(bundle);
        d0();
    }

    @Override // defpackage.kc1
    public final void G(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.artist_list_menu, menu);
        SearchView searchView = (SearchView) menu.findItem(R.id.action_search).getActionView();
        searchView.setImeOptions(6);
        searchView.setOnQueryTextListener(new rm3(this, searchView));
        searchView.setPadding(-32, 0, 0, 0);
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k03 k03Var;
        v23 v23Var;
        this.m0 = (MainActivity) e();
        final int i = 0;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_album_list_page, viewGroup, false);
        int i2 = R.id.album_info_sector;
        ConstraintLayout constraintLayout = (ConstraintLayout) uo.s(viewInflate, R.id.album_info_sector);
        if (constraintLayout != null) {
            i2 = R.id.album_list_recycler_view;
            RecyclerView recyclerView = (RecyclerView) uo.s(viewInflate, R.id.album_list_recycler_view);
            if (recyclerView != null) {
                i2 = R.id.album_list_sort_image_view;
                Button button = (Button) uo.s(viewInflate, R.id.album_list_sort_image_view);
                if (button != null) {
                    i2 = R.id.app_bar_layout;
                    AppBarLayout appBarLayout = (AppBarLayout) uo.s(viewInflate, R.id.app_bar_layout);
                    if (appBarLayout != null) {
                        i2 = R.id.page_subtitle_label;
                        TextView textView = (TextView) uo.s(viewInflate, R.id.page_subtitle_label);
                        if (textView != null) {
                            i2 = R.id.page_title_label;
                            TextView textView2 = (TextView) uo.s(viewInflate, R.id.page_title_label);
                            if (textView2 != null) {
                                i2 = R.id.toolbar;
                                MaterialToolbar materialToolbar = (MaterialToolbar) uo.s(viewInflate, R.id.toolbar);
                                if (materialToolbar != null) {
                                    LinearLayout linearLayout = (LinearLayout) viewInflate;
                                    this.l0 = new oc1(linearLayout, constraintLayout, recyclerView, button, appBarLayout, textView, textView2, materialToolbar);
                                    e75 e75VarD = d();
                                    b75 b75VarR = gh0.r(this);
                                    tf0 tf0VarQ = gh0.q(this);
                                    b75VarR.getClass();
                                    tf0VarQ.getClass();
                                    bq4 bq4Var = new bq4(e75VarD, b75VarR, tf0VarQ);
                                    i30 i30VarA = kx3.a(f8.class);
                                    String strB = i30VarA.b();
                                    if (strB == null) {
                                        kf2.n("Local and anonymous classes can not be ViewModels");
                                        return null;
                                    }
                                    this.n0 = (f8) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                                    Bundle bundle2 = this.s;
                                    if (bundle2 == null) {
                                        MainActivity mainActivity = this.m0;
                                        if (mainActivity != null && (v23Var = mainActivity.T) != null) {
                                            v23Var.o();
                                        }
                                        return linearLayout;
                                    }
                                    if (bundle2.getString("ALBUM_RECENTLY_PLAYED") != null) {
                                        this.n0.d = "ALBUM_RECENTLY_PLAYED";
                                        this.l0.f.setText(R.string.album_list_page_recently_played);
                                    } else if (bundle2.getString("ALBUM_MOST_PLAYED") != null) {
                                        this.n0.d = "ALBUM_MOST_PLAYED";
                                        this.l0.f.setText(R.string.album_list_page_most_played);
                                    } else if (bundle2.getString("ALBUM_RECENTLY_ADDED") != null) {
                                        this.n0.d = "ALBUM_RECENTLY_ADDED";
                                        this.l0.f.setText(R.string.album_list_page_recently_added);
                                    } else if (bundle2.getString("ALBUM_STARRED") != null) {
                                        this.n0.d = "ALBUM_STARRED";
                                        this.l0.f.setText(R.string.album_list_page_starred);
                                    } else if (bundle2.getString("ALBUM_NEW_RELEASES") != null) {
                                        this.n0.d = "ALBUM_NEW_RELEASES";
                                        this.l0.f.setText(R.string.album_list_page_new_releases);
                                    } else if (bundle2.getString("ALBUM_DOWNLOADED") != null) {
                                        this.n0.d = "ALBUM_DOWNLOADED";
                                        this.l0.f.setText(R.string.album_list_page_downloaded);
                                    } else if (bundle2.getParcelable("ARTIST_OBJECT") != null) {
                                        this.n0.e = (ArtistID3) bundle2.getParcelable("ARTIST_OBJECT");
                                        f8 f8Var = this.n0;
                                        f8Var.d = "ALBUM_FROM_ARTIST";
                                        this.l0.f.setText(f8Var.e.getName());
                                    } else if (bundle2.getParcelableArrayList("ALBUMS_OBJECT") != null) {
                                        this.n0.f = bundle2.getParcelableArrayList("ALBUMS_OBJECT");
                                        this.n0.d = bundle2.getString("ALBUM_LIST_TITLE", "");
                                        this.l0.f.setText(this.n0.d);
                                    }
                                    this.m0.o(this.l0.g);
                                    if (this.m0.n() != null) {
                                        this.m0.n().f0(true);
                                        this.m0.n().g0();
                                    }
                                    this.l0.g.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: c8
                                        public final /* synthetic */ AlbumListPageFragment o;

                                        {
                                            this.o = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            int i3 = i;
                                            AlbumListPageFragment albumListPageFragment = this.o;
                                            switch (i3) {
                                                case 0:
                                                    ((InputMethodManager) albumListPageFragment.X().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                                                    albumListPageFragment.m0.T.o();
                                                    break;
                                                default:
                                                    PopupMenu popupMenu = new PopupMenu(albumListPageFragment.Z(), view);
                                                    popupMenu.getMenuInflater().inflate(R.menu.sort_horizontal_album_popup_menu, popupMenu.getMenu());
                                                    popupMenu.setOnMenuItemClickListener(new v7(1, albumListPageFragment));
                                                    popupMenu.show();
                                                    break;
                                            }
                                        }
                                    });
                                    this.l0.a.a(new u7(1, this));
                                    RecyclerView recyclerView2 = this.l0.c;
                                    Z();
                                    recyclerView2.setLayoutManager(new LinearLayoutManager(1));
                                    this.l0.c.setHasFixedSize(true);
                                    if (!this.n0.d.equals("ALBUM_DOWNLOADED")) {
                                        this.n0.d.equals("ALBUM_FROM_ARTIST");
                                    }
                                    b8 b8Var = new b8(this, 0);
                                    this.o0 = b8Var;
                                    final int i3 = 2;
                                    b8Var.p = 2;
                                    b8Var.n.g();
                                    this.l0.c.setAdapter(this.o0);
                                    final f8 f8Var2 = this.n0;
                                    le1 le1VarV = v();
                                    int i4 = f8Var2.h;
                                    rv2 rv2Var = f8Var2.c;
                                    ArrayList arrayList = f8Var2.f;
                                    if (arrayList != null) {
                                        k03Var = new k03(arrayList);
                                    } else {
                                        f8Var2.g = new k03(new ArrayList());
                                        String str = f8Var2.d;
                                        str.getClass();
                                        switch (str) {
                                            case "ALBUM_MOST_PLAYED":
                                                rv2Var.getClass();
                                                final int i5 = 1;
                                                rv2.m("frequent", i4, null, null).e(le1VarV, new a83() { // from class: e8
                                                    @Override // defpackage.a83
                                                    public final void b(Object obj) {
                                                        int i6 = i5;
                                                        f8 f8Var3 = f8Var2;
                                                        List list = (List) obj;
                                                        switch (i6) {
                                                            case 0:
                                                                f8Var3.g.k(list);
                                                                break;
                                                            case 1:
                                                                f8Var3.g.k(list);
                                                                break;
                                                            case 2:
                                                                f8Var3.g.k(list);
                                                                break;
                                                            default:
                                                                f8Var3.getClass();
                                                                list.sort(Comparator.comparing(new m7(8), Comparator.nullsFirst(Comparator.naturalOrder())).reversed());
                                                                f8Var3.g.i(list.subList(0, Math.min(20, list.size())));
                                                                break;
                                                        }
                                                    }
                                                });
                                                break;
                                            case "ALBUM_NEW_RELEASES":
                                                int i6 = Calendar.getInstance().get(1);
                                                Integer numValueOf = Integer.valueOf(i6);
                                                Integer numValueOf2 = Integer.valueOf(i6);
                                                rv2Var.getClass();
                                                final int i7 = 3;
                                                rv2.m("byYear", i4, numValueOf, numValueOf2).e(le1VarV, new a83() { // from class: e8
                                                    @Override // defpackage.a83
                                                    public final void b(Object obj) {
                                                        int i8 = i7;
                                                        f8 f8Var3 = f8Var2;
                                                        List list = (List) obj;
                                                        switch (i8) {
                                                            case 0:
                                                                f8Var3.g.k(list);
                                                                break;
                                                            case 1:
                                                                f8Var3.g.k(list);
                                                                break;
                                                            case 2:
                                                                f8Var3.g.k(list);
                                                                break;
                                                            default:
                                                                f8Var3.getClass();
                                                                list.sort(Comparator.comparing(new m7(8), Comparator.nullsFirst(Comparator.naturalOrder())).reversed());
                                                                f8Var3.g.i(list.subList(0, Math.min(20, list.size())));
                                                                break;
                                                        }
                                                    }
                                                });
                                                break;
                                            case "ALBUM_STARRED":
                                                rv2Var.getClass();
                                                f8Var2.g = rv2.o(-1, false);
                                                break;
                                            case "ALBUM_RECENTLY_PLAYED":
                                                rv2Var.getClass();
                                                final int i8 = 0;
                                                rv2.m("recent", i4, null, null).e(le1VarV, new a83() { // from class: e8
                                                    @Override // defpackage.a83
                                                    public final void b(Object obj) {
                                                        int i9 = i8;
                                                        f8 f8Var3 = f8Var2;
                                                        List list = (List) obj;
                                                        switch (i9) {
                                                            case 0:
                                                                f8Var3.g.k(list);
                                                                break;
                                                            case 1:
                                                                f8Var3.g.k(list);
                                                                break;
                                                            case 2:
                                                                f8Var3.g.k(list);
                                                                break;
                                                            default:
                                                                f8Var3.getClass();
                                                                list.sort(Comparator.comparing(new m7(8), Comparator.nullsFirst(Comparator.naturalOrder())).reversed());
                                                                f8Var3.g.i(list.subList(0, Math.min(20, list.size())));
                                                                break;
                                                        }
                                                    }
                                                });
                                                break;
                                            case "ALBUM_RECENTLY_ADDED":
                                                rv2Var.getClass();
                                                rv2.m("newest", i4, null, null).e(le1VarV, new a83() { // from class: e8
                                                    @Override // defpackage.a83
                                                    public final void b(Object obj) {
                                                        int i9 = i3;
                                                        f8 f8Var3 = f8Var2;
                                                        List list = (List) obj;
                                                        switch (i9) {
                                                            case 0:
                                                                f8Var3.g.k(list);
                                                                break;
                                                            case 1:
                                                                f8Var3.g.k(list);
                                                                break;
                                                            case 2:
                                                                f8Var3.g.k(list);
                                                                break;
                                                            default:
                                                                f8Var3.getClass();
                                                                list.sort(Comparator.comparing(new m7(8), Comparator.nullsFirst(Comparator.naturalOrder())).reversed());
                                                                f8Var3.g.i(list.subList(0, Math.min(20, list.size())));
                                                                break;
                                                        }
                                                    }
                                                });
                                                break;
                                        }
                                        k03Var = f8Var2.g;
                                    }
                                    k03Var.e(v(), new d8(0, this));
                                    final int i9 = 1;
                                    this.l0.c.setOnTouchListener(new s7(1, this));
                                    this.l0.d.setOnClickListener(new View.OnClickListener(this) { // from class: c8
                                        public final /* synthetic */ AlbumListPageFragment o;

                                        {
                                            this.o = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            int i10 = i9;
                                            AlbumListPageFragment albumListPageFragment = this.o;
                                            switch (i10) {
                                                case 0:
                                                    ((InputMethodManager) albumListPageFragment.X().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                                                    albumListPageFragment.m0.T.o();
                                                    break;
                                                default:
                                                    PopupMenu popupMenu = new PopupMenu(albumListPageFragment.Z(), view);
                                                    popupMenu.getMenuInflater().inflate(R.menu.sort_horizontal_album_popup_menu, popupMenu.getMenu());
                                                    popupMenu.setOnMenuItemClickListener(new v7(1, albumListPageFragment));
                                                    popupMenu.show();
                                                    break;
                                            }
                                        }
                                    });
                                    return linearLayout;
                                }
                            }
                        }
                    }
                }
            }
        }
        nz2.n("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        this.l0 = null;
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onAlbumClick(Bundle bundle) {
        gb.x(a0()).m(R.id.albumPageFragment, bundle, null);
    }

    @Override // com.eddyizm.tempus.interfaces.ClickCallback
    public final void onAlbumLongClick(Bundle bundle) {
        gb.x(a0()).m(R.id.albumBottomSheetDialog, bundle, null);
    }
}
