package androidx.credentials.exceptions.publickeycredential;

import androidx.credentials.exceptions.GetCredentialException;
import defpackage.kf2;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class GetPublicKeyCredentialException extends GetCredentialException {
    public static final /* synthetic */ int r = 0;
    public final String q;

    public GetPublicKeyCredentialException(CharSequence charSequence, String str) {
        super(charSequence, str);
        this.q = str;
        if (str.length() > 0) {
            return;
        }
        kf2.n("type must not be empty");
        throw null;
    }

    @Override // androidx.credentials.exceptions.GetCredentialException
    public final String a() {
        return this.q;
    }
}
