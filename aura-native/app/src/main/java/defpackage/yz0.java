package defpackage;

import android.text.Editable;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class yz0 extends Editable.Factory {
    public yz0() {
        super();
    }

    public static final Object a = new Object();
    public static volatile yz0 b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new lj4(cls, charSequence) : super.newEditable(charSequence);
    }
}
