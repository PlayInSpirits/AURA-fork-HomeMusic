package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zd extends ce {
    public float a;

    public zd(float r1) {
        this.a = r1;
    }

    @Override // defpackage.ce
    public final float a(int r1) {
        if (r1 == 0) goto L4;
        return 0.0f;
    L4:
        return this.a;
    }

    @Override // defpackage.ce
    public final int b() {
        return 1;
    }

    @Override // defpackage.ce
    public final ce c() {
        return new zd(0.0f);
    }

    @Override // defpackage.ce
    public final void d(int r1, float r2) {
        if (r1 != 0) goto L5;
        this.a = r2;
        return;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof zd) == true) goto L5;
        return false;
    L5:
        if (((zd) r2).a != this.a) goto L10;
        return true;
    L10:
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
