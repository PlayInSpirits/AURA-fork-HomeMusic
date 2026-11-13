package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public interface g45 {
    boolean a();

    ce d(long j, ce ceVar, ce ceVar2, ce ceVar3);

    ce k(long j, ce ceVar, ce ceVar2, ce ceVar3);

    default ce l(ce ceVar, ce ceVar2, ce ceVar3) {
        return d(m(ceVar, ceVar2, ceVar3), ceVar, ceVar2, ceVar3);
    }

    long m(ce ceVar, ce ceVar2, ce ceVar3);
}
