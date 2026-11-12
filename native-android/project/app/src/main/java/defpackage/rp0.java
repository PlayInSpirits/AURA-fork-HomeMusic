package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rp0 extends r23 {
    public String x;

    @Override // defpackage.r23
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof rp0) && super.equals(obj) && h12.c(this.x, ((rp0) obj).x);
    }

    @Override // defpackage.r23
    public final void f(Context context, AttributeSet attributeSet) {
        super.f(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, at3.a);
        typedArrayObtainAttributes.getClass();
        String string = typedArrayObtainAttributes.getString(0);
        if (string != null) {
            this.x = string;
        }
        typedArrayObtainAttributes.recycle();
    }

    @Override // defpackage.r23
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.x;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
