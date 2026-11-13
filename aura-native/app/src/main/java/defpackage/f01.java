package defpackage;

import android.text.TextUtils;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class f01 implements e01 {
    public final /* synthetic */ int n;
    public final String o;

    public /* synthetic */ f01(int i, String str) {
        this.n = i;
        this.o = str;
    }

    @Override // defpackage.e01
    public boolean b(CharSequence charSequence, int i, int i2, k05 k05Var) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.o)) {
            return true;
        }
        k05Var.c = (k05Var.c & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.n) {
            case 1:
                return "<" + this.o + '>';
            default:
                return super.toString();
        }
    }

    @Override // defpackage.e01
    public Object a() {
        return this;
    }
}
