package defpackage;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.WindowInsetsController
 *  android.view.inputmethod.InputMethodManager
 */
import android.os.Build;
import android.view.View;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

public final class yh4
extends sg3 {
    public View b;
    public WindowInsetsController c;

    @Override
    public final void a() {
        View view = this.b;
        Object object = this.c;
        if (object == null) {
            object = view != null ? xq2.m(view) : null;
        }
        if (object != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            xh4 xh42 = new xh4(atomicBoolean);
            xq2.w(object, xh42);
            if (!atomicBoolean.get() && view != null) {
                ((InputMethodManager)view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
            xq2.C(object, xh42);
            xq2.B(object, xq2.b());
            return;
        }
        super.a();
    }

    @Override
    public final void b() {
        Object object;
        View view = this.b;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager)view.getContext().getSystemService("input_method")).isActive();
        }
        if ((object = this.c) == null) {
            object = view != null ? xq2.m(view) : null;
        }
        if (object != null) {
            xq2.v(object, xq2.b());
        }
        super.b();
    }
}

