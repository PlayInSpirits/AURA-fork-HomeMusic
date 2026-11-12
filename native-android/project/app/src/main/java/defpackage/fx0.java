package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fx0 implements aa4, gx0 {
    public final /* synthetic */ int a;
    public final aa4 b;
    public final int c;

    public fx0(aa4 aa4Var, int i, int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                this.b = aa4Var;
                this.c = i;
                if (i >= 0) {
                    return;
                }
                kf2.i("count must be non-negative, but was ", i, 46);
                throw null;
            default:
                aa4Var.getClass();
                this.b = aa4Var;
                this.c = i;
                if (i >= 0) {
                    return;
                }
                kf2.i("count must be non-negative, but was ", i, 46);
                throw null;
        }
    }

    @Override // defpackage.gx0
    public final aa4 a(int i) {
        int i2 = this.a;
        aa4 aa4Var = this.b;
        int i3 = this.c;
        switch (i2) {
            case 0:
                int i4 = i3 + i;
                return i4 < 0 ? new fx0(this, i, 1) : new fn4(aa4Var, i3, i4);
            default:
                return i >= i3 ? this : new fx0(aa4Var, i, 1);
        }
    }

    @Override // defpackage.gx0
    public final aa4 b(int i) {
        int i2 = this.a;
        aa4 aa4Var = this.b;
        int i3 = this.c;
        switch (i2) {
            case 0:
                int i4 = i3 + i;
                return i4 < 0 ? new fx0(this, i, 0) : new fx0(aa4Var, i4, 0);
            default:
                return i >= i3 ? y01.a : new fn4(aa4Var, i, i3);
        }
    }

    @Override // defpackage.aa4
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new ex0(this);
            default:
                return new ex0(this, (byte) 0);
        }
    }
}
