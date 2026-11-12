package defpackage;

import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y51 extends z1 {
    public final zc p;

    public y51() {
        this.p = new zc(2);
    }

    @Override // defpackage.z1
    public final Random b() {
        Object r0 = this.p.get();
        r0.getClass();
        return (Random) r0;
    }
}
