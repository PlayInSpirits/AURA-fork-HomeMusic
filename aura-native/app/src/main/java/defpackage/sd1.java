package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class sd1 extends r23 {
    public sd1(defpackage.t43 a0) {
        super(a0);
    }

    public String x;

    @Override // defpackage.r23
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof sd1) && super.equals(obj) && h12.c(this.x, ((sd1) obj).x);
    }

    @Override // defpackage.r23
    public final void f(Context context, AttributeSet attributeSet) {
        super.f(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, at3.b);
        obtainAttributes.getClass();
        String string = obtainAttributes.getString(0);
        if (string != null) {
            this.x = string;
        }
        obtainAttributes.recycle();
    }

    @Override // defpackage.r23
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.x;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.r23
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" class=");
        String str = this.x;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        return sb.toString();
    }
}
