package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class yj4 implements Iterator {
    public String o;
    public final CharSequence p;
    public final u10 q;
    public int s;
    public final /* synthetic */ si1 t;
    public int n = 2;
    public int r = 0;

    public yj4(si1 si1Var, ue1 ue1Var, CharSequence charSequence) {
        this.t = si1Var;
        this.q = (u10) ue1Var.p;
        this.s = ue1Var.o;
        this.p = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        u10 u10Var;
        rr2.w(this.n != 4);
        int w = xa3.w(this.n);
        if (w == 0) {
            return true;
        }
        if (w != 2) {
            this.n = 4;
            int i = this.r;
            while (true) {
                int i2 = this.r;
                if (i2 == -1) {
                    this.n = 3;
                    str = null;
                    break;
                }
                r10 r10Var = (r10) this.t.o;
                CharSequence charSequence = this.p;
                int length = charSequence.length();
                rr2.t(i2, length);
                while (true) {
                    if (i2 >= length) {
                        i2 = -1;
                        break;
                    }
                    if (r10Var.c(charSequence.charAt(i2))) {
                        break;
                    }
                    i2++;
                }
                if (i2 == -1) {
                    i2 = charSequence.length();
                    this.r = -1;
                } else {
                    this.r = i2 + 1;
                }
                int i3 = this.r;
                if (i3 == i) {
                    int i4 = i3 + 1;
                    this.r = i4;
                    if (i4 > charSequence.length()) {
                        this.r = -1;
                    }
                } else {
                    while (true) {
                        u10Var = this.q;
                        if (i >= i2 || !u10Var.c(charSequence.charAt(i))) {
                            break;
                        }
                        i++;
                    }
                    while (i2 > i && u10Var.c(charSequence.charAt(i2 - 1))) {
                        i2--;
                    }
                    int i5 = this.s;
                    if (i5 == 1) {
                        i2 = charSequence.length();
                        this.r = -1;
                        while (i2 > i && u10Var.c(charSequence.charAt(i2 - 1))) {
                            i2--;
                        }
                    } else {
                        this.s = i5 - 1;
                    }
                    str = charSequence.subSequence(i, i2).toString();
                }
            }
            this.o = str;
            if (this.n != 3) {
                this.n = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            tb4.k();
            return null;
        }
        this.n = 2;
        String str = this.o;
        this.o = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
