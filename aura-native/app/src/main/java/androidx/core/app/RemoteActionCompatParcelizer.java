package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.s45;
import defpackage.t45;
import defpackage.u45;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(s45 s45Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        u45 u45Var = remoteActionCompat.a;
        boolean z = true;
        if (s45Var.e(1)) {
            u45Var = s45Var.h();
        }
        remoteActionCompat.a = (IconCompat) u45Var;
        CharSequence charSequence = remoteActionCompat.b;
        if (s45Var.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((t45) s45Var).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (s45Var.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((t45) s45Var).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) s45Var.g(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (s45Var.e(5)) {
            z2 = ((t45) s45Var).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!s45Var.e(6)) {
            z = z3;
        } else if (((t45) s45Var).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, s45 s45Var) {
        s45Var.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        s45Var.i(1);
        s45Var.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        s45Var.i(2);
        Parcel parcel = ((t45) s45Var).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        s45Var.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        s45Var.k(remoteActionCompat.d, 4);
        boolean z = remoteActionCompat.e;
        s45Var.i(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        s45Var.i(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
