package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fx1 extends qw1 {
    public q73 a;
    public boolean b;

    @Override // defpackage.qw1
    public final qw1 a(Object r2) {
        c(1, r2);
        return this;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003c -> B:9:0x001e). Please report as a decompilation issue!!! */
    public final void c(int r8, Object r9) {
        Objects.requireNonNull(this.a);
        if (r8 != 0) goto L6;
        return;
    L6:
        if (this.b == false) goto L16;
        q73 r2 = this.a;
        q73 r0 = new q73();
        r0.d(r2.c);
        if (r2.c != 0) goto L10;
    L9:
        int r3 = -1;
    L11:
        if (r3 == (-1)) goto L15;
        rr2.q(r3, r2.c);
        Object r5 = r2.a[r3];
        rr2.q(r3, r2.c);
        r0.e(r2.b[r3], r5);
        r3 = r3 + 1;
        if (r3 >= r2.c) goto L9;
    L15:
        this.a = r0;
        goto L16
    L10:
        r3 = 0;
    L16:
        this.b = false;
        r9.getClass();
        q73 r7 = this.a;
        r7.e(r7.b(r9) + r8, r9);
    }
}
