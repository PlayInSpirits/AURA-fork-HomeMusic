package defpackage;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j05 extends i05 {
    @Override // defpackage.i05
    public final Font N(ib1 r4) {
        Uri r3 = r4.a;
        boolean r0 = Objects.equals(r3.getScheme(), "systemfont");
        String r5 = r4.e;
        if (r0 == false) goto L5;
        String r6 = r3.getAuthority();
    L6:
        if (r6 == null) goto L18;
        Typeface r7 = Typeface.create(r6, 0);
        Typeface r1 = Typeface.create(Typeface.DEFAULT, 0);
        if (r7 != null) goto L11;
    L13:
        r7 = null;
    L14:
        if (r7 == null) goto L18;
        Font r8 = d05.d(r7);
        if (r8 == null) goto L18;
        if (TextUtils.isEmpty(r5) == false) goto L26;
        return r8;
    L26:
        return new Font.Builder(r8).setFontVariationSettings(r5).build();
    L24:
        Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
        return null;
    L11:
        if (r7.equals(r1) == true) goto L13;
    L18:
        return null;
    L5:
        r6 = null;
        goto L6
    }
}
