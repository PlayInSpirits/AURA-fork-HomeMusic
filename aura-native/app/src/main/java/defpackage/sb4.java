package defpackage;

import android.text.InputFilter;
import android.text.Spanned;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class sb4 implements InputFilter {
    public sb4() {
        super();
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        while (i < i2) {
            if (!Character.isDigit(charSequence.charAt(i))) {
                return "";
            }
            i++;
        }
        return null;
    }
}
