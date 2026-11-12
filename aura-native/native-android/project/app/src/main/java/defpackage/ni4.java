package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.homemusic.R;
import com.bumptech.glide.a;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.DiscTitle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ni4 extends dw3 implements Filterable {
    public bl2 A;
    public rm3 B;
    public final o7 C;
    public final ClickCallback q;
    public final boolean r;
    public final boolean s;
    public final AlbumID3 t;
    public List u;
    public final pk v = new pk(this, new hh3(29));
    public String w;
    public String x;
    public boolean y;
    public List z;

    public ni4(le1 le1Var, ClickCallback clickCallback, boolean z, boolean z2, AlbumID3 albumID3) {
        List list = Collections.EMPTY_LIST;
        this.z = list;
        this.C = new o7(this, 9);
        this.q = clickCallback;
        this.r = z;
        this.s = z2;
        this.u = list;
        this.w = "";
        this.t = albumID3;
        final int i = 0;
        o(false);
        if (le1Var != null) {
            g51.d.e(le1Var, new d8(15, new Runnable(this) { // from class: ji4
                public final /* synthetic */ ni4 o;

                {
                    this.o = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    ni4 ni4Var = this.o;
                    switch (i2) {
                        case 0:
                            if (ud3.o() != null) {
                                ni4Var.d();
                            }
                            break;
                        default:
                            ni4Var.d();
                            break;
                    }
                }
            }));
            final int i2 = 1;
            kb4.N(le1Var, new Runnable(this) { // from class: ji4
                public final /* synthetic */ ni4 o;

                {
                    this.o = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = i2;
                    ni4 ni4Var = this.o;
                    switch (i3) {
                        case 0:
                            if (ud3.o() != null) {
                                ni4Var.d();
                            }
                            break;
                        default:
                            ni4Var.d();
                            break;
                    }
                }
            });
        }
    }

    @Override // defpackage.dw3
    public final int a() {
        return this.v.f.size();
    }

    @Override // defpackage.dw3
    public final long b(int i) {
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ca  */
    @Override // defpackage.dw3
    public final void g(cx3 cx3Var, final int i) {
        ko1 ko1Var;
        mi4 mi4Var = (mi4) cx3Var;
        pk pkVar = this.v;
        Child child = (Child) pkVar.f.get(i);
        y12 y12Var = mi4Var.u;
        y12Var.q.setText(child.getTitle());
        TextView textView = y12Var.p;
        ConstraintLayout constraintLayout = y12Var.m;
        ImageView imageView = y12Var.r;
        TextView textView2 = y12Var.t;
        ConstraintLayout constraintLayout2 = y12Var.e;
        TextView textView3 = y12Var.f;
        FrameLayout frameLayout = y12Var.n;
        View view = mi4Var.a;
        textView.setText(view.getContext().getString(R.string.song_subtitle_formatter, this.s ? child.getAlbum() : child.getArtist(), e03.g(child.getDuration()), e03.f(child)));
        Context context = view.getContext();
        Integer track = child.getTrack();
        textView2.setText(track != null ? String.valueOf(track) : context.getString(R.string.label_placeholder));
        if (ud3.o() == null) {
            eu0 eu0VarW = au0.w(view.getContext());
            String id = child.getId();
            eu0VarW.getClass();
            if (eu0.d(id)) {
                frameLayout.setVisibility(0);
            } else {
                frameLayout.setVisibility(8);
            }
        } else if (g51.e(child) != null) {
            frameLayout.setVisibility(0);
        } else {
            frameLayout.setVisibility(8);
        }
        if (frameLayout.getVisibility() == 0) {
            Context context2 = frameLayout.getContext();
            context2.getClass();
            String strO = ud3.o();
            ko1 ko1Var2 = ko1.n;
            ko1 ko1Var3 = ko1.p;
            if (strO == null) {
                eu0 eu0VarW2 = au0.w(context2);
                String id2 = child.getId();
                eu0VarW2.getClass();
                Integer numC = eu0.c(id2);
                if (numC == null || numC.intValue() == 4 || numC.intValue() == 5) {
                    ko1Var = ko1Var2;
                } else if (numC.intValue() == 3) {
                    ko1Var = ko1Var3;
                } else {
                    ko1Var = ko1.o;
                }
            } else if (g51.e(child) != null) {
                ko1Var = ko1Var3;
            } else {
                ko1Var = ko1Var2;
            }
            if (ko1Var == ko1Var2) {
                frameLayout.setVisibility(8);
            } else {
                View childAt = frameLayout.getChildAt(0);
                if (childAt == null) {
                    childAt = frameLayout;
                }
                childAt.setBackground(frameLayout.getContext().getDrawable(ko1Var == ko1Var3 ? R.drawable.ic_homemusic_on_phone : R.drawable.ic_homemusic_to_phone));
                childAt.setContentDescription(frameLayout.getContext().getString(ko1Var == ko1Var3 ? R.string.homemusic_downloaded_on_phone : R.string.homemusic_downloading_to_phone));
            }
        }
        boolean z = this.r;
        if (z) {
            Context context3 = view.getContext();
            String coverArtId = child.getCoverArtId();
            vz3 vz3VarT = b11.g(context3, coverArtId, 9, a.c(context3), coverArtId != null ? wg0.b(ud3.t(), coverArtId) : null).T(xv0.b());
            if (ud3.R()) {
                vz3VarT = (vz3) vz3VarT.l();
            }
            vz3VarT.K(imageView);
        }
        textView2.setVisibility(z ? 4 : 0);
        imageView.setVisibility(z ? 0 : 4);
        if (z) {
            constraintLayout2.setVisibility(8);
        } else {
            if (i != 0 || pkVar.f.stream().filter(new c7(20)).map(new hu3(3)).filter(new c7(21)).distinct().count() <= 1) {
                if (i > 0) {
                    int i2 = i - 1;
                    if (pkVar.f.get(i2) == null || ((Child) pkVar.f.get(i2)).getDiscNumber() == null || ((Child) pkVar.f.get(i)).getDiscNumber() == null || ((Child) pkVar.f.get(i2)).getDiscNumber().intValue() >= ((Child) pkVar.f.get(i)).getDiscNumber().intValue()) {
                    }
                }
                constraintLayout2.setVisibility(8);
            }
            if (((Child) pkVar.f.get(i)).getDiscNumber() != null) {
                textView3.setText(view.getContext().getString(R.string.disc_titleless, ((Child) pkVar.f.get(i)).getDiscNumber().toString()));
                constraintLayout2.setVisibility(0);
                textView3.setVisibility(0);
                y12Var.d.setVisibility(0);
            } else {
                constraintLayout2.setVisibility(8);
            }
            AlbumID3 albumID3 = this.t;
            if (albumID3 != null && albumID3.getDiscTitles() != null) {
                Optional<DiscTitle> optionalFindFirst = albumID3.getDiscTitles().stream().filter(new Predicate() { // from class: ki4
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return Objects.equals(((DiscTitle) obj).getDisc(), ((Child) this.a.v.f.get(i)).getDiscNumber());
                    }
                }).findFirst();
                if (optionalFindFirst.isPresent() && optionalFindFirst.get().getDisc() != null && optionalFindFirst.get().getTitle() != null && !optionalFindFirst.get().getTitle().isEmpty()) {
                    textView3.setText(view.getContext().getString(R.string.disc_titlefull, optionalFindFirst.get().getDisc().toString(), optionalFindFirst.get().getTitle()));
                }
            }
        }
        if (xa3.u("rating_per_item", false)) {
            boolean zF = n61.f(1, child.getId(), child.getStarred() != null);
            constraintLayout.setVisibility((zF || child.getUserRating() != null) ? 0 : 8);
            y12Var.k.setVisibility(zF ? 0 : 8);
            y12Var.l.setVisibility(child.getUserRating() == null ? 8 : 0);
            if (child.getUserRating() != null) {
                ImageView imageView2 = y12Var.i;
                Context context4 = view.getContext();
                int iIntValue = child.getUserRating().intValue();
                int i3 = R.drawable.ic_star_outlined;
                imageView2.setImageDrawable(zz1.r(context4, iIntValue >= 1 ? R.drawable.ic_star : R.drawable.ic_star_outlined));
                y12Var.u.setImageDrawable(zz1.r(view.getContext(), child.getUserRating().intValue() >= 2 ? R.drawable.ic_star : R.drawable.ic_star_outlined));
                y12Var.s.setImageDrawable(zz1.r(view.getContext(), child.getUserRating().intValue() >= 3 ? R.drawable.ic_star : R.drawable.ic_star_outlined));
                y12Var.h.setImageDrawable(zz1.r(view.getContext(), child.getUserRating().intValue() >= 4 ? R.drawable.ic_star : R.drawable.ic_star_outlined));
                ImageView imageView3 = y12Var.g;
                Context context5 = view.getContext();
                if (child.getUserRating().intValue() >= 5) {
                    i3 = R.drawable.ic_star;
                }
                imageView3.setImageDrawable(zz1.r(context5, i3));
            }
        } else {
            constraintLayout.setVisibility(8);
        }
        p(mi4Var, child);
        jz4.k(view, y12Var.o, this.B, child);
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return this.C;
    }

    @Override // defpackage.dw3
    public final void h(cx3 cx3Var, int i, List list) {
        mi4 mi4Var = (mi4) cx3Var;
        if (list.isEmpty() || !(list.contains("payload_playback") || list.contains("payload_homemusic_selection"))) {
            g(mi4Var, i);
            return;
        }
        Child child = (Child) this.v.f.get(i);
        if (list.contains("payload_playback")) {
            p(mi4Var, child);
        }
        if (list.contains("payload_homemusic_selection")) {
            jz4.k(mi4Var.a, mi4Var.u.o, this.B, child);
        }
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup viewGroup, int i) {
        View viewI = b11.i(viewGroup, R.layout.item_horizontal_track, viewGroup, false);
        int i2 = R.id.cover_art_overlay;
        View viewS = uo.s(viewI, R.id.cover_art_overlay);
        if (viewS != null) {
            i2 = R.id.cover_image_separator;
            View viewS2 = uo.s(viewI, R.id.cover_image_separator);
            if (viewS2 != null) {
                i2 = R.id.different_disk_divider;
                View viewS3 = uo.s(viewI, R.id.different_disk_divider);
                if (viewS3 != null) {
                    i2 = R.id.different_disk_divider_sector;
                    ConstraintLayout constraintLayout = (ConstraintLayout) uo.s(viewI, R.id.different_disk_divider_sector);
                    if (constraintLayout != null) {
                        i2 = R.id.disc_title_text_view;
                        TextView textView = (TextView) uo.s(viewI, R.id.disc_title_text_view);
                        if (textView != null) {
                            i2 = R.id.five_star_icon;
                            ImageView imageView = (ImageView) uo.s(viewI, R.id.five_star_icon);
                            if (imageView != null) {
                                i2 = R.id.four_star_icon;
                                ImageView imageView2 = (ImageView) uo.s(viewI, R.id.four_star_icon);
                                if (imageView2 != null) {
                                    i2 = R.id.one_star_icon;
                                    ImageView imageView3 = (ImageView) uo.s(viewI, R.id.one_star_icon);
                                    if (imageView3 != null) {
                                        i2 = R.id.play_pause_icon;
                                        ImageView imageView4 = (ImageView) uo.s(viewI, R.id.play_pause_icon);
                                        if (imageView4 != null) {
                                            i2 = R.id.preferred_icon;
                                            ImageView imageView5 = (ImageView) uo.s(viewI, R.id.preferred_icon);
                                            if (imageView5 != null) {
                                                i2 = R.id.rating_bar_layout;
                                                LinearLayout linearLayout = (LinearLayout) uo.s(viewI, R.id.rating_bar_layout);
                                                if (linearLayout != null) {
                                                    i2 = R.id.rating_indicator_image_view;
                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) uo.s(viewI, R.id.rating_indicator_image_view);
                                                    if (constraintLayout2 != null) {
                                                        i2 = R.id.search_result_download_indicator_image_view;
                                                        FrameLayout frameLayout = (FrameLayout) uo.s(viewI, R.id.search_result_download_indicator_image_view);
                                                        if (frameLayout != null) {
                                                            i2 = R.id.search_result_song_more_button;
                                                            FrameLayout frameLayout2 = (FrameLayout) uo.s(viewI, R.id.search_result_song_more_button);
                                                            if (frameLayout2 != null) {
                                                                i2 = R.id.search_result_song_subtitle_text_view;
                                                                TextView textView2 = (TextView) uo.s(viewI, R.id.search_result_song_subtitle_text_view);
                                                                if (textView2 != null) {
                                                                    i2 = R.id.search_result_song_title_text_view;
                                                                    TextView textView3 = (TextView) uo.s(viewI, R.id.search_result_song_title_text_view);
                                                                    if (textView3 != null) {
                                                                        i2 = R.id.song_cover_image_view;
                                                                        ImageView imageView6 = (ImageView) uo.s(viewI, R.id.song_cover_image_view);
                                                                        if (imageView6 != null) {
                                                                            i2 = R.id.three_star_icon;
                                                                            ImageView imageView7 = (ImageView) uo.s(viewI, R.id.three_star_icon);
                                                                            if (imageView7 != null) {
                                                                                i2 = R.id.track_number_text_view;
                                                                                TextView textView4 = (TextView) uo.s(viewI, R.id.track_number_text_view);
                                                                                if (textView4 != null) {
                                                                                    i2 = R.id.two_star_icon;
                                                                                    ImageView imageView8 = (ImageView) uo.s(viewI, R.id.two_star_icon);
                                                                                    if (imageView8 != null) {
                                                                                        return new mi4(this, new y12((ConstraintLayout) viewI, viewS, viewS2, viewS3, constraintLayout, textView, imageView, imageView2, imageView3, imageView4, imageView5, linearLayout, constraintLayout2, frameLayout, frameLayout2, textView2, textView3, imageView6, imageView7, textView4, imageView8));
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        nz2.n("Missing required view with ID: ".concat(viewI.getResources().getResourceName(i2)));
        return null;
    }

    @Override // defpackage.dw3
    public final void n(cx3 cx3Var) {
        mi4 mi4Var = (mi4) cx3Var;
        c04 c04VarC = a.c(mi4Var.a.getContext());
        ImageView imageView = mi4Var.u.r;
        c04VarC.getClass();
        c04VarC.q(new a04(imageView));
    }

    public final void p(mi4 mi4Var, Child child) {
        y12 y12Var = mi4Var.u;
        String str = this.x;
        boolean z = this.r;
        if (str == null || !str.equals(child.getId())) {
            y12Var.j.setVisibility(4);
            if (z) {
                y12Var.b.setVisibility(4);
                return;
            } else {
                y12Var.t.setVisibility(0);
                return;
            }
        }
        y12Var.j.setVisibility(0);
        if (this.y) {
            y12Var.j.setImageResource(R.drawable.ic_pause);
        } else {
            y12Var.j.setImageResource(R.drawable.ic_play);
        }
        if (z) {
            y12Var.b.setVisibility(0);
        } else {
            y12Var.t.setVisibility(4);
        }
    }

    public final List q(String str) {
        if (str == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            pk pkVar = this.v;
            if (i >= pkVar.f.size()) {
                return arrayList;
            }
            if (str.equals(((Child) pkVar.f.get(i)).getId())) {
                arrayList.add(Integer.valueOf(i));
            }
            i++;
        }
    }

    public final void r(List list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.u = list;
        this.C.filter(this.w);
    }

    public final void s(String str, boolean z) {
        pk pkVar;
        String str2 = this.x;
        boolean z2 = this.y;
        List list = this.z;
        this.x = str;
        this.y = z;
        if (Objects.equals(str2, str) && z2 == z) {
            if (list.equals(str != null ? q(str) : Collections.EMPTY_LIST)) {
                return;
            }
        }
        this.z = str != null ? q(str) : Collections.EMPTY_LIST;
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            pkVar = this.v;
            if (!zHasNext) {
                break;
            }
            int iIntValue = ((Integer) it.next()).intValue();
            if (iIntValue >= 0 && iIntValue < pkVar.f.size()) {
                e(iIntValue, "payload_playback");
            }
        }
        for (Integer num : this.z) {
            int iIntValue2 = num.intValue();
            if (!list.contains(num) && iIntValue2 >= 0 && iIntValue2 < pkVar.f.size()) {
                e(iIntValue2, "payload_playback");
            }
        }
    }

    public final void t(String str) {
        pk pkVar = this.v;
        ArrayList arrayList = new ArrayList(pkVar.f);
        switch (str) {
            case "MEDIA_BY_TITLE":
                arrayList.sort(Comparator.comparing(new hu3(4)));
                break;
            case "MEDIA_LEAST_RECENTLY_STARRED":
                arrayList.sort(Comparator.comparing(new hu3(5), Comparator.nullsLast(Comparator.naturalOrder())));
                break;
            case "MEDIA_MOST_RECENTLY_STARRED":
                arrayList.sort(Comparator.comparing(new hu3(5), Comparator.nullsLast(Comparator.reverseOrder())));
                break;
        }
        pkVar.b(arrayList, null);
    }
}
