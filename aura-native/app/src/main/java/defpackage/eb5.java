package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class eb5 extends db5 {
    public eb5(pb5 pb5Var, WindowInsets windowInsets) {
        super(pb5Var, windowInsets);
    }

    @Override // defpackage.mb5
    public pb5 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.c.consumeDisplayCutout();
        return pb5.g(consumeDisplayCutout, null);
    }

    @Override // defpackage.cb5, defpackage.mb5
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb5)) {
            return false;
        }
        eb5 eb5Var = (eb5) obj;
        return Objects.equals(this.c, eb5Var.c) && Objects.equals(this.g, eb5Var.g) && cb5.L(this.h, eb5Var.h);
    }

    @Override // defpackage.mb5
    public tr0 g() {
        DisplayCutout displayCutout;
        displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new tr0(displayCutout);
    }

    @Override // defpackage.mb5
    public int hashCode() {
        return this.c.hashCode();
    }
}
