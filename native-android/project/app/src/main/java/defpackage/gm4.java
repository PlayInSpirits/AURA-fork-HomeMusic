package defpackage;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gm4 extends jk {
    public static final UriMatcher r = null;

    static {
        UriMatcher r0 = new UriMatcher(-1);
        r = r0;
        r0.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        r0.addURI("com.android.contacts", "contacts/lookup/*", 1);
        r0.addURI("com.android.contacts", "contacts/#/photo", 2);
        r0.addURI("com.android.contacts", "contacts/#", 3);
        r0.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        r0.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    @Override // defpackage.sh0
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.jk
    public final void g(Object r1) {
        ((InputStream) r1).close();
    }

    @Override // defpackage.jk
    public final Object h(ContentResolver r3, Uri r4) {
        int r2 = r.match(r4);
        if (r2 != 1) goto L5;
    L10:
        Uri r5 = ContactsContract.Contacts.lookupContact(r3, r4);
        if (r5 == null) goto L18;
        InputStream r6 = ContactsContract.Contacts.openContactPhotoInputStream(r3, r5, true);
    L13:
        if (r6 == null) goto L15;
        return r6;
    L15:
        mj0.k(r4, "InputStream is null for ");
        return null;
    L18:
        throw new FileNotFoundException("Contact cannot be found");
    L5:
        if (r2 != 3) goto L7;
        r6 = ContactsContract.Contacts.openContactPhotoInputStream(r3, r4, true);
        goto L13
    L7:
        if (r2 == 5) goto L10;
        r6 = r3.openInputStream(r4);
        goto L13
    }
}
