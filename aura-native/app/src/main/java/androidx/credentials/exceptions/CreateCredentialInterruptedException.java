package androidx.credentials.exceptions;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class CreateCredentialInterruptedException extends CreateCredentialException {
    public CreateCredentialInterruptedException(String str) {
        super(str, "android.credentials.CreateCredentialException.TYPE_INTERRUPTED");
    }

    public CreateCredentialInterruptedException() {
        this(null);
    }
}
