package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class af4 {
    public final /* synthetic */ int a;
    public Context b;
    public Uri c;

    public af4(Context r2, Uri r3) {
        this.a = 1;
        this.b = r2;
        this.c = r3;
    }

    public final boolean a() {
        switch(this.a) {
            case 0: goto L10;
            default: goto L12;
        };
    L10:
        return DocumentsContract.deleteDocument(this.b.getContentResolver(), this.c);
    L15:
        return false;
    L12:
        return DocumentsContract.deleteDocument(this.b.getContentResolver(), this.c);
    L14:
        return false;
    }

    public final boolean b() {
        switch(this.a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return h12.o(this.b, this.c);
    L7:
        return h12.o(this.b, this.c);
    }

    public final String c() {
        switch(this.a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return h12.K(this.b, this.c, "_display_name");
    L7:
        return h12.K(this.b, this.c, "_display_name");
    }

    public final Uri d() {
        switch(this.a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.c;
    L7:
        return this.c;
    }

    public final boolean e() {
        switch(this.a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return "vnd.android.document/directory".equals(h12.K(this.b, this.c, "mime_type"));
    L7:
        return "vnd.android.document/directory".equals(h12.K(this.b, this.c, "mime_type"));
    }

    public final long f() {
        switch(this.a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return h12.J(this.b, this.c, "_size", 0);
    L7:
        return h12.J(this.b, this.c, "_size", 0);
    }

    public af4[] g() {
        Context r1 = this.b;
        ContentResolver r2 = r1.getContentResolver();
        Uri r11 = this.c;
        Uri r3 = DocumentsContract.buildChildDocumentsUriUsingTree(r11, DocumentsContract.getDocumentId(r11));
        ArrayList r8 = new ArrayList();
        int r9 = 0;
        Cursor r10 = null;
        r10 = r2.query(r3, new String[]{"document_id"}, null, null, null);     // Catch: Throwable -> L8 Exception -> L10
    L5:
        if (r10.moveToNext() == false) goto L40;
        r8.add(DocumentsContract.buildDocumentUriUsingTree(r11, r10.getString(0)));     // Catch: Throwable -> L8 Exception -> L10
    L40:
        xa3.p(r10);     // Catch: RuntimeException -> L14 Exception -> L36
    L44:
    L14:
        e = move-exception;
        throw e;
    L8:
        th = move-exception;
        if (r10 != null) goto L47;
        throw th;
    L47:
        xa3.p(r10);     // Catch: RuntimeException -> L32 Exception -> L37
        goto L52
    L51:
        throw th;
    L32:
        e = move-exception;
        throw e;
    L52:
        throw th;
    L10:
        e = move-exception;
        Log.w("DocumentFile", "Failed query: " + e);     // Catch: Throwable -> L8
        if (r10 == null) goto L24;
        xa3.p(r10);     // Catch: RuntimeException -> L21 Exception -> L36
    L21:
        e = move-exception;
        throw e;
    L24:
        Uri[] r12 = (Uri[]) r8.toArray(new Uri[r8.size()]);
        af4[] r0 = new af4[r12.length];
    L26:
        if (r9 >= r12.length) goto L28;
        r0[r9] = new af4(r1, r12[r9]);
        r9 = r9 + 1;
        goto L26
    L28:
        return r0;
    }

    public /* synthetic */ af4() {
        this.a = 0;
    }
}
