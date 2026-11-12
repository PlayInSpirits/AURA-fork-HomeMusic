package defpackage;

import android.os.Parcel;
import android.util.SparseIntArray;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class t45 extends s45 {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;

    public t45(Parcel r9) {
        this(r9, r9.dataPosition(), r9.dataSize(), "", new oi(0), new oi(0), new oi(0));
    }

    @Override // defpackage.s45
    public final t45 a() {
        Parcel r1 = this.e;
        int r2 = r1.dataPosition();
        int r3 = this.j;
        if (r3 != this.f) goto L5;
        r3 = this.g;
    L5:
        String r4 = b11.q(new StringBuilder(), this.h, "  ");
        oi r6 = this.b;
        oi r7 = this.c;
        return new t45(r1, r2, r3, r4, this.a, r6, r7);
    }

    @Override // defpackage.s45
    public final boolean e(int r4) {
    L2:
        int r0 = this.j;
        int r1 = this.k;
        if (r0 >= this.g) goto L10;
        if (r1 == r4) goto L18;
        if (String.valueOf(r1).compareTo(String.valueOf(r4)) > 0) goto L19;
        int r2 = this.j;
        Parcel r3 = this.e;
        r3.setDataPosition(r2);
        int r5 = r3.readInt();
        this.k = r3.readInt();
        this.j += r5;
        goto L2
    L19:
        return false;
    L18:
        return true;
    L10:
        if (r1 != r4) goto L13;
        return true;
    L13:
        return false;
    }

    @Override // defpackage.s45
    public final void i(int r6) {
        int r0 = this.i;
        SparseIntArray r1 = this.d;
        Parcel r2 = this.e;
        if (r0 < 0) goto L5;
        int r3 = r1.get(r0);
        int r4 = r2.dataPosition();
        r2.setDataPosition(r3);
        r2.writeInt(r4 - r3);
        r2.setDataPosition(r4);
    L5:
        this.i = r6;
        r1.put(r6, r2.dataPosition());
        r2.writeInt(0);
        r2.writeInt(r6);
    }

    public t45(Parcel r1, int r2, int r3, String r4, oi r5, oi r6, oi r7) {
        super(r5, r6, r7);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = r1;
        this.f = r2;
        this.g = r3;
        this.j = r2;
        this.h = r4;
    }
}
