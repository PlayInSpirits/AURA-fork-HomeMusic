package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ms4 {
    public final ls4 a;
    public final fd b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public ms4(ls4 ls4Var, fd fdVar, long j) {
        this.a = ls4Var;
        this.b = fdVar;
        this.c = j;
        ArrayList arrayList = (ArrayList) fdVar.e;
        float fC = 0.0f;
        this.d = arrayList.isEmpty() ? 0.0f : ((od3) arrayList.get(0)).a.d.c(0) + 0.0f;
        if (!arrayList.isEmpty()) {
            od3 od3Var = (od3) q40.C0(arrayList);
            ks4 ks4Var = od3Var.a.d;
            fC = ks4Var.c(ks4Var.f - 1) + 0.0f + od3Var.f;
        }
        this.e = fC;
        this.f = (ArrayList) fdVar.d;
    }

    public final int a(int i) {
        int iC;
        fd fdVar = this.b;
        ArrayList arrayList = (ArrayList) fdVar.e;
        if (i >= ((he) ((bq4) fdVar.c).n).o.length()) {
            iC = gb.E(arrayList);
        } else {
            iC = i < 0 ? 0 : rr2.C(arrayList, i);
        }
        od3 od3Var = (od3) arrayList.get(iC);
        return od3Var.a.d.f(od3Var.a(i)) + od3Var.d;
    }

    public final int b(float f) {
        int size;
        byte b;
        int i;
        ArrayList arrayList = (ArrayList) this.b.e;
        int lineForVertical = 0;
        if (f > 0.0f) {
            if (f < ((od3) q40.C0(arrayList)).g) {
                int size2 = arrayList.size() - 1;
                int i2 = 0;
                while (true) {
                    if (i2 > size2) {
                        size = -(i2 + 1);
                        break;
                    }
                    int i3 = (i2 + size2) >>> 1;
                    od3 od3Var = (od3) arrayList.get(i3);
                    if (od3Var.f > f) {
                        b = 1;
                    } else {
                        b = od3Var.g <= f ? (byte) -1 : (byte) 0;
                    }
                    if (b >= 0) {
                        if (b <= 0) {
                            size = i3;
                            break;
                        }
                        size2 = i3 - 1;
                    } else {
                        i2 = i3 + 1;
                    }
                }
            } else {
                size = arrayList.size() - 1;
            }
        } else {
            size = 0;
        }
        od3 od3Var2 = (od3) arrayList.get(size);
        int i4 = od3Var2.c;
        int i5 = od3Var2.d;
        if (i4 - od3Var2.b == 0) {
            return i5;
        }
        ic icVar = od3Var2.a;
        float f2 = f - od3Var2.f;
        ks4 ks4Var = icVar.d;
        int i6 = (int) (f2 - 0.0f);
        int i7 = ks4Var.f;
        if (i7 > 0 && (lineForVertical = ks4Var.e.getLineForVertical(i6 - ks4Var.g)) > (i = i7 - 1)) {
            lineForVertical = i;
        }
        return lineForVertical + i5;
    }

    public final int c(int i) {
        fd fdVar = this.b;
        fdVar.c(i);
        ArrayList arrayList = (ArrayList) fdVar.e;
        od3 od3Var = (od3) arrayList.get(rr2.D(arrayList, i));
        ic icVar = od3Var.a;
        return icVar.d.e.getLineStart(i - od3Var.d) + od3Var.b;
    }

    public final float d(int i) {
        fd fdVar = this.b;
        fdVar.c(i);
        ArrayList arrayList = (ArrayList) fdVar.e;
        od3 od3Var = (od3) arrayList.get(rr2.D(arrayList, i));
        ic icVar = od3Var.a;
        return icVar.d.g(i - od3Var.d) + od3Var.f;
    }

    public final o04 e(int i) {
        fd fdVar = this.b;
        he heVar = (he) ((bq4) fdVar.c).n;
        if (i < 0 || i > heVar.o.length()) {
            dz1.a("offset(" + i + ") is out of bounds [0, " + heVar.o.length() + "]");
        }
        int length = ((he) ((bq4) fdVar.c).n).o.length();
        ArrayList arrayList = (ArrayList) fdVar.e;
        od3 od3Var = (od3) arrayList.get(i == length ? gb.E(arrayList) : rr2.C(arrayList, i));
        ic icVar = od3Var.a;
        int iA = od3Var.a(i);
        ks4 ks4Var = icVar.d;
        return ks4Var.e.getParagraphDirection(ks4Var.f(iA)) == 1 ? o04.n : o04.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ms4) {
            ms4 ms4Var = (ms4) obj;
            if (h12.c(this.a, ms4Var.a) && this.b == ms4Var.b && n02.a(this.c, ms4Var.c) && this.d == ms4Var.d && this.e == ms4Var.e && h12.c(this.f, ms4Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + b11.d(b11.d(xa3.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), this.d, 31), this.e, 31);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + n02.b(this.c) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ")";
    }
}
