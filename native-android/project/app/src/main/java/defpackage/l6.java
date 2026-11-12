package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l6 extends ya4 {
    public final AtomicIntegerFieldUpdater f;

    public l6(AtomicReferenceFieldUpdater r1, AtomicIntegerFieldUpdater r2) {
        this.f = r2;
    }

    @Override // defpackage.ya4
    public final int l(g60 r1) {
        return this.f.decrementAndGet(r1);
    }
}
