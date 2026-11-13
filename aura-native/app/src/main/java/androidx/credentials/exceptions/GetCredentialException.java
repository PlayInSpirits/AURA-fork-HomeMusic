package androidx.credentials.exceptions;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class GetCredentialException extends Exception {
    public static final /* synthetic */ int p = 0;
    public final String n;
    public final CharSequence o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCredentialException(CharSequence charSequence, String str) {
        super(charSequence != null ? charSequence.toString() : null);
        str.getClass();
        this.n = str;
        this.o = charSequence;
    }

    public String a() {
        return this.n;
    }
}
