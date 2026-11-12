.class public final Llp2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lqp2;


# direct methods
.method public synthetic constructor <init>(Lqp2;I)V
    .locals 0

    .line 1
    iput p2, p0, Llp2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Llp2;->o:Lqp2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget v0, p0, Llp2;->n:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, Llp2;->o:Lqp2;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-boolean p1, p0, Lqp2;->q0:Z

    .line 10
    .line 11
    xor-int/lit8 v0, p1, 0x1

    .line 12
    .line 13
    iput-boolean v0, p0, Lqp2;->q0:Z

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lqp2;->R:Landroidx/mediarouter/app/OverlayListView;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-boolean p1, p0, Lqp2;->q0:Z

    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    iget-object p1, p0, Lqp2;->x0:Landroid/view/animation/Interpolator;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget-object p1, p0, Lqp2;->y0:Landroid/view/animation/Interpolator;

    .line 31
    .line 32
    :goto_0
    iput-object p1, p0, Lqp2;->w0:Landroid/view/animation/Interpolator;

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Lqp2;->w(Z)V

    .line 35
    .line 36
    .line 37
    :pswitch_0
    return-void

    .line 38
    :pswitch_1
    invoke-virtual {p0}, Ldg;->dismiss()V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    const v0, 0x1020019

    .line 47
    .line 48
    .line 49
    if-eq p1, v0, :cond_4

    .line 50
    .line 51
    const v2, 0x102001a

    .line 52
    .line 53
    .line 54
    if-ne p1, v2, :cond_2

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    const v0, 0x7f0a03cf

    .line 58
    .line 59
    .line 60
    if-ne p1, v0, :cond_3

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    const v0, 0x7f0a03cd

    .line 64
    .line 65
    .line 66
    if-ne p1, v0, :cond_7

    .line 67
    .line 68
    invoke-virtual {p0}, Ldg;->dismiss()V

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_4
    :goto_1
    iget-object v2, p0, Lqp2;->w:Lwq2;

    .line 73
    .line 74
    invoke-virtual {v2}, Lwq2;->g()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_6

    .line 79
    .line 80
    iget-object v2, p0, Lqp2;->u:Lyq2;

    .line 81
    .line 82
    if-ne p1, v0, :cond_5

    .line 83
    .line 84
    const/4 v1, 0x2

    .line 85
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-static {v1}, Lyq2;->f(I)V

    .line 89
    .line 90
    .line 91
    :cond_6
    invoke-virtual {p0}, Ldg;->dismiss()V

    .line 92
    .line 93
    .line 94
    :cond_7
    :goto_2
    return-void

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
