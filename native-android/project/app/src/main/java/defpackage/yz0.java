package defpackage;

import android.text.Editable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yz0 extends Editable.Factory {
    public static final Object a = null;
    public static volatile yz0 b;
    public static Class c;

    static {
        a = new Object();
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence r2) {
        Class r0 = c;
        if (r0 == null) goto L7;
        return new lj4(r0, r2);
    L7:
        return super.newEditable(r2);
    }
}
