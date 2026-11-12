package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gs3 implements sh0 {
    public static final String[] x = {"_data"};
    public final Context n;
    public final uw2 o;
    public final uw2 p;
    public final Uri q;
    public final int r;
    public final int s;
    public final db3 t;
    public final Class u;
    public volatile boolean v;
    public volatile sh0 w;

    public gs3(Context context, uw2 uw2Var, uw2 uw2Var2, Uri uri, int i, int i2, db3 db3Var, Class cls) {
        this.n = context.getApplicationContext();
        this.o = uw2Var;
        this.p = uw2Var2;
        this.q = uri;
        this.r = i;
        this.s = i2;
        this.t = db3Var;
        this.u = cls;
    }

    @Override // defpackage.sh0
    public final Class a() {
        return this.u;
    }

    public final sh0 b() throws Throwable {
        tw2 tw2VarB;
        Throwable th;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.n;
        db3 db3Var = this.t;
        int i = this.s;
        int i2 = this.r;
        if (zIsExternalStorageLegacy) {
            Uri uri = this.q;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, x, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            tw2VarB = this.o.b(file, i2, i, db3Var);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorQuery;
                        if (cursor == null) {
                            throw th;
                        }
                        cursor.close();
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            Uri requireOriginal = this.q;
            boolean zS = hw.s(requireOriginal);
            uw2 uw2Var = this.p;
            if (zS && requireOriginal.getPathSegments().contains("picker")) {
                tw2VarB = uw2Var.b(requireOriginal, i2, i, db3Var);
            } else {
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                }
                tw2VarB = uw2Var.b(requireOriginal, i2, i, db3Var);
            }
        }
        if (tw2VarB != null) {
            return tw2VarB.c;
        }
        return null;
    }

    @Override // defpackage.sh0
    public final void c() {
        sh0 sh0Var = this.w;
        if (sh0Var != null) {
            sh0Var.c();
        }
    }

    @Override // defpackage.sh0
    public final void cancel() {
        this.v = true;
        sh0 sh0Var = this.w;
        if (sh0Var != null) {
            sh0Var.cancel();
        }
    }

    @Override // defpackage.sh0
    public final void d(eq3 eq3Var, rh0 rh0Var) throws Throwable {
        try {
            sh0 sh0VarB = b();
            if (sh0VarB == null) {
                rh0Var.b(new IllegalArgumentException("Failed to build fetcher for: " + this.q));
            } else {
                this.w = sh0VarB;
                if (this.v) {
                    cancel();
                } else {
                    sh0VarB.d(eq3Var, rh0Var);
                }
            }
        } catch (FileNotFoundException e) {
            rh0Var.b(e);
        }
    }

    @Override // defpackage.sh0
    public final int e() {
        return 1;
    }
}
