package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lo0 implements Iterator, x32 {
    public int n = -1;
    public int o;
    public int p;
    public j02 q;
    public int r;
    public final /* synthetic */ mo0 s;

    public lo0(mo0 mo0Var) {
        this.s = mo0Var;
        int iM = gb.m(0, 0, mo0Var.a.length());
        this.o = iM;
        this.p = iM;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    /* JADX WARN: Code duplicated, block: B:15:0x0046  */
    /* JADX WARN: Code duplicated, block: B:16:0x005a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0077  */
    public final void a() {
        kd3 kd3Var;
        mo0 mo0Var = this.s;
        CharSequence charSequence = mo0Var.a;
        int i = this.p;
        if (i < 0) {
            this.n = 0;
            this.q = null;
            return;
        }
        int i2 = mo0Var.b;
        if (i2 > 0) {
            int i3 = this.r + 1;
            this.r = i3;
            if (i3 >= i2) {
                int i4 = this.o;
                charSequence.getClass();
                this.q = new j02(i4, charSequence.length() - 1, 1);
                this.p = -1;
            } else if (i > charSequence.length()) {
                int i5 = this.o;
                charSequence.getClass();
                this.q = new j02(i5, charSequence.length() - 1, 1);
                this.p = -1;
            } else {
                kd3Var = (kd3) mo0Var.c.invoke(charSequence, Integer.valueOf(this.p));
                if (kd3Var == null) {
                    int i6 = this.o;
                    charSequence.getClass();
                    this.q = new j02(i6, charSequence.length() - 1, 1);
                    this.p = -1;
                } else {
                    int iIntValue = ((Number) kd3Var.n).intValue();
                    int iIntValue2 = ((Number) kd3Var.o).intValue();
                    this.q = gb.g0(this.o, iIntValue);
                    int i7 = iIntValue + iIntValue2;
                    this.o = i7;
                    this.p = i7 + (iIntValue2 == 0 ? 1 : 0);
                }
            }
        } else if (i > charSequence.length()) {
            int i8 = this.o;
            charSequence.getClass();
            this.q = new j02(i8, charSequence.length() - 1, 1);
            this.p = -1;
        } else {
            kd3Var = (kd3) mo0Var.c.invoke(charSequence, Integer.valueOf(this.p));
            if (kd3Var == null) {
                int i9 = this.o;
                charSequence.getClass();
                this.q = new j02(i9, charSequence.length() - 1, 1);
                this.p = -1;
            } else {
                int iIntValue3 = ((Number) kd3Var.n).intValue();
                int iIntValue4 = ((Number) kd3Var.o).intValue();
                this.q = gb.g0(this.o, iIntValue3);
                int i10 = iIntValue3 + iIntValue4;
                this.o = i10;
                this.p = i10 + (iIntValue4 == 0 ? 1 : 0);
            }
        }
        this.n = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.n == -1) {
            a();
        }
        return this.n == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.n == -1) {
            a();
        }
        if (this.n == 0) {
            tb4.k();
            return null;
        }
        j02 j02Var = this.q;
        j02Var.getClass();
        this.q = null;
        this.n = -1;
        return j02Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
