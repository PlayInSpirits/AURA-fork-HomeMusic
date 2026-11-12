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
    public static final String[] q = null;
    public final /* synthetic */ int n;
    public final Object o;
    public Object p;

    static {
        q = new String[]{"_data"};
    }

    public /* synthetic */ cu2(int r1, Object r2, Object r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
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
        switch(this.n) {
            case 0: goto L10;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        return InputStream.class;
    L10:
        return File.class;
    L6:
        switch(((pa) this.p).n) {
            case 21: goto L8;
            default: goto L12;
        };
    L8:
        return ByteBuffer.class;
    L12:
        return InputStream.class;
    }

    @Override // defpackage.sh0
    public final void c() {
        switch(this.n) {
            case 0: goto L9;
            case 1: goto L9;
            default: goto L7;
        };
    L7:
        ((ByteArrayInputStream) this.p).close();     // Catch: IOException -> L6
        return;
    L10:
        return;
    }

    @Override // defpackage.sh0
    public final void cancel() {
        int r0 = this.n;
    }

    @Override // defpackage.sh0
    public final void d(eq3 r8, rh0 r9) {
        int r10 = this.n;
        Object r0 = this.o;
        switch(r10) {
            case 0: goto L15;
            case 1: goto L9;
            default: goto L31;
        };
    L9:
        byte[] r1 = (byte[]) r0;
        switch(((pa) this.p).n) {
            case 21: goto L12;
            default: goto L11;
        };
    L11:
        Object r7 = new ByteArrayInputStream(r1);
    L13:
        r9.f(r7);
        return;
    L12:
        r7 = ByteBuffer.wrap(r1);
        goto L13
    L15:
        Cursor r11 = ((Context) r0).getContentResolver().query((Uri) this.p, q, null, null, null);
        String r2 = null;
        if (r11 == null) goto L27;
    L21:
        th = move-exception;
        r11.close();
        throw th;
    L18:
        if (r11.moveToFirst() == false) goto L23;
        r2 = r11.getString(r11.getColumnIndexOrThrow("_data"));     // Catch: Throwable -> L21
    L23:
        r11.close();
    L27:
        if (TextUtils.isEmpty(r2) == false) goto L29;
        r9.b(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.p)));
        return;
    L29:
        r9.f(new File(r2));
        return;
    L31:
        ByteArrayInputStream r12 = i80.q((String) r0);     // Catch: IllegalArgumentException -> L6
        this.p = r12;     // Catch: IllegalArgumentException -> L6
        r9.f(r12);     // Catch: IllegalArgumentException -> L6
        return;
    L6:
        e = move-exception;
        r9.b(e);
    }

    @Override // defpackage.sh0
    public final int e() {
        switch(this.n) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        return 1;
    L6:
        return 1;
    L8:
        return 1;
    }

    public cu2(String r1, i80 r2) {
        this.n = 2;
        this.o = r1;
    }
}
