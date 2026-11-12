package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.eddyizm.tempus.service.MediaService;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w9 {
    public static final Uri g = Uri.parse("content://androidx.car.app.connection");
    public final Context a;
    public final es2 b;
    public final Executor c;
    public final v9 d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;

    public w9(MediaService mediaService, es2 es2Var) {
        this.a = mediaService.getApplicationContext();
        this.b = es2Var;
        Executor executorT = uo.t();
        this.c = executorT;
        this.d = new v9(0, this);
        this.e = new AtomicBoolean();
        this.f = new AtomicBoolean();
        executorT.execute(new u9(this, 1));
    }

    public final void a() {
        AtomicBoolean atomicBoolean = this.e;
        boolean z = atomicBoolean.get();
        boolean z2 = false;
        try {
            Cursor cursorQuery = this.a.getContentResolver().query(g, new String[]{"CarConnectionState"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    int columnIndex = cursorQuery.getColumnIndex("CarConnectionState");
                    if (columnIndex != -1 && cursorQuery.moveToNext()) {
                        boolean z3 = cursorQuery.getInt(columnIndex) != 0;
                        cursorQuery.close();
                        z2 = z3;
                    } else {
                        cursorQuery.close();
                    }
                } catch (Throwable th) {
                    try {
                        cursorQuery.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } else if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Exception unused) {
        }
        atomicBoolean.set(z2);
        if (z == z2 || this.f.get()) {
            return;
        }
        this.b.run();
    }
}
