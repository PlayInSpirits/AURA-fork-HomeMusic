package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchView;
import java.lang.reflect.Array;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lo {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public Object n;
    public Object o;

    public lo(int r9) {
        this.a = new boolean[256];
        this.b = new byte[256];
        this.c = new byte[18002];
        this.d = new byte[18002];
        this.g = new int[256];
        Class r7 = Integer.TYPE;
        this.k = (int[][]) Array.newInstance(r7, new int[]{6, 258});
        this.l = (int[][]) Array.newInstance(r7, new int[]{6, 258});
        this.m = (int[][]) Array.newInstance(r7, new int[]{6, 258});
        this.h = new int[6];
        this.i = new int[257];
        this.n = new char[256];
        this.o = (char[][]) Array.newInstance(Character.TYPE, new int[]{6, 258});
        this.e = new byte[6];
        this.f = new byte[r9 * 100000];
    }

    public static void a(lo r1, float r2) {
        ((ImageButton) r1.j).setAlpha(r2);
        ((View) r1.k).setAlpha(r2);
        ((TouchObserverFrameLayout) r1.l).setAlpha(r2);
        if (((SearchView) r1.a).J == false) goto L8;
        ActionMenuView r3 = gb.y((MaterialToolbar) r1.f);
        if (r3 == null) goto L9;
        r3.setAlpha(r2);
        return;
    L9:
        return;
    }

    public void b(AnimatorSet r8) {
        ImageButton r0 = gb.F((MaterialToolbar) this.f);
        if (r0 == null) goto L23;
        Drawable r1 = r0.getDrawable();
        if (((SearchView) this.a).I == false) goto L15;
        if ((r1 instanceof dw0) == false) goto L11;
        ValueAnimator r4 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        r4.addUpdateListener(new cn0(5, (dw0) r1));
        r8.playTogether(new Animator[]{r4});
    L11:
        if ((r1 instanceof v51) == false) goto L21;
        ValueAnimator r7 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        r7.addUpdateListener(new cn0(6, (v51) r1));
        r8.playTogether(new Animator[]{r7});
        return;
    L21:
        return;
    L15:
        if ((r1 instanceof dw0) == false) goto L18;
        ((dw0) r1).setProgress(1.0f);
    L18:
        if ((r1 instanceof v51) == false) goto L22;
        ((v51) r1).a(1.0f);
        return;
    L22:
        return;
    }

    public AnimatorSet c(boolean r13) {
        AnimatorSet r0 = new AnimatorSet();
        MaterialToolbar r1 = (MaterialToolbar) this.f;
        ImageButton r2 = gb.F(r1);
        if (r2 == null) goto L6;
        ValueAnimator r8 = ValueAnimator.ofFloat(new float[]{f(r2), 0.0f});
        r8.addUpdateListener(new c30(new zr2(28), new View[]{r2}));
        ValueAnimator r9 = ValueAnimator.ofFloat(new float[]{g(), 0.0f});
        r9.addUpdateListener(c30.a(new View[]{r2}));
        r0.playTogether(new Animator[]{r8, r9});
    L6:
        ActionMenuView r3 = gb.y(r1);
        if (r3 == null) goto L10;
        ValueAnimator r4 = ValueAnimator.ofFloat(new float[]{e(r3), 0.0f});
        r4.addUpdateListener(new c30(new zr2(28), new View[]{r3}));
        ValueAnimator r12 = ValueAnimator.ofFloat(new float[]{g(), 0.0f});
        r12.addUpdateListener(c30.a(new View[]{r3}));
        r0.playTogether(new Animator[]{r4, r12});
    L10:
        if (r13 == false) goto L12;
        long r5 = 300;
    L13:
        r0.setDuration(r5);
        r0.setInterpolator(d24.a(r13, yd.b));
        return r0;
    L12:
        r5 = 250;
        goto L13
    }

    public AnimatorSet d(boolean r23) {
        Toolbar r2 = (Toolbar) this.g;
        SearchView r3 = (SearchView) this.a;
        AnimatorSet r4 = new AnimatorSet();
        if (((AnimatorSet) this.n) != null) goto L10;
        AnimatorSet r5 = new AnimatorSet();
        b(r5);
        if (r23 == false) goto L8;
        long r13 = 300;
    L9:
        r5.setDuration(r13);
        r5.setInterpolator(d24.a(r23, yd.b));
        r4.playTogether(new Animator[]{r5, c(r23)});
        goto L10
    L8:
        r13 = 250;
    L10:
        if (r23 == false) goto L12;
        TimeInterpolator r6 = yd.a;
    L13:
        ValueAnimator r14 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        if (r23 == false) goto L16;
        long r15 = 300;
    L17:
        r14.setDuration(r15);
        r14.setInterpolator(d24.a(r23, r6));
        r14.addUpdateListener(new c30(new nz2(1), new View[]{(View) this.b}));
        ClippableRoundedCornerLayout r7 = (ClippableRoundedCornerLayout) this.c;
        ci2 r16 = (ci2) this.m;
        Rect r17 = r16.j;
        Rect r9 = r16.k;
        if (r17 != null) goto L21;
        r17 = new Rect(r3.getLeft(), r3.getTop(), r3.getRight(), r3.getBottom());
    L21:
        if (r9 != null) goto L24;
        r9 = vr1.c(r7, (SearchBar) this.o);
    L24:
        final Rect r8 = new Rect(r9);
        final float r10 = ((SearchBar) this.o).getCornerSize();
        final float r11 = Math.max(r7.getCornerRadius(), r16.c());
        ValueAnimator r12 = ValueAnimator.ofObject(new i81(r8), new Object[]{r9, r17});
        r12.addUpdateListener(new a84(this, r10, r11, r8));
        if (r23 == false) goto L27;
        long r18 = 300;
    L28:
        r12.setDuration(r18);
        a61 r19 = yd.b;
        r12.setInterpolator(d24.a(r23, r19));
        ValueAnimator r20 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        if (r23 == false) goto L31;
        long r110 = 50;
    L32:
        r20.setDuration(r110);
        if (r23 == false) goto L35;
        long r111 = 250;
    L36:
        r20.setStartDelay(r111);
        LinearInterpolator r112 = yd.a;
        r20.setInterpolator(d24.a(r23, r112));
        r20.addUpdateListener(new c30(new nz2(1), new View[]{(ImageButton) this.j}));
        View r113 = (View) this.k;
        TouchObserverFrameLayout r114 = (TouchObserverFrameLayout) this.l;
        AnimatorSet r115 = new AnimatorSet();
        ValueAnimator r116 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        if (r23 == false) goto L40;
        long r117 = 150;
    L41:
        r116.setDuration(r117);
        if (r23 == false) goto L44;
        long r21 = 75;
    L45:
        r116.setStartDelay(r21);
        r116.setInterpolator(d24.a(r23, r112));
        r116.addUpdateListener(new c30(new nz2(1), new View[]{r113, r114}));
        ValueAnimator r22 = ValueAnimator.ofFloat(new float[]{(r114.getHeight() * 0.050000012f) / 2.0f, 0.0f});
        if (r23 == false) goto L48;
        long r24 = 300;
    L49:
        r22.setDuration(r24);
        r22.setInterpolator(d24.a(r23, r19));
        r22.addUpdateListener(c30.a(new View[]{r113}));
        ValueAnimator r25 = ValueAnimator.ofFloat(new float[]{0.95f, 1.0f});
        if (r23 == false) goto L52;
        long r26 = 300;
    L53:
        r25.setDuration(r26);
        r25.setInterpolator(d24.a(r23, r19));
        r25.addUpdateListener(new c30(new nz2(0), new View[]{r114}));
        r115.playTogether(new Animator[]{r116, r22, r25});
        Animator r27 = i(r23, false, (FrameLayout) this.d);
        Animator r118 = i(r23, false, r2);
        ValueAnimator r28 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        if (r23 == false) goto L56;
        long r29 = 300;
    L57:
        r28.setDuration(r29);
        r28.setInterpolator(d24.a(r23, r19));
        if (r3.J == false) goto L60;
        r28.addUpdateListener(new w51(gb.y(r2), gb.y((MaterialToolbar) this.f)));
    L60:
        r4.playTogether(new Animator[]{r14, r12, r20, r115, r27, r118, r28, i(r23, true, (EditText) this.i), i(r23, true, (TextView) this.h)});
        r4.addListener(new d61(this, r23));
        return r4;
    L56:
        r29 = 250;
        goto L57
    L52:
        r26 = 250;
        goto L53
    L48:
        r24 = 250;
        goto L49
    L44:
        r21 = 0;
        goto L45
    L40:
        r117 = 83;
        goto L41
    L35:
        r111 = 0;
        goto L36
    L31:
        r110 = 42;
        goto L32
    L27:
        r18 = 250;
        goto L28
    L16:
        r15 = 250;
        goto L17
    L12:
        r6 = yd.b;
        goto L13
    }

    public int e(View r3) {
        int r4 = ((ViewGroup.MarginLayoutParams) r3.getLayoutParams()).getMarginEnd();
        boolean r0 = vr1.z((SearchBar) this.o);
        SearchBar r1 = (SearchBar) this.o;
        if (r0 == false) goto L7;
        return r1.getLeft() - r4;
    L7:
        return (r1.getRight() - ((SearchView) this.a).getWidth()) + r4;
    }

    public int f(View r4) {
        int r5 = ((ViewGroup.MarginLayoutParams) r4.getLayoutParams()).getMarginStart();
        SearchBar r0 = (SearchBar) this.o;
        WeakHashMap r1 = j65.a;
        int r2 = r0.getPaddingStart();
        boolean r3 = vr1.z((SearchBar) this.o);
        SearchBar r6 = (SearchBar) this.o;
        if (r3 == false) goto L7;
        return ((r6.getWidth() - ((SearchBar) this.o).getRight()) + r5) - r2;
    L7:
        return (r6.getLeft() - r5) + r2;
    }

    public int g() {
        FrameLayout r0 = (FrameLayout) this.e;
        int r1 = r0.getTop();
        int r2 = (r0.getBottom() + r1) / 2;
        int r3 = ((SearchBar) this.o).getTop();
        return ((((SearchBar) this.o).getBottom() + r3) / 2) - r2;
    }

    public AnimatorSet h(boolean r7) {
        AnimatorSet r0 = new AnimatorSet();
        ClippableRoundedCornerLayout r1 = (ClippableRoundedCornerLayout) this.c;
        ValueAnimator r3 = ValueAnimator.ofFloat(new float[]{r1.getHeight(), 0.0f});
        r3.addUpdateListener(c30.a(new View[]{r1}));
        r0.playTogether(new Animator[]{r3});
        b(r0);
        r0.setInterpolator(d24.a(r7, yd.b));
        if (r7 == false) goto L5;
        long r6 = 350;
    L6:
        r0.setDuration(r6);
        return r0;
    L5:
        r6 = 300;
        goto L6
    }

    public AnimatorSet i(boolean r9, boolean r10, View r11) {
        if (r10 == false) goto L4;
        int r12 = f(r11);
    L5:
        ValueAnimator r1 = ValueAnimator.ofFloat(new float[]{r12, 0.0f});
        r1.addUpdateListener(new c30(new zr2(28), new View[]{r11}));
        ValueAnimator r8 = ValueAnimator.ofFloat(new float[]{g(), 0.0f});
        r8.addUpdateListener(c30.a(new View[]{r11}));
        AnimatorSet r13 = new AnimatorSet();
        r13.playTogether(new Animator[]{r1, r8});
        if (r9 == false) goto L8;
        long r0 = 300;
    L9:
        r13.setDuration(r0);
        r13.setInterpolator(d24.a(r9, yd.b));
        return r13;
    L8:
        r0 = 250;
        goto L9
    L4:
        r12 = e(r11);
        goto L5
    }

    public AnimatorSet j() {
        SearchBar r0 = (SearchBar) this.o;
        SearchView r1 = (SearchView) this.a;
        if (r0 == null) goto L10;
        if (r1.h() == false) goto L7;
        r1.f();
    L7:
        AnimatorSet r2 = d(false);
        r2.addListener(new c84(this, 1));
        r2.start();
        return r2;
    L10:
        if (r1.h() == false) goto L12;
        r1.f();
    L12:
        AnimatorSet r3 = h(false);
        r3.addListener(new c84(this, 3));
        r3.start();
        return r3;
    }

    public lo(SearchView r3) {
        this.a = r3;
        this.b = r3.n;
        ClippableRoundedCornerLayout r0 = r3.o;
        this.c = r0;
        this.d = r3.r;
        this.e = r3.s;
        this.f = r3.t;
        this.g = r3.u;
        this.h = r3.v;
        this.i = r3.w;
        this.j = r3.x;
        this.k = r3.y;
        this.l = r3.z;
        this.m = new ci2(r0);
    }

    public lo(ConstraintLayout r1, View r2, ImageView r3, ImageView r4, ImageView r5, ImageView r6, ImageView r7, ImageView r8, ImageView r9, TextView r10, TextView r11, LinearLayout r12, ConstraintLayout r13, ImageView r14, ImageView r15) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
        this.g = r7;
        this.h = r8;
        this.i = r9;
        this.j = r10;
        this.k = r11;
        this.l = r12;
        this.m = r13;
        this.n = r14;
        this.o = r15;
    }
}
