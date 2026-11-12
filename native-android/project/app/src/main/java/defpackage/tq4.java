package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tq4 implements aa4 {
    public final /* synthetic */ int a;
    public final Object b;
    public final if1 c;

    public /* synthetic */ tq4(Object r1, if1 r2, int r3) {
        this.a = r3;
        this.b = r1;
        this.c = r2;
    }

    @Override // defpackage.aa4
    public final Iterator iterator() {
        switch(this.a) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return new bh1(this);
    L7:
        return new zw4(this);
    L9:
        return new g71(this);
    }
}
