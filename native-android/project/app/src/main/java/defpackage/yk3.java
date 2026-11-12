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

    public yk3(wk3 r2) {
        new ConcurrentHashMap();
        List r0 = Collections.EMPTY_LIST;
        this.v = r0;
        this.q = r2;
        this.s = r0;
    }

    @Override // defpackage.dw3
    public final int a() {
        List r0 = this.s;
        if (r0 != null) goto L7;
        return 0;
    L7:
        return r0.size();
    }

    @Override // defpackage.dw3
    public final long b(int r1) {
        return r1;
    }

    @Override // defpackage.dw3
    public final void g(cx3 r14, int r15) {
        xk3 r16 = (xk3) r14;
        Child r17 = (Child) this.s.get(r16.d());
        lo r0 = r16.u;
        TextView r1 = (TextView) r0.k;
        View r2 = (View) r0.b;
        ConstraintLayout r3 = (ConstraintLayout) r0.m;
        ImageView r4 = (ImageView) r0.g;
        r1.setText(r17.getTitle());
        TextView r5 = (TextView) r0.j;
        View r6 = r16.a;
        r5.setText(r6.getContext().getString(R.string.song_subtitle_formatter, new Object[]{a.a(r17.getArtist(), r17.getId()), e03.g(r17.getDuration()), e03.f(r17)}));
        Context r7 = r6.getContext();
        String r8 = r17.getCoverArtId();
        c04 r9 = com.bumptech.glide.a.c(r7);
        String r10 = null;
        if (r8 == null) goto L5;
        String r11 = wg0.b(ud3.t(), r8);
    L6:
        vz3 r12 = b11.g(r7, r8, 9, r9, r11).T(xv0.b());
        if (ud3.R() == false) goto L9;
        r12 = (vz3) r12.l();
    L9:
        vz3 r13 = (vz3) r12.x();
        Context r18 = r6.getContext();
        String r19 = r17.getCoverArtId();
        c04 r20 = com.bumptech.glide.a.c(r18);
        if (r19 == null) goto L12;
        r10 = wg0.b(ud3.t(), r19);
    L12:
        vz3 r21 = b11.g(r18, r19, 9, r20, r10).T(xv0.b());
        if (ud3.R() == false) goto L15;
        r21 = (vz3) r21.l();
    L15:
        r21.S(r13).K((ImageView) r0.i);
        bl2 r22 = this.r;
        si1 r23 = new si1(14, r16);
        WeakReference r24 = bo2.a;
        int r25 = 20;
        if (u52.c().a == false) goto L18;
        r23.onRecovery(u52.c().o);
    L21:
        if (ud3.o() != null) goto L27;
        if (au0.w(r6.getContext()) == null) goto L25;
        boolean r26 = eu0.d(r17.getId());
    L29:
        ImageView r27 = (ImageView) r0.c;
        int r110 = 8;
        if (r26 == false) goto L32;
        r27.setVisibility(0);
    L34:
        if (xa3.u("rating_per_item", false) == false) goto L75;
        String r28 = r17.getId();
        if (r17.getStarred() == null) goto L38;
        boolean r111 = true;
    L39:
        boolean r29 = n61.f(1, r28, r111);
        if (r29 == false) goto L42;
    L45:
        int r112 = 0;
    L46:
        r3.setVisibility(r112);
        ImageView r30 = (ImageView) r0.h;
        if (r29 == false) goto L49;
        int r31 = 0;
    L50:
        r30.setVisibility(r31);
        LinearLayout r32 = (LinearLayout) r0.l;
        if (r17.getUserRating() == null) goto L53;
        r110 = 0;
    L53:
        r32.setVisibility(r110);
        if (r17.getUserRating() == null) goto L76;
        ImageView r33 = (ImageView) r0.f;
        Context r34 = r6.getContext();
        int r113 = r17.getUserRating().intValue();
        int r114 = R.drawable.ic_star_outlined;
        if (r113 < 1) goto L58;
        int r35 = R.drawable.ic_star;
    L59:
        r33.setImageDrawable(zz1.r(r34, r35));
        ImageView r36 = (ImageView) r0.o;
        Context r37 = r6.getContext();
        if (r17.getUserRating().intValue() < 2) goto L62;
        int r38 = R.drawable.ic_star;
    L63:
        r36.setImageDrawable(zz1.r(r37, r38));
        ImageView r39 = (ImageView) r0.n;
        Context r40 = r6.getContext();
        if (r17.getUserRating().intValue() < 3) goto L66;
        int r41 = R.drawable.ic_star;
    L67:
        r39.setImageDrawable(zz1.r(r40, r41));
        ImageView r42 = (ImageView) r0.e;
        Context r43 = r6.getContext();
        if (r17.getUserRating().intValue() < 4) goto L70;
        int r44 = R.drawable.ic_star;
    L71:
        r42.setImageDrawable(zz1.r(r43, r44));
        ImageView r45 = (ImageView) r0.d;
        Context r46 = r6.getContext();
        if (r17.getUserRating().intValue() < 5) goto L74;
        r114 = R.drawable.ic_star;
    L74:
        r45.setImageDrawable(zz1.r(r46, r114));
        goto L76
    L70:
        r44 = R.drawable.ic_star_outlined;
        goto L71
    L66:
        r41 = R.drawable.ic_star_outlined;
        goto L67
    L62:
        r38 = R.drawable.ic_star_outlined;
        goto L63
    L58:
        r35 = R.drawable.ic_star_outlined;
    L76:
        r6.setOnClickListener(new j8(r25, this, r16));
        String r115 = this.t;
        if (r115 != null) goto L79;
    L86:
        r4.setVisibility(4);
        r2.setVisibility(4);
        return;
    L79:
        if (r115.equals(r17.getId()) == false) goto L86;
        r4.setVisibility(0);
        if (this.u == false) goto L83;
        r4.setImageResource(R.drawable.ic_pause);
    L84:
        r2.setVisibility(0);
        return;
    L83:
        r4.setImageResource(R.drawable.ic_play);
        goto L84
    L49:
        r31 = 8;
        goto L50
    L42:
        if (r17.getUserRating() != null) goto L45;
        r112 = 8;
        goto L46
    L38:
        r111 = false;
        goto L39
    L75:
        r3.setVisibility(8);
        goto L76
    L32:
        r27.setVisibility(8);
    L25:
        r26 = false;
        goto L29
    L27:
        if (g51.e(r17) == null) goto L25;
        r26 = true;
        goto L29
    L18:
        if (r22 == null) goto L21;
        r22.f(new ws1(r25, r22, r23), gq0.n);
        goto L21
    L5:
        r11 = null;
        goto L6
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup r19, int r20) {
        View r0 = b11.i(r19, R.layout.item_player_queue_song, r19, false);
        int r1 = R.id.cover_art_overlay;
        View r4 = uo.s(r0, R.id.cover_art_overlay);
        if (r4 == null) goto L34;
        r1 = R.id.download_indicator_icon;
        ImageView r5 = (ImageView) uo.s(r0, R.id.download_indicator_icon);
        if (r5 == null) goto L34;
        r1 = R.id.five_star_icon;
        ImageView r6 = (ImageView) uo.s(r0, R.id.five_star_icon);
        if (r6 == null) goto L34;
        r1 = R.id.four_star_icon;
        ImageView r7 = (ImageView) uo.s(r0, R.id.four_star_icon);
        if (r7 == null) goto L34;
        r1 = R.id.one_star_icon;
        ImageView r8 = (ImageView) uo.s(r0, R.id.one_star_icon);
        if (r8 == null) goto L34;
        r1 = R.id.play_pause_icon;
        ImageView r9 = (ImageView) uo.s(r0, R.id.play_pause_icon);
        if (r9 == null) goto L34;
        r1 = R.id.preferred_icon;
        ImageView r10 = (ImageView) uo.s(r0, R.id.preferred_icon);
        if (r10 == null) goto L34;
        r1 = R.id.queue_song_cover_image_view;
        ImageView r11 = (ImageView) uo.s(r0, R.id.queue_song_cover_image_view);
        if (r11 == null) goto L34;
        r1 = R.id.queue_song_holder_image;
        if (((ImageView) uo.s(r0, R.id.queue_song_holder_image)) == null) goto L34;
        r1 = R.id.queue_song_subtitle_text_view;
        TextView r12 = (TextView) uo.s(r0, R.id.queue_song_subtitle_text_view);
        if (r12 == null) goto L34;
        r1 = R.id.queue_song_title_text_view;
        TextView r13 = (TextView) uo.s(r0, R.id.queue_song_title_text_view);
        if (r13 == null) goto L34;
        r1 = R.id.rating_bar_layout;
        LinearLayout r14 = (LinearLayout) uo.s(r0, R.id.rating_bar_layout);
        if (r14 == null) goto L34;
        r1 = R.id.rating_indicator_image_view;
        ConstraintLayout r15 = (ConstraintLayout) uo.s(r0, R.id.rating_indicator_image_view);
        if (r15 == null) goto L34;
        r1 = R.id.three_star_icon;
        ImageView r16 = (ImageView) uo.s(r0, R.id.three_star_icon);
        if (r16 == null) goto L34;
        r1 = R.id.two_star_icon;
        ImageView r17 = (ImageView) uo.s(r0, R.id.two_star_icon);
        if (r17 == null) goto L34;
        return new xk3(this, new lo((ConstraintLayout) r0, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17));
    L34:
        nz2.n("Missing required view with ID: ".concat(r0.getResources().getResourceName(r1)));
        return null;
    }

    public final List p(String r4) {
        if (r4 == null) goto L4;
        ArrayList r0 = new ArrayList();
        int r1 = 0;
    L7:
        if (r1 >= this.s.size()) goto L12;
        if (r4.equals(((Child) this.s.get(r1)).getId()) == false) goto L11;
        r0.add(Integer.valueOf(r1));
    L11:
        r1 = r1 + 1;
        goto L7
    L12:
        return r0;
    L4:
        return Collections.EMPTY_LIST;
    }

    public final void q(String r4, boolean r5) {
        String r0 = this.t;
        boolean r1 = this.u;
        List r2 = this.v;
        this.t = r4;
        this.u = r5;
        if (Objects.equals(r0, r4) == false) goto L11;
        if (r1 != r5) goto L11;
        if (r4 == null) goto L7;
        List r6 = p(r4);
    L9:
        if (r2.equals(r6) == false) goto L11;
        return;
    L7:
        r6 = Collections.EMPTY_LIST;
    L11:
        if (r4 == null) goto L13;
        List r7 = p(r4);
    L14:
        this.v = r7;
        Iterator r8 = r2.iterator();
    L16:
        if (r8.hasNext() == false) goto L22;
        int r9 = ((Integer) r8.next()).intValue();
        if (r9 < 0) goto L16;
        if (r9 >= this.s.size()) goto L16;
        e(r9, "payload_playback");
        goto L16
    L22:
        Iterator r10 = this.v.iterator();
    L24:
        if (r10.hasNext() == false) goto L48;
        Integer r11 = (Integer) r10.next();
        int r3 = r11.intValue();
        if (r2.contains(r11) == true) goto L24;
        if (r3 < 0) goto L24;
        if (r3 >= this.s.size()) goto L24;
        e(r3, "payload_playback");
        goto L24
    L48:
        return;
    L13:
        r7 = Collections.EMPTY_LIST;
        goto L14
    }
}
