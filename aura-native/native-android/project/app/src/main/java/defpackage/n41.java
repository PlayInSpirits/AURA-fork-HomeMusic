package defpackage;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n41 {
    public final /* synthetic */ int a = 1;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public Object f;

    public n41(int i) {
        this.b = i;
        byte[] bArr = new byte[131];
        this.f = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i, int i2) {
        if (this.d) {
            int i3 = i2 - i;
            byte[] bArr2 = (byte[]) this.f;
            int length = bArr2.length;
            int i4 = this.c + i3;
            if (length < i4) {
                this.f = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, (byte[]) this.f, this.c, i3);
            this.c += i3;
        }
    }

    public void b() {
        boolean z = this.d;
        qz0 qz0Var = (qz0) this.f;
        this.c = z ? qz0Var.i() : qz0Var.m();
    }

    public void c(View view, int i) {
        qz0 qz0Var = (qz0) this.f;
        int iN = Integer.MIN_VALUE == qz0Var.a ? 0 : qz0Var.n() - qz0Var.a;
        if (iN >= 0) {
            boolean z = this.d;
            qz0 qz0Var2 = (qz0) this.f;
            if (z) {
                int iD = qz0Var2.d(view);
                qz0 qz0Var3 = (qz0) this.f;
                this.c = (Integer.MIN_VALUE != qz0Var3.a ? qz0Var3.n() - qz0Var3.a : 0) + iD;
            } else {
                this.c = qz0Var2.g(view);
            }
            this.b = i;
            return;
        }
        this.b = i;
        boolean z2 = this.d;
        qz0 qz0Var4 = (qz0) this.f;
        if (!z2) {
            int iG = qz0Var4.g(view);
            int iM = iG - ((qz0) this.f).m();
            this.c = iG;
            if (iM > 0) {
                int i2 = (((qz0) this.f).i() - Math.min(0, (((qz0) this.f).i() - iN) - ((qz0) this.f).d(view))) - (((qz0) this.f).e(view) + iG);
                if (i2 < 0) {
                    this.c -= Math.min(iM, -i2);
                    return;
                }
                return;
            }
            return;
        }
        int i3 = (qz0Var4.i() - iN) - ((qz0) this.f).d(view);
        this.c = ((qz0) this.f).i() - i3;
        if (i3 > 0) {
            int iE = this.c - ((qz0) this.f).e(view);
            int iM2 = ((qz0) this.f).m();
            int iMin = iE - (Math.min(((qz0) this.f).g(view) - iM2, 0) + iM2);
            if (iMin < 0) {
                this.c = Math.min(i3, -iMin) + this.c;
            }
        }
    }

    public boolean d(int i) {
        if (!this.d) {
            return false;
        }
        this.c -= i;
        this.d = false;
        this.e = true;
        return true;
    }

    public void e(int i) {
        this.d |= i > 0;
        this.b += i;
    }

    public void f() {
        switch (this.a) {
            case 1:
                this.b = -1;
                this.c = Integer.MIN_VALUE;
                this.d = false;
                this.e = false;
                break;
            default:
                this.d = false;
                this.e = false;
                break;
        }
    }

    public void g(int i) {
        rr2.w(!this.d);
        boolean z = i == this.b;
        this.d = z;
        if (z) {
            this.c = 3;
            this.e = false;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
            default:
                return super.toString();
        }
    }

    public n41(ph3 ph3Var) {
        this.f = ph3Var;
    }

    public n41() {
        f();
    }
}
