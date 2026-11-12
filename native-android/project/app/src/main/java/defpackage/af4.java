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
    public final /* synthetic */ int a = 0;
    public Context b;
    public Uri c;

    public af4(Context context, Uri uri) {
        this.b = context;
        this.c = uri;
    }

    public final boolean a() {
        switch (this.a) {
            case 0:
                try {
                    return DocumentsContract.deleteDocument(this.b.getContentResolver(), this.c);
                } catch (Exception unused) {
                    return false;
                }
            default:
                try {
                    return DocumentsContract.deleteDocument(this.b.getContentResolver(), this.c);
                } catch (Exception unused2) {
                    return false;
                }
        }
    }

    public final boolean b() {
        switch (this.a) {
            case 0:
                break;
        }
        return h12.o(this.b, this.c);
    }

    public final String c() {
        switch (this.a) {
            case 0:
                break;
        }
        return h12.K(this.b, this.c, "_display_name");
    }

    public final Uri d() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    public final boolean e() {
        switch (this.a) {
            case 0:
                break;
        }
        return "vnd.android.document/directory".equals(h12.K(this.b, this.c, "mime_type"));
    }

    public final long f() {
        switch (this.a) {
            case 0:
                break;
        }
        return h12.J(this.b, this.c, "_size", 0L);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0074 A[LOOP:1: B:25:0x0071->B:27:0x0074, LOOP_END] */
    public af4[] g() {
        Uri[] uriArr;
        af4[] af4VarArr;
        Context context = this.b;
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = this.c;
        Uri uriBuildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                try {
                    cursorQuery = contentResolver.query(uriBuildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                    while (cursorQuery.moveToNext()) {
                        arrayList.add(DocumentsContract.buildDocumentUriUsingTree(uri, cursorQuery.getString(0)));
                    }
                    try {
                        xa3.p(cursorQuery);
                    } catch (RuntimeException e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    Log.w("DocumentFile", "Failed query: " + e2);
                    if (cursorQuery != null) {
                        try {
                            xa3.p(cursorQuery);
                        } catch (RuntimeException e3) {
                            throw e3;
                        }
                    }
                    uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
                    af4VarArr = new af4[uriArr.length];
                    for (int i = 0; i < uriArr.length; i++) {
                        af4VarArr[i] = new af4(context, uriArr[i]);
                    }
                    return af4VarArr;
                }
            } catch (Throwable th) {
                if (cursorQuery == null) {
                    throw th;
                }
                try {
                    xa3.p(cursorQuery);
                    throw th;
                } catch (RuntimeException e4) {
                    throw e4;
                } catch (Exception unused) {
                    throw th;
                }
            }
        } catch (Exception unused2) {
        }
        uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
        af4VarArr = new af4[uriArr.length];
        while (i < uriArr.length) {
            af4VarArr[i] = new af4(context, uriArr[i]);
        }
        return af4VarArr;
    }

    public /* synthetic */ af4() {
    }
}
