.class public final synthetic Lti3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lxi3;


# direct methods
.method public synthetic constructor <init>(Lxi3;I)V
    .locals 0

    .line 1
    iput p2, p0, Lti3;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lti3;->o:Lxi3;

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
    .locals 2

    .line 1
    iget p1, p0, Lti3;->n:I

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    iget-object p0, p0, Lti3;->o:Lxi3;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->t()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p0}, Lgh0;->G(Lnc1;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_1
    iget-object p0, p0, Lxi3;->o0:Lns3;

    .line 29
    .line 30
    iget-object p0, p0, Lns3;->o:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Landroid/widget/FrameLayout;

    .line 33
    .line 34
    const p1, 0x7f0a0214

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0}, Landroid/view/View;->performClick()Z

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_2
    iget-object p0, p0, Lxi3;->o0:Lns3;

    .line 46
    .line 47
    iget-object p0, p0, Lns3;->o:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p0, Landroid/widget/FrameLayout;

    .line 50
    .line 51
    const p1, 0x7f0a022a

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {p0}, Landroid/view/View;->performClick()Z

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :pswitch_3
    invoke-static {}, Lu52;->c()Lv52;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iget-boolean p1, p1, Lv52;->a:Z

    .line 67
    .line 68
    if-eqz p1, :cond_0

    .line 69
    .line 70
    const-string p0, "next"

    .line 71
    .line 72
    invoke-static {p0, v0, v1}, Lu52;->a(Ljava/lang/String;J)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    iget-object p0, p0, Lxi3;->o0:Lns3;

    .line 77
    .line 78
    iget-object p0, p0, Lns3;->o:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p0, Landroid/widget/FrameLayout;

    .line 81
    .line 82
    const p1, 0x7f0a021d

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-virtual {p0}, Landroid/view/View;->performClick()Z

    .line 90
    .line 91
    .line 92
    :goto_0
    return-void

    .line 93
    :pswitch_4
    invoke-static {}, Lu52;->c()Lv52;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    iget-boolean p1, p1, Lv52;->a:Z

    .line 98
    .line 99
    if-eqz p1, :cond_2

    .line 100
    .line 101
    invoke-static {}, Lu52;->c()Lv52;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    iget-boolean p0, p0, Lv52;->k:Z

    .line 106
    .line 107
    if-eqz p0, :cond_1

    .line 108
    .line 109
    const-string p0, "pause"

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_1
    const-string p0, "play"

    .line 113
    .line 114
    :goto_1
    invoke-static {p0, v0, v1}, Lu52;->a(Ljava/lang/String;J)V

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_2
    iget-object p0, p0, Lxi3;->o0:Lns3;

    .line 119
    .line 120
    iget-object p0, p0, Lns3;->o:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast p0, Landroid/widget/FrameLayout;

    .line 123
    .line 124
    const p1, 0x7f0a0223

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-virtual {p0}, Landroid/view/View;->performClick()Z

    .line 132
    .line 133
    .line 134
    :goto_2
    return-void

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
