package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.widget.RatingBar;
import android.widget.Toast;
import app.homemusic.R;
import cat.ereza.customactivityoncrash.activity.DefaultErrorActivity;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.lan.LanPlaybackActivity;
import com.eddyizm.tempus.subsonic.models.InternetRadioStation;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.PlaylistPageFragment;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.PlaylistRowBottomSheetDialog;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vr implements DialogInterface.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ vr(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface r3, int r4) {
        int r5 = this.n;
        MainActivity r6 = null;
        byte r0 = 0;
        Object r2 = this.o;
        switch(r5) {
            case 0: goto L39;
            case 1: goto L35;
            case 2: goto L29;
            case 3: goto L27;
            case 4: goto L18;
            case 5: goto L16;
            case 6: goto L6;
            default: goto L4;
        };
    L4:
        ou3 r7 = (ou3) r2;
        r7.C0.c((int) ((RatingBar) r7.B0.o).getRating());
        return;
    L6:
        gu3 r8 = ((eu3) r2).C0;
        InternetRadioStation r9 = r8.d;
        if (r9 != null) goto L9;
        return;
    L9:
        if (r9.getId() == null) goto L43;
        r8.g.k(null);
        r8.f.k(Boolean.FALSE);
        boolean r10 = r8.e;
        hh3 r11 = r8.c;
        InternetRadioStation r1 = r8.d;
        if (r10 == false) goto L14;
        String r12 = r1.getId();
        fu3 r13 = new fu3(r8, 0);
        r11.getClass();
        new Thread(new ur2(16, r12, r13)).start();
        return;
    L14:
        String r14 = r1.getId();
        r11.getClass();
        xc5 r15 = App.f(false).d();
        r15.getClass();
        Log.d("InternetRadioClient", "deleteInternetRadioStation()");
        ((x02) r15.p).c(((pn4) r15.o).f(), r14).enqueue(new si1(19, r8));
        return;
    L43:
        return;
    L16:
        PlaylistRowBottomSheetDialog r16 = (PlaylistRowBottomSheetDialog) r2;
        Context r17 = r16.Z().getApplicationContext();
        r16.h0();
        r16.B0.b(r16.C0.getId(), new vj(r17, r0));
        return;
    L18:
        PlaylistPageFragment r18 = (PlaylistPageFragment) r2;
        r18.n0.k.k(Boolean.FALSE);
        if (r18.n() == null) goto L21;
        Toast.makeText(r18.n(), R.string.playlist_error_not_found_toast, 0).show();
    L21:
        MainActivity r19 = r18.m0;
        if (r19 == null) goto L44;
        v23 r20 = r19.T;
        if (r20 == null) goto L45;
        r20.o();
        return;
    L45:
        return;
    L44:
        return;
    L27:
        nc1 r21 = (nc1) r2;
        r21.startActivity(new Intent(r21, LanPlaybackActivity.class));
        return;
    L29:
        nc1 r22 = ((vb4) r2).l();
        if ((r22 instanceof MainActivity) == false) goto L32;
        r6 = (MainActivity) r22;
    L32:
        if (r6 == null) goto L46;
        String r23 = ud3.E();
        io1.a.execute(new ws1(r0, r23, r6));
        return;
    L46:
        return;
    L35:
        DefaultErrorActivity r24 = (DefaultErrorActivity) r2;
        int r25 = DefaultErrorActivity.N;
        String r26 = sg0.b(r24, r24.getIntent());
        ClipboardManager r27 = (ClipboardManager) r24.getSystemService("clipboard");
        if (r27 == null) goto L47;
        r27.setPrimaryClip(ClipData.newPlainText(r24.getString(R.string.customactivityoncrash_error_activity_error_details_clipboard_label), r26));
        Toast.makeText(r24, R.string.customactivityoncrash_error_activity_error_details_copied, 0).show();
        return;
    L47:
        return;
    L39:
        Intent r28 = new Intent();
        r28.addFlags(268435456);
        r28.setAction("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
        ((xr) r2).g0(r28);
    }
}
