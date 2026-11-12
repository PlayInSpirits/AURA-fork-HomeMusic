package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fp4 extends gx2 {
    public final Object a;
    public final Object b;
    public final PointerInputEventHandler c;

    public fp4(Object r1, uo r2, PointerInputEventHandler r3, int r4) {
        if ((r4 & 2) == 0) goto L5;
        r2 = null;
    L5:
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    @Override // defpackage.gx2
    public final cx2 d() {
        Object r1 = this.b;
        PointerInputEventHandler r2 = this.c;
        return new ip4(this.a, r1, r2);
    }

    @Override // defpackage.gx2
    public final void e(cx2 r5) {
        ip4 r6 = (ip4) r5;
        Object r0 = r6.B;
        Object r1 = this.a;
        boolean r2 = true;
        boolean r3 = !h12.c(r0, r1);
        r6.B = r1;
        Object r4 = r6.C;
        Object r7 = this.b;
        if (h12.c(r4, r7) == true) goto L5;
        r3 = true;
    L5:
        r6.C = r7;
        Class<?> r8 = r6.D.getClass();
        PointerInputEventHandler r9 = this.c;
        if (r8 != r9.getClass()) goto L9;
        r2 = r3;
    L9:
        if (r2 == false) goto L11;
        r6.r0();
    L11:
        r6.D = r9;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if ((r3 instanceof fp4) == false) goto L20;
        fp4 r4 = (fp4) r3;
        Object r0 = r4.a;
        if (this.a.equals(r0) == true) goto L11;
        return false;
    L11:
        if (h12.c(this.b, r4.b) == true) goto L14;
        return false;
    L14:
        if (this.c != r4.c) goto L17;
        return true;
    L17:
        return false;
    L20:
        return false;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        Object r1 = this.b;
        if (r1 == null) goto L5;
        int r2 = r1.hashCode();
    L6:
        int r3 = this.c.hashCode();
        return r3 + ((r0 + r2) * 961);
    L5:
        r2 = 0;
        goto L6
    }
}
