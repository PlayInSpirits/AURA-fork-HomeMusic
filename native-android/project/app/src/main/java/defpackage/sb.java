package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sb extends r14 implements wf1 {
    public final /* synthetic */ int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ sb(Object r1, vd0 r2, int r3) {
        this.o = r3;
        this.r = r1;
        super(r2);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r3, vd0 r4) {
        int r0 = this.o;
        Object r2 = this.r;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        sb r1 = new sb((View) r2, r4, 1);
        r1.q = r3;
        return r1;
    L6:
        sb r5 = new sb((tb) r2, r4, 0);
        r5.q = r3;
        return r5;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r3, Object r4) {
        int r0 = this.o;
        j15 r1 = j15.a;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((sb) create((ba4) r3, (vd0) r4)).invokeSuspend(r1);
    L7:
        return ((sb) create((hp4) r3, (vd0) r4)).invokeSuspend(r1);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00b4 -> B:38:0x00b7). Please report as a decompilation issue!!! */
    @Override // defpackage.jp
    public final Object invokeSuspend(Object r15) {
        int r0 = this.o;
        xe0 r2 = xe0.n;
        Object r5 = this.r;
        j15 r6 = j15.a;
        switch(r0) {
            case 0: goto L24;
            default: goto L4;
        };
    L4:
        View r7 = (View) r5;
        int r1 = this.p;
        if (r1 == 0) goto L22;
        if (r1 == 1) goto L11;
        if (r1 != 2) goto L10;
        kb4.X(r15);
    L65:
        return r6;
    L10:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L11:
        ba4 r3 = (ba4) this.q;
        kb4.X(r15);
        if ((r7 instanceof ViewGroup) == false) goto L65;
        this.q = null;
        this.p = 2;
        r3.getClass();
        zw4 r16 = new zw4(new x0(3, (ViewGroup) r7));
        if (r16.o.hasNext() == true) goto L16;
        Object r14 = r6;
    L17:
        if (r14 == r2) goto L20;
        r14 = r6;
    L20:
        if (r14 != r2) goto L65;
        return r2;
    L16:
        r3.p = r16;
        r3.n = 2;
        r3.q = this;
        r14 = r2;
        goto L17
    L22:
        kb4.X(r15);
        ba4 r17 = (ba4) this.q;
        this.q = r17;
        this.p = 1;
        r17.b(this, r7);
        return r2;
    L24:
        tb r8 = (tb) r5;
        int r4 = this.p;
        ln3 r9 = ln3.o;
        if (r4 == 0) goto L31;
        if (r4 == 1) goto L30;
        if (r4 != 2) goto L29;
        hp4 r10 = (hp4) this.q;
        kb4.X(r15);
    L38:
        List r18 = ((kn3) r15).a;
        ArrayList r11 = new ArrayList(r18.size());
        int r12 = r18.size();
        int r13 = 0;
        int r19 = 0;
    L39:
        if (r19 >= r12) goto L44;
        Object r110 = r18.get(r19);
        if (((on3) r110).d == false) goto L43;
        r11.add(r110);
    L43:
        r19 = r19 + 1;
        goto L39
    L44:
        int r111 = r11.size();
    L45:
        if (r13 >= r111) goto L50;
        Object r20 = r11.get(r13);
        if (vr1.n(((on3) r20).a, r8.h) == true) goto L51;
        r13 = r13 + 1;
    L51:
        on3 r21 = (on3) r20;
        if (r21 != null) goto L54;
        r21 = (on3) q40.x0(r11);
    L54:
        if (r21 == null) goto L57;
        r8.h = r21.a;
        r8.b = r21.c;
    L57:
        if (r11.isEmpty() == true) goto L58;
    L35:
        this.q = r10;
        this.p = 2;
        r15 = r10.a(r9, this);
        if (r15 != r2) goto L38;
        return r2;
    L58:
        r8.h = -1;
        return r6;
    L50:
        r20 = null;
        goto L51
    L29:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L30:
        r10 = (hp4) this.q;
        kb4.X(r15);
    L34:
        on3 r112 = (on3) r15;
        r8.h = r112.a;
        r8.b = r112.c;
        goto L35
    L31:
        kb4.X(r15);
        r10 = (hp4) this.q;
        this.q = r10;
        this.p = 1;
        int r113 = vq4.a;
        r15 = vq4.a(r10, r9, this);
        if (r15 != r2) goto L34;
        return r2;
    }
}
