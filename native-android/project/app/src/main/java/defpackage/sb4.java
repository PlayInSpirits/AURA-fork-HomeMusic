package defpackage;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sb4 implements InputFilter {
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence r1, int r2, int r3, Spanned r4, int r5, int r6) {
    L2:
        if (r2 >= r3) goto L8;
        if (Character.isDigit(r1.charAt(r2)) == false) goto L5;
        r2 = r2 + 1;
        goto L2
    L5:
        return "";
    L8:
        return null;
    }
}
