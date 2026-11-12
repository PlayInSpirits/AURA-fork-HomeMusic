package defpackage;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tk3 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ wk3 o;

    public /* synthetic */ tk3(wk3 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        gq0 r1 = gq0.n;
        int r2 = 0;
        wk3 r12 = this.o;
        switch(r0) {
            case 0: goto L77;
            case 1: goto L61;
            case 2: goto L56;
            case 3: goto L52;
            case 4: goto L75;
            case 5: goto L28;
            default: goto L79;
        };
    L52:
        yk3 r13 = r12.w0;
        if (r13 == null) goto L84;
        r13.d();
        return;
    L84:
        return;
    L56:
        yk3 r14 = r12.w0;
        if (r14 == null) goto L85;
        r14.d();
        return;
    L85:
        return;
    L75:
        bj2 r3 = (bj2) r12.v0.get();     // Catch: Exception -> L39
        if (u52.c().a == false) goto L41;
        int r4 = u52.c().o;     // Catch: Exception -> L39
    L42:
        int r6 = r4 + 1;     // Catch: Exception -> L39
        int r7 = r12.w0.s.size();     // Catch: Exception -> L39
        bl2 r5 = r12.v0;     // Catch: Exception -> L39
        List r8 = r12.w0.s;     // Catch: Exception -> L39
        WeakReference r9 = bo2.a;     // Catch: Exception -> L39
        if (u52.q("remove", r6, r7) == true) goto L47;
        if (r5 == null) goto L47;
        r5.f(new vn2(r5, r6, r7, r8, 0), r1);     // Catch: Exception -> L39
    L47:
        ((RecyclerView) r12.l0.t).getAdapter().n.f(r6, r7 - r6);     // Catch: Exception -> L39
    L50:
        r12.k0();
        return;
    L41:
        r4 = r3.o0();     // Catch: Exception -> L39
    L39:
        e = move-exception;
        Log.e("PlayerQueueFragment", "Error clearing queue", e);
        goto L50
    L77:
    L68:
        e = move-exception;
        Log.e("PlayerQueueFragment", "Failed to get mediaBrowserListenableFuture in onResume", e);
        return;
    L65:
        if (u52.c().a == false) goto L70;
        int r10 = u52.c().o;     // Catch: Exception -> L68
    L71:
        r12.X().runOnUiThread(new mm(r12, r10, 5));     // Catch: Exception -> L68
        return;
    L70:
        r10 = ((bj2) r12.v0.get()).o0();     // Catch: Exception -> L68
        goto L71
    L79:
        bj2 r11 = (bj2) r12.v0.get();     // Catch: Exception -> L7
        if (u52.c().a == false) goto L9;
        int r15 = u52.c().o;     // Catch: Exception -> L7
    L10:
        int r16 = r15 + 1;     // Catch: Exception -> L7
        int r17 = r12.w0.s.size() - 1;     // Catch: Exception -> L7
        if (r16 >= r17) goto L25;
        ArrayList r18 = new ArrayList();     // Catch: Exception -> L7
        int r19 = r16;
    L13:
        if (r19 > r17) goto L16;
        r18.add(Integer.valueOf(r19));     // Catch: Exception -> L7
        r19 = r19 + 1;     // Catch: Exception -> L7
    L16:
        if (r18.size() < 2) goto L18;
        int r20 = (int) (Math.random() * ((double) r18.size()));     // Catch: Exception -> L7
        int r21 = ((Integer) r18.get(r20)).intValue();     // Catch: Exception -> L7
        r18.remove(r20);     // Catch: Exception -> L7
        int r22 = (int) (Math.random() * ((double) r18.size()));     // Catch: Exception -> L7
        int r23 = ((Integer) r18.get(r22)).intValue();     // Catch: Exception -> L7
        r18.remove(r22);     // Catch: Exception -> L7
        Collections.swap(r12.w0.s, r21, r23);     // Catch: Exception -> L7
        ((RecyclerView) r12.l0.t).getAdapter().n.c(r21, r23);     // Catch: Exception -> L7
        goto L16
    L18:
        bl2 r24 = r12.v0;     // Catch: Exception -> L7
        List r25 = r12.w0.s;     // Catch: Exception -> L7
        WeakReference r26 = bo2.a;     // Catch: Exception -> L7
        r25.getClass();     // Catch: Exception -> L7
        if (u52.r(r25, "reorder", 0, 0) == true) goto L25;
        if (r24 == null) goto L25;
        r24.f(new vn2(r24, r25, r16, r17), r1);     // Catch: Exception -> L7
    L25:
        r12.k0();
        return;
    L9:
        r15 = r11.o0();     // Catch: Exception -> L7
    L7:
        e = move-exception;
        Log.e("PlayerQueueFragment", "Error shuffling queue", e);
        goto L25
    L28:
        if (r12.l0 == null) goto L83;
        View r27 = r12.X().getWindow().getDecorView();
        WeakHashMap r28 = j65.a;
        pb5 r29 = b65.a(r27);
        if (r29 == null) goto L34;
        r2 = r29.a.h(519).d;
    L34:
        RecyclerView r30 = (RecyclerView) r12.l0.t;
        r30.setPadding(r30.getPaddingLeft(), ((RecyclerView) r12.l0.t).getPaddingTop(), ((RecyclerView) r12.l0.t).getPaddingRight(), r2);
        return;
    L83:
        return;
    L61:
        if (r12.s0 == false) goto L86;
        r12.k0();
        return;
    }
}
