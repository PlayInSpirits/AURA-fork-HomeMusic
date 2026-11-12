package defpackage;

import java.util.Iterator;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ug2 extends y {
    public final /* synthetic */ int n;
    public final Object o;

    public /* synthetic */ ug2(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    @Override // defpackage.y
    public final int a() {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                return ((Matcher) ((jv3) obj).n).groupCount() + 1;
            default:
                nf3 nf3Var = (nf3) obj;
                nf3Var.getClass();
                return nf3Var.o;
        }
    }

    public sg2 b(int i) {
        Matcher matcher = (Matcher) ((jv3) this.o).n;
        j02 j02VarG0 = gb.g0(matcher.start(i), matcher.end(i));
        if (j02VarG0.n < 0) {
            return null;
        }
        String strGroup = matcher.group(i);
        strGroup.getClass();
        return new sg2(strGroup, j02VarG0);
    }

    @Override // defpackage.y, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.n) {
            case 0:
                if (obj == null ? true : obj instanceof sg2) {
                    return super.contains((sg2) obj);
                }
                return false;
            default:
                return ((nf3) this.o).containsValue(obj);
        }
    }

    @Override // defpackage.y, java.util.Collection
    public boolean isEmpty() {
        switch (this.n) {
            case 0:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.n) {
            case 0:
                return new zw4(new tq4(new w40(0, gb.C(this)), new x(24, this), 1));
            default:
                xx4 xx4Var = ((nf3) this.o).n;
                yx4[] yx4VarArr = new yx4[8];
                for (int i = 0; i < 8; i++) {
                    yx4VarArr[i] = new zx4(2);
                }
                return new uf3(xx4Var, yx4VarArr);
        }
    }
}
