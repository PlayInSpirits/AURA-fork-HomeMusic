package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l91 extends m91 {
    public final /* synthetic */ Iterable o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l91(Iterable iterable, Iterable iterable2) {
        super(iterable);
        this.o = iterable2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.o.iterator();
    }
}
