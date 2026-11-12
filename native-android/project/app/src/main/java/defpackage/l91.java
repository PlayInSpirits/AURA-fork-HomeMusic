package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l91 extends m91 {
    public final /* synthetic */ Iterable o;

    public l91(Iterable r1, Iterable r2) {
        this.o = r2;
        super(r1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.o.iterator();
    }
}
