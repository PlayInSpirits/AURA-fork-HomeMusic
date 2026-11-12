package defpackage;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sf5 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Intent o;
    public final /* synthetic */ Object p;

    public /* synthetic */ sf5(Intent r1, Object r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    public final void a() {
        int r0 = this.n;
        Object r2 = this.p;
        Intent r3 = this.o;
        switch(r0) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        if (r3 == null) goto L10;
        ((x92) r2).startActivityForResult(r3, 2);
        return;
    L10:
        return;
    L7:
        if (r3 == null) goto L11;
        ((GoogleApiActivity) r2).startActivityForResult(r3, 2);
        return;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface r4, int r5) {
        a();     // Catch: Throwable -> L4 ActivityNotFoundException -> L6
    L11:
        r4.dismiss();
        return;
    L6:
        e = move-exception;
        String r6 = "Failed to start resolution intent.";
        if (true != Build.FINGERPRINT.contains("generic")) goto L10;
        r6 = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
    L10:
        Log.e("DialogRedirect", r6, e);     // Catch: Throwable -> L4
    L4:
        th = move-exception;
        r4.dismiss();
        throw th;
    }
}
