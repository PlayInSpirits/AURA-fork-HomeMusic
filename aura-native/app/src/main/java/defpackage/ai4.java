package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ai4 implements Comparable {
    public boolean n;
    public float r;
    public int y;
    public int o = -1;
    public int p = -1;
    public int q = 0;
    public boolean s = false;
    public final float[] t = new float[9];
    public final float[] u = new float[9];
    public pi[] v = new pi[16];
    public int w = 0;
    public int x = 0;

    public ai4(int i) {
        this.y = i;
    }

    public final void a(pi piVar) {
        int i = 0;
        while (true) {
            int i2 = this.w;
            pi[] piVarArr = this.v;
            if (i >= i2) {
                if (i2 >= piVarArr.length) {
                    this.v = (pi[]) Arrays.copyOf(piVarArr, piVarArr.length * 2);
                }
                pi[] piVarArr2 = this.v;
                int i3 = this.w;
                piVarArr2[i3] = piVar;
                this.w = i3 + 1;
                return;
            }
            if (piVarArr[i] == piVar) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(pi piVar) {
        int i = this.w;
        int i2 = 0;
        while (i2 < i) {
            if (this.v[i2] == piVar) {
                while (i2 < i - 1) {
                    pi[] piVarArr = this.v;
                    int i3 = i2 + 1;
                    piVarArr[i2] = piVarArr[i3];
                    i2 = i3;
                }
                this.w--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.y = 5;
        this.q = 0;
        this.o = -1;
        this.p = -1;
        this.r = 0.0f;
        this.s = false;
        int i = this.w;
        for (int i2 = 0; i2 < i; i2++) {
            this.v[i2] = null;
        }
        this.w = 0;
        this.x = 0;
        this.n = false;
        Arrays.fill(this.u, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.o - ((ai4) obj).o;
    }

    public final void d(eb2 eb2Var, float f) {
        this.r = f;
        this.s = true;
        int i = this.w;
        this.p = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.v[i2].h(eb2Var, this, false);
        }
        this.w = 0;
    }

    public final void e(eb2 eb2Var, pi piVar) {
        int i = this.w;
        for (int i2 = 0; i2 < i; i2++) {
            this.v[i2].i(eb2Var, piVar, false);
        }
        this.w = 0;
    }

    public final String toString() {
        return "" + this.o;
    }
}
