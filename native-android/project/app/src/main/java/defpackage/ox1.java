package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ox1 implements th4 {
    public static final ox1 p = null;
    public static final ox1 q = null;
    public final /* synthetic */ int n;
    public final boolean o;

    static {
        int r2 = 0;
        p = new ox1(r2, true);
        q = new ox1(r2, false);
    }

    public ox1(kb4 r6, f83 r7) {
        this.n = 1;
        int r1 = r7.a;
        ByteBuffer r8 = r7.b;
        if (r1 == 6) goto L7;
        if (r1 == 3) goto L7;
        boolean r2 = false;
    L8:
        rr2.l(r2);
        int r3 = Math.min(4, r8.remaining());
        byte[] r4 = new byte[r3];
        r8.asReadOnlyBuffer().get(r4);
        h00 r9 = new h00(r3, r4);
        r6.getClass();
        if (r9.h() == false) goto L11;
        this.o = false;
        return;
    L11:
        int r10 = r9.i(2);
        if (r9.h() == true) goto L15;
        this.o = true;
        return;
    L15:
        if (r10 == 3) goto L19;
        if (r10 == 0) goto L19;
        r9.h();
    L19:
        r9.s();
        throw new e83();
    L7:
        r2 = true;
        goto L8
    }

    public String toString() {
        switch(this.n) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        StringBuilder r0 = new StringBuilder("IncorrectFragmentation{expected=");
        r0.append(!this.o);
        r0.append("}");
        return r0.toString();
    L5:
        return super.toString();
    }

    public /* synthetic */ ox1(int r1, boolean r2) {
        this.n = r1;
        this.o = r2;
    }
}
