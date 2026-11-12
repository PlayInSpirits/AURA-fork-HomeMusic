package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class lt4 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = null;
    private volatile /* synthetic */ int _size$volatile;
    public j21[] a;

    static {
        b = AtomicIntegerFieldUpdater.newUpdater(lt4.class, "_size$volatile");
    }

    public final void a(j21 r5) {
        r5.d((k21) this);
        j21[] r0 = this.a;
        AtomicIntegerFieldUpdater r1 = b;
        if (r0 != null) goto L6;
        r0 = new j21[4];
        this.a = r0;
    L8:
        int r2 = r1.get(this);
        r1.set(this, r2 + 1);
        r0[r2] = r5;
        r5.o = r2;
        c(r2);
        return;
    L6:
        if (r1.get(this) < r0.length) goto L8;
        r0 = (j21[]) Arrays.copyOf(r0, r1.get(this) * 2);
        this.a = r0;
        goto L8
    }

    public final j21 b(int r9) {
        Object[] r0 = this.a;
        r0.getClass();
        AtomicIntegerFieldUpdater r1 = b;
        r1.set(this, r1.get(this) - 1);
        if (r9 >= r1.get(this)) goto L22;
        d(r9, r1.get(this));
        int r2 = (r9 - 1) / 2;
        if (r9 <= 0) goto L9;
        j21 r4 = r0[r9];
        r4.getClass();
        Object r5 = r0[r2];
        r5.getClass();
        if (r4.compareTo(r5) >= 0) goto L9;
        d(r9, r2);
        c(r2);
    L9:
        int r3 = r9 * 2;
        int r6 = r3 + 1;
        if (r6 >= r1.get(this)) goto L22;
        Object[] r7 = this.a;
        r7.getClass();
        int r8 = r3 + 2;
        if (r8 >= r1.get(this)) goto L17;
        Comparable r10 = r7[r8];
        r10.getClass();
        Object r11 = r7[r6];
        r11.getClass();
        if (r10.compareTo(r11) >= 0) goto L17;
    L18:
        Comparable r12 = r7[r9];
        r12.getClass();
        Comparable r13 = r7[r8];
        r13.getClass();
        if (r12.compareTo(r13) <= 0) goto L22;
        d(r9, r8);
        r9 = r8;
    L17:
        r8 = r6;
    L22:
        j21 r14 = r0[r1.get(this)];
        r14.getClass();
        r14.d(null);
        r14.o = -1;
        r0[r1.get(this)] = null;
        return r14;
    }

    public final void c(int r4) {
    L2:
        if (r4 <= 0) goto L6;
        j21[] r0 = this.a;
        r0.getClass();
        int r1 = (r4 - 1) / 2;
        j21 r2 = r0[r1];
        r2.getClass();
        j21 r3 = r0[r4];
        r3.getClass();
        if (r2.compareTo(r3) <= 0) goto L10;
        d(r4, r1);
        r4 = r1;
        goto L2
    L10:
        return;
    }

    public final void d(int r3, int r4) {
        j21[] r2 = this.a;
        r2.getClass();
        j21 r0 = r2[r4];
        r0.getClass();
        j21 r1 = r2[r3];
        r1.getClass();
        r2[r3] = r0;
        r2[r4] = r1;
        r0.o = r3;
        r1.o = r4;
    }
}
