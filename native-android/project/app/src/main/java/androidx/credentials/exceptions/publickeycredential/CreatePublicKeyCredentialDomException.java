package androidx.credentials.exceptions.publickeycredential;

import defpackage.h;
import defpackage.kf2;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class CreatePublicKeyCredentialDomException extends CreatePublicKeyCredentialException {
    /* JADX WARN: Illegal instructions before constructor call */
    public CreatePublicKeyCredentialDomException(h hVar, String str) {
        String strConcat = "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/".concat(hVar.a);
        super(str, strConcat);
        if (strConcat.length() > 0) {
            return;
        }
        kf2.n("type must not be empty");
        throw null;
    }
}
