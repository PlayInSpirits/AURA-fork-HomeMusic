package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class be extends ce {
    public float a;
    public float b;
    public float c;
    public float d;

    public be(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.ce
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.c;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.d;
    }

    @Override // defpackage.ce
    public final int b() {
        return 4;
    }

    @Override // defpackage.ce
    public final ce c() {
        return new be(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // defpackage.ce
    public final void d(int i, float f) {
        if (i == 0) {
            this.a = f;
            return;
        }
        if (i == 1) {
            this.b = f;
        } else if (i == 2) {
            this.c = f;
        } else {
            if (i != 3) {
                return;
            }
            this.d = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof be)) {
            return false;
        }
        be beVar = (be) obj;
        return beVar.a == this.a && beVar.b == this.b && beVar.c == this.c && beVar.d == this.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + b11.d(b11.d(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        float f4 = this.d;
        StringBuilder sbR = b11.r("AnimationVector4D: v1 = ", f, ", v2 = ", f2, ", v3 = ");
        sbR.append(f3);
        sbR.append(", v4 = ");
        sbR.append(f4);
        return sbR.toString();
    }
}
