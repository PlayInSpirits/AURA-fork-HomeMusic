package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ha0 extends wd0 {
    public Object n;
    public Serializable o;
    public wn3 p;
    public jx3 q;
    public ne0 r;
    public jx3 s;
    public boolean t;
    public /* synthetic */ Object u;
    public final /* synthetic */ ia0 v;
    public int w;

    public ha0(ia0 r1, wd0 r2) {
        this.v = r1;
        super(r2);
    }

    @Override // defpackage.jp
    public final Object invokeSuspend(Object r3) {
        this.u = r3;
        this.w |= Integer.MIN_VALUE;
        return this.v.k(false, null, this);
    }
}
