package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class be extends ce {
    public float a;
    public float b;
    public float c;
    public float d;

    public be(float r1, float r2, float r3, float r4) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
    }

    @Override // defpackage.ce
    public final float a(int r2) {
        if (r2 == 0) goto L18;
        if (r2 == 1) goto L16;
        if (r2 == 2) goto L14;
        if (r2 == 3) goto L12;
        return 0.0f;
    L12:
        return this.d;
    L14:
        return this.c;
    L16:
        return this.b;
    L18:
        return this.a;
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
    public final void d(int r2, float r3) {
        if (r2 != 0) goto L4;
        this.a = r3;
        return;
    L4:
        if (r2 != 1) goto L6;
        this.b = r3;
        return;
    L6:
        if (r2 != 2) goto L8;
        this.c = r3;
        return;
    L8:
        if (r2 == 3) goto L10;
        return;
    L10:
        this.d = r3;
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof be) == false) goto L14;
        be r4 = (be) r3;
        if (r4.a == this.a) goto L7;
        return false;
    L7:
        if (r4.b == this.b) goto L9;
        return false;
    L9:
        if (r4.c == this.c) goto L11;
        return false;
    L11:
        if (r4.d != this.d) goto L19;
        return true;
    L19:
        return false;
    L14:
        return false;
    }

    public final int hashCode() {
        int r0 = b11.d(b11.d(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
        return Float.hashCode(this.d) + r0;
    }

    public final String toString() {
        float r0 = this.a;
        float r1 = this.b;
        float r2 = this.c;
        float r6 = this.d;
        StringBuilder r3 = b11.r("AnimationVector4D: v1 = ", r0, ", v2 = ", r1, ", v3 = ");
        r3.append(r2);
        r3.append(", v4 = ");
        r3.append(r6);
        return r3.toString();
    }
}
