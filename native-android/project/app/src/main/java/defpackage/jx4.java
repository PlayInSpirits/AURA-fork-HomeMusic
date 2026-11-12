package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jx4 implements Cloneable {
    public ex4 n = z53.o;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final jx4 clone() {
        try {
            return (jx4) super.clone();
        } catch (CloneNotSupportedException e) {
            er1.m(e);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof jx4) {
            return this.n.equals(((jx4) obj).n);
        }
        return false;
    }
}
