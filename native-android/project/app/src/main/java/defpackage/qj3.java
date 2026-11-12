package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.media3.ui.PlayerControlView;
import app.homemusic.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qj3 {
    public int A;
    public boolean B;
    public boolean C;
    public boolean D;
    public final PlayerControlView a;
    public final View b;
    public final ViewGroup c;
    public final ViewGroup d;
    public final ViewGroup e;
    public final ViewGroup f;
    public final ViewGroup g;
    public final ViewGroup h;
    public final ViewGroup i;
    public final ViewGroup j;
    public final View k;
    public final View l;
    public final AnimatorSet m;
    public final AnimatorSet n;
    public final AnimatorSet o;
    public final AnimatorSet p;
    public final AnimatorSet q;
    public final ValueAnimator r;
    public final ValueAnimator s;
    public final mj3 t;
    public final mj3 u;
    public final mj3 v;
    public final mj3 w;
    public final mj3 x;
    public final cs1 y;
    public final ArrayList z;

    public qj3(PlayerControlView r17) {
        this.a = r17;
        final int r3 = 0;
        this.t = new mj3(this, 0);
        final int r4 = 3;
        this.u = new mj3(this, 3);
        this.v = new mj3(this, 4);
        this.w = new mj3(this, 5);
        this.x = new mj3(this, 6);
        final int r7 = 2;
        this.y = new cs1(2, this);
        final int r2 = 1;
        this.D = true;
        this.A = 0;
        this.z = new ArrayList();
        this.c = (ViewGroup) r17.findViewById(R.id.exo_top_controls);
        this.b = r17.findViewById(R.id.exo_controls_background);
        this.d = (ViewGroup) r17.findViewById(R.id.exo_center_controls);
        this.f = (ViewGroup) r17.findViewById(R.id.exo_minimal_controls);
        ViewGroup r8 = (ViewGroup) r17.findViewById(R.id.exo_bottom_bar);
        this.e = r8;
        this.j = (ViewGroup) r17.findViewById(R.id.exo_time);
        View r9 = r17.findViewById(R.id.exo_progress);
        this.k = r9;
        this.g = (ViewGroup) r17.findViewById(R.id.exo_basic_controls);
        this.h = (ViewGroup) r17.findViewById(R.id.exo_extra_controls);
        this.i = (ViewGroup) r17.findViewById(R.id.exo_extra_controls_scroll_view);
        View r10 = r17.findViewById(R.id.exo_overflow_show);
        this.l = r10;
        View r11 = r17.findViewById(R.id.exo_overflow_hide);
        if (r10 == null) goto L6;
        if (r11 == null) goto L6;
        r10.setOnClickListener(new bj3(r4, this));
        r11.setOnClickListener(new bj3(r4, this));
    L6:
        ValueAnimator r12 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        r12.setInterpolator(new LinearInterpolator());
        r12.addUpdateListener(new nj3(this, r4));
        r12.addListener(new oj3(this, r3));
        ValueAnimator r13 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        r13.setInterpolator(new LinearInterpolator());
        r13.addUpdateListener(new nj3(this, r3));
        r13.addListener(new oj3(this, r2));
        Resources r14 = r17.getResources();
        float r15 = r14.getDimension(R.dimen.exo_styled_bottom_bar_height) - r14.getDimension(R.dimen.exo_styled_progress_bar_height);
        float r16 = r14.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet r18 = new AnimatorSet();
        this.m = r18;
        r18.setDuration(250);
        r18.addListener(new pj3(this, r17, r3));
        r18.play(r12).with(d(r9, 0.0f, r15)).with(d(r8, 0.0f, r15));
        AnimatorSet r5 = new AnimatorSet();
        this.n = r5;
        r5.setDuration(250);
        r5.addListener(new pj3(this, r17, r2));
        r5.play(d(r9, r15, r16)).with(d(r8, r15, r16));
        AnimatorSet r6 = new AnimatorSet();
        this.o = r6;
        r6.setDuration(250);
        r6.addListener(new pj3(this, r17, r7));
        r6.play(r12).with(d(r9, 0.0f, r16)).with(d(r8, 0.0f, r16));
        AnimatorSet r1 = new AnimatorSet();
        this.p = r1;
        r1.setDuration(250);
        r1.addListener(new oj3(this, r7));
        r1.play(r13).with(d(r9, r15, 0.0f)).with(d(r8, r15, 0.0f));
        AnimatorSet r19 = new AnimatorSet();
        this.q = r19;
        r19.setDuration(250);
        r19.addListener(new oj3(this, r4));
        r19.play(r13).with(d(r9, r16, 0.0f)).with(d(r8, r16, 0.0f));
        ValueAnimator r20 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.r = r20;
        r20.setDuration(250);
        r20.addUpdateListener(new nj3(this, r2));
        r20.addListener(new oj3(this, 4));
        ValueAnimator r21 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        this.s = r21;
        r21.setDuration(250);
        r21.addUpdateListener(new nj3(this, r7));
        r21.addListener(new oj3(this, 5));
    }

    public static int c(View r2) {
        if (r2 != null) goto L5;
        return 0;
    L5:
        int r0 = r2.getWidth();
        ViewGroup.LayoutParams r3 = r2.getLayoutParams();
        if ((r3 instanceof ViewGroup.MarginLayoutParams) == false) goto L9;
        ViewGroup.MarginLayoutParams r4 = (ViewGroup.MarginLayoutParams) r3;
        return (r4.leftMargin + r4.rightMargin) + r0;
    L9:
        return r0;
    }

    public static ObjectAnimator d(View r2, float r3, float r4) {
        return ObjectAnimator.ofFloat(r2, "translationY", new float[]{r3, r4});
    }

    public static boolean j(View r1) {
        int r2 = r1.getId();
        if (r2 != R.id.exo_bottom_bar) goto L5;
        return true;
    L5:
        if (r2 != R.id.exo_media_route_button_placeholder) goto L7;
        return true;
    L7:
        if (r2 != R.id.exo_prev) goto L9;
        return true;
    L9:
        if (r2 != R.id.exo_next) goto L11;
        return true;
    L11:
        if (r2 != R.id.exo_rew) goto L13;
        return true;
    L13:
        if (r2 != R.id.exo_rew_with_amount) goto L15;
        return true;
    L15:
        if (r2 != R.id.exo_ffwd) goto L17;
        return true;
    L17:
        if (r2 == R.id.exo_ffwd_with_amount) goto L29;
        return false;
    L29:
        return true;
    }

    public final void a(float r5) {
        ViewGroup r1 = this.i;
        if (r1 == null) goto L5;
        r1.setTranslationX((int) ((1.0f - r5) * r1.getWidth()));
    L5:
        ViewGroup r2 = this.j;
        if (r2 == null) goto L8;
        r2.setAlpha(1.0f - r5);
    L8:
        ViewGroup r4 = this.g;
        if (r4 == null) goto L12;
        r4.setAlpha(1.0f - r5);
        return;
    }

    public final boolean b(View r1) {
        if (r1 != null) goto L4;
        return false;
    L4:
        if (this.z.contains(r1) == false) goto L9;
        return true;
    L9:
        return false;
    }

    public final void e(Runnable r3, long r4) {
        if (r4 < 0) goto L6;
        this.a.postDelayed(r3, r4);
        return;
    }

    public final void f() {
        mj3 r0 = this.x;
        PlayerControlView r1 = this.a;
        r1.removeCallbacks(r0);
        r1.removeCallbacks(this.u);
        r1.removeCallbacks(this.w);
        r1.removeCallbacks(this.v);
    }

    public final void g() {
        if (this.A == 3) goto L18;
        f();
        int r0 = this.a.getShowTimeoutMs();
        if (r0 > 0) goto L8;
        return;
    L8:
        if (this.D == true) goto L12;
        e(this.x, r0);
        return;
    L12:
        if (this.A != 1) goto L15;
        e(this.v, 2000);
        return;
    L15:
        e(this.w, r0);
        return;
    }

    public final void h(View r2, boolean r3) {
        if (r2 != null) goto L4;
        return;
    L4:
        ArrayList r0 = this.z;
        if (r3 == true) goto L9;
        r2.setVisibility(8);
        r0.remove(r2);
        return;
    L9:
        if (this.B == true) goto L11;
    L13:
        r2.setVisibility(0);
    L14:
        r0.add(r2);
        return;
    L11:
        if (j(r2) == false) goto L13;
        r2.setVisibility(4);
        goto L14
    }

    public final void i(int r3) {
        int r0 = this.A;
        this.A = r3;
        PlayerControlView r2 = this.a;
        if (r3 != 2) goto L5;
        r2.setVisibility(8);
    L7:
        if (r0 == r3) goto L17;
        Iterator r4 = r2.x.iterator();
        if (r4.hasNext() == true) goto L12;
        return;
    L12:
        if (r4.next() == null) goto L15;
        kf2.k();
        return;
    L15:
        r2.getVisibility();
        throw null;
    L17:
        return;
    L5:
        if (r0 != 2) goto L7;
        r2.setVisibility(0);
        goto L7
    }
}
