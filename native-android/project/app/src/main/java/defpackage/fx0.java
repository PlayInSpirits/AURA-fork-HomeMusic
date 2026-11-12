package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fx0 implements aa4, gx0 {
    public final /* synthetic */ int a;
    public final aa4 b;
    public final int c;

    public fx0(aa4 r4, int r5, int r6) {
        this.a = r6;
        switch(r6) {
            case 1: goto L9;
            default: goto L4;
        };
    L4:
        r4.getClass();
        this.b = r4;
        this.c = r5;
        if (r5 < 0) goto L7;
        return;
    L7:
        kf2.i("count must be non-negative, but was ", r5, 46);
        throw null;
    L9:
        this.b = r4;
        this.c = r5;
        if (r5 < 0) goto L12;
        return;
    L12:
        kf2.i("count must be non-negative, but was ", r5, 46);
        throw null;
    }

    @Override // defpackage.gx0
    public final aa4 a(int r5) {
        int r0 = this.a;
        aa4 r2 = this.b;
        int r3 = this.c;
        switch(r0) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        if (r5 < r3) goto L7;
        return this;
    L7:
        return new fx0(r2, r5, 1);
    L8:
        int r1 = r3 + r5;
        if (r1 >= 0) goto L12;
        return new fx0(this, r5, 1);
    L12:
        return new fn4(r2, r3, r1);
    }

    @Override // defpackage.gx0
    public final aa4 b(int r4) {
        int r0 = this.a;
        aa4 r1 = this.b;
        int r2 = this.c;
        switch(r0) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        if (r4 < r2) goto L7;
        return y01.a;
    L7:
        return new fn4(r1, r4, r2);
    L8:
        int r3 = r2 + r4;
        if (r3 >= 0) goto L12;
        return new fx0(this, r4, 0);
    L12:
        return new fx0(r1, r3, 0);
    }

    @Override // defpackage.aa4
    public final Iterator iterator() {
        switch(this.a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return new ex0(this, (byte) 0);
    L7:
        return new ex0(this);
    }
}
