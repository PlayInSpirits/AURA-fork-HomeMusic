package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q42 implements gg1, Serializable {
    private final int arity;

    public q42(int r1) {
        this.arity = r1;
    }

    @Override // defpackage.gg1
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        kx3.a.getClass();
        return lx3.a(this);
    }
}
