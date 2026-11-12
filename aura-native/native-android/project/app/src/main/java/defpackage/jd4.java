package defpackage;

import android.content.res.TypedArray;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jd4 extends rp {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd4(int i) {
        super(3);
        this.b = i;
        switch (i) {
            case 1:
                super(3);
                break;
            default:
                ((kd4) this.a).p = true;
                break;
        }
    }

    @Override // defpackage.rp
    public rp g(TypedArray typedArray) {
        switch (this.b) {
            case 1:
                kd4 kd4Var = (kd4) this.a;
                super.g(typedArray);
                if (typedArray.hasValue(2)) {
                    kd4Var.e = (typedArray.getColor(2, kd4Var.e) & 16777215) | (kd4Var.e & (-16777216));
                }
                if (typedArray.hasValue(12)) {
                    kd4Var.d = typedArray.getColor(12, kd4Var.d);
                }
                return this;
            default:
                return super.g(typedArray);
        }
    }

    @Override // defpackage.rp
    public final rp j() {
        int i = this.b;
        return this;
    }
}
