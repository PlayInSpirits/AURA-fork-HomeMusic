package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kj1 extends tg0 {
    public final String c;
    public final String d;

    public kj1(String r3, String r4, String r5, String r6, String r7, Uri r8, String r9) {
        r3.getClass();
        r4.getClass();
        Bundle r0 = new Bundle();
        r0.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", r3);
        r0.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", r4);
        r0.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", r5);
        r0.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", r6);
        r0.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", r7);
        r0.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", r9);
        r0.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", r8);
        super("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", r0);
        this.c = r3;
        this.d = r4;
        if (r3.length() > 0) goto L5;
        kf2.n("id should not be empty");
        throw null;
    L5:
        if (r4.length() <= 0) goto L7;
        return;
    L7:
        kf2.n("idToken should not be empty");
        throw null;
    }
}
