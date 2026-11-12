package defpackage;

import java.util.Iterator;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ug2 extends y {
    public final /* synthetic */ int n;
    public final Object o;

    public /* synthetic */ ug2(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.y
    public final int a() {
        int r0 = this.n;
        Object r1 = this.o;
        switch(r0) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        nf3 r2 = (nf3) r1;
        r2.getClass();
        return r2.o;
    L7:
        return ((Matcher) ((jv3) r1).n).groupCount() + 1;
    }

    public sg2 b(int r3) {
        Matcher r2 = (Matcher) ((jv3) this.o).n;
        j02 r0 = gb.g0(r2.start(r3), r2.end(r3));
        if (r0.n < 0) goto L6;
        String r4 = r2.group(r3);
        r4.getClass();
        return new sg2(r4, r0);
    L6:
        return null;
    }

    @Override // defpackage.y, java.util.Collection, java.util.List
    public final boolean contains(Object r2) {
        switch(this.n) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        if (r2 != null) goto L8;
        boolean r0 = true;
    L9:
        if (r0 == true) goto L12;
        return false;
    L12:
        return super.contains((sg2) r2);
    L8:
        r0 = r2 instanceof sg2;
        goto L9
    L5:
        return ((nf3) this.o).containsValue(r2);
    }

    @Override // defpackage.y, java.util.Collection
    public boolean isEmpty() {
        switch(this.n) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        return false;
    L5:
        return super.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int r1 = 0;
        switch(this.n) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        xx4 r6 = ((nf3) this.o).n;
        yx4[] r3 = new yx4[8];
    L5:
        if (r1 >= 8) goto L8;
        r3[r1] = new zx4(2);
        r1 = r1 + 1;
        goto L5
    L8:
        return new uf3(r6, r3);
    L10:
        return new zw4(new tq4(new w40(0, gb.C(this)), new x(24, this), 1));
    }
}
