package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ce2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = null;
    public static final /* synthetic */ AtomicLongFieldUpdater f = null;
    public static final f01 g = null;
    public static final /* synthetic */ long h = 0;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;

    static {
        e = AtomicReferenceFieldUpdater.newUpdater(ce2.class, Object.class, "_next$volatile");
        h = dz.a.objectFieldOffset(ce2.class.getDeclaredField("_next$volatile"));
        f = AtomicLongFieldUpdater.newUpdater(ce2.class, "_state$volatile");
        int r2 = 1;
        g = new f01(r2, "REMOVE_FROZEN");
    }

    public ce2(int r2, boolean r3) {
        this.a = r2;
        this.b = r3;
        int r4 = r2 - 1;
        this.c = r4;
        this.d = new AtomicReferenceArray(r2);
        if (r4 <= 1073741823) goto L5;
        kf2.o("Check failed.");
        throw null;
    L5:
        if ((r2 & r4) != 0) goto L7;
        return;
    L7:
        kf2.o("Check failed.");
        throw null;
    }

    public final int a(Object r15) {
    L2:
        AtomicLongFieldUpdater r0 = f;
        long r3 = r0.get(this);
        if ((3458764513820540928L & r3) != 0) goto L5;
        int r1 = (int) (1073741823 & r3);
        int r9 = (int) ((1152921503533105152L & r3) >> 30);
        int r10 = this.c;
        if (((r9 + 2) & r10) == (r1 & r10)) goto L54;
        boolean r5 = this.b;
        AtomicReferenceArray r11 = this.d;
        if (r5 == true) goto L21;
        if (r11.get(r9 & r10) == null) goto L21;
        int r2 = this.a;
        if (r2 < 1024) goto L52;
        if (((r9 - r1) & 1073741823) <= (r2 >> 1)) goto L2;
        return 1;
    L52:
        return 1;
    L21:
        long r6 = ((-1152921503533105153L) & r3) | (((long) ((r9 + 1) & 1073741823)) << 30);
        ce2 r4 = this;
        if (f.compareAndSet(r4, r3, r6) == true) goto L23;
        ce2 this = r4;
        goto L2
    L23:
        r11.set(r9 & r10, r15);
        ce2 r14 = r4;
    L25:
        if ((r0.get(r14) & 1152921504606846976L) == 0) goto L55;
        r14 = r14.d();
        AtomicReferenceArray r7 = r14.d;
        int r8 = r14.c & r9;
        Object r12 = r7.get(r8);
        if ((r12 instanceof be2) == true) goto L29;
    L31:
        r14 = null;
    L32:
        if (r14 != null) goto L25;
        return 0;
    L29:
        if (((be2) r12).a != r9) goto L31;
        r7.set(r8, r15);
        goto L32
    L55:
        return 0;
    L54:
        return 1;
    L5:
        if ((2305843009213693952L & r3) == 0) goto L19;
        return 2;
    L19:
        return 1;
    }

    public final ce2 b(long r10) {
    L2:
        e.getClass();
        Unsafe r0 = dz.a;
        long r1 = h;
        ce2 r2 = (ce2) r0.getObjectVolatile(this, r1);
        if (r2 != null) goto L4;
        ce2 r8 = new ce2(this.a * 2, this.b);
        int r3 = (int) (1073741823 & r10);
        int r4 = (int) ((1152921503533105152L & r10) >> 30);
    L6:
        int r5 = this.c;
        int r6 = r3 & r5;
        if (r6 == (r5 & r4)) goto L12;
        Object r7 = this.d.get(r6);
        if (r7 != null) goto L11;
        r7 = new be2(r3);
    L11:
        int r9 = r8.c & r3;
        r8.d.set(r9, r7);
        r3 = r3 + 1;
        goto L6
    L12:
        AtomicLongFieldUpdater r11 = f;
        r11.set(r8, (-1152921504606846977L) & r10);
    L13:
        Unsafe r12 = dz.a;
        ce2 r13 = this;
        if (r12.compareAndSwapObject(r13, h, null, r8) == true) goto L18;
        if (r12.getObjectVolatile(r13, r1) != null) goto L18;
        ce2 this = r13;
    L18:
        this = r13;
        goto L2
    L4:
        return r2;
    }

    public final boolean c() {
    L2:
        AtomicLongFieldUpdater r0 = f;
        long r2 = r0.get(this);
        if ((r2 & 2305843009213693952L) != 0) goto L4;
        if ((1152921504606846976L & r2) != 0) goto L7;
        ce2 r1 = this;
        if (r0.compareAndSet(r1, r2, 2305843009213693952L | r2) == true) goto L11;
        ce2 this = r1;
        goto L2
    L11:
        return true;
    L7:
        return false;
    L4:
        return true;
    }

    public final ce2 d() {
    L2:
        AtomicLongFieldUpdater r0 = f;
        long r2 = r0.get(this);
        if ((r2 & 1152921504606846976L) != 0) goto L4;
        long r4 = 1152921504606846976L | r2;
        ce2 r1 = this;
        if (r0.compareAndSet(r1, r2, r4) == true) goto L7;
        ce2 this = r1;
        goto L2
    L7:
        r2 = r4;
    L9:
        return r1.b(r2);
    L4:
        r1 = this;
        goto L9
    }

    public final Object e() {
        ce2 r1 = this;
    L3:
        AtomicLongFieldUpdater r6 = f;
        long r2 = r6.get(r1);
        if ((r2 & 1152921504606846976L) != 0) goto L6;
        int r0 = (int) (r2 & 1073741823);
        int r5 = r1.c;
        int r13 = r0 & r5;
        if ((((int) ((1152921503533105152L & r2) >> 30)) & r5) == r13) goto L16;
        AtomicReferenceArray r15 = r1.d;
        Object r4 = r15.get(r13);
        boolean r7 = r1.b;
        if (r4 == null) goto L12;
        if ((r4 instanceof be2) == true) goto L16;
        long r8 = (r0 + 1) & 1073741823;
        if (f.compareAndSet(r1, r2, (r2 & (-1073741824)) | r8) == true) goto L19;
        r1 = this;
        if (r7 == false) goto L3;
    L23:
        long r24 = r6.get(r1);
        int r3 = (int) (r24 & 1073741823);
        if ((r24 & 1152921504606846976L) != 0) goto L25;
        ce2 r23 = r1;
        if (f.compareAndSet(r23, r24, (r24 & (-1073741824)) | r8) == true) goto L28;
        r1 = r23;
        goto L23
    L28:
        r23.d.set(r3 & r23.c, null);
        r1 = null;
    L29:
        if (r1 != null) goto L23;
        return r4;
    L25:
        r1 = r1.d();
        goto L29
    L19:
        r15.set(r13, null);
        return r4;
    L12:
        if (r7 == false) goto L3;
    L16:
        return null;
    L6:
        return g;
    }
}
