package defpackage;

import androidx.media3.common.ParserException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yn {
    public final ArrayList a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final String l;

    public yn(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = f;
        this.l = str;
    }

    public static yn a(be3 be3Var) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        try {
            be3Var.O(4);
            int iA = (be3Var.A() & 3) + 1;
            if (iA == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iA2 = be3Var.A() & 31;
            for (int i9 = 0; i9 < iA2; i9++) {
                int iH = be3Var.H();
                int i10 = be3Var.b;
                be3Var.O(iH);
                byte[] bArr = be3Var.a;
                byte[] bArr2 = new byte[iH + 4];
                System.arraycopy(i40.a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i10, bArr2, 4, iH);
                arrayList.add(bArr2);
            }
            int iA3 = be3Var.A();
            for (int i11 = 0; i11 < iA3; i11++) {
                int iH2 = be3Var.H();
                int i12 = be3Var.b;
                be3Var.O(iH2);
                byte[] bArr3 = be3Var.a;
                byte[] bArr4 = new byte[iH2 + 4];
                System.arraycopy(i40.a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i12, bArr4, 4, iH2);
                arrayList.add(bArr4);
            }
            if (iA2 > 0) {
                u13 u13VarL = uc5.L((byte[]) arrayList.get(0), 4, ((byte[]) arrayList.get(0)).length);
                int i13 = u13VarL.e;
                int i14 = u13VarL.f;
                int i15 = u13VarL.h + 8;
                int i16 = u13VarL.i + 8;
                int i17 = u13VarL.p;
                int i18 = u13VarL.q;
                int i19 = u13VarL.r;
                int i20 = u13VarL.s;
                float f2 = u13VarL.g;
                int i21 = u13VarL.a;
                int i22 = u13VarL.b;
                int i23 = u13VarL.c;
                byte[] bArr5 = i40.a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i21), Integer.valueOf(i22), Integer.valueOf(i23));
                i4 = i18;
                i5 = i19;
                i6 = i20;
                f = f2;
                i2 = i14;
                i3 = i15;
                i7 = i16;
                i8 = i17;
                i = i13;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = 16;
                f = 1.0f;
                i7 = -1;
                i8 = -1;
            }
            return new yn(arrayList, iA, i, i2, i3, i7, i8, i4, i5, i6, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.a(e, "Error parsing AVC config");
        }
    }
}
