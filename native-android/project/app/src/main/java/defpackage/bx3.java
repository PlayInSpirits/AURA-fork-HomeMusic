package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bx3 implements Runnable {
    public int n;
    public int o;
    public OverScroller p;
    public Interpolator q;
    public boolean r;
    public boolean s;
    public final /* synthetic */ RecyclerView t;

    public bx3(RecyclerView r3) {
        this.t = r3;
        c22 r0 = RecyclerView.W0;
        this.q = r0;
        this.r = false;
        this.s = false;
        this.p = new OverScroller(r3.getContext(), r0);
    }

    public final void a(int r13, int r14) {
        RecyclerView r1 = this.t;
        r1.setScrollState(2);
        this.o = 0;
        this.n = 0;
        Interpolator r0 = this.q;
        c22 r2 = RecyclerView.W0;
        if (r0 == r2) goto L5;
        this.q = r2;
        this.p = new OverScroller(r1.getContext(), r2);
    L5:
        this.p.fling(0, 0, r13, r14, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.r == false) goto L6;
        this.s = true;
        return;
    L6:
        RecyclerView r0 = this.t;
        r0.removeCallbacks(this);
        WeakHashMap r1 = j65.a;
        r0.postOnAnimation(this);
    }

    public final void c(int r10, int r11, int r12, Interpolator r13) {
        RecyclerView r2 = this.t;
        if (r12 != Integer.MIN_VALUE) goto L15;
        int r14 = Math.abs(r10);
        int r0 = Math.abs(r11);
        if (r14 <= r0) goto L7;
        boolean r3 = true;
    L8:
        if (r3 == false) goto L10;
        int r4 = r2.getWidth();
    L11:
        if (r3 == true) goto L14;
        r14 = r0;
    L14:
        r12 = Math.min((int) (((r14 / r4) + 1.0f) * 300.0f), 2000);
        goto L15
    L10:
        r4 = r2.getHeight();
        goto L11
    L7:
        r3 = false;
    L15:
        int r8 = r12;
        if (r13 != null) goto L19;
        r13 = RecyclerView.W0;
    L19:
        if (this.q == r13) goto L21;
        this.q = r13;
        this.p = new OverScroller(r2.getContext(), r13);
    L21:
        this.o = 0;
        this.n = 0;
        r2.setScrollState(2);
        this.p.startScroll(0, 0, r10, r11, r8);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView r0 = this.t;
        int[] r8 = r0.G0;
        if (r0.A != null) goto L6;
        r0.removeCallbacks(this);
        this.p.abortAnimation();
        return;
    L6:
        this.s = false;
        this.r = true;
        r0.p();
        OverScroller r11 = this.p;
        if (r11.computeScrollOffset() == false) goto L108;
        int r1 = r11.getCurrX();
        int r2 = r11.getCurrY();
        int r3 = r1 - this.n;
        int r4 = r2 - this.o;
        this.n = r1;
        this.o = r2;
        int r5 = RecyclerView.o(r3, r0.V, r0.a0, r0.getWidth());
        int r6 = RecyclerView.o(r4, r0.W, r0.b0, r0.getHeight());
        int[] r7 = r0.G0;
        r7[0] = 0;
        r7[1] = 0;
        if (r0.v(r5, r6, 1, r7, null) == false) goto L12;
        r5 = r5 - r8[0];
        r6 = r6 - r8[1];
    L12:
        if (r0.getOverScrollMode() == 2) goto L15;
        r0.n(r5, r6);
    L15:
        if (r0.z == null) goto L30;
        r8[0] = 0;
        r8[1] = 0;
        r0.i0(r5, r6, r8);
        int r9 = r8[0];
        int r10 = r8[1];
        int r12 = r5 - r9;
        int r13 = r6 - r10;
        db2 r14 = r0.A.e;
        if (r14 != null) goto L19;
    L29:
        int r15 = r12;
        int r16 = r9;
        int r17 = r13;
        int r18 = r10;
    L32:
        if (r0.C.isEmpty() == true) goto L34;
        r0.invalidate();
    L34:
        int[] r19 = r0.G0;
        r19[0] = 0;
        r19[1] = 0;
        r0.w(r16, r18, r15, r17, null, 1, r19);
        int r20 = r15 - r8[0];
        int r21 = r17 - r8[1];
        if (r16 != 0) goto L37;
        if (r18 != 0) goto L37;
    L39:
        if (RecyclerView.d(r0) == true) goto L42;
        r0.invalidate();
    L42:
        if (r11.getCurrX() != r11.getFinalX()) goto L44;
        boolean r22 = true;
    L46:
        if (r11.getCurrY() != r11.getFinalY()) goto L48;
        boolean r23 = true;
    L50:
        if (r11.isFinished() == true) goto L57;
        if (r22 == true) goto L53;
        if (r20 != 0) goto L53;
    L56:
        boolean r24 = false;
    L58:
        db2 r25 = r0.A.e;
        if (r25 != null) goto L61;
    L63:
        if (r24 == true) goto L65;
    L102:
        b();
        yg1 r26 = r0.s0;
        if (r26 == null) goto L106;
        r26.a(r0, r16, r18);
    L106:
        if (Build.VERSION.SDK_INT < 35) goto L108;
        gw3.a(r0, Math.abs(r11.getCurrVelocity()));
        goto L108
    L65:
        if (r0.getOverScrollMode() == 2) goto L97;
        int r27 = (int) r11.getCurrVelocity();
        if (r20 >= 0) goto L69;
        int r28 = -r27;
    L72:
        if (r21 >= 0) goto L74;
        r27 = -r27;
    L77:
        if (r28 >= 0) goto L81;
        r0.z();
        if (r0.V.isFinished() == false) goto L85;
        r0.V.onAbsorb(-r28);
    L85:
        if (r27 >= 0) goto L89;
        r0.B();
        if (r0.W.isFinished() == false) goto L93;
        r0.W.onAbsorb(-r27);
    L93:
        if (r28 != 0) goto L95;
        if (r27 == 0) goto L97;
    L95:
        r0.postInvalidateOnAnimation();
        goto L97
    L89:
        if (r27 <= 0) goto L93;
        r0.y();
        if (r0.b0.isFinished() == false) goto L93;
        r0.b0.onAbsorb(r27);
        goto L93
    L81:
        if (r28 <= 0) goto L85;
        r0.A();
        if (r0.a0.isFinished() == false) goto L85;
        r0.a0.onAbsorb(r28);
        goto L85
    L74:
        if (r21 > 0) goto L77;
        r27 = 0;
        goto L77
    L69:
        if (r20 <= 0) goto L71;
        r28 = r27;
        goto L72
    L71:
        r28 = 0;
    L97:
        if (RecyclerView.U0 == false) goto L106;
        b30 r29 = r0.t0;
        int[] r30 = r29.c;
        if (r30 == null) goto L101;
        Arrays.fill(r30, -1);
    L101:
        r29.d = 0;
        goto L106
    L61:
        if (r25.d == false) goto L63;
    L53:
        if (r23 == true) goto L57;
        if (r21 == 0) goto L56;
    L57:
        r24 = true;
        goto L58
    L48:
        r23 = false;
        goto L50
    L44:
        r22 = false;
    L37:
        r0.x(r16, r18);
        goto L39
    L19:
        if (r14.d == true) goto L29;
        if (r14.e == false) goto L29;
        int r31 = r0.u0.b();
        if (r31 != 0) goto L26;
        r14.i();
        goto L29
    L26:
        if (r14.a < r31) goto L28;
        r14.a = r31 - 1;
        r14.g(r9, r10);
        goto L29
    L28:
        r14.g(r9, r10);
        goto L29
    L30:
        r15 = r5;
        r17 = r6;
        r16 = 0;
        r18 = 0;
    L108:
        db2 r32 = r0.A.e;
        if (r32 != null) goto L111;
    L113:
        this.r = false;
        if (this.s == false) goto L117;
        r0.removeCallbacks(this);
        WeakHashMap r33 = j65.a;
        r0.postOnAnimation(this);
        return;
    L117:
        r0.setScrollState(0);
        r0.q0(1);
        return;
    L111:
        if (r32.d == false) goto L113;
        r32.g(0, 0);
        goto L113
    }
}
