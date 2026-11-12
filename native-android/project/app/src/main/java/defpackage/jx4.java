package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jx4 implements Cloneable {
    public ex4 n;

    public jx4() {
        this.n = z53.o;
    }

    public final jx4 a() {
        return (jx4) super.clone();
    L4:
        e = move-exception;
        er1.m(e);
        return null;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return a();
    }

    public boolean equals(Object r2) {
        if ((r2 instanceof jx4) == true) goto L5;
        return false;
    L5:
        return this.n.equals(((jx4) r2).n);
    }
}
