package androidx.credentials.exceptions;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class CreateCredentialCancellationException extends CreateCredentialException {
    public CreateCredentialCancellationException(String str) {
        super(str, "android.credentials.CreateCredentialException.TYPE_USER_CANCELED");
    }

    public CreateCredentialCancellationException() {
        this(null);
    }
}
