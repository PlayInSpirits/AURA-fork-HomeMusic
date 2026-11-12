package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
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
        String string;
        u10 u10Var;
        rr2.w(this.n != 4);
        int iW = xa3.w(this.n);
        if (iW == 0) {
            return true;
        }
        if (iW != 2) {
            this.n = 4;
            int i = this.r;
            while (true) {
                int length = this.r;
                if (length == -1) {
                    this.n = 3;
                    string = null;
                    break;
                }
                r10 r10Var = (r10) this.t.o;
                CharSequence charSequence = this.p;
                int length2 = charSequence.length();
                rr2.t(length, length2);
                while (true) {
                    if (length >= length2) {
                        length = -1;
                        break;
                    }
                    if (r10Var.c(charSequence.charAt(length))) {
                        break;
                    }
                    length++;
                }
                if (length == -1) {
                    length = charSequence.length();
                    this.r = -1;
                } else {
                    this.r = length + 1;
                }
                int i2 = this.r;
                if (i2 != i) {
                    while (true) {
                        u10Var = this.q;
                        if (i >= length || !u10Var.c(charSequence.charAt(i))) {
                            break;
                        }
                        i++;
                    }
                    while (length > i && u10Var.c(charSequence.charAt(length - 1))) {
                        length--;
                    }
                    int i3 = this.s;
                    if (i3 == 1) {
                        length = charSequence.length();
                        this.r = -1;
                        while (length > i && u10Var.c(charSequence.charAt(length - 1))) {
                            length--;
                        }
                    } else {
                        this.s = i3 - 1;
                    }
                    string = charSequence.subSequence(i, length).toString();
                    break;
                }
                int i4 = i2 + 1;
                this.r = i4;
                if (i4 > charSequence.length()) {
                    this.r = -1;
                }
            }
            this.o = string;
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
