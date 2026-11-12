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
import android.view.ViewGroup;
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

    @Override // defpackage.pp0, defpackage.kc1
    public void F(Bundle bundle) {
        super.F(bundle);
        kc1 kc1VarU = u(true);
        if (!(kc1VarU instanceof kp3)) {
            kf2.o("Target fragment must implement TargetFragment interface");
            return;
        }
        kp3 kp3Var = (kp3) kc1VarU;
        String string = Y().getString("key");
        if (bundle != null) {
            this.C0 = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.D0 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.E0 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.F0 = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.G0 = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.H0 = new BitmapDrawable(r(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) kp3Var.h0(string);
        this.B0 = dialogPreference;
        this.C0 = dialogPreference.b0;
        this.D0 = dialogPreference.e0;
        this.E0 = dialogPreference.f0;
        this.F0 = dialogPreference.c0;
        this.G0 = dialogPreference.g0;
        Drawable drawable = dialogPreference.d0;
        if (drawable == null || (drawable instanceof BitmapDrawable)) {
            this.H0 = (BitmapDrawable) drawable;
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        this.H0 = new BitmapDrawable(r(), bitmapCreateBitmap);
    }

    @Override // defpackage.pp0, defpackage.kc1
    public void Q(Bundle bundle) {
        super.Q(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.C0);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.D0);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.E0);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.F0);
        bundle.putInt("PreferenceDialogFragment.layout", this.G0);
        BitmapDrawable bitmapDrawable = this.H0;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle bundle) {
        this.I0 = -2;
        e9 e9VarD = new e9(Z()).setTitle(this.C0).b(this.H0).f(this.D0, this).d(this.E0, this);
        Z();
        int i = this.G0;
        View viewInflate = i != 0 ? o().inflate(i, (ViewGroup) null) : null;
        if (viewInflate != null) {
            o0(viewInflate);
            e9VarD.setView(viewInflate);
        } else {
            e9VarD.c(this.F0);
        }
        q0(e9VarD);
        f9 f9VarCreate = e9VarD.create();
        if (this instanceof jz0) {
            Window window = f9VarCreate.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                hp3.a(window);
                return f9VarCreate;
            }
            jz0 jz0Var = (jz0) this;
            jz0Var.M0 = SystemClock.currentThreadTimeMillis();
            jz0Var.r0();
        }
        return f9VarCreate;
    }

    public final DialogPreference n0() {
        if (this.B0 == null) {
            this.B0 = (DialogPreference) ((kp3) u(true)).h0(Y().getString("key"));
        }
        return this.B0;
    }

    public void o0(View view) {
        int i;
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.F0;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(charSequence);
                }
                i = 0;
            }
            if (viewFindViewById.getVisibility() != i) {
                viewFindViewById.setVisibility(i);
            }
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.I0 = i;
    }

    @Override // defpackage.pp0, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        p0(this.I0 == -1);
    }

    public abstract void p0(boolean z);

    public void q0(e9 e9Var) {
    }
}
