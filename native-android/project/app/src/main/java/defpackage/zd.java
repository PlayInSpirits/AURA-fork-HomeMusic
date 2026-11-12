package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zd extends ce {
    public float a;

    public zd(float f) {
        this.a = f;
    }

    @Override // defpackage.ce
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
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
    public final void d(int i, float f) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zd) && ((zd) obj).a == this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
