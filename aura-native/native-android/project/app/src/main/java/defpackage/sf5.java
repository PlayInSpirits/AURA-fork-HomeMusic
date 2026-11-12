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

    public /* synthetic */ sf5(Intent intent, Object obj, int i) {
        this.n = i;
        this.o = intent;
        this.p = obj;
    }

    public final void a() {
        int i = this.n;
        Object obj = this.p;
        Intent intent = this.o;
        switch (i) {
            case 0:
                if (intent != null) {
                    ((GoogleApiActivity) obj).startActivityForResult(intent, 2);
                }
                break;
            default:
                if (intent != null) {
                    ((x92) obj).startActivityForResult(intent, 2);
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
