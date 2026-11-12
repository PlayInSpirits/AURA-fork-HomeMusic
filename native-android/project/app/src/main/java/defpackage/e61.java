package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e61 extends kw3 implements qw3 {
    public static final int[] C = null;
    public static final int[] D = null;
    public int A;
    public final g5 B;
    public final int a;
    public final int b;
    public final StateListDrawable c;
    public final Drawable d;
    public final int e;
    public final int f;
    public final StateListDrawable g;
    public final Drawable h;
    public final int i;
    public final int j;
    public int k;
    public int l;
    public float m;
    public int n;
    public int o;
    public float p;
    public int q;
    public int r;
    public final RecyclerView s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public final int[] x;
    public final int[] y;
    public final ValueAnimator z;

    static {
        C = new int[]{R.attr.state_pressed};
        D = new int[0];
    }

    public e61(RecyclerView r5, StateListDrawable r6, Drawable r7, StateListDrawable r8, Drawable r9, int r10, int r11, int r12) {
        this.q = 0;
        this.r = 0;
        this.t = false;
        this.u = false;
        this.v = 0;
        this.w = 0;
        this.x = new int[2];
        this.y = new int[2];
        ValueAnimator r1 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.z = r1;
        this.A = 0;
        g5 r0 = new g5(11, this);
        this.B = r0;
        c61 r2 = new c61(1, this);
        this.c = r6;
        this.d = r7;
        this.g = r8;
        this.h = r9;
        this.e = Math.max(r10, r6.getIntrinsicWidth());
        this.f = Math.max(r10, r7.getIntrinsicWidth());
        this.i = Math.max(r10, r8.getIntrinsicWidth());
        this.j = Math.max(r10, r9.getIntrinsicWidth());
        this.a = r11;
        this.b = r12;
        r6.setAlpha(255);
        r7.setAlpha(255);
        r1.addListener(new d61(this));
        r1.addUpdateListener(new qq(3, this));
        RecyclerView r13 = this.s;
        if (r13 != r5) goto L5;
        return;
    L5:
        if (r13 == null) goto L13;
        r13.f0(this);
        RecyclerView r14 = this.s;
        r14.D.remove(this);
        if (r14.E != this) goto L9;
        r14.E = null;
    L9:
        ArrayList r15 = this.s.w0;
        if (r15 == null) goto L12;
        r15.remove(r2);
    L12:
        this.s.removeCallbacks(r0);
    L13:
        this.s = r5;
        r5.i(this);
        this.s.D.add(this);
        this.s.j(r2);
    }

    public static int k(float r2, float r3, int[] r4, int r5, int r6, int r7) {
        int r0 = r4[1] - r4[0];
        if (r0 == 0) goto L9;
        int r8 = r5 - r7;
        int r9 = (int) (((r3 - r2) / r0) * r8);
        int r10 = r6 + r9;
        if (r10 >= r8) goto L9;
        if (r10 < 0) goto L9;
        return r9;
    L9:
        return 0;
    }

    @Override // defpackage.qw3
    public final void a(MotionEvent r14) {
        if (this.v != 0) goto L6;
        return;
    L6:
        if (r14.getAction() != 0) goto L17;
        boolean r0 = j(r14.getX(), r14.getY());
        boolean r3 = i(r14.getX(), r14.getY());
        if (r0 == true) goto L10;
        if (r3 == true) goto L10;
        return;
    L10:
        if (r3 == false) goto L12;
        this.w = 1;
        this.p = (int) r14.getX();
    L14:
        l(2);
        return;
    L12:
        if (r0 == false) goto L14;
        this.w = 2;
        this.m = (int) r14.getY();
        goto L14
    L17:
        if (r14.getAction() != 1) goto L23;
        if (this.v != 2) goto L23;
        this.m = 0.0f;
        this.p = 0.0f;
        l(1);
        this.w = 0;
        return;
    L23:
        if (r14.getAction() == 2) goto L25;
        return;
    L25:
        if (this.v != 2) goto L47;
        m();
        int r1 = this.w;
        RecyclerView r4 = this.s;
        int r6 = this.b;
        if (r1 != 1) goto L36;
        float r2 = r14.getX();
        int[] r9 = this.y;
        r9[0] = r6;
        int r7 = this.q - r6;
        r9[1] = r7;
        float r8 = Math.max(r6, Math.min(r7, r2));
        if (Math.abs(this.o - r8) < 2.0f) goto L36;
        int r5 = k(this.p, r8, r9, r4.computeHorizontalScrollRange(), r4.computeHorizontalScrollOffset(), this.q);
        if (r5 == 0) goto L34;
        r4.scrollBy(r5, 0);
    L34:
        this.p = r8;
    L36:
        if (this.w != 2) goto L48;
        float r15 = r14.getY();
        int[] r10 = this.x;
        r10[0] = r6;
        int r11 = this.r - r6;
        r10[1] = r11;
        float r12 = Math.max(r6, Math.min(r11, r15));
        if (Math.abs(this.l - r12) < 2.0f) goto L50;
        int r16 = k(this.m, r12, r10, r4.computeVerticalScrollRange(), r4.computeVerticalScrollOffset(), this.r);
        if (r16 == 0) goto L43;
        r4.scrollBy(0, r16);
    L43:
        this.m = r12;
        return;
    L50:
        return;
    L48:
        return;
    }

    @Override // defpackage.qw3
    public final boolean d(MotionEvent r6) {
        int r0 = this.v;
        if (r0 != 1) goto L14;
        boolean r1 = j(r6.getX(), r6.getY());
        boolean r3 = i(r6.getX(), r6.getY());
        if (r6.getAction() != 0) goto L16;
        if (r1 == true) goto L8;
        if (r3 == true) goto L8;
        return false;
    L8:
        if (r3 == false) goto L10;
        this.w = 1;
        this.p = (int) r6.getX();
    L12:
        l(2);
        return true;
    L10:
        if (r1 == false) goto L12;
        this.w = 2;
        this.m = (int) r6.getY();
        goto L12
    L16:
        return false;
    L14:
        if (r0 != 2) goto L19;
        return true;
    L19:
        return false;
    }

    @Override // defpackage.qw3
    public final void e(boolean r1) {
    }

    @Override // defpackage.kw3
    public final void h(Canvas r10, RecyclerView r11) {
        int r12 = this.q;
        RecyclerView r0 = this.s;
        if (r12 == r0.getWidth()) goto L5;
    L19:
        this.q = r0.getWidth();
        this.r = r0.getHeight();
        l(0);
        return;
    L5:
        if (this.r != r0.getHeight()) goto L19;
        if (this.A != 0) goto L10;
        return;
    L10:
        if (this.t == false) goto L16;
        int r13 = this.q;
        int r3 = this.e;
        int r14 = r13 - r3;
        int r4 = this.l;
        int r5 = this.k;
        int r6 = r4 - (r5 / 2);
        StateListDrawable r7 = this.c;
        r7.setBounds(0, 0, r3, r5);
        int r8 = this.f;
        int r9 = this.r;
        Drawable r15 = this.d;
        r15.setBounds(0, 0, r8, r9);
        if (r0.getLayoutDirection() != 1) goto L14;
        r15.draw(r10);
        r10.translate(r3, r6);
        r10.scale(-1.0f, 1.0f);
        r7.draw(r10);
        r10.scale(-1.0f, 1.0f);
        r10.translate(-r3, -r6);
        goto L16
    L14:
        r10.translate(r14, 0.0f);
        r15.draw(r10);
        r10.translate(0.0f, r6);
        r7.draw(r10);
        r10.translate(-r14, -r6);
    L16:
        if (this.u == false) goto L22;
        int r16 = this.r;
        int r1 = this.i;
        int r17 = r16 - r1;
        int r18 = this.o;
        int r19 = this.n;
        int r20 = r18 - (r19 / 2);
        StateListDrawable r21 = this.g;
        r21.setBounds(0, 0, r19, r1);
        int r2 = this.q;
        int r22 = this.j;
        Drawable r23 = this.h;
        r23.setBounds(0, 0, r2, r22);
        r10.translate(0.0f, r17);
        r23.draw(r10);
        r10.translate(r20, 0.0f);
        r21.draw(r10);
        r10.translate(-r20, -r17);
        return;
    }

    public final boolean i(float r3, float r4) {
        if (r4 < (this.r - this.i)) goto L10;
        int r5 = this.o;
        int r2 = this.n;
        if (r3 >= (r5 - (r2 / 2))) goto L7;
        return false;
    L7:
        if (r3 > ((r2 / 2) + r5)) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    public final boolean j(float r4, float r5) {
        int r0 = this.s.getLayoutDirection();
        int r1 = this.e;
        if (r0 != 1) goto L8;
        if (r4 <= r1) goto L9;
        return false;
    L9:
        int r6 = this.l;
        int r3 = this.k / 2;
        if (r5 >= (r6 - r3)) goto L12;
        return false;
    L12:
        if (r5 > (r3 + r6)) goto L18;
        return true;
    L18:
        return false;
    L8:
        if (r4 >= (this.q - r1)) goto L9;
        return false;
    }

    public final void l(int r6) {
        RecyclerView r0 = this.s;
        g5 r1 = this.B;
        StateListDrawable r2 = this.c;
        if (r6 == 2) goto L5;
    L7:
        if (r6 != 0) goto L9;
        r0.invalidate();
    L11:
        if (this.v != 2) goto L15;
        if (r6 == 2) goto L15;
        r2.setState(D);
        r0.removeCallbacks(r1);
        r0.postDelayed(r1, 1200);
    L17:
        this.v = r6;
        return;
    L15:
        if (r6 != 1) goto L17;
        r0.removeCallbacks(r1);
        r0.postDelayed(r1, 1500);
        goto L17
    L9:
        m();
        goto L11
    L5:
        if (this.v == 2) goto L7;
        r2.setState(C);
        r0.removeCallbacks(r1);
        goto L7
    }

    public final void m() {
        int r0 = this.A;
        ValueAnimator r1 = this.z;
        if (r0 != 0) goto L5;
    L8:
        this.A = 1;
        r1.setFloatValues(new float[]{((Float) r1.getAnimatedValue()).floatValue(), 1.0f});
        r1.setDuration(500);
        r1.setStartDelay(0);
        r1.start();
        return;
    L5:
        if (r0 == 3) goto L7;
        return;
    L7:
        r1.cancel();
        goto L8
    }
}
