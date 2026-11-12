package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.media3.ui.PlayerControlView;
import com.eddyizm.tempus.homemusic.HubFragment;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cs1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cs1(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13) {
        int r0 = this.a;
        Object r4 = this.b;
        switch(r0) {
            case 0: goto L47;
            case 1: goto L40;
            default: goto L4;
        };
    L4:
        qj3 r14 = (qj3) r4;
        PlayerControlView r15 = r14.a;
        int r16 = (r15.getWidth() - r15.getPaddingLeft()) - r15.getPaddingRight();
        int r17 = (r15.getHeight() - r15.getPaddingBottom()) - r15.getPaddingTop();
        ViewGroup r18 = r14.d;
        int r19 = qj3.c(r18);
        boolean r1 = false;
        if (r18 == null) goto L7;
        int r2 = r18.getPaddingRight() + r18.getPaddingLeft();
    L8:
        int r110 = r19 - r2;
        if (r18 != null) goto L11;
        int r3 = 0;
    L14:
        if (r18 == null) goto L16;
        int r20 = r18.getPaddingBottom() + r18.getPaddingTop();
    L17:
        int r21 = r3 - r20;
        int r22 = Math.max(r110, qj3.c(r14.l) + qj3.c(r14.j));
        ViewGroup r111 = r14.e;
        if (r111 != null) goto L20;
        int r23 = 0;
    L23:
        int r24 = (r23 * 2) + r21;
        if (r16 <= r22) goto L28;
        if (r17 <= r24) goto L28;
        boolean r25 = false;
    L30:
        if (r14.B == r25) goto L33;
        r14.B = r25;
        r5.post(new mj3(r14, 1));
    L33:
        if ((r8 - r6) == (r12 - r10)) goto L36;
        r1 = true;
    L36:
        if (r14.B == true) goto L49;
        if (r1 == false) goto L50;
        r5.post(new mj3(r14, 2));
        return;
    L50:
        return;
    L49:
        return;
    L28:
        r25 = true;
        goto L30
    L20:
        r23 = r111.getHeight();
        ViewGroup.LayoutParams r112 = r111.getLayoutParams();
        if ((r112 instanceof ViewGroup.MarginLayoutParams) == false) goto L23;
        ViewGroup.MarginLayoutParams r113 = (ViewGroup.MarginLayoutParams) r112;
        r23 = r23 + (r113.topMargin + r113.bottomMargin);
        goto L23
    L16:
        r20 = 0;
        goto L17
    L11:
        r3 = r18.getHeight();
        ViewGroup.LayoutParams r26 = r18.getLayoutParams();
        if ((r26 instanceof ViewGroup.MarginLayoutParams) == false) goto L14;
        ViewGroup.MarginLayoutParams r27 = (ViewGroup.MarginLayoutParams) r26;
        r3 = r3 + (r27.topMargin + r27.bottomMargin);
        goto L14
    L7:
        r2 = 0;
        goto L8
    L40:
        PlayerControlView r28 = (PlayerControlView) r4;
        int r29 = r28.F;
        PopupWindow r30 = r28.E;
        int r31 = r9 - r7;
        int r114 = r13 - r11;
        if ((r8 - r6) != (r12 - r10)) goto L44;
        if (r31 != r114) goto L44;
        return;
    L44:
        if (r30.isShowing() == false) goto L52;
        r28.p();
        r30.update(r5, (r28.getWidth() - r30.getWidth()) - r29, (-r30.getHeight()) - r29, -1, -1);
        return;
    L52:
        return;
    L47:
        List r32 = HubFragment.y0;
        ((HubFragment) r4).n0();
    }
}
