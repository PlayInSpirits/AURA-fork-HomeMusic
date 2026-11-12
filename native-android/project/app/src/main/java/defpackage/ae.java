package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ae extends ce {
    public float a;
    public float b;

    public ae(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.ce
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.b;
    }

    @Override // defpackage.ce
    public final int b() {
        return 2;
    }

    @Override // defpackage.ce
    public final ce c() {
        return new ae(0.0f, 0.0f);
    }

    @Override // defpackage.ce
    public final void d(int i, float f) {
        if (i == 0) {
            this.a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ae)) {
            return false;
        }
        ae aeVar = (ae) obj;
        return aeVar.a == this.a && aeVar.b == this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
