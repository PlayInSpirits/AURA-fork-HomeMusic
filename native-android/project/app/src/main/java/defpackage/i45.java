package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i45 {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        char c;
        int i;
        pa[] paVarArr;
        char c2;
        boolean z;
        float[][] fArr = {new float[2], new float[2]};
        int i2 = new int[2][0];
        char c3 = 3;
        int i3 = 1;
        if (i2 == 0) {
            c = 3;
        } else if (i2 == 1) {
            c = 1;
        } else if (i2 == 2 || i2 == 3) {
            c = 2;
        } else if (i2 == 4) {
            c = 4;
        } else if (i2 != 5) {
            c = 1;
        } else {
            c = 5;
        }
        float[] fArr2 = fArr[0];
        float[] fArr3 = fArr[1];
        int length = (fArr2.length % 2) + (fArr2.length / 2);
        pa[] paVarArr2 = new pa[length];
        int i4 = 0;
        while (i4 < length) {
            int i5 = i4 * 2;
            float f = fArr2[i5];
            int i6 = i5 + 1;
            float f2 = fArr2[i6];
            float f3 = fArr3[i5];
            float f4 = fArr3[i6];
            pa paVar = new pa(9);
            float f5 = f3 - f;
            float f6 = f4 - f2;
            float[] fArr4 = new float[101];
            if (c != c3 && Math.abs(f5) >= 0.001f && Math.abs(f6) >= 0.001f) {
                float f7 = f2 - f4;
                float[] fArr5 = au0.v;
                int i7 = i3;
                i = i7;
                float f8 = f7;
                float fHypot = 0.0f;
                float f9 = 0.0f;
                while (true) {
                    double d = (float) (((((double) i7) * 90.0d) / 90.0d) * 0.017453292519943295d);
                    float f10 = f7;
                    float fSin = ((float) Math.sin(d)) * f5;
                    float fCos = f10 * ((float) Math.cos(d));
                    float f11 = fCos - f8;
                    paVarArr = paVarArr2;
                    c2 = c;
                    fHypot += (float) Math.hypot(fSin - f9, f11);
                    fArr5[i7] = fHypot;
                    if (i7 == 90) {
                        break;
                    }
                    i7++;
                    f9 = fSin;
                    c = c2;
                    paVarArr2 = paVarArr;
                    f8 = fCos;
                    f7 = f10;
                }
                int i8 = i;
                while (true) {
                    fArr5[i8] = fArr5[i8] / fHypot;
                    if (i8 == 90) {
                        break;
                    } else {
                        i8++;
                    }
                }
                for (int i9 = 0; i9 < 101; i9++) {
                    float f12 = i9 / 100.0f;
                    int iBinarySearch = Arrays.binarySearch(fArr5, 0, 91, f12);
                    if (iBinarySearch >= 0) {
                        fArr4[i9] = iBinarySearch / 90.0f;
                    } else if (iBinarySearch == -1) {
                        fArr4[i9] = 0.0f;
                    } else {
                        int i10 = -iBinarySearch;
                        int i11 = i10 - 2;
                        float f13 = i11;
                        float f14 = fArr5[i11];
                        fArr4[i9] = (((f12 - f14) / (fArr5[i10 - 1] - f14)) + f13) / 90.0f;
                    }
                }
                z = false;
            } else {
                paVarArr = paVarArr2;
                c2 = c;
                i = i3;
                z = false;
                Math.hypot(f6, f5);
            }
            paVarArr[i4] = paVar;
            i4++;
            c = c2;
            i3 = i;
            paVarArr2 = paVarArr;
            c3 = 3;
        }
    }
}
