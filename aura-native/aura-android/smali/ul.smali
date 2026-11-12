.class public final synthetic Lul;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:I

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 12
    iput p2, p0, Lul;->n:I

    iput-object p3, p0, Lul;->p:Ljava/lang/Object;

    iput p1, p0, Lul;->o:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lq41;IZ)V
    .locals 0

    .line 1
    const/4 p3, 0x3

    .line 2
    iput p3, p0, Lul;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lul;->p:Ljava/lang/Object;

    .line 8
    .line 9
    iput p2, p0, Lul;->o:I

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lul;->n:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget v2, p0, Lul;->o:I

    .line 5
    .line 6
    iget-object p0, p0, Lul;->p:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->C:Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Landroid/view/View;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-virtual {p0, v0, v2, v1}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->z(Landroid/view/View;IZ)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void

    .line 28
    :pswitch_0
    check-cast p0, Lau0;

    .line 29
    .line 30
    invoke-virtual {p0, v2}, Lau0;->M(I)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_1
    check-cast p0, Lbm2;

    .line 35
    .line 36
    iget-object v0, p0, Lbm2;->k:Lqi;

    .line 37
    .line 38
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v0, v3}, Lqi;->remove(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    iget-object v3, p0, Lbm2;->l:Landroid/util/SparseArray;

    .line 46
    .line 47
    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->delete(I)V

    .line 48
    .line 49
    .line 50
    iget-object v2, p0, Lbm2;->n:Lcb4;

    .line 51
    .line 52
    if-eqz v2, :cond_1

    .line 53
    .line 54
    iget-object v2, v2, Lcb4;->a:Lbb4;

    .line 55
    .line 56
    invoke-interface {v2}, Lbb4;->f()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    const/4 v3, 0x5

    .line 61
    if-ge v2, v3, :cond_1

    .line 62
    .line 63
    invoke-virtual {v0}, Lqi;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_1

    .line 68
    .line 69
    iget-object v0, p0, Lbm2;->m:Landroid/os/Handler;

    .line 70
    .line 71
    new-instance v2, Lsl2;

    .line 72
    .line 73
    invoke-direct {v2, p0, v1}, Lsl2;-><init>(Lbm2;I)V

    .line 74
    .line 75
    .line 76
    const-wide/16 v3, 0x1f4

    .line 77
    .line 78
    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 79
    .line 80
    .line 81
    :cond_1
    return-void

    .line 82
    :pswitch_2
    check-cast p0, Lq41;

    .line 83
    .line 84
    iget-object v0, p0, Lq41;->K:Lnj0;

    .line 85
    .line 86
    iget-object p0, p0, Lq41;->n:[Lez3;

    .line 87
    .line 88
    aget-object p0, p0, v2

    .line 89
    .line 90
    iget-object p0, p0, Lez3;->e:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast p0, Lkq;

    .line 93
    .line 94
    iget p0, p0, Lkq;->o:I

    .line 95
    .line 96
    invoke-virtual {v0}, Lnj0;->a0()Lq9;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    new-instance v1, Loi0;

    .line 101
    .line 102
    const/16 v2, 0xd

    .line 103
    .line 104
    invoke-direct {v1, v2}, Loi0;-><init>(I)V

    .line 105
    .line 106
    .line 107
    const/16 v2, 0x409

    .line 108
    .line 109
    invoke-virtual {v0, p0, v2, v1}, Lnj0;->b0(Lq9;ILqc2;)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :pswitch_3
    check-cast p0, Lft0;

    .line 114
    .line 115
    iget-object p0, p0, Ldw3;->n:Lew3;

    .line 116
    .line 117
    const/4 v0, 0x0

    .line 118
    invoke-virtual {p0, v2, v1, v0}, Lew3;->d(IILjava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :pswitch_4
    check-cast p0, Lxc5;

    .line 123
    .line 124
    iget-object p0, p0, Lxc5;->p:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast p0, Lqm;

    .line 127
    .line 128
    sget-object v0, Lf35;->a:Ljava/lang/String;

    .line 129
    .line 130
    invoke-interface {p0, v2}, Lqm;->b(I)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :pswitch_5
    check-cast p0, Lvl;

    .line 135
    .line 136
    iget-object p0, p0, Lvl;->b:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    .line 137
    .line 138
    invoke-interface {p0, v2}, Landroid/media/AudioManager$OnAudioFocusChangeListener;->onAudioFocusChange(I)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    nop

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
