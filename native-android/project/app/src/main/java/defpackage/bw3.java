package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bw3 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ RecyclerView o;

    public /* synthetic */ bw3(RecyclerView r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r1 = this.n;
        RecyclerView r0 = this.o;
        switch(r1) {
            case 0: goto L47;
            default: goto L4;
        };
    L4:
        jw3 r2 = r0.c0;
        if (r2 == null) goto L43;
        pl0 r3 = (pl0) r2;
        long r4 = r3.d;
        ArrayList r6 = r3.h;
        boolean r7 = r6.isEmpty();
        ArrayList r8 = r3.j;
        boolean r9 = r8.isEmpty();
        ArrayList r10 = r3.k;
        boolean r11 = r10.isEmpty();
        ArrayList r12 = r3.i;
        boolean r13 = r12.isEmpty();
        if (r7 == false) goto L12;
        if (r9 == false) goto L12;
        if (r13 == false) goto L12;
        if (r11 == true) goto L43;
    L12:
        int r14 = r6.size();
        int r15 = 0;
    L13:
        if (r15 >= r14) goto L15;
        Object r16 = r6.get(r15);
        r15 = r15 + 1;
        cx3 r5 = (cx3) r16;
        View r17 = r5.a;
        ArrayList r18 = r6;
        ViewPropertyAnimator r19 = r17.animate();
        r3.q.add(r5);
        r19.setDuration(r4).alpha(0.0f).setListener(new kl0(r3, r5, r19, r17)).start();
        r6 = r18;
        r7 = r7;
        r9 = r9;
        goto L13
    L15:
        boolean r110 = r7;
        boolean r111 = r9;
        r6.clear();
        if (r111 == true) goto L21;
        ArrayList r20 = new ArrayList();
        r20.addAll(r8);
        r3.m.add(r20);
        r8.clear();
        jl0 r21 = new jl0(r3, r20, 0);
        if (r110 == true) goto L20;
        View r22 = ((ol0) r20.get(0)).a.a;
        WeakHashMap r23 = j65.a;
        r22.postOnAnimationDelayed(r21, r4);
        goto L21
    L20:
        r21.run();
    L21:
        if (r11 == true) goto L26;
        ArrayList r24 = new ArrayList();
        r24.addAll(r10);
        r3.n.add(r24);
        r10.clear();
        jl0 r25 = new jl0(r3, r24, 1);
        if (r110 == true) goto L25;
        View r26 = ((nl0) r24.get(0)).a.a;
        WeakHashMap r27 = j65.a;
        r26.postOnAnimationDelayed(r25, r4);
        goto L26
    L25:
        r25.run();
    L26:
        if (r13 == true) goto L43;
        ArrayList r28 = new ArrayList();
        r28.addAll(r12);
        r3.l.add(r28);
        r12.clear();
        jl0 r29 = new jl0(r3, r28, 2);
        if (r110 == false) goto L33;
        if (r111 == false) goto L33;
        if (r11 == false) goto L33;
        r29.run();
    L33:
        long r30 = 0;
        if (r110 == false) goto L37;
        r4 = 0;
    L37:
        if (r111 == true) goto L39;
        long r31 = r3.e;
    L40:
        if (r11 == true) goto L42;
        r30 = r3.f;
    L42:
        long r32 = Math.max(r31, r30) + r4;
        boolean r33 = false;
        View r34 = ((cx3) r28.get(0)).a;
        WeakHashMap r35 = j65.a;
        r34.postOnAnimationDelayed(r29, r32);
    L44:
        r0.A0 = r33;
        return;
    L39:
        r31 = 0;
    L43:
        r33 = false;
        goto L44
    L47:
        if (r0.H == true) goto L49;
        return;
    L49:
        if (r0.isLayoutRequested() == false) goto L52;
        return;
    L52:
        if (r0.F == true) goto L55;
        r0.requestLayout();
        return;
    L55:
        if (r0.K == false) goto L57;
        r0.J = true;
        return;
    L57:
        r0.p();
    }
}
