package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w40 implements aa4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w40(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // defpackage.aa4
    public final Iterator iterator() {
        int r0 = this.a;
        Object r1 = this.b;
        switch(r0) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return new fb2((String) r1);
    L7:
        return (Iterator) r1;
    L9:
        return ((Iterable) r1).iterator();
    }
}
