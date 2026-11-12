package defpackage;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ek4 extends bz4 {
    public static final ri c = null;
    public final /* synthetic */ int a;
    public final bz4 b;

    static {
        c = new ri(4);
    }

    public /* synthetic */ ek4(bz4 r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // defpackage.bz4
    public final Object a(l32 r5) {
        int r0 = this.a;
        bz4 r4 = this.b;
        switch(r0) {
            case 0: goto L19;
            case 1: goto L18;
            case 2: goto L9;
            default: goto L5;
        };
    L9:
        ArrayList r1 = new ArrayList();
        r5.b();
    L11:
        if (r5.J() == false) goto L13;
        r1.add(Long.valueOf(((Number) r4.a(r5)).longValue()));
        goto L11
    L13:
        r5.q();
        int r6 = r1.size();
        AtomicLongArray r7 = new AtomicLongArray(r6);
        int r2 = 0;
    L14:
        if (r2 >= r6) goto L16;
        r7.set(r2, ((Long) r1.get(r2)).longValue());
        r2 = r2 + 1;
        goto L14
    L16:
        return r7;
    L19:
        Date r8 = (Date) r4.a(r5);
        if (r8 != null) goto L22;
        return null;
    L22:
        return new Timestamp(r8.getTime());
    L5:
        if (r5.e0() != 9) goto L8;
        r5.a0();
        return null;
    L8:
        return r4.a(r5);
    L18:
        return new AtomicLong(((Number) r4.a(r5)).longValue());
    }

    @Override // defpackage.bz4
    public final void b(q32 r5, Object r6) {
        int r0 = this.a;
        bz4 r4 = this.b;
        switch(r0) {
            case 0: goto L15;
            case 1: goto L13;
            case 2: goto L8;
            default: goto L4;
        };
    L4:
        if (r6 != null) goto L6;
        r5.F();
        return;
    L6:
        r4.b(r5, r6);
        return;
    L8:
        AtomicLongArray r7 = (AtomicLongArray) r6;
        r5.f();
        int r1 = r7.length();
        int r2 = 0;
    L9:
        if (r2 >= r1) goto L11;
        r4.b(r5, Long.valueOf(r7.get(r2)));
        r2 = r2 + 1;
        goto L9
    L11:
        r5.q();
        return;
    L13:
        r4.b(r5, Long.valueOf(((AtomicLong) r6).get()));
        return;
    L15:
        r4.b(r5, (Timestamp) r6);
    }
}
