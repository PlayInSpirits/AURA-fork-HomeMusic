package defpackage;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.preference.DialogPreference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ip3 extends pp0 implements DialogInterface.OnClickListener {
    public DialogPreference B0;
    public CharSequence C0;
    public CharSequence D0;
    public CharSequence E0;
    public CharSequence F0;
    public int G0;
    public BitmapDrawable H0;
    public int I0;

    public ip3() {
    }

    @Override // defpackage.pp0, defpackage.kc1
    public void F(Bundle r6) {
        super.F(r6);
        kc1 r0 = u(true);
        if ((r0 instanceof kp3) == false) goto L19;
        kp3 r1 = (kp3) r0;
        String r2 = Y().getString("key");
        if (r6 != null) goto L15;
        DialogPreference r7 = (DialogPreference) r1.h0(r2);
        this.B0 = r7;
        this.C0 = r7.b0;
        this.D0 = r7.e0;
        this.E0 = r7.f0;
        this.F0 = r7.c0;
        this.G0 = r7.g0;
        Drawable r8 = r7.d0;
        if (r8 != null) goto L9;
    L13:
        this.H0 = (BitmapDrawable) r8;
        return;
    L9:
        if ((r8 instanceof BitmapDrawable) == true) goto L13;
        Bitmap r3 = Bitmap.createBitmap(r8.getIntrinsicWidth(), r8.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas r4 = new Canvas(r3);
        r8.setBounds(0, 0, r4.getWidth(), r4.getHeight());
        r8.draw(r4);
        this.H0 = new BitmapDrawable(r(), r3);
        return;
    L15:
        this.C0 = r6.getCharSequence("PreferenceDialogFragment.title");
        this.D0 = r6.getCharSequence("PreferenceDialogFragment.positiveText");
        this.E0 = r6.getCharSequence("PreferenceDialogFragment.negativeText");
        this.F0 = r6.getCharSequence("PreferenceDialogFragment.message");
        this.G0 = r6.getInt("PreferenceDialogFragment.layout", 0);
        Bitmap r9 = (Bitmap) r6.getParcelable("PreferenceDialogFragment.icon");
        if (r9 == null) goto L21;
        this.H0 = new BitmapDrawable(r(), r9);
        return;
    L21:
        return;
    L19:
        kf2.o("Target fragment must implement TargetFragment interface");
    }

    @Override // defpackage.pp0, defpackage.kc1
    public void Q(Bundle r3) {
        super.Q(r3);
        r3.putCharSequence("PreferenceDialogFragment.title", this.C0);
        r3.putCharSequence("PreferenceDialogFragment.positiveText", this.D0);
        r3.putCharSequence("PreferenceDialogFragment.negativeText", this.E0);
        r3.putCharSequence("PreferenceDialogFragment.message", this.F0);
        r3.putInt("PreferenceDialogFragment.layout", this.G0);
        BitmapDrawable r2 = this.H0;
        if (r2 == null) goto L6;
        r3.putParcelable("PreferenceDialogFragment.icon", r2.getBitmap());
        return;
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle r4) {
        this.I0 = -2;
        e9 r5 = new e9(Z()).setTitle(this.C0).b(this.H0).f(this.D0, this).d(this.E0, this);
        Z();
        int r0 = this.G0;
        View r1 = null;
        if (r0 == 0) goto L6;
        r1 = o().inflate(r0, null);
    L6:
        if (r1 == null) goto L8;
        o0(r1);
        r5.setView(r1);
    L9:
        q0(r5);
        f9 r6 = r5.create();
        if ((this instanceof jz0) == false) goto L16;
        Window r2 = r6.getWindow();
        if (Build.VERSION.SDK_INT < 30) goto L15;
        hp3.a(r2);
        return r6;
    L15:
        jz0 r3 = (jz0) this;
        r3.M0 = SystemClock.currentThreadTimeMillis();
        r3.r0();
    L16:
        return r6;
    L8:
        r5.c(this.F0);
        goto L9
    }

    public final DialogPreference n0() {
        if (this.B0 != null) goto L6;
        String r0 = Y().getString("key");
        this.B0 = (DialogPreference) ((kp3) u(true)).h0(r0);
    L6:
        return this.B0;
    }

    public void o0(View r2) {
        View r3 = r2.findViewById(R.id.message);
        if (r3 == null) goto L15;
        CharSequence r1 = this.F0;
        if (TextUtils.isEmpty(r1) == false) goto L7;
        int r4 = 8;
    L12:
        if (r3.getVisibility() == r4) goto L16;
        r3.setVisibility(r4);
        return;
    L16:
        return;
    L7:
        if ((r3 instanceof TextView) == false) goto L9;
        ((TextView) r3).setText(r1);
    L9:
        r4 = 0;
        goto L12
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface r1, int r2) {
        this.I0 = r2;
    }

    @Override // defpackage.pp0, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface r2) {
        super.onDismiss(r2);
        if (this.I0 != (-1)) goto L5;
        boolean r3 = true;
    L6:
        p0(r3);
        return;
    L5:
        r3 = false;
        goto L6
    }

    public abstract void p0(boolean r1);

    public void q0(e9 r1) {
    }
}
