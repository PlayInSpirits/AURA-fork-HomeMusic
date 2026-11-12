package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f01 implements e01 {
    public final /* synthetic */ int n;
    public final String o;

    public /* synthetic */ f01(int r1, String r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.e01
    public Object a() {
        return this;
    }

    @Override // defpackage.e01
    public boolean b(CharSequence r1, int r2, int r3, k05 r4) {
        if (TextUtils.equals(r1.subSequence(r2, r3), this.o) == false) goto L6;
        r4.c = (r4.c & 3) | 4;
        return false;
    L6:
        return true;
    }

    public String toString() {
        switch(this.n) {
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return super.toString();
    L7:
        return "<" + this.o + '>';
    }
}
