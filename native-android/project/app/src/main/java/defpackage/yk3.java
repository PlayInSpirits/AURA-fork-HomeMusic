package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.a;
import com.eddyizm.tempus.subsonic.models.Child;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yk3 extends dw3 {
    public final wk3 q;
    public bl2 r;
    public List s;
    public String t;
    public boolean u;
    public List v;

    public yk3(wk3 wk3Var) {
        new ConcurrentHashMap();
        List list = Collections.EMPTY_LIST;
        this.v = list;
        this.q = wk3Var;
        this.s = list;
    }

    @Override // defpackage.dw3
    public final int a() {
        List list = this.s;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // defpackage.dw3
    public final long b(int i) {
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x010f  */
    @Override // defpackage.dw3
    public final void g(cx3 cx3Var, int i) {
        boolean zD;
        xk3 xk3Var = (xk3) cx3Var;
        Child child = (Child) this.s.get(xk3Var.d());
        lo loVar = xk3Var.u;
        TextView textView = (TextView) loVar.k;
        View view = (View) loVar.b;
        ConstraintLayout constraintLayout = (ConstraintLayout) loVar.m;
        ImageView imageView = (ImageView) loVar.g;
        textView.setText(child.getTitle());
        TextView textView2 = (TextView) loVar.j;
        View view2 = xk3Var.a;
        textView2.setText(view2.getContext().getString(R.string.song_subtitle_formatter, a.a(child.getArtist(), child.getId()), e03.g(child.getDuration()), e03.f(child)));
        Context context = view2.getContext();
        String coverArtId = child.getCoverArtId();
        vz3 vz3VarT = b11.g(context, coverArtId, 9, com.bumptech.glide.a.c(context), coverArtId != null ? wg0.b(ud3.t(), coverArtId) : null).T(xv0.b());
        if (ud3.R()) {
            vz3VarT = (vz3) vz3VarT.l();
        }
        vz3 vz3Var = (vz3) vz3VarT.x();
        Context context2 = view2.getContext();
        String coverArtId2 = child.getCoverArtId();
        vz3 vz3VarT2 = b11.g(context2, coverArtId2, 9, com.bumptech.glide.a.c(context2), coverArtId2 != null ? wg0.b(ud3.t(), coverArtId2) : null).T(xv0.b());
        if (ud3.R()) {
            vz3VarT2 = (vz3) vz3VarT2.l();
        }
        vz3VarT2.S(vz3Var).K((ImageView) loVar.i);
        bl2 bl2Var = this.r;
        si1 si1Var = new si1(14, xk3Var);
        WeakReference weakReference = bo2.a;
        int i2 = 20;
        if (u52.c().a) {
            si1Var.onRecovery(u52.c().o);
        } else if (bl2Var != null) {
            bl2Var.f(new ws1(i2, bl2Var, si1Var), gq0.n);
        }
        if (ud3.o() == null) {
            if (au0.w(view2.getContext()) != null) {
                zD = eu0.d(child.getId());
            } else {
                zD = false;
            }
        } else if (g51.e(child) != null) {
            zD = true;
        } else {
            zD = false;
        }
        ImageView imageView2 = (ImageView) loVar.c;
        if (zD) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
        if (xa3.u("rating_per_item", false)) {
            boolean zF = n61.f(1, child.getId(), child.getStarred() != null);
            constraintLayout.setVisibility((zF || child.getUserRating() != null) ? 0 : 8);
            ((ImageView) loVar.h).setVisibility(zF ? 0 : 8);
            ((LinearLayout) loVar.l).setVisibility(child.getUserRating() != null ? 0 : 8);
            if (child.getUserRating() != null) {
                ImageView imageView3 = (ImageView) loVar.f;
                Context context3 = view2.getContext();
                int iIntValue = child.getUserRating().intValue();
                int i3 = R.drawable.ic_star_outlined;
                imageView3.setImageDrawable(zz1.r(context3, iIntValue >= 1 ? R.drawable.ic_star : R.drawable.ic_star_outlined));
                ((ImageView) loVar.o).setImageDrawable(zz1.r(view2.getContext(), child.getUserRating().intValue() >= 2 ? R.drawable.ic_star : R.drawable.ic_star_outlined));
                ((ImageView) loVar.n).setImageDrawable(zz1.r(view2.getContext(), child.getUserRating().intValue() >= 3 ? R.drawable.ic_star : R.drawable.ic_star_outlined));
                ((ImageView) loVar.e).setImageDrawable(zz1.r(view2.getContext(), child.getUserRating().intValue() >= 4 ? R.drawable.ic_star : R.drawable.ic_star_outlined));
                ImageView imageView4 = (ImageView) loVar.d;
                Context context4 = view2.getContext();
                if (child.getUserRating().intValue() >= 5) {
                    i3 = R.drawable.ic_star;
                }
                imageView4.setImageDrawable(zz1.r(context4, i3));
            }
        } else {
            constraintLayout.setVisibility(8);
        }
        view2.setOnClickListener(new j8(i2, this, xk3Var));
        String str = this.t;
        if (str == null || !str.equals(child.getId())) {
            imageView.setVisibility(4);
            view.setVisibility(4);
            return;
        }
        imageView.setVisibility(0);
        if (this.u) {
            imageView.setImageResource(R.drawable.ic_pause);
        } else {
            imageView.setImageResource(R.drawable.ic_play);
        }
        view.setVisibility(0);
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup viewGroup, int i) {
        View viewI = b11.i(viewGroup, R.layout.item_player_queue_song, viewGroup, false);
        int i2 = R.id.cover_art_overlay;
        View viewS = uo.s(viewI, R.id.cover_art_overlay);
        if (viewS != null) {
            i2 = R.id.download_indicator_icon;
            ImageView imageView = (ImageView) uo.s(viewI, R.id.download_indicator_icon);
            if (imageView != null) {
                i2 = R.id.five_star_icon;
                ImageView imageView2 = (ImageView) uo.s(viewI, R.id.five_star_icon);
                if (imageView2 != null) {
                    i2 = R.id.four_star_icon;
                    ImageView imageView3 = (ImageView) uo.s(viewI, R.id.four_star_icon);
                    if (imageView3 != null) {
                        i2 = R.id.one_star_icon;
                        ImageView imageView4 = (ImageView) uo.s(viewI, R.id.one_star_icon);
                        if (imageView4 != null) {
                            i2 = R.id.play_pause_icon;
                            ImageView imageView5 = (ImageView) uo.s(viewI, R.id.play_pause_icon);
                            if (imageView5 != null) {
                                i2 = R.id.preferred_icon;
                                ImageView imageView6 = (ImageView) uo.s(viewI, R.id.preferred_icon);
                                if (imageView6 != null) {
                                    i2 = R.id.queue_song_cover_image_view;
                                    ImageView imageView7 = (ImageView) uo.s(viewI, R.id.queue_song_cover_image_view);
                                    if (imageView7 != null) {
                                        i2 = R.id.queue_song_holder_image;
                                        if (((ImageView) uo.s(viewI, R.id.queue_song_holder_image)) != null) {
                                            i2 = R.id.queue_song_subtitle_text_view;
                                            TextView textView = (TextView) uo.s(viewI, R.id.queue_song_subtitle_text_view);
                                            if (textView != null) {
                                                i2 = R.id.queue_song_title_text_view;
                                                TextView textView2 = (TextView) uo.s(viewI, R.id.queue_song_title_text_view);
                                                if (textView2 != null) {
                                                    i2 = R.id.rating_bar_layout;
                                                    LinearLayout linearLayout = (LinearLayout) uo.s(viewI, R.id.rating_bar_layout);
                                                    if (linearLayout != null) {
                                                        i2 = R.id.rating_indicator_image_view;
                                                        ConstraintLayout constraintLayout = (ConstraintLayout) uo.s(viewI, R.id.rating_indicator_image_view);
                                                        if (constraintLayout != null) {
                                                            i2 = R.id.three_star_icon;
                                                            ImageView imageView8 = (ImageView) uo.s(viewI, R.id.three_star_icon);
                                                            if (imageView8 != null) {
                                                                i2 = R.id.two_star_icon;
                                                                ImageView imageView9 = (ImageView) uo.s(viewI, R.id.two_star_icon);
                                                                if (imageView9 != null) {
                                                                    return new xk3(this, new lo((ConstraintLayout) viewI, viewS, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, textView, textView2, linearLayout, constraintLayout, imageView8, imageView9));
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

    public final List p(String str) {
        if (str == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.s.size(); i++) {
            if (str.equals(((Child) this.s.get(i)).getId())) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        return arrayList;
    }

    public final void q(String str, boolean z) {
        String str2 = this.t;
        boolean z2 = this.u;
        List list = this.v;
        this.t = str;
        this.u = z;
        if (Objects.equals(str2, str) && z2 == z) {
            if (list.equals(str != null ? p(str) : Collections.EMPTY_LIST)) {
                return;
            }
        }
        this.v = str != null ? p(str) : Collections.EMPTY_LIST;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (iIntValue >= 0 && iIntValue < this.s.size()) {
                e(iIntValue, "payload_playback");
            }
        }
        for (Integer num : this.v) {
            int iIntValue2 = num.intValue();
            if (!list.contains(num) && iIntValue2 >= 0 && iIntValue2 < this.s.size()) {
                e(iIntValue2, "payload_playback");
            }
        }
    }
}
