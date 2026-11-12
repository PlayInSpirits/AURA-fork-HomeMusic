package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v34 {
    public ba5 a;
    public ArrayList b;

    public static long a(yo0 r9, long r10) {
        ba5 r0 = r9.d;
        ArrayList r1 = r9.k;
        if ((r0 instanceof yl1) == false) goto L5;
        return r10;
    L5:
        int r2 = r1.size();
        int r3 = 0;
        long r4 = r10;
    L6:
        if (r3 >= r2) goto L14;
        uo0 r6 = (uo0) r1.get(r3);
        if ((r6 instanceof yo0) == false) goto L13;
        yo0 r7 = (yo0) r6;
        if (r7.d == r0) goto L13;
        r4 = Math.min(r4, a(r7, ((long) r7.f) + r10));
    L13:
        r3 = r3 + 1;
        goto L6
    L14:
        yo0 r5 = r0.i;
        yo0 r8 = r0.h;
        if (r9 != r5) goto L18;
        long r11 = r10 - r0.j();
        return Math.min(Math.min(r4, a(r8, r11)), r11 - ((long) r8.f));
    L18:
        return r4;
    }

    public static long b(yo0 r9, long r10) {
        ba5 r0 = r9.d;
        ArrayList r1 = r9.k;
        if ((r0 instanceof yl1) == false) goto L5;
        return r10;
    L5:
        int r2 = r1.size();
        int r3 = 0;
        long r4 = r10;
    L6:
        if (r3 >= r2) goto L14;
        uo0 r6 = (uo0) r1.get(r3);
        if ((r6 instanceof yo0) == false) goto L13;
        yo0 r7 = (yo0) r6;
        if (r7.d == r0) goto L13;
        r4 = Math.max(r4, b(r7, ((long) r7.f) + r10));
    L13:
        r3 = r3 + 1;
        goto L6
    L14:
        yo0 r5 = r0.h;
        yo0 r8 = r0.i;
        if (r9 != r5) goto L18;
        long r11 = r0.j() + r10;
        return Math.max(Math.max(r4, b(r8, r11)), r11 - ((long) r8.f));
    L18:
        return r4;
    }
}
