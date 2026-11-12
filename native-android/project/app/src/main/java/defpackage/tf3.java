package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tf3 extends l2 {
    public final /* synthetic */ int n;
    public final nf3 o;

    public /* synthetic */ tf3(nf3 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.y
    public final int a() {
        int r0 = this.n;
        nf3 r1 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r1.getClass();
        return r1.o;
    L6:
        r1.getClass();
        return r1.o;
    }

    @Override // defpackage.y, java.util.Collection, java.util.List
    public final boolean contains(Object r3) {
        int r0 = this.n;
        nf3 r2 = this.o;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r2.containsKey(r3);
    L7:
        if ((r3 instanceof Map.Entry) == false) goto L21;
        Map.Entry r4 = (Map.Entry) r3;
        Object r1 = r2.get(r4.getKey());
        if (r1 == null) goto L13;
        return r1.equals(r4.getValue());
    L13:
        if (r4.getValue() == null) goto L15;
        return false;
    L15:
        if (r2.containsKey(r4.getKey()) == false) goto L20;
        return true;
    L20:
        return false;
    L21:
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch(this.n) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        xx4 r6 = this.o.n;
        yx4[] r2 = new yx4[8];
        int r3 = 0;
    L5:
        if (r3 >= 8) goto L8;
        r2[r3] = new zx4(1);
        r3 = r3 + 1;
        goto L5
    L8:
        return new uf3(r6, r2);
    L9:
        xx4 r7 = this.o.n;
        yx4[] r4 = new yx4[8];
        int r5 = 0;
    L10:
        if (r5 >= 8) goto L13;
        r4[r5] = new zx4(0);
        r5 = r5 + 1;
        goto L10
    L13:
        return new uf3(r7, r4);
    }
}
