package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mc5 {
    public static final String i = null;
    public final sc5 a;
    public final String b;
    public final int c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f;
    public boolean g;
    public rv2 h;

    static {
        i = cx.i("WorkContinuationImpl");
    }

    public mc5(sc5 r5, String r6, int r7, List r8, int r9) {
        this.a = r5;
        this.b = r6;
        this.c = r7;
        this.d = r8;
        this.e = new ArrayList(r8.size());
        this.f = new ArrayList();
        int r10 = 0;
    L4:
        if (r10 >= r8.size()) goto L13;
        if (r7 != 1) goto L12;
        if (((bd5) r8.get(r10)).b.u == Long.MAX_VALUE) goto L12;
        kf2.n("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
        throw null;
    L12:
        String r11 = ((bd5) r8.get(r10)).a.toString();
        r11.getClass();
        this.e.add(r11);
        this.f.add(r11);
        r10 = r10 + 1;
        goto L4
    }

    public static HashSet b(mc5 r1) {
        HashSet r0 = new HashSet();
        r1.getClass();
        return r0;
    }

    public final rv2 a() {
        if (this.g == true) goto L18;
        sc5 r0 = this.a;
        i80 r1 = r0.b.m;
        int r3 = 3;
        int r4 = this.c;
        if (r4 != 1) goto L7;
        String r2 = "REPLACE";
    L17:
        this.h = h12.D(r1, "EnqueueRunnable_".concat(r2), (ia4) r0.d.n, new e25(r3, this));
    L20:
        return this.h;
    L7:
        if (r4 == 2) goto L15;
        if (r4 != 3) goto L10;
        r2 = "APPEND";
        goto L17
    L10:
        if (r4 != 4) goto L13;
        r2 = "APPEND_OR_REPLACE";
        goto L17
    L13:
        throw null;
    L15:
        r2 = "KEEP";
        goto L17
    L18:
        cx.f().k(i, "Already enqueued work ids (" + TextUtils.join(", ", this.e) + ")");
        goto L20
    }
}
