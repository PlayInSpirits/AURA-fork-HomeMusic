package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cu2 implements sh0 {
    public static final String[] q = {"_data"};
    public final /* synthetic */ int n;
    public final Object o;
    public Object p;

    public /* synthetic */ cu2(int i, Object obj, Object obj2) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
    }

    private final void b() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }

    private final void i() {
    }

    @Override // defpackage.sh0
    public final Class a() {
        switch (this.n) {
            case 0:
                return File.class;
            case 1:
                switch (((pa) this.p).n) {
                    case 21:
                        return ByteBuffer.class;
                    default:
                        return InputStream.class;
                }
            default:
                return InputStream.class;
        }
    }

    @Override // defpackage.sh0
    public final void c() {
        switch (this.n) {
            case 0:
            case 1:
                break;
            default:
                try {
                    ((ByteArrayInputStream) this.p).close();
                } catch (IOException unused) {
                    return;
                }
                break;
        }
    }

    @Override // defpackage.sh0
    public final void cancel() {
        int i = this.n;
    }

    @Override // defpackage.sh0
    public final void d(eq3 eq3Var, rh0 rh0Var) {
        Object objWrap;
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                Cursor cursorQuery = ((Context) obj).getContentResolver().query((Uri) this.p, q, null, null, null);
                String string = null;
                if (cursorQuery != null) {
                    try {
                        string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                        cursorQuery.close();
                    } catch (Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                    break;
                }
                if (!TextUtils.isEmpty(string)) {
                    rh0Var.f(new File(string));
                    return;
                }
                rh0Var.b(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.p)));
                return;
            case 1:
                byte[] bArr = (byte[]) obj;
                switch (((pa) this.p).n) {
                    case 21:
                        objWrap = ByteBuffer.wrap(bArr);
                        break;
                    default:
                        objWrap = new ByteArrayInputStream(bArr);
                        break;
                }
                rh0Var.f(objWrap);
                return;
            default:
                try {
                    ByteArrayInputStream byteArrayInputStreamQ = i80.q((String) obj);
                    this.p = byteArrayInputStreamQ;
                    rh0Var.f(byteArrayInputStreamQ);
                    return;
                } catch (IllegalArgumentException e) {
                    rh0Var.b(e);
                    return;
                }
        }
    }

    @Override // defpackage.sh0
    public final int e() {
        switch (this.n) {
        }
        return 1;
    }

    public cu2(String str, i80 i80Var) {
        this.n = 2;
        this.o = str;
    }
}
