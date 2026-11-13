package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import defpackage.ar;
import defpackage.j65;
import defpackage.z10;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    public static final int[] t = {R.attr.state_checked};
    public boolean q;
    public boolean r;
    public boolean s;

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.r = true;
        this.s = true;
        j65.o(this, new ar(2, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.q;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.q ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), t) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof z10)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z10 z10Var = (z10) parcelable;
        super.onRestoreInstanceState(z10Var.n);
        setChecked(z10Var.p);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        z10 z10Var = new z10(super.onSaveInstanceState());
        z10Var.p = this.q;
        return z10Var;
    }

    public void setCheckable(boolean z) {
        if (this.r != z) {
            this.r = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.r || this.q == z) {
            return;
        }
        this.q = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.s = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.s) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.q);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, app.homemusic.R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }
}
