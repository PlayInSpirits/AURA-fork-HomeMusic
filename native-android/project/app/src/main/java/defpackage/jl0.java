package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jl0 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ ArrayList o;
    public final /* synthetic */ pl0 p;

    public /* synthetic */ jl0(pl0 r1, ArrayList r2, int r3) {
        this.n = r3;
        this.p = r1;
        this.o = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r1 = this.n;
        int r4 = 0;
        ArrayList r5 = this.o;
        switch(r1) {
            case 0: goto L29;
            case 1: goto L10;
            default: goto L4;
        };
    L4:
        int r2 = r5.size();
    L5:
        pl0 r3 = this.p;
        if (r4 >= r2) goto L8;
        Object r6 = r5.get(r4);
        r4 = r4 + 1;
        cx3 r7 = (cx3) r6;
        r3.getClass();
        View r8 = r7.a;
        ViewPropertyAnimator r9 = r8.animate();
        r3.o.add(r7);
        r9.alpha(1.0f).setDuration(r3.c).setListener(new kl0(r3, r7, r8, r9)).start();
        goto L5
    L8:
        r5.clear();
        r3.l.remove(r5);
        return;
    L10:
        int r10 = r5.size();
    L11:
        pl0 r11 = this.p;
        if (r4 >= r10) goto L27;
        Object r12 = r5.get(r4);
        r4 = r4 + 1;
        nl0 r13 = (nl0) r12;
        ArrayList r14 = r11.r;
        long r15 = r11.f;
        cx3 r16 = r13.a;
        View r17 = null;
        if (r16 != null) goto L16;
        View r18 = null;
    L17:
        cx3 r19 = r13.b;
        if (r19 == null) goto L20;
        r17 = r19.a;
    L20:
        View r110 = r17;
        if (r18 == null) goto L23;
        ViewPropertyAnimator r20 = r18.animate().setDuration(r15);
        r14.add(r13.a);
        r20.translationX(r13.e - r13.c);
        r20.translationY(r13.f - r13.d);
        r20.alpha(0.0f).setListener(new ml0(r11, r13, r20, r18, 0)).start();
    L23:
        if (r110 == null) goto L25;
        ViewPropertyAnimator r21 = r110.animate();
        r14.add(r13.b);
        char r111 = 0;
        r21.translationX(0.0f).translationY(0.0f).setDuration(r15).alpha(1.0f).setListener(new ml0(r11, r13, r21, r110, 1)).start();
        goto L11
    L25:
        r111 = 0;
        goto L11
    L16:
        r18 = r16.a;
        goto L17
    L27:
        r5.clear();
        r11.n.remove(r5);
        return;
    L29:
        int r22 = r5.size();
    L30:
        pl0 r23 = this.p;
        if (r4 >= r22) goto L38;
        Object r24 = r5.get(r4);
        r4 = r4 + 1;
        ol0 r25 = (ol0) r24;
        cx3 r26 = r25.a;
        int r27 = r25.b;
        int r28 = r25.c;
        int r112 = r25.d;
        int r29 = r25.e;
        r23.getClass();
        View r113 = r26.a;
        int r30 = r112 - r27;
        int r114 = r29 - r28;
        if (r30 == 0) goto L35;
        r113.animate().translationX(0.0f);
    L35:
        if (r114 == 0) goto L37;
        r113.animate().translationY(0.0f);
    L37:
        ViewPropertyAnimator r115 = r113.animate();
        r23.p.add(r26);
        r115.setDuration(r23.e).setListener(new ll0(r23, r26, r30, r113, r114, r115)).start();
        goto L30
    L38:
        r5.clear();
        r23.m.remove(r5);
    }
}
