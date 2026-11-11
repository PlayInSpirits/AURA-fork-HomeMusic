.class public final synthetic La7;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, La7;->n:I

    .line 2
    .line 3
    iput-object p1, p0, La7;->o:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, La7;->p:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, La7;->q:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, La7;->r:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .line 1
    iget p1, p0, La7;->n:I

    .line 2
    .line 3
    iget-object v0, p0, La7;->r:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v1, p0, La7;->q:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v2, p0, La7;->p:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object p0, p0, La7;->o:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    packed-switch p1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p0, Lcj3;

    .line 16
    .line 17
    check-cast v2, Lqi3;

    .line 18
    .line 19
    check-cast v1, Lsv4;

    .line 20
    .line 21
    check-cast v0, Llj3;

    .line 22
    .line 23
    const/16 p1, 0x1d

    .line 24
    .line 25
    invoke-interface {v2, p1}, Lqi3;->S0(I)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    invoke-interface {v2}, Lqi3;->E0()Lcw4;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Lcw4;->a()Lbw4;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    new-instance v4, Lyv4;

    .line 41
    .line 42
    iget v5, v0, Llj3;->b:I

    .line 43
    .line 44
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-static {v5}, Lyw1;->o(Ljava/lang/Object;)Lgy3;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-direct {v4, v1, v5}, Lyv4;-><init>(Lsv4;Ljava/util/List;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v4}, Lbw4;->h(Lyv4;)Lbw4;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iget-object v1, v0, Llj3;->a:Liw4;

    .line 60
    .line 61
    iget-object v1, v1, Liw4;->b:Lsv4;

    .line 62
    .line 63
    iget v1, v1, Lsv4;->c:I

    .line 64
    .line 65
    invoke-virtual {p1, v1, v3}, Lbw4;->l(IZ)Lbw4;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1}, Lbw4;->b()Lcw4;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-interface {v2, p1}, Lqi3;->M(Lcw4;)V

    .line 74
    .line 75
    .line 76
    iget-object p1, v0, Llj3;->c:Ljava/lang/String;

    .line 77
    .line 78
    iget v0, p0, Lcj3;->s:I

    .line 79
    .line 80
    packed-switch v0, :pswitch_data_1

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :pswitch_0
    iget-object v0, p0, Lcj3;->t:Landroidx/media3/ui/PlayerControlView;

    .line 85
    .line 86
    iget-object v0, v0, Landroidx/media3/ui/PlayerControlView;->z:Ljj3;

    .line 87
    .line 88
    const/4 v1, 0x1

    .line 89
    iget-object v0, v0, Ljj3;->r:[Ljava/lang/String;

    .line 90
    .line 91
    aput-object p1, v0, v1

    .line 92
    .line 93
    :goto_0
    iget-object p0, p0, Lcj3;->r:Landroidx/media3/ui/PlayerControlView;

    .line 94
    .line 95
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->E:Landroid/widget/PopupWindow;

    .line 96
    .line 97
    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 98
    .line 99
    .line 100
    :goto_1
    return-void

    .line 101
    :pswitch_1
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;

    .line 102
    .line 103
    check-cast v2, Ljava/util/ArrayList;

    .line 104
    .line 105
    check-cast v1, Ljava/util/List;

    .line 106
    .line 107
    check-cast v0, Ljava/util/List;

    .line 108
    .line 109
    invoke-static {}, Lud3;->o()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    if-nez p1, :cond_1

    .line 114
    .line 115
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-static {p1}, Lau0;->w(Landroid/content/Context;)Leu0;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-virtual {p1, v2, v1, v3}, Leu0;->a(Ljava/util/ArrayList;Ljava/util/List;Z)I

    .line 124
    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_1
    new-instance p1, Ld7;

    .line 128
    .line 129
    invoke-direct {p1, v3, p0}, Ld7;-><init>(ILjava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    invoke-interface {v0, p1}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 133
    .line 134
    .line 135
    :goto_2
    invoke-virtual {p0}, Lzt;->h0()V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
