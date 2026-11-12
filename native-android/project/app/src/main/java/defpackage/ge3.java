package defpackage;

import java.io.File;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ge3 implements Comparable {
    public static final String o;
    public final yw n;

    static {
        String str = File.separator;
        str.getClass();
        o = str;
    }

    public ge3(yw ywVar) {
        ywVar.getClass();
        this.n = ywVar;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iA = f.a(this);
        yw ywVar = this.n;
        if (iA == -1) {
            iA = 0;
        } else if (iA < ywVar.d() && ywVar.i(iA) == 92) {
            iA++;
        }
        int iD = ywVar.d();
        int i = iA;
        while (iA < iD) {
            if (ywVar.i(iA) == 47 || ywVar.i(iA) == 92) {
                arrayList.add(ywVar.n(i, iA));
                i = iA + 1;
            }
            iA++;
        }
        if (i < ywVar.d()) {
            arrayList.add(ywVar.n(i, ywVar.d()));
        }
        return arrayList;
    }

    public final ge3 b() {
        yw ywVar = f.d;
        yw ywVar2 = this.n;
        if (h12.c(ywVar2, ywVar)) {
            return null;
        }
        yw ywVar3 = f.a;
        if (h12.c(ywVar2, ywVar3)) {
            return null;
        }
        yw ywVar4 = f.b;
        if (h12.c(ywVar2, ywVar4)) {
            return null;
        }
        yw ywVar5 = f.e;
        ywVar2.getClass();
        ywVar5.getClass();
        int iD = ywVar2.d();
        byte[] bArr = ywVar5.n;
        if (ywVar2.m(iD - bArr.length, ywVar5, bArr.length) && (ywVar2.d() == 2 || ywVar2.m(ywVar2.d() - 3, ywVar3, 1) || ywVar2.m(ywVar2.d() - 3, ywVar4, 1))) {
            return null;
        }
        int iK = yw.k(ywVar2, ywVar3);
        if (iK == -1) {
            iK = yw.k(ywVar2, ywVar4);
        }
        if (iK == 2 && e() != null) {
            if (ywVar2.d() == 3) {
                return null;
            }
            return new ge3(yw.o(ywVar2, 0, 3, 1));
        }
        if (iK == 1) {
            ywVar4.getClass();
            if (ywVar2.m(0, ywVar4, ywVar4.d())) {
                return null;
            }
        }
        if (iK != -1 || e() == null) {
            if (iK == -1) {
                return new ge3(ywVar);
            }
            return iK == 0 ? new ge3(yw.o(ywVar2, 0, 1, 1)) : new ge3(yw.o(ywVar2, 0, iK, 1));
        }
        if (ywVar2.d() == 2) {
            return null;
        }
        return new ge3(yw.o(ywVar2, 0, 2, 1));
    }

    public final ge3 c(ge3 ge3Var) {
        ge3Var.getClass();
        yw ywVar = ge3Var.n;
        int iA = f.a(this);
        yw ywVar2 = this.n;
        ge3 ge3Var2 = iA == -1 ? null : new ge3(ywVar2.n(0, iA));
        int iA2 = f.a(ge3Var);
        if (!h12.c(ge3Var2, iA2 == -1 ? null : new ge3(ywVar.n(0, iA2)))) {
            nz2.v("Paths of different roots cannot be relative to each other: ", this, " and ", ge3Var);
            return null;
        }
        ArrayList arrayListA = a();
        ArrayList arrayListA2 = ge3Var.a();
        int iMin = Math.min(arrayListA.size(), arrayListA2.size());
        int i = 0;
        while (i < iMin && h12.c(arrayListA.get(i), arrayListA2.get(i))) {
            i++;
        }
        if (i == iMin && ywVar2.d() == ywVar.d()) {
            return tv1.z(".");
        }
        if (arrayListA2.subList(i, arrayListA2.size()).indexOf(f.e) != -1) {
            nz2.v("Impossible relative path to resolve: ", this, " and ", ge3Var);
            return null;
        }
        tv tvVar = new tv();
        yw ywVarC = f.c(ge3Var);
        if (ywVarC == null && (ywVarC = f.c(this)) == null) {
            ywVarC = f.f(o);
        }
        int size = arrayListA2.size();
        for (int i2 = i; i2 < size; i2++) {
            tvVar.X(f.e);
            tvVar.X(ywVarC);
        }
        int size2 = arrayListA.size();
        while (i < size2) {
            tvVar.X((yw) arrayListA.get(i));
            tvVar.X(ywVarC);
            i++;
        }
        return f.d(tvVar, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ge3 ge3Var = (ge3) obj;
        ge3Var.getClass();
        return this.n.compareTo(ge3Var.n);
    }

    public final ge3 d(String str) {
        str.getClass();
        tv tvVar = new tv();
        tvVar.d0(str);
        return f.b(this, f.d(tvVar, false), false);
    }

    public final Character e() {
        yw ywVar = f.a;
        yw ywVar2 = this.n;
        if (yw.g(ywVar2, ywVar) != -1 || ywVar2.d() < 2 || ywVar2.i(1) != 58) {
            return null;
        }
        char cI = (char) ywVar2.i(0);
        if (('a' > cI || cI >= '{') && ('A' > cI || cI >= '[')) {
            return null;
        }
        return Character.valueOf(cI);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ge3) && h12.c(((ge3) obj).n, this.n);
    }

    public final int hashCode() {
        return this.n.hashCode();
    }

    public final File toFile() {
        return new File(this.n.q());
    }

    public final String toString() {
        return this.n.q();
    }
}
