package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jz1 {
    public final /* synthetic */ int a;
    public final rp1 b;
    public final rp1 c;
    public final rp1 d;
    public final rp1 e;
    public final Serializable f;

    /* JADX WARN: Multi-variable type inference failed */
    public jz1(jz1[] jz1VarArr) {
        final int i = 0;
        this.a = 0;
        this.f = jz1VarArr;
        int length = jz1VarArr.length;
        final rp1[] rp1VarArr = new rp1[length];
        for (int i2 = 0; i2 < length; i2++) {
            rp1VarArr[i2] = ((jz1[]) this.f)[i2].b();
        }
        final int i3 = 1;
        this.b = new rp1(1, new wf1() { // from class: v45
            @Override // defpackage.wf1
            public final Object invoke(Object obj, Object obj2) {
                float fD;
                int i4 = i3;
                rp1[] rp1VarArr2 = rp1VarArr;
                ig3 ig3Var = (ig3) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (i4) {
                    case 0:
                        fD = zz1.d(ig3Var, false, rp1VarArr2, fFloatValue);
                        break;
                    default:
                        fD = zz1.d(ig3Var, true, rp1VarArr2, fFloatValue);
                        break;
                }
                return Float.valueOf(fD);
            }
        });
        int length2 = ((jz1[]) this.f).length;
        final rp1[] rp1VarArr2 = new rp1[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            rp1VarArr2[i4] = ((jz1[]) this.f)[i4].d();
        }
        this.c = new rp1(0, new wf1() { // from class: qp1
            @Override // defpackage.wf1
            public final Object invoke(Object obj, Object obj2) {
                float fD;
                int i5 = i3;
                rp1[] rp1VarArr3 = rp1VarArr2;
                ig3 ig3Var = (ig3) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (i5) {
                    case 0:
                        fD = zz1.d(ig3Var, false, rp1VarArr3, fFloatValue);
                        break;
                    default:
                        fD = zz1.d(ig3Var, true, rp1VarArr3, fFloatValue);
                        break;
                }
                return Float.valueOf(fD);
            }
        });
        int length3 = ((jz1[]) this.f).length;
        final rp1[] rp1VarArr3 = new rp1[length3];
        for (int i5 = 0; i5 < length3; i5++) {
            rp1VarArr3[i5] = ((jz1[]) this.f)[i5].c();
        }
        this.d = new rp1(1, new wf1() { // from class: v45
            @Override // defpackage.wf1
            public final Object invoke(Object obj, Object obj2) {
                float fD;
                int i6 = i;
                rp1[] rp1VarArr4 = rp1VarArr3;
                ig3 ig3Var = (ig3) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (i6) {
                    case 0:
                        fD = zz1.d(ig3Var, false, rp1VarArr4, fFloatValue);
                        break;
                    default:
                        fD = zz1.d(ig3Var, true, rp1VarArr4, fFloatValue);
                        break;
                }
                return Float.valueOf(fD);
            }
        });
        int length4 = ((jz1[]) this.f).length;
        final rp1[] rp1VarArr4 = new rp1[length4];
        for (int i6 = 0; i6 < length4; i6++) {
            rp1VarArr4[i6] = ((jz1[]) this.f)[i6].a();
        }
        this.e = new rp1(0, new wf1() { // from class: qp1
            @Override // defpackage.wf1
            public final Object invoke(Object obj, Object obj2) {
                float fD;
                int i7 = i;
                rp1[] rp1VarArr5 = rp1VarArr4;
                ig3 ig3Var = (ig3) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (i7) {
                    case 0:
                        fD = zz1.d(ig3Var, false, rp1VarArr5, fFloatValue);
                        break;
                    default:
                        fD = zz1.d(ig3Var, true, rp1VarArr5, fFloatValue);
                        break;
                }
                return Float.valueOf(fD);
            }
        });
    }

    public final rp1 a() {
        int i = this.a;
        return this.e;
    }

    public final rp1 b() {
        int i = this.a;
        return this.b;
    }

    public final rp1 c() {
        int i = this.a;
        return this.d;
    }

    public final rp1 d() {
        int i = this.a;
        return this.c;
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ti.n0(57, (jz1[]) obj);
            default:
                return xa3.h("RectRulers(", (String) obj, ")");
        }
    }

    public jz1(String str) {
        this.a = 1;
        this.f = str;
        this.b = new rp1(1, null);
        this.c = new rp1(0, null);
        this.d = new rp1(1, null);
        this.e = new rp1(0, null);
    }
}
