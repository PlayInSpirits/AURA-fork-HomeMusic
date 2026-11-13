package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ha4 implements Iterable, x32 {
    public final /* synthetic */ mo0 n;

    public ha4(mo0 mo0Var) {
        this.n = mo0Var;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new lo0(this.n);
    }
}
