package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ae extends ce {
    public float a;
    public float b;

    public ae(float r1, float r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // defpackage.ce
    public final float a(int r2) {
        if (r2 == 0) goto L10;
        if (r2 == 1) goto L8;
        return 0.0f;
    L8:
        return this.b;
    L10:
        return this.a;
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
    public final void d(int r2, float r3) {
        if (r2 != 0) goto L4;
        this.a = r3;
        return;
    L4:
        if (r2 == 1) goto L6;
        return;
    L6:
        this.b = r3;
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof ae) == false) goto L10;
        ae r4 = (ae) r3;
        if (r4.a == this.a) goto L7;
        return false;
    L7:
        if (r4.b != this.b) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    public final int hashCode() {
        int r0 = Float.hashCode(this.a) * 31;
        return Float.hashCode(this.b) + r0;
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
