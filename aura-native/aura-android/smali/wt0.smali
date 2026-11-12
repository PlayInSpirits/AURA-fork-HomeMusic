.class public final synthetic Lwt0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lus0;

.field public final synthetic p:Lf9;


# direct methods
.method public synthetic constructor <init>(Lus0;Lf9;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwt0;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lwt0;->o:Lus0;

    .line 4
    .line 5
    iput-object p2, p0, Lwt0;->p:Lf9;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget p1, p0, Lwt0;->n:I

    .line 2
    .line 3
    iget-object v0, p0, Lwt0;->p:Lf9;

    .line 4
    .line 5
    iget-object p0, p0, Lwt0;->o:Lus0;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lud3;->p()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    const/4 v1, 0x2

    .line 15
    if-eq p1, v1, :cond_0

    .line 16
    .line 17
    invoke-static {v1}, Lud3;->j0(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1}, Lau0;->w(Landroid/content/Context;)Leu0;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Leu0;->g()V

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, Lus0;->C0:Lcom/eddyizm/tempus/interfaces/DialogClickCallback;

    .line 32
    .line 33
    check-cast p0, Lrm2;

    .line 34
    .line 35
    invoke-virtual {p0}, Lrm2;->onNeutralClick()V

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-virtual {v0}, Ldg;->dismiss()V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_0
    invoke-static {}, Lud3;->p()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_1

    .line 47
    .line 48
    const/4 p1, 0x0

    .line 49
    invoke-static {p1}, Lud3;->j0(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-static {p1}, Lau0;->w(Landroid/content/Context;)Leu0;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1}, Leu0;->g()V

    .line 61
    .line 62
    .line 63
    iget-object p0, p0, Lus0;->C0:Lcom/eddyizm/tempus/interfaces/DialogClickCallback;

    .line 64
    .line 65
    check-cast p0, Lrm2;

    .line 66
    .line 67
    invoke-virtual {p0}, Lrm2;->onNegativeClick()V

    .line 68
    .line 69
    .line 70
    :cond_1
    invoke-virtual {v0}, Ldg;->dismiss()V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :pswitch_1
    invoke-static {}, Lud3;->p()I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    const/4 v1, 0x1

    .line 79
    if-eq p1, v1, :cond_2

    .line 80
    .line 81
    invoke-static {v1}, Lud3;->j0(I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-static {p1}, Lau0;->w(Landroid/content/Context;)Leu0;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p1}, Leu0;->g()V

    .line 93
    .line 94
    .line 95
    iget-object p0, p0, Lus0;->C0:Lcom/eddyizm/tempus/interfaces/DialogClickCallback;

    .line 96
    .line 97
    check-cast p0, Lrm2;

    .line 98
    .line 99
    invoke-virtual {p0}, Lrm2;->onPositiveClick()V

    .line 100
    .line 101
    .line 102
    :cond_2
    invoke-virtual {v0}, Ldg;->dismiss()V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    nop

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
