package defpackage;

import java.text.BreakIterator;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c3 extends b3 {
    public static c3 e;
    public static c3 f;
    public static c3 g;
    public static final o04 h = o04.o;
    public static final o04 i = o04.n;
    public final /* synthetic */ int c;
    public Object d;

    public /* synthetic */ c3(int i2) {
        this.c = i2;
    }

    @Override // defpackage.b3
    public final int[] f(int i2) {
        int iA;
        switch (this.c) {
            case 0:
                int length = j().length();
                if (length <= 0 || i2 >= length) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator == null) {
                        h12.Q("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i2);
                    BreakIterator breakIterator2 = (BreakIterator) this.d;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            h12.Q("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i2);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return i(i2, iFollowing);
                    }
                    if (breakIterator2 == null) {
                        h12.Q("impl");
                        throw null;
                    }
                    i2 = breakIterator2.following(i2);
                } while (i2 != -1);
                return null;
            case 1:
                if (j().length() <= 0 || i2 >= j().length()) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                while (!r(i2) && (!r(i2) || (i2 != 0 && r(i2 - 1)))) {
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 == null) {
                        h12.Q("impl");
                        throw null;
                    }
                    i2 = breakIterator3.following(i2);
                    if (i2 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.d;
                if (breakIterator4 == null) {
                    h12.Q("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator4.following(i2);
                if (iFollowing2 == -1 || !q(iFollowing2)) {
                    return null;
                }
                return i(i2, iFollowing2);
            default:
                if (j().length() <= 0 || i2 >= j().length()) {
                    return null;
                }
                ms4 ms4Var = (ms4) this.d;
                o04 o04Var = h;
                if (i2 < 0) {
                    if (ms4Var == null) {
                        h12.Q("layoutResult");
                        throw null;
                    }
                    iA = ms4Var.a(0);
                } else {
                    if (ms4Var == null) {
                        h12.Q("layoutResult");
                        throw null;
                    }
                    int iA2 = ms4Var.a(i2);
                    iA = o(iA2, o04Var) == i2 ? iA2 : iA2 + 1;
                }
                ms4 ms4Var2 = (ms4) this.d;
                if (ms4Var2 == null) {
                    h12.Q("layoutResult");
                    throw null;
                }
                if (iA >= ms4Var2.b.b) {
                    return null;
                }
                return i(o(iA, o04Var), o(iA, i) + 1);
        }
    }

    @Override // defpackage.b3
    public final int[] m(int i2) {
        int iA;
        switch (this.c) {
            case 0:
                int length = j().length();
                if (length <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length) {
                    i2 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator == null) {
                        h12.Q("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i2);
                    BreakIterator breakIterator2 = (BreakIterator) this.d;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            h12.Q("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i2);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return i(iPreceding, i2);
                    }
                    if (breakIterator2 == null) {
                        h12.Q("impl");
                        throw null;
                    }
                    i2 = breakIterator2.preceding(i2);
                } while (i2 != -1);
                return null;
            case 1:
                int length2 = j().length();
                if (length2 <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length2) {
                    i2 = length2;
                }
                while (i2 > 0 && !r(i2 - 1) && !q(i2)) {
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 == null) {
                        h12.Q("impl");
                        throw null;
                    }
                    i2 = breakIterator3.preceding(i2);
                    if (i2 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.d;
                if (breakIterator4 == null) {
                    h12.Q("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator4.preceding(i2);
                if (iPreceding2 == -1 || !r(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !r(iPreceding2 - 1)) {
                    return i(iPreceding2, i2);
                }
                return null;
            default:
                if (j().length() <= 0 || i2 <= 0) {
                    return null;
                }
                int length3 = j().length();
                ms4 ms4Var = (ms4) this.d;
                o04 o04Var = i;
                if (i2 > length3) {
                    if (ms4Var == null) {
                        h12.Q("layoutResult");
                        throw null;
                    }
                    iA = ms4Var.a(j().length());
                } else {
                    if (ms4Var == null) {
                        h12.Q("layoutResult");
                        throw null;
                    }
                    int iA2 = ms4Var.a(i2);
                    iA = o(iA2, o04Var) + 1 == i2 ? iA2 : iA2 - 1;
                }
                if (iA < 0) {
                    return null;
                }
                return i(o(iA, h), o(iA, o04Var) + 1);
        }
    }

    public int o(int i2, o04 o04Var) {
        ms4 ms4Var = (ms4) this.d;
        if (ms4Var == null) {
            h12.Q("layoutResult");
            throw null;
        }
        int iC = ms4Var.c(i2);
        ms4 ms4Var2 = (ms4) this.d;
        if (ms4Var2 == null) {
            h12.Q("layoutResult");
            throw null;
        }
        o04 o04VarE = ms4Var2.e(iC);
        ms4 ms4Var3 = (ms4) this.d;
        if (o04Var != o04VarE) {
            if (ms4Var3 != null) {
                return ms4Var3.c(i2);
            }
            h12.Q("layoutResult");
            throw null;
        }
        if (ms4Var3 == null) {
            h12.Q("layoutResult");
            throw null;
        }
        fd fdVar = ms4Var3.b;
        fdVar.c(i2);
        ArrayList arrayList = (ArrayList) fdVar.e;
        od3 od3Var = (od3) arrayList.get(rr2.D(arrayList, i2));
        return (od3Var.a.d.e(i2 - od3Var.d) + od3Var.b) - 1;
    }

    public void p(String str) {
        switch (this.c) {
            case 0:
                this.a = str;
                BreakIterator breakIterator = (BreakIterator) this.d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    h12.Q("impl");
                    throw null;
                }
            default:
                this.a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    h12.Q("impl");
                    throw null;
                }
        }
    }

    public boolean q(int i2) {
        if (i2 <= 0 || !r(i2 - 1)) {
            return false;
        }
        return i2 == j().length() || !r(i2);
    }

    public boolean r(int i2) {
        if (i2 < 0 || i2 >= j().length()) {
            return false;
        }
        return Character.isLetterOrDigit(j().codePointAt(i2));
    }
}
