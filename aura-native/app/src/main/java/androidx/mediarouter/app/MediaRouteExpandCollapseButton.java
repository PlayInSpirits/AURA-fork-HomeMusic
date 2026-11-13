package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import app.homemusic.R;
import defpackage.fu;
import defpackage.i4;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class MediaRouteExpandCollapseButton extends AppCompatImageButton {
    public final AnimationDrawable q;
    public final AnimationDrawable r;
    public final String s;
    public final String t;
    public boolean u;
    public View.OnClickListener v;

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnimationDrawable animationDrawable = (AnimationDrawable) context.getDrawable(R.drawable.mr_group_expand);
        this.q = animationDrawable;
        AnimationDrawable animationDrawable2 = (AnimationDrawable) context.getDrawable(R.drawable.mr_group_collapse);
        this.r = animationDrawable2;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(fu.u(context, i), PorterDuff.Mode.SRC_IN);
        animationDrawable.setColorFilter(porterDuffColorFilter);
        animationDrawable2.setColorFilter(porterDuffColorFilter);
        String string = context.getString(R.string.mr_controller_expand_group);
        this.s = string;
        this.t = context.getString(R.string.mr_controller_collapse_group);
        setImageDrawable(animationDrawable.getFrame(0));
        setContentDescription(string);
        super.setOnClickListener(new i4(10, this));
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.v = onClickListener;
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaRouteExpandCollapseButton(Context context) {
        this(context, null);
    }
}
