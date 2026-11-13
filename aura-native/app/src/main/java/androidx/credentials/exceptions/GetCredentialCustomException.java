package androidx.credentials.exceptions;

import defpackage.kf2;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class GetCredentialCustomException extends GetCredentialException {
    public final String q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCredentialCustomException(CharSequence charSequence, String str) {
        super(charSequence, str);
        str.getClass();
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
