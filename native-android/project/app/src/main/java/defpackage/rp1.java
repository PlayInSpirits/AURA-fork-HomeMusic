package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rp1 {
    public final wf1 a;
    public final /* synthetic */ int b;

    public rp1(int i, wf1 wf1Var) {
        this.b = i;
        this.a = wf1Var;
    }

    public final float a(float f, q62 q62Var, q62 q62Var2) {
        switch (this.b) {
            case 0:
                return Float.intBitsToFloat((int) (q62Var2.z(q62Var, (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(((int) (q62Var.k() >> 32)) / 2.0f) << 32)) & 4294967295L));
            default:
                return Float.intBitsToFloat((int) (q62Var2.z(q62Var, (((long) Float.floatToRawIntBits(((int) (q62Var.k() & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)) >> 32));
        }
    }
}
